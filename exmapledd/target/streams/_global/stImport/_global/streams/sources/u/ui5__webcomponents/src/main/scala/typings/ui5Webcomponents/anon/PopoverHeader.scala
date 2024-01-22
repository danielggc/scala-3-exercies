package typings.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopoverHeader extends StObject {
  
  var popoverHeader: Width
}
object PopoverHeader {
  
  inline def apply(popoverHeader: Width): PopoverHeader = {
    val __obj = js.Dynamic.literal(popoverHeader = popoverHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverHeader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PopoverHeader] (val x: Self) extends AnyVal {
    
    inline def setPopoverHeader(value: Width): Self = StObject.set(x, "popoverHeader", value.asInstanceOf[js.Any])
  }
}
