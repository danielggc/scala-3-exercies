package typings.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BusyInd extends StObject {
  
  var busyInd: Position
}
object BusyInd {
  
  inline def apply(busyInd: Position): BusyInd = {
    val __obj = js.Dynamic.literal(busyInd = busyInd.asInstanceOf[js.Any])
    __obj.asInstanceOf[BusyInd]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BusyInd] (val x: Self) extends AnyVal {
    
    inline def setBusyInd(value: Position): Self = StObject.set(x, "busyInd", value.asInstanceOf[js.Any])
  }
}
