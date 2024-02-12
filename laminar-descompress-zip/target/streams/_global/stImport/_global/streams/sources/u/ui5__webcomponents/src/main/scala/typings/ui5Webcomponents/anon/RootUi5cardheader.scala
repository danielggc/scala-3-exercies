package typings.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RootUi5cardheader extends StObject {
  
  var root: Ui5cardheader
}
object RootUi5cardheader {
  
  inline def apply(root: Ui5cardheader): RootUi5cardheader = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootUi5cardheader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RootUi5cardheader] (val x: Self) extends AnyVal {
    
    inline def setRoot(value: Ui5cardheader): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
