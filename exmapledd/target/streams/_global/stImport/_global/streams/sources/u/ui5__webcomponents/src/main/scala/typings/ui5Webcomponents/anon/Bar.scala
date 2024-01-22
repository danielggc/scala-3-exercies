package typings.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bar extends StObject {
  
  var bar: Transitionduration
}
object Bar {
  
  inline def apply(bar: Transitionduration): Bar = {
    val __obj = js.Dynamic.literal(bar = bar.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bar] (val x: Self) extends AnyVal {
    
    inline def setBar(value: Transitionduration): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
  }
}
