package example

import scala.scalajs.js
import scala.scalajs.js.annotation.*
import be.doeraene.webcomponents.ui5.*
import be.doeraene.webcomponents.ui5.configkeys.*
import com.raquo.laminar.api.L.*
import org.scalajs.dom
import com.raquo.laminar.api.L.{*, given}
import org.scalajs.dom.File

import scala.scalajs.js.typedarray.{ArrayBuffer, Uint8Array}
import scala.concurrent.{Future, Promise}


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
  import scala.scalajs.concurrent.JSExecutionContext.Implicits.queue

  def unzip(file: File ): Future[Unit] = {

    println("reading files of zip !!!!" )
    val promise = Promise[Unit]()

    val reader =  dom.FileReader()
    reader.onload = (event: dom.Event) => {
      val arrayBuffer: ArrayBuffer = reader.result.asInstanceOf[scala.scalajs.js.typedarray.ArrayBuffer]
      val uint8Array =  Uint8Array(arrayBuffer, 0, arrayBuffer.byteLength)
      println("here data of zip ")
      println(uint8Array)
      val zip  = js.Dynamic.global.JSZip(uint8Array)

      val promise = zip.file("data1.txt").async("string")
      val future: scala.concurrent.Future[js.Any] = promise.asInstanceOf[scala.scalajs.js.Thenable[js.Any]].toFuture
      future.foreach { data =>
        println(s"Contenido del archivo descomprimido: $data")
      }
    }
    reader.readAsArrayBuffer(file)
    promise.future
  }
}


