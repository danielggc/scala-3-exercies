package typings.litHtml.mod.LitUnstable.DebugLog

import org.scalajs.dom.Element
import typings.litHtml.litHtmlStrings.`commit to element binding`
import typings.litHtml.mod.RenderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitToElementBinding
  extends StObject
     with CommitPartEntry {
  
  var element: Element
  
  var kind: `commit to element binding`
  
  var options: js.UndefOr[RenderOptions] = js.undefined
  
  var value: Any
}
object CommitToElementBinding {
  
  inline def apply(element: Element, value: Any): CommitToElementBinding = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], kind = "commit to element binding", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitToElementBinding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommitToElementBinding] (val x: Self) extends AnyVal {
    
    inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setKind(value: `commit to element binding`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: RenderOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
