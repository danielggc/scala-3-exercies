package typings.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ui5dtpickercontentphone extends StObject {
  
  var `ui5-dt-picker-content--phone`: Boolean
}
object Ui5dtpickercontentphone {
  
  inline def apply(`ui5-dt-picker-content--phone`: Boolean): Ui5dtpickercontentphone = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ui5-dt-picker-content--phone")(`ui5-dt-picker-content--phone`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ui5dtpickercontentphone]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ui5dtpickercontentphone] (val x: Self) extends AnyVal {
    
    inline def `setUi5-dt-picker-content--phone`(value: Boolean): Self = StObject.set(x, "ui5-dt-picker-content--phone", value.asInstanceOf[js.Any])
  }
}
