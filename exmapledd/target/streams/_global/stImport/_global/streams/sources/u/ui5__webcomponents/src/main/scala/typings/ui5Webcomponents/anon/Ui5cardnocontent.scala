package typings.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ui5cardnocontent extends StObject {
  
  var `ui5-card--nocontent`: Boolean
  
  var `ui5-card-root`: Boolean
}
object Ui5cardnocontent {
  
  inline def apply(`ui5-card--nocontent`: Boolean, `ui5-card-root`: Boolean): Ui5cardnocontent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ui5-card--nocontent")(`ui5-card--nocontent`.asInstanceOf[js.Any])
    __obj.updateDynamic("ui5-card-root")(`ui5-card-root`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ui5cardnocontent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ui5cardnocontent] (val x: Self) extends AnyVal {
    
    inline def `setUi5-card--nocontent`(value: Boolean): Self = StObject.set(x, "ui5-card--nocontent", value.asInstanceOf[js.Any])
    
    inline def `setUi5-card-root`(value: Boolean): Self = StObject.set(x, "ui5-card-root", value.asInstanceOf[js.Any])
  }
}
