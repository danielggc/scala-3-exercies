package typings.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Circle extends StObject {
  
  var circle: Left
  
  var colorSpan: Backgroundcolor
  
  var mainColor: Backgroundcolor
}
object Circle {
  
  inline def apply(circle: Left, colorSpan: Backgroundcolor, mainColor: Backgroundcolor): Circle = {
    val __obj = js.Dynamic.literal(circle = circle.asInstanceOf[js.Any], colorSpan = colorSpan.asInstanceOf[js.Any], mainColor = mainColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Circle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Circle] (val x: Self) extends AnyVal {
    
    inline def setCircle(value: Left): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
    
    inline def setColorSpan(value: Backgroundcolor): Self = StObject.set(x, "colorSpan", value.asInstanceOf[js.Any])
    
    inline def setMainColor(value: Backgroundcolor): Self = StObject.set(x, "mainColor", value.asInstanceOf[js.Any])
  }
}
