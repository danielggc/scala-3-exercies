package typings.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ucdndoverlay extends StObject {
  
  var `uc-dnd-overlay`: Boolean
  
  var `uc-drag-overlay`: Boolean
  
  var `uc-drop-overlay`: Boolean
}
object Ucdndoverlay {
  
  inline def apply(`uc-dnd-overlay`: Boolean, `uc-drag-overlay`: Boolean, `uc-drop-overlay`: Boolean): Ucdndoverlay = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("uc-dnd-overlay")(`uc-dnd-overlay`.asInstanceOf[js.Any])
    __obj.updateDynamic("uc-drag-overlay")(`uc-drag-overlay`.asInstanceOf[js.Any])
    __obj.updateDynamic("uc-drop-overlay")(`uc-drop-overlay`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ucdndoverlay]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ucdndoverlay] (val x: Self) extends AnyVal {
    
    inline def `setUc-dnd-overlay`(value: Boolean): Self = StObject.set(x, "uc-dnd-overlay", value.asInstanceOf[js.Any])
    
    inline def `setUc-drag-overlay`(value: Boolean): Self = StObject.set(x, "uc-drag-overlay", value.asInstanceOf[js.Any])
    
    inline def `setUc-drop-overlay`(value: Boolean): Self = StObject.set(x, "uc-drop-overlay", value.asInstanceOf[js.Any])
  }
}
