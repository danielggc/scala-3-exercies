package typings.ui5WebcomponentsBase

import org.scalajs.dom.HTMLStyleElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilCreateStyleInHeadMod {
  
  @JSImport("@ui5/webcomponents-base/dist/util/createStyleInHead", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(cssText: String): HTMLStyleElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(cssText.asInstanceOf[js.Any]).asInstanceOf[HTMLStyleElement]
  inline def default(cssText: String, attributes: Record[String, String]): HTMLStyleElement = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(cssText.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[HTMLStyleElement]
}
