import cats.effect.{IO, *}
import eu.timepit.refined.types.string.NonEmptyString
import fs2.{Pipe, Pure, Stream}
import fs2.aws.s3.{AwsRequestModifier, S3}
import fs2.aws.s3.models.Models.{BucketName, ETag, FileKey, MultiPartConcurrency, PartSizeMB, UploadEmptyFiles}
import software.amazon.awssdk.auth.credentials.{AwsBasicCredentials, StaticCredentialsProvider}
import io.laserdisc.pure.s3.tagless.{S3AsyncClientOp, Interpreter as S3Interpreter}
import software.amazon.awssdk.regions.Region
import software.amazon.awssdk.services.s3.S3AsyncClient
import cats.effect.unsafe.implicits.global
import software.amazon.awssdk.core.SdkBytes
import software.amazon.awssdk.services.s3.model.SelectObjectContentResponseHandler.Visitor
import software.amazon.awssdk.services.s3.model.{CSVInput, CSVOutput, CompressionType, ExpressionType, InputSerialization, OutputSerialization, ScanRange, SelectObjectContentRequest, SelectObjectContentResponseHandler}

import java.io.{BufferedReader, File, InputStream, InputStreamReader}
import java.net.URI
import java.nio.charset.StandardCharsets

object S3StoreInterpreter {


  def saveFile( s3: S3[IO] ): IO[Unit] = {

     val dd: Pipe[IO, Byte, ETag] = s3.uploadFile(
     BucketName( NonEmptyString.unsafeFrom( "s3-created-cince-ec2" ) ) ,
     FileKey( NonEmptyString.unsafeFrom("/home/dgc7/data.txt"  ) )
      )
    val byteStream: fs2.Stream[IO, Byte] = fs2.Stream.emits("Hello, World!".getBytes)
    byteStream.through( dd ).compile.drain

  }



  def selectSql(s3: NewS3[IO]):Stream[IO, String] =
    val stream: IO[Array[Byte]] = IO.async_[Array[Byte]] {
      cb => s3.selectSql("s3-created-cince-ec2", "SELECT * FROM S3Object s", "/home/dgc7/daay.csv")(cb).unsafeRunSync()
    }

    fs2.Stream.eval( stream ).flatMap( e =>  fs2.Stream.emits(e).through(lineSplitter)  )


  private def lineSplitter: Pipe[IO, Byte, String] =
    _.through(fs2.text.utf8.decode)
      .through(fs2.text.lines)
      .filter(_.nonEmpty)

}


object  initS3 {

  def s3StreamResource: Resource[IO, S3AsyncClientOp[IO]] =
    val credentials = AwsBasicCredentials.create("AKIAW3MEDWHZ7KWR4Q7Q", "LdsmllNQkH9RLU5qQVosvs0Gh/6zz+GrM2uwRX5l")
    val port = 4566
    for {
      s3 <- S3Interpreter[IO].S3AsyncClientOpResource(
        S3AsyncClient
          .builder()
          .credentialsProvider(StaticCredentialsProvider.create(credentials))
          .endpointOverride(URI.create(s"https://s3.amazonaws.com"))
          .region(Region.US_EAST_2)
      )
    } yield s3




  @main
  def main(): Unit = {
    println("example run save file S3")
    //s3StreamResource.map(S3.create[IO]).use(s3 => S3StoreInterpreter.saveFile(s3) ).unsafeRunSync()
    val dd = s3StreamResource.map( NewS3.create[IO]).use(s3 => S3StoreInterpreter.selectSql( s3 ).compile.toVector ).unsafeRunSync()
    dd.foreach( e =>  println( e ) )

  }
}


trait  NewS3[F[_]] extends S3[F]{

  def selectSql( bucketName: String  , searchQuery:String ,directoryName:String )( callBack: Either[Throwable,Array[Byte] ] => Unit ):F[Unit]

}

object NewS3  {
  def create[F[_]: Async](s3: S3AsyncClientOp[F]): NewS3[F] = {
    val originalS3 = S3.create[F](s3)
    val newS3 = new  NewS3[F]{
      override def delete(bucket: BucketName, key: FileKey): F[Unit] = originalS3.delete( bucket, key)

      override def uploadFile(
                               bucket: BucketName,
                               key: FileKey,
                               awsRequestModifier: AwsRequestModifier.Upload1 = AwsRequestModifier.Upload1.identity
                             ) : Pipe[F, Byte, ETag] = originalS3.uploadFile( bucket, key,  awsRequestModifier )

      override def uploadFileMultipart(
                                        bucket: BucketName,
                                        key: FileKey,
                                        partSize: PartSizeMB,
                                        uploadEmptyFiles: UploadEmptyFiles,
                                        multiPartConcurrency: MultiPartConcurrency,
                                        requestModifier: AwsRequestModifier.MultipartUpload,
                                        multipartETagValidation: Option[S3.MultipartETagValidation[F]]
                                      ): Pipe[F, Byte, Option[ETag]] =  originalS3.uploadFileMultipart(bucket, key, partSize, uploadEmptyFiles, multiPartConcurrency, requestModifier, multipartETagValidation)

      override def readFile(bucket: BucketName, key: FileKey): fs2.Stream[F, Byte] = originalS3.readFile(bucket, key)

      override def readFileMultipart(bucket: BucketName, key: FileKey, partSize: PartSizeMB): fs2.Stream[F, Byte] = originalS3.readFileMultipart( bucket, key, partSize)








      override def  selectSql( bucketName: String  , searchQuery:String ,directoryName:String  )( callBack : Either[Throwable,Array[Byte] ] => Unit ): F[Unit] = {
        val inputSerialization =  InputSerialization.builder().csv( CSVInput.builder().build() ).compressionType(CompressionType.NONE) .build() ;
        val outputSerialization = OutputSerialization.builder().csv( CSVOutput.builder().build()  ).build()
          val request =  SelectObjectContentRequest
            .builder()
            .scanRange( ScanRange.builder().start(0).end(50).build() )
            .bucket( bucketName )
            .key(  directoryName  )
            .expression( searchQuery )
            .expressionType(ExpressionType.SQL)
            .inputSerialization(inputSerialization)
            .outputSerialization(outputSerialization)
            .build()

        import scala.jdk.CollectionConverters.*
        // r => println(f( r.payload().asInputStream()

          val response: SelectObjectContentResponseHandler = SelectObjectContentResponseHandler
            .builder()
            .subscriber(
              Visitor
                .builder()
                .onRecords(
                  e => {
                     callBack(Right( e.payload().asByteArray()  ) )
                  }
                ).build()
            ).build()

           Sync[F].map( s3.selectObjectContent( request , response  ) )( _ =>  { } )

      }

    }
    newS3
  }

}


