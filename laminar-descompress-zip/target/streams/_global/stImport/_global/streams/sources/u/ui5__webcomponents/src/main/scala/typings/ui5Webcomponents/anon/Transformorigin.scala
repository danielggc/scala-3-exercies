package typings.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transformorigin extends StObject {
  
  var transform: String
  
  var `transform-origin`: String
}
object Transformorigin {
  
  inline def apply(transform: String, `transform-origin`: String): Transformorigin = {
    val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any])
    __obj.updateDynamic("transform-origin")(`transform-origin`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transformorigin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Transformorigin] (val x: Self) extends AnyVal {
    
    inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def `setTransform-origin`(value: String): Self = StObject.set(x, "transform-origin", value.asInstanceOf[js.Any])
  }
}
