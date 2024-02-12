package typings.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ui5panelheaderbuttonanimated extends StObject {
  
  var `ui5-panel-header-button-animated`: Boolean
}
object Ui5panelheaderbuttonanimated {
  
  inline def apply(`ui5-panel-header-button-animated`: Boolean): Ui5panelheaderbuttonanimated = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ui5-panel-header-button-animated")(`ui5-panel-header-button-animated`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ui5panelheaderbuttonanimated]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ui5panelheaderbuttonanimated] (val x: Self) extends AnyVal {
    
    inline def `setUi5-panel-header-button-animated`(value: Boolean): Self = StObject.set(x, "ui5-panel-header-button-animated", value.asInstanceOf[js.Any])
  }
}
