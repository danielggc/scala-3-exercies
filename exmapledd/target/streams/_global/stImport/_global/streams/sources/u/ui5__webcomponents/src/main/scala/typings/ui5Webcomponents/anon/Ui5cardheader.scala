package typings.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ui5cardheader extends StObject {
  
  var `ui5-card-header`: Boolean
  
  var `ui5-card-header--active`: Boolean
  
  var `ui5-card-header--interactive`: Boolean
  
  var `ui5-card-header-ff`: Boolean
}
object Ui5cardheader {
  
  inline def apply(
    `ui5-card-header`: Boolean,
    `ui5-card-header--active`: Boolean,
    `ui5-card-header--interactive`: Boolean,
    `ui5-card-header-ff`: Boolean
  ): Ui5cardheader = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ui5-card-header")(`ui5-card-header`.asInstanceOf[js.Any])
    __obj.updateDynamic("ui5-card-header--active")(`ui5-card-header--active`.asInstanceOf[js.Any])
    __obj.updateDynamic("ui5-card-header--interactive")(`ui5-card-header--interactive`.asInstanceOf[js.Any])
    __obj.updateDynamic("ui5-card-header-ff")(`ui5-card-header-ff`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ui5cardheader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ui5cardheader] (val x: Self) extends AnyVal {
    
    inline def `setUi5-card-header`(value: Boolean): Self = StObject.set(x, "ui5-card-header", value.asInstanceOf[js.Any])
    
    inline def `setUi5-card-header--active`(value: Boolean): Self = StObject.set(x, "ui5-card-header--active", value.asInstanceOf[js.Any])
    
    inline def `setUi5-card-header--interactive`(value: Boolean): Self = StObject.set(x, "ui5-card-header--interactive", value.asInstanceOf[js.Any])
    
    inline def `setUi5-card-header-ff`(value: Boolean): Self = StObject.set(x, "ui5-card-header-ff", value.asInstanceOf[js.Any])
  }
}
