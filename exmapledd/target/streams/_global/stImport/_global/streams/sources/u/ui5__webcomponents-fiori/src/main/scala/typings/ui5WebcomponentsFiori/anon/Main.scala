package typings.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Main extends StObject {
  
  var main: Height
  
  var root: Flexwrap
  
  var side: Height
}
object Main {
  
  inline def apply(main: Height, root: Flexwrap, side: Height): Main = {
    val __obj = js.Dynamic.literal(main = main.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any])
    __obj.asInstanceOf[Main]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Main] (val x: Self) extends AnyVal {
    
    inline def setMain(value: Height): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: Flexwrap): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setSide(value: Height): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
  }
}
