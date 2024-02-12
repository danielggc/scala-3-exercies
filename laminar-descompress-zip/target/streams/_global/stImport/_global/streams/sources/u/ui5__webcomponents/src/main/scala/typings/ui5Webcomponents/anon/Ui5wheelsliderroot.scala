package typings.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ui5wheelsliderroot extends StObject {
  
  var `ui5-phone`: Boolean
  
  var `ui5-wheelslider-root`: Boolean
}
object Ui5wheelsliderroot {
  
  inline def apply(`ui5-phone`: Boolean, `ui5-wheelslider-root`: Boolean): Ui5wheelsliderroot = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ui5-phone")(`ui5-phone`.asInstanceOf[js.Any])
    __obj.updateDynamic("ui5-wheelslider-root")(`ui5-wheelslider-root`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ui5wheelsliderroot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ui5wheelsliderroot] (val x: Self) extends AnyVal {
    
    inline def `setUi5-phone`(value: Boolean): Self = StObject.set(x, "ui5-phone", value.asInstanceOf[js.Any])
    
    inline def `setUi5-wheelslider-root`(value: Boolean): Self = StObject.set(x, "ui5-wheelslider-root", value.asInstanceOf[js.Any])
  }
}
