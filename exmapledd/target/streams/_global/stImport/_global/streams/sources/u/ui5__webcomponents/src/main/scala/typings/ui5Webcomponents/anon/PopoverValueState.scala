package typings.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopoverValueState extends StObject {
  
  var popoverValueState: Ui5valuestatemessageerror
}
object PopoverValueState {
  
  inline def apply(popoverValueState: Ui5valuestatemessageerror): PopoverValueState = {
    val __obj = js.Dynamic.literal(popoverValueState = popoverValueState.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverValueState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PopoverValueState] (val x: Self) extends AnyVal {
    
    inline def setPopoverValueState(value: Ui5valuestatemessageerror): Self = StObject.set(x, "popoverValueState", value.asInstanceOf[js.Any])
  }
}
