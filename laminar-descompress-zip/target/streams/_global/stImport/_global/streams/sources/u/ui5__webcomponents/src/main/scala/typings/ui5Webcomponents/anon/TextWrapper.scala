package typings.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextWrapper extends StObject {
  
  var textWrapper: Ui5labeltextwrapper
}
object TextWrapper {
  
  inline def apply(textWrapper: Ui5labeltextwrapper): TextWrapper = {
    val __obj = js.Dynamic.literal(textWrapper = textWrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextWrapper]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextWrapper] (val x: Self) extends AnyVal {
    
    inline def setTextWrapper(value: Ui5labeltextwrapper): Self = StObject.set(x, "textWrapper", value.asInstanceOf[js.Any])
  }
}
