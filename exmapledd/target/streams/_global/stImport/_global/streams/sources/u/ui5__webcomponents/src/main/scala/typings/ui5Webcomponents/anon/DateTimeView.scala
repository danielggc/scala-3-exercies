package typings.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTimeView extends StObject {
  
  var dateTimeView: Ui5dtcalhidden
  
  var footer: Ui5dtpickerfootertimehidden
  
  var picker: Ui5dtpickercontentphone
}
object DateTimeView {
  
  inline def apply(dateTimeView: Ui5dtcalhidden, footer: Ui5dtpickerfootertimehidden, picker: Ui5dtpickercontentphone): DateTimeView = {
    val __obj = js.Dynamic.literal(dateTimeView = dateTimeView.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateTimeView] (val x: Self) extends AnyVal {
    
    inline def setDateTimeView(value: Ui5dtcalhidden): Self = StObject.set(x, "dateTimeView", value.asInstanceOf[js.Any])
    
    inline def setFooter(value: Ui5dtpickerfootertimehidden): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setPicker(value: Ui5dtpickercontentphone): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
  }
}
