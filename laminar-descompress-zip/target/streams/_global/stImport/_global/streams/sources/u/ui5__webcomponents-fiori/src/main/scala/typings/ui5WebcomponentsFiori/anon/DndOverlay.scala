package typings.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DndOverlay extends StObject {
  
  var content: Ui5uccontent
  
  var dndOverlay: Ucdndoverlay
  
  var noFiles: Ucnofiles
}
object DndOverlay {
  
  inline def apply(content: Ui5uccontent, dndOverlay: Ucdndoverlay, noFiles: Ucnofiles): DndOverlay = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], dndOverlay = dndOverlay.asInstanceOf[js.Any], noFiles = noFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[DndOverlay]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DndOverlay] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Ui5uccontent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setDndOverlay(value: Ucdndoverlay): Self = StObject.set(x, "dndOverlay", value.asInstanceOf[js.Any])
    
    inline def setNoFiles(value: Ucnofiles): Self = StObject.set(x, "noFiles", value.asInstanceOf[js.Any])
  }
}
