package typings.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrowsArray extends StObject {
  
  var arrows: js.Array[Separator | DirSeparator]
  
  var layout: js.Array[String]
}
object ArrowsArray {
  
  inline def apply(arrows: js.Array[Separator | DirSeparator], layout: js.Array[String]): ArrowsArray = {
    val __obj = js.Dynamic.literal(arrows = arrows.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowsArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrowsArray] (val x: Self) extends AnyVal {
    
    inline def setArrows(value: js.Array[Separator | DirSeparator]): Self = StObject.set(x, "arrows", value.asInstanceOf[js.Any])
    
    inline def setArrowsVarargs(value: (Separator | DirSeparator)*): Self = StObject.set(x, "arrows", js.Array(value*))
    
    inline def setLayout(value: js.Array[String]): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutVarargs(value: String*): Self = StObject.set(x, "layout", js.Array(value*))
  }
}
