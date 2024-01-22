package typings.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RootBackgroundcolor extends StObject {
  
  var root: Backgroundcolor
}
object RootBackgroundcolor {
  
  inline def apply(root: Backgroundcolor): RootBackgroundcolor = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootBackgroundcolor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RootBackgroundcolor] (val x: Self) extends AnyVal {
    
    inline def setRoot(value: Backgroundcolor): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
