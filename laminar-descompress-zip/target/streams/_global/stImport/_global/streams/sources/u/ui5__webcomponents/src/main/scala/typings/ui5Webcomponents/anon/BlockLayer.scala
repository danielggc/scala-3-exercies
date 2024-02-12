package typings.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockLayer extends StObject {
  
  var blockLayer: ZIndex
}
object BlockLayer {
  
  inline def apply(blockLayer: ZIndex): BlockLayer = {
    val __obj = js.Dynamic.literal(blockLayer = blockLayer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockLayer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockLayer] (val x: Self) extends AnyVal {
    
    inline def setBlockLayer(value: ZIndex): Self = StObject.set(x, "blockLayer", value.asInstanceOf[js.Any])
  }
}
