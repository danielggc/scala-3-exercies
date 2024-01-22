package typings.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirSeparator extends StObject {
  
  var dir: String
  
  var separator: Unit
  
  var visible: Boolean
}
object DirSeparator {
  
  inline def apply(dir: String, separator: Unit, visible: Boolean): DirSeparator = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirSeparator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirSeparator] (val x: Self) extends AnyVal {
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setSeparator(value: Unit): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
