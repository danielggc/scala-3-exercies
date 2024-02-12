package typings.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AriaHaspopup extends StObject {
  
  var ariaExpanded: Boolean
  
  var ariaHaspopup: Boolean
  
  var description: String
  
  var keyboardHint: String
}
object AriaHaspopup {
  
  inline def apply(ariaExpanded: Boolean, ariaHaspopup: Boolean, description: String, keyboardHint: String): AriaHaspopup = {
    val __obj = js.Dynamic.literal(ariaExpanded = ariaExpanded.asInstanceOf[js.Any], ariaHaspopup = ariaHaspopup.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], keyboardHint = keyboardHint.asInstanceOf[js.Any])
    __obj.asInstanceOf[AriaHaspopup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AriaHaspopup] (val x: Self) extends AnyVal {
    
    inline def setAriaExpanded(value: Boolean): Self = StObject.set(x, "ariaExpanded", value.asInstanceOf[js.Any])
    
    inline def setAriaHaspopup(value: Boolean): Self = StObject.set(x, "ariaHaspopup", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setKeyboardHint(value: String): Self = StObject.set(x, "keyboardHint", value.asInstanceOf[js.Any])
  }
}
