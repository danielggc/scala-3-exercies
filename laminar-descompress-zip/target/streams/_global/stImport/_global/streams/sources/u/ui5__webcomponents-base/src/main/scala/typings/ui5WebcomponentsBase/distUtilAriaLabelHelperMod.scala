package typings.ui5WebcomponentsBase

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilAriaLabelHelperMod {
  
  @JSImport("@ui5/webcomponents-base/dist/util/AriaLabelHelper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @param {HTMLElement} el Defines the HTMLElement, for which you need to get all related "label for" texts
    */
  inline def getAssociatedLabelForTexts(el: HTMLElement): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAssociatedLabelForTexts")(el.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def getEffectiveAriaLabelText(el: HTMLElement): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEffectiveAriaLabelText")(el.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
}
