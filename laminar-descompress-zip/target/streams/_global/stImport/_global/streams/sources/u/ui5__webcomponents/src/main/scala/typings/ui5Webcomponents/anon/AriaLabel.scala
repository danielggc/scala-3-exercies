package typings.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AriaLabel extends StObject {
  
  var ariaLabel: js.UndefOr[String] = js.undefined
  
  var ariaRequired: Boolean
}
object AriaLabel {
  
  inline def apply(ariaRequired: Boolean): AriaLabel = {
    val __obj = js.Dynamic.literal(ariaRequired = ariaRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[AriaLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AriaLabel] (val x: Self) extends AnyVal {
    
    inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    
    inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
    
    inline def setAriaRequired(value: Boolean): Self = StObject.set(x, "ariaRequired", value.asInstanceOf[js.Any])
  }
}
