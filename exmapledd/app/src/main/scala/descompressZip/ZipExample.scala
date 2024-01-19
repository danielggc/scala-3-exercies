package ZipExample

import org.scalajs.dom.{Blob, BlobPropertyBag, Event, File, FileReader, ProgressEvent, console}

import scala.scalajs.js
import scala.scalajs.js.typedarray.ArrayBuffer
import js.Dynamic.literal
import js.DynamicImplicits.truthValue
import scala.scalajs.concurrent.JSExecutionContext.Implicits.queue
import scala.scalajs.js.annotation.{JSExportTopLevel, JSGlobal}
import scala.concurrent.{Future, Promise}
import scala.util.{Failure, Success}

@js.native
trait JSZip extends js.Object {
  def loadAsync(data: Blob): js.Promise[Unit] = js.native
  def file(name: String): JSZipObject = js.native
}

@js.native
trait JSZipObject extends js.Object {
  def async(dataType: String): js.Promise[js.Dynamic] = js.native
}


@JSExportTopLevel("ZipExample")
object ZipExample {
  def decompressFile(file: File): Future[String] = {
    val jsZip =  js.Object().asInstanceOf[JSZip]
    val fileReader =  FileReader()
    val promise = Promise[String]()

    fileReader.onload = { ( event: Event ) =>
      val arrayBuffer = fileReader.result.asInstanceOf[ArrayBuffer]

      jsZip.loadAsync( Blob(js.Array(arrayBuffer))).toFuture.flatMap { _ =>
        val contentPromise = jsZip.file("data1.txt").async("string").toFuture
        contentPromise.map(_.toString)
      }.onComplete {
        case scala.util.Success(content) => promise.success(content)
        case scala.util.Failure(error)   => promise.failure(error)
      }
    }

    fileReader.onerror = { ( event: Event ) =>
      promise.failure( RuntimeException(s"Error al leer el archivo: ${fileReader.error}"))
    }

    fileReader.readAsArrayBuffer(file)

    promise.future
  }

  def decompressFileExternal(file: File): Unit = {
    println("estamos en el decompress file")
    decompressFile(file).onComplete {
      case Failure(exception) =>
        console.log(s"Error al descomprimir el archivo: $exception")
        println(s"Error al descomprimir el archivo: $exception")
      case Success(value) =>
        console.log(s"Contenido del archivo descomprimido: $value")
        println(s"Contenido del archivo descomprimido: $value")
    }
  }


}
