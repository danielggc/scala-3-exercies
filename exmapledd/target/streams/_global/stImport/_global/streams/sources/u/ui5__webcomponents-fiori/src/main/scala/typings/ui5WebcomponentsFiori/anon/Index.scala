package typings.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Index extends StObject {
  
  var index: Double
  
  var selected: Boolean
  
  var text: String
}
object Index {
  
  inline def apply(index: Double, selected: Boolean, text: String): Index = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
