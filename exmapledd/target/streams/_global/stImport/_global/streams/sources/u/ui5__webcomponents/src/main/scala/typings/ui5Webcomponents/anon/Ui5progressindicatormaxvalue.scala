package typings.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ui5progressindicatormaxvalue extends StObject {
  
  var `ui5-progress-indicator-max-value`: Boolean
  
  var `ui5-progress-indicator-min-value`: Boolean
}
object Ui5progressindicatormaxvalue {
  
  inline def apply(`ui5-progress-indicator-max-value`: Boolean, `ui5-progress-indicator-min-value`: Boolean): Ui5progressindicatormaxvalue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ui5-progress-indicator-max-value")(`ui5-progress-indicator-max-value`.asInstanceOf[js.Any])
    __obj.updateDynamic("ui5-progress-indicator-min-value")(`ui5-progress-indicator-min-value`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ui5progressindicatormaxvalue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ui5progressindicatormaxvalue] (val x: Self) extends AnyVal {
    
    inline def `setUi5-progress-indicator-max-value`(value: Boolean): Self = StObject.set(x, "ui5-progress-indicator-max-value", value.asInstanceOf[js.Any])
    
    inline def `setUi5-progress-indicator-min-value`(value: Boolean): Self = StObject.set(x, "ui5-progress-indicator-min-value", value.asInstanceOf[js.Any])
  }
}
