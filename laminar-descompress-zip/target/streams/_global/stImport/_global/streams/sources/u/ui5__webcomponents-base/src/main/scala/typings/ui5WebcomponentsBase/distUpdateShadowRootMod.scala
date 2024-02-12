package typings.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUpdateShadowRootMod {
  
  @JSImport("@ui5/webcomponents-base/dist/updateShadowRoot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Updates the shadow root of a UI5Element or its static area item
    * @param element
    * @param forStaticArea
    */
  inline def default(element: typings.ui5WebcomponentsBase.distUi5elementMod.default): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default(element: typings.ui5WebcomponentsBase.distUi5elementMod.default, forStaticArea: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], forStaticArea.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
