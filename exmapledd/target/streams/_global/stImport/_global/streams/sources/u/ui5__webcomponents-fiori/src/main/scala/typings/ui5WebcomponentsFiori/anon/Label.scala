package typings.ui5WebcomponentsFiori.anon

import typings.ui5WebcomponentsFiori.distTypesBarDesignMod.BarDesign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Label extends StObject {
  
  var label: BarDesign
}
object Label {
  
  inline def apply(label: BarDesign): Label = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: BarDesign): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
