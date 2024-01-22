package typings.ui5Webcomponents.anon

import typings.ui5Webcomponents.distTypesHasPopupMod.HasPopup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AriaAutoComplete extends StObject {
  
  var ariaAutoComplete: String
  
  var ariaHasPopup: HasPopup
  
  var ariaLabel: js.UndefOr[String] = js.undefined
  
  var ariaRequired: Boolean
  
  var ariaRoledescription: String
}
object AriaAutoComplete {
  
  inline def apply(
    ariaAutoComplete: String,
    ariaHasPopup: HasPopup,
    ariaRequired: Boolean,
    ariaRoledescription: String
  ): AriaAutoComplete = {
    val __obj = js.Dynamic.literal(ariaAutoComplete = ariaAutoComplete.asInstanceOf[js.Any], ariaHasPopup = ariaHasPopup.asInstanceOf[js.Any], ariaRequired = ariaRequired.asInstanceOf[js.Any], ariaRoledescription = ariaRoledescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[AriaAutoComplete]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AriaAutoComplete] (val x: Self) extends AnyVal {
    
    inline def setAriaAutoComplete(value: String): Self = StObject.set(x, "ariaAutoComplete", value.asInstanceOf[js.Any])
    
    inline def setAriaHasPopup(value: HasPopup): Self = StObject.set(x, "ariaHasPopup", value.asInstanceOf[js.Any])
    
    inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    
    inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
    
    inline def setAriaRequired(value: Boolean): Self = StObject.set(x, "ariaRequired", value.asInstanceOf[js.Any])
    
    inline def setAriaRoledescription(value: String): Self = StObject.set(x, "ariaRoledescription", value.asInstanceOf[js.Any])
  }
}
