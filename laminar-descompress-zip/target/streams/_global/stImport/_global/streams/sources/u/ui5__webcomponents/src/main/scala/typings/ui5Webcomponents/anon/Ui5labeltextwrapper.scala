package typings.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ui5labeltextwrapper extends StObject {
  
  var `ui5-label-text-wrapper`: Boolean
  
  var `ui5-label-text-wrapper-safari`: Boolean
}
object Ui5labeltextwrapper {
  
  inline def apply(`ui5-label-text-wrapper`: Boolean, `ui5-label-text-wrapper-safari`: Boolean): Ui5labeltextwrapper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ui5-label-text-wrapper")(`ui5-label-text-wrapper`.asInstanceOf[js.Any])
    __obj.updateDynamic("ui5-label-text-wrapper-safari")(`ui5-label-text-wrapper-safari`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ui5labeltextwrapper]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ui5labeltextwrapper] (val x: Self) extends AnyVal {
    
    inline def `setUi5-label-text-wrapper`(value: Boolean): Self = StObject.set(x, "ui5-label-text-wrapper", value.asInstanceOf[js.Any])
    
    inline def `setUi5-label-text-wrapper-safari`(value: Boolean): Self = StObject.set(x, "ui5-label-text-wrapper-safari", value.asInstanceOf[js.Any])
  }
}
