package typings.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeaderBtn extends StObject {
  
  var headerBtn: Ui5panelheaderbuttonanimated
}
object HeaderBtn {
  
  inline def apply(headerBtn: Ui5panelheaderbuttonanimated): HeaderBtn = {
    val __obj = js.Dynamic.literal(headerBtn = headerBtn.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderBtn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeaderBtn] (val x: Self) extends AnyVal {
    
    inline def setHeaderBtn(value: Ui5panelheaderbuttonanimated): Self = StObject.set(x, "headerBtn", value.asInstanceOf[js.Any])
  }
}
