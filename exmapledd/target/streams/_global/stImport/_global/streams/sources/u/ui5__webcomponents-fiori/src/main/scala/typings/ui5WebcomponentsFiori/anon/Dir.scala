package typings.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dir extends StObject {
  
  var dir: Null
  
  var visible: Boolean
}
object Dir {
  
  inline def apply(dir: Null, visible: Boolean): Dir = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dir]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dir] (val x: Self) extends AnyVal {
    
    inline def setDir(value: Null): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
