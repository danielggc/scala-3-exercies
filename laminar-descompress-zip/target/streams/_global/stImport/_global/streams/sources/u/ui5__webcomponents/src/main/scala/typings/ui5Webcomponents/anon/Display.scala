package typings.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Display extends StObject {
  
  var display: String
  
  var `justify-content`: String
}
object Display {
  
  inline def apply(display: String, `justify-content`: String): Display = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any])
    __obj.updateDynamic("justify-content")(`justify-content`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Display]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Display] (val x: Self) extends AnyVal {
    
    inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def `setJustify-content`(value: String): Self = StObject.set(x, "justify-content", value.asInstanceOf[js.Any])
  }
}
