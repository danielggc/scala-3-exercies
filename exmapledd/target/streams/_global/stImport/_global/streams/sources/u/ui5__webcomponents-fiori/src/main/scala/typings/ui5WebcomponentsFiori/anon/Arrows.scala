package typings.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arrows extends StObject {
  
  var arrows: js.Array[Dir]
  
  var layout: js.Array[String | Double]
}
object Arrows {
  
  inline def apply(arrows: js.Array[Dir], layout: js.Array[String | Double]): Arrows = {
    val __obj = js.Dynamic.literal(arrows = arrows.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arrows]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Arrows] (val x: Self) extends AnyVal {
    
    inline def setArrows(value: js.Array[Dir]): Self = StObject.set(x, "arrows", value.asInstanceOf[js.Any])
    
    inline def setArrowsVarargs(value: Dir*): Self = StObject.set(x, "arrows", js.Array(value*))
    
    inline def setLayout(value: js.Array[String | Double]): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutVarargs(value: (String | Double)*): Self = StObject.set(x, "layout", js.Array(value*))
  }
}
