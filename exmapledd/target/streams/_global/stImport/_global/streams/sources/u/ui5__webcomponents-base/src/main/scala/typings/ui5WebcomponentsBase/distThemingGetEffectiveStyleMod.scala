package typings.ui5WebcomponentsBase

import org.scalablytyped.runtime.Instantiable0
import typings.ui5WebcomponentsBase.anon.TypeofUI5Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distThemingGetEffectiveStyleMod {
  
  @JSImport("@ui5/webcomponents-base/dist/theming/getEffectiveStyle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    ElementClass: Instantiable0[typings.ui5WebcomponentsBase.distUi5elementMod.default] & TypeofUI5Element
  ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ElementClass.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(
    ElementClass: Instantiable0[typings.ui5WebcomponentsBase.distUi5elementMod.default] & TypeofUI5Element,
    forStaticArea: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ElementClass.asInstanceOf[js.Any], forStaticArea.asInstanceOf[js.Any])).asInstanceOf[String]
}
