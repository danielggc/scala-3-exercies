package typings.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ucnofiles extends StObject {
  
  var `uc-no-files`: Boolean
  
  var `uc-no-files-dnd-overlay`: Boolean
}
object Ucnofiles {
  
  inline def apply(`uc-no-files`: Boolean, `uc-no-files-dnd-overlay`: Boolean): Ucnofiles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("uc-no-files")(`uc-no-files`.asInstanceOf[js.Any])
    __obj.updateDynamic("uc-no-files-dnd-overlay")(`uc-no-files-dnd-overlay`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ucnofiles]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ucnofiles] (val x: Self) extends AnyVal {
    
    inline def `setUc-no-files`(value: Boolean): Self = StObject.set(x, "uc-no-files", value.asInstanceOf[js.Any])
    
    inline def `setUc-no-files-dnd-overlay`(value: Boolean): Self = StObject.set(x, "uc-no-files-dnd-overlay", value.asInstanceOf[js.Any])
  }
}
