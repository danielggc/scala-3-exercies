package typings.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ui5dtcalhidden extends StObject {
  
  var `ui5-dt-cal--hidden`: Boolean
  
  var `ui5-dt-time--hidden`: Boolean
}
object Ui5dtcalhidden {
  
  inline def apply(`ui5-dt-cal--hidden`: Boolean, `ui5-dt-time--hidden`: Boolean): Ui5dtcalhidden = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ui5-dt-cal--hidden")(`ui5-dt-cal--hidden`.asInstanceOf[js.Any])
    __obj.updateDynamic("ui5-dt-time--hidden")(`ui5-dt-time--hidden`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ui5dtcalhidden]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ui5dtcalhidden] (val x: Self) extends AnyVal {
    
    inline def `setUi5-dt-cal--hidden`(value: Boolean): Self = StObject.set(x, "ui5-dt-cal--hidden", value.asInstanceOf[js.Any])
    
    inline def `setUi5-dt-time--hidden`(value: Boolean): Self = StObject.set(x, "ui5-dt-time--hidden", value.asInstanceOf[js.Any])
  }
}
