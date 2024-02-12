package typings.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ui5tliindicator extends StObject {
  
  var `ui5-tli-indicator`: Boolean
  
  var `ui5-tli-indicator-large-line`: Boolean
  
  var `ui5-tli-indicator-short-line`: Boolean
}
object Ui5tliindicator {
  
  inline def apply(
    `ui5-tli-indicator`: Boolean,
    `ui5-tli-indicator-large-line`: Boolean,
    `ui5-tli-indicator-short-line`: Boolean
  ): Ui5tliindicator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ui5-tli-indicator")(`ui5-tli-indicator`.asInstanceOf[js.Any])
    __obj.updateDynamic("ui5-tli-indicator-large-line")(`ui5-tli-indicator-large-line`.asInstanceOf[js.Any])
    __obj.updateDynamic("ui5-tli-indicator-short-line")(`ui5-tli-indicator-short-line`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ui5tliindicator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ui5tliindicator] (val x: Self) extends AnyVal {
    
    inline def `setUi5-tli-indicator`(value: Boolean): Self = StObject.set(x, "ui5-tli-indicator", value.asInstanceOf[js.Any])
    
    inline def `setUi5-tli-indicator-large-line`(value: Boolean): Self = StObject.set(x, "ui5-tli-indicator-large-line", value.asInstanceOf[js.Any])
    
    inline def `setUi5-tli-indicator-short-line`(value: Boolean): Self = StObject.set(x, "ui5-tli-indicator-short-line", value.asInstanceOf[js.Any])
  }
}
