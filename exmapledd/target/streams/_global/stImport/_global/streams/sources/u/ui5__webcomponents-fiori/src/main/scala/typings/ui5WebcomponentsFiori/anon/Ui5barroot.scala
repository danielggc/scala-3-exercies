package typings.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ui5barroot extends StObject {
  
  var `ui5-bar-root`: Boolean
}
object Ui5barroot {
  
  inline def apply(`ui5-bar-root`: Boolean): Ui5barroot = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ui5-bar-root")(`ui5-bar-root`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ui5barroot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ui5barroot] (val x: Self) extends AnyVal {
    
    inline def `setUi5-bar-root`(value: Boolean): Self = StObject.set(x, "ui5-bar-root", value.asInstanceOf[js.Any])
  }
}
