package typings.ui5WebcomponentsFiori.anon

import typings.ui5WebcomponentsFiori.ui5WebcomponentsFioriInts.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bottom extends StObject {
  
  var bottom: String | `0`
  
  var `padding-bottom`: String | `0`
  
  var top: String
}
object Bottom {
  
  inline def apply(bottom: String | `0`, `padding-bottom`: String | `0`, top: String): Bottom = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.updateDynamic("padding-bottom")(`padding-bottom`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bottom]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
    
    inline def setBottom(value: String | `0`): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def `setPadding-bottom`(value: String | `0`): Self = StObject.set(x, "padding-bottom", value.asInstanceOf[js.Any])
    
    inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
