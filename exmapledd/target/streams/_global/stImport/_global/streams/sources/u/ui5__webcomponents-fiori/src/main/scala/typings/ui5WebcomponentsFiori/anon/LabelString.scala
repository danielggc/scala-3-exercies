package typings.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelString extends StObject {
  
  var label: String
}
object LabelString {
  
  inline def apply(label: String): LabelString = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelString] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
