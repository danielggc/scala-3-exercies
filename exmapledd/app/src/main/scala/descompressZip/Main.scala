package example

import scala.scalajs.js
import scala.scalajs.js.annotation.*
import be.doeraene.webcomponents.ui5.*
import be.doeraene.webcomponents.ui5.configkeys.*
import com.raquo.laminar.api.L.*
import org.scalajs.dom
import com.raquo.laminar.api.L.{*, given}
import descompressZip.UploadZIp


@main
def descompress(): Unit =
  renderOnDomContentLoaded(
    dom.document.getElementById("app"),
    Main.appElement()
  )


object Main:

  def appElement(): Element =
    div(

      h1("Hello Laminar dgc7  descompress "),

      UploadZIp.apply()
    )
  end appElement






