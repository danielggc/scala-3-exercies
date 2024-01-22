package typings.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RootUi5phone extends StObject {
  
  var root: Ui5phone
}
object RootUi5phone {
  
  inline def apply(root: Ui5phone): RootUi5phone = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootUi5phone]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RootUi5phone] (val x: Self) extends AnyVal {
    
    inline def setRoot(value: Ui5phone): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
