package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCDataChannelEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var channel: org.scalajs.dom.RTCDataChannel
}
object RTCDataChannelEventInit {
  
  inline def apply(channel: org.scalajs.dom.RTCDataChannel): RTCDataChannelEventInit = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDataChannelEventInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RTCDataChannelEventInit] (val x: Self) extends AnyVal {
    
    inline def setChannel(value: org.scalajs.dom.RTCDataChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
  }
}
