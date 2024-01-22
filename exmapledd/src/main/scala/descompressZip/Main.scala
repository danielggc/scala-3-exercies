package example

import scala.scalajs.js
import scala.scalajs.js.annotation.*
import be.doeraene.webcomponents.ui5.*
import be.doeraene.webcomponents.ui5.configkeys.*
import com.raquo.laminar.api.L.*
import org.scalajs.dom
import com.raquo.laminar.api.L.{*, given}
import org.scalajs.dom.{Blob, File}

import scala.scalajs.js.typedarray.{ArrayBuffer, Uint8Array}
import scala.concurrent.{Future, Promise}
import scala.util.{Failure, Success}
import scala.concurrent._
import ExecutionContext.Implicits.global



@main
def descompress(): Unit =
  renderOnDomContentLoaded(
    dom.document.getElementById("app"),
    Main.appElement()
  )


object Main:
  val selectedZipFileVar: Var[Option[File]] = Var(None)

  def handleZipFileSelection(event:dom.Event): Unit = {
    val inputElements = event.target.asInstanceOf[dom.html.Input]
    val files = inputElements.files
    val zipFiles = files.filter(file => file.`type` == "application/zip" || file.name.endsWith(".zip"))
    selectedZipFileVar.set(zipFiles.headOption)
    zipFiles.headOption.foreach { file =>
      Unzipper.unzip(file)
    }
  }


  val zipFileInput: Input = input(
      typ("file"),
      accept("application/zip"),
      onInput.preventDefault  --> (handleZipFileSelection _)
  )

  val selectedZipFileName: Element = div(
    child.text <-- selectedZipFileVar
      .signal
      .map(
        _.fold("Ningún archivo ZIP seleccionado")
        (file => s"Archivo ZIP seleccionado: ${file.name}  }"))
  )






  def appElement(): Element =

   

    div(

      h1("Selección de Archivo con dgc7"),
      zipFileInput,
      selectedZipFileName

    )
  end appElement







object Unzipper {
  import typings.zipJsZipJs.*
  import scala.scalajs.js.JSConverters.*
  import typings.zipJsZipJs.mod.{BlobReader, ZipReader }

  def unzip(file: File): Unit = {
    println("reading files of zip !!!!")
    val dd: ZipReader[Blob] = ZipReader(BlobReader(Blob(js.Array(file))))
     dd.getEntries().toFuture.onComplete {
       case Failure(exception) => println(s"error exeption => $exception ")
       case Success(value) =>{
         val dd = value.map( e =>
           println( s"name of field is : [ ${e.filename} ] size: [ ${ e.uncompressedSize } ] data : [${ e.directory } ]  " )
         )

       }
     }


  }
}


