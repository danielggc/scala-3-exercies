package typings.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arrow extends StObject {
  
  var arrow: Transform
  
  var blockLayer: ZIndex
  
  var root: Maxheight
}
object Arrow {
  
  inline def apply(arrow: Transform, blockLayer: ZIndex, root: Maxheight): Arrow = {
    val __obj = js.Dynamic.literal(arrow = arrow.asInstanceOf[js.Any], blockLayer = blockLayer.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arrow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Arrow] (val x: Self) extends AnyVal {
    
    inline def setArrow(value: Transform): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
    
    inline def setBlockLayer(value: ZIndex): Self = StObject.set(x, "blockLayer", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: Maxheight): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
