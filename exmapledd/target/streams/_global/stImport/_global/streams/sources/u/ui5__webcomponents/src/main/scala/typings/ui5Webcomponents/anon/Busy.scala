package typings.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Busy extends StObject {
  
  var busy: Position
}
object Busy {
  
  inline def apply(busy: Position): Busy = {
    val __obj = js.Dynamic.literal(busy = busy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Busy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Busy] (val x: Self) extends AnyVal {
    
    inline def setBusy(value: Position): Self = StObject.set(x, "busy", value.asInstanceOf[js.Any])
  }
}
