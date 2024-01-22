package typings.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transitionduration extends StObject {
  
  var `transition-duration`: String
  
  var width: String
}
object Transitionduration {
  
  inline def apply(`transition-duration`: String, width: String): Transitionduration = {
    val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("transition-duration")(`transition-duration`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transitionduration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Transitionduration] (val x: Self) extends AnyVal {
    
    inline def `setTransition-duration`(value: String): Self = StObject.set(x, "transition-duration", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
