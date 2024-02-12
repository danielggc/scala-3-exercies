package typings.litHtml.developmentLitHtmlMod

import org.scalajs.dom.DocumentFragment
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import typings.litHtml.litHtmlStrings.attribute
import typings.litHtml.litHtmlStrings.property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object render {
  
  inline def apply(value: Any, container: DocumentFragment): RootPart = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[RootPart]
  inline def apply(value: Any, container: DocumentFragment, options: RenderOptions): RootPart = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], container.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RootPart]
  inline def apply(value: Any, container: HTMLElement): RootPart = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[RootPart]
  inline def apply(value: Any, container: HTMLElement, options: RenderOptions): RootPart = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], container.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RootPart]
  
  @JSImport("lit-html/development/lit-html", "render")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lit-html/development/lit-html", "render.createSanitizer")
  @js.native
  def createSanitizer: SanitizerFactory = js.native
  inline def createSanitizer(node: Node, name: String, `type`: property | attribute): ValueSanitizer = (^.asInstanceOf[js.Dynamic].applyDynamic("createSanitizer")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[ValueSanitizer]
  inline def createSanitizer_=(x: SanitizerFactory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createSanitizer")(x.asInstanceOf[js.Any])
  
  inline def setSanitizer(newSanitizer: SanitizerFactory): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSanitizer")(newSanitizer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def testOnlyClearSanitizerFactoryDoNotCallOrElse(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_testOnlyClearSanitizerFactoryDoNotCallOrElse")().asInstanceOf[Unit]
}
