package typings.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThreeColumnsMidExpanded extends StObject {
  
  var ThreeColumnsEndExpanded: String
  
  var ThreeColumnsMidExpanded: String
  
  var ThreeColumnsMidExpandedEndHidden: String
  
  var ThreeColumnsStartExpandedEndHidden: String
}
object ThreeColumnsMidExpanded {
  
  inline def apply(
    ThreeColumnsEndExpanded: String,
    ThreeColumnsMidExpanded: String,
    ThreeColumnsMidExpandedEndHidden: String,
    ThreeColumnsStartExpandedEndHidden: String
  ): ThreeColumnsMidExpanded = {
    val __obj = js.Dynamic.literal(ThreeColumnsEndExpanded = ThreeColumnsEndExpanded.asInstanceOf[js.Any], ThreeColumnsMidExpanded = ThreeColumnsMidExpanded.asInstanceOf[js.Any], ThreeColumnsMidExpandedEndHidden = ThreeColumnsMidExpandedEndHidden.asInstanceOf[js.Any], ThreeColumnsStartExpandedEndHidden = ThreeColumnsStartExpandedEndHidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeColumnsMidExpanded]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThreeColumnsMidExpanded] (val x: Self) extends AnyVal {
    
    inline def setThreeColumnsEndExpanded(value: String): Self = StObject.set(x, "ThreeColumnsEndExpanded", value.asInstanceOf[js.Any])
    
    inline def setThreeColumnsMidExpanded(value: String): Self = StObject.set(x, "ThreeColumnsMidExpanded", value.asInstanceOf[js.Any])
    
    inline def setThreeColumnsMidExpandedEndHidden(value: String): Self = StObject.set(x, "ThreeColumnsMidExpandedEndHidden", value.asInstanceOf[js.Any])
    
    inline def setThreeColumnsStartExpandedEndHidden(value: String): Self = StObject.set(x, "ThreeColumnsStartExpandedEndHidden", value.asInstanceOf[js.Any])
  }
}
