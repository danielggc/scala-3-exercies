package typings.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZIndex extends StObject {
  
  var zIndex: String | Double
}
object ZIndex {
  
  inline def apply(zIndex: String | Double): ZIndex = {
    val __obj = js.Dynamic.literal(zIndex = zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZIndex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ZIndex] (val x: Self) extends AnyVal {
    
    inline def setZIndex(value: String | Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
  }
}
