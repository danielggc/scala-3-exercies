package typings.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Separator extends StObject {
  
  var dir: Null
  
  var separator: Boolean
  
  var visible: Boolean
}
object Separator {
  
  inline def apply(dir: Null, separator: Boolean, visible: Boolean): Separator = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Separator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Separator] (val x: Self) extends AnyVal {
    
    inline def setDir(value: Null): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setSeparator(value: Boolean): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
