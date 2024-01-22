package typings.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AriaHasPopup_ extends StObject {
  
  var ariaAutoComplete: String
  
  var ariaControls: String
  
  var ariaHasPopup: String
  
  var ariaRoledescription: String
}
object AriaHasPopup_ {
  
  inline def apply(ariaAutoComplete: String, ariaControls: String, ariaHasPopup: String, ariaRoledescription: String): AriaHasPopup_ = {
    val __obj = js.Dynamic.literal(ariaAutoComplete = ariaAutoComplete.asInstanceOf[js.Any], ariaControls = ariaControls.asInstanceOf[js.Any], ariaHasPopup = ariaHasPopup.asInstanceOf[js.Any], ariaRoledescription = ariaRoledescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[AriaHasPopup_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AriaHasPopup_] (val x: Self) extends AnyVal {
    
    inline def setAriaAutoComplete(value: String): Self = StObject.set(x, "ariaAutoComplete", value.asInstanceOf[js.Any])
    
    inline def setAriaControls(value: String): Self = StObject.set(x, "ariaControls", value.asInstanceOf[js.Any])
    
    inline def setAriaHasPopup(value: String): Self = StObject.set(x, "ariaHasPopup", value.asInstanceOf[js.Any])
    
    inline def setAriaRoledescription(value: String): Self = StObject.set(x, "ariaRoledescription", value.asInstanceOf[js.Any])
  }
}
