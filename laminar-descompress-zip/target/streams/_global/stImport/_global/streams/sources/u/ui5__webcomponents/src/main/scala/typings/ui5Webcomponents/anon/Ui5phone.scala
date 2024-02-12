package typings.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ui5phone extends StObject {
  
  var `ui5-phone`: Boolean
  
  var `ui5-time-selection-root`: Boolean
}
object Ui5phone {
  
  inline def apply(`ui5-phone`: Boolean, `ui5-time-selection-root`: Boolean): Ui5phone = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ui5-phone")(`ui5-phone`.asInstanceOf[js.Any])
    __obj.updateDynamic("ui5-time-selection-root")(`ui5-time-selection-root`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ui5phone]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ui5phone] (val x: Self) extends AnyVal {
    
    inline def `setUi5-phone`(value: Boolean): Self = StObject.set(x, "ui5-phone", value.asInstanceOf[js.Any])
    
    inline def `setUi5-time-selection-root`(value: Boolean): Self = StObject.set(x, "ui5-time-selection-root", value.asInstanceOf[js.Any])
  }
}
