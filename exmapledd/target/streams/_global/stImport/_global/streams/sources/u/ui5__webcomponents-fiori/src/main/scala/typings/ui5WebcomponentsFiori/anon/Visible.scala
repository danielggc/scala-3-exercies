package typings.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Visible extends StObject {
  
  var dir: String
  
  var visible: Boolean
}
object Visible {
  
  inline def apply(dir: String, visible: Boolean): Visible = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Visible]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Visible] (val x: Self) extends AnyVal {
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
