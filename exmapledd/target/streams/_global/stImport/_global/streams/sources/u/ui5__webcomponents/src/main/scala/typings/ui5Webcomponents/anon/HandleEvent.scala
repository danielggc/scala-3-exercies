package typings.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandleEvent extends StObject {
  
  def handleEvent(): Unit
  
  var passive: Boolean
}
object HandleEvent {
  
  inline def apply(handleEvent: () => Unit, passive: Boolean): HandleEvent = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction0(handleEvent), passive = passive.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HandleEvent] (val x: Self) extends AnyVal {
    
    inline def setHandleEvent(value: () => Unit): Self = StObject.set(x, "handleEvent", js.Any.fromFunction0(value))
    
    inline def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
  }
}
