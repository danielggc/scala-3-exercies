package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventSourceEventMap extends StObject {
  
  /* standard dom */
  var error: org.scalajs.dom.Event
  
  /* standard dom */
  var message: org.scalajs.dom.MessageEvent
  
  /* standard dom */
  var open: org.scalajs.dom.Event
}
object EventSourceEventMap {
  
  inline def apply(error: org.scalajs.dom.Event, message: org.scalajs.dom.MessageEvent, open: org.scalajs.dom.Event): EventSourceEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSourceEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventSourceEventMap] (val x: Self) extends AnyVal {
    
    inline def setError(value: org.scalajs.dom.Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: org.scalajs.dom.MessageEvent): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: org.scalajs.dom.Event): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
  }
}
