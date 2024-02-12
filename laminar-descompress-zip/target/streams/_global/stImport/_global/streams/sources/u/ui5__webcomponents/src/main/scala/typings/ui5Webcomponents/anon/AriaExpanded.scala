package typings.ui5Webcomponents.anon

import typings.ui5Webcomponents.distTypesHasPopupMod.HasPopup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AriaExpanded extends StObject {
  
  var ariaExpanded: Unit
  
  var ariaHaspopup: js.UndefOr[HasPopup] = js.undefined
  
  var ariaLabel: String
  
  var ariaLabelRadioButton: String
  
  var ariaLevel: js.UndefOr[Double] = js.undefined
  
  var ariaSelectedText: js.UndefOr[String] = js.undefined
  
  var role: String
}
object AriaExpanded {
  
  inline def apply(ariaExpanded: Unit, ariaLabel: String, ariaLabelRadioButton: String, role: String): AriaExpanded = {
    val __obj = js.Dynamic.literal(ariaExpanded = ariaExpanded.asInstanceOf[js.Any], ariaLabel = ariaLabel.asInstanceOf[js.Any], ariaLabelRadioButton = ariaLabelRadioButton.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[AriaExpanded]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AriaExpanded] (val x: Self) extends AnyVal {
    
    inline def setAriaExpanded(value: Unit): Self = StObject.set(x, "ariaExpanded", value.asInstanceOf[js.Any])
    
    inline def setAriaHaspopup(value: HasPopup): Self = StObject.set(x, "ariaHaspopup", value.asInstanceOf[js.Any])
    
    inline def setAriaHaspopupUndefined: Self = StObject.set(x, "ariaHaspopup", js.undefined)
    
    inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    
    inline def setAriaLabelRadioButton(value: String): Self = StObject.set(x, "ariaLabelRadioButton", value.asInstanceOf[js.Any])
    
    inline def setAriaLevel(value: Double): Self = StObject.set(x, "ariaLevel", value.asInstanceOf[js.Any])
    
    inline def setAriaLevelUndefined: Self = StObject.set(x, "ariaLevel", js.undefined)
    
    inline def setAriaSelectedText(value: String): Self = StObject.set(x, "ariaSelectedText", value.asInstanceOf[js.Any])
    
    inline def setAriaSelectedTextUndefined: Self = StObject.set(x, "ariaSelectedText", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
