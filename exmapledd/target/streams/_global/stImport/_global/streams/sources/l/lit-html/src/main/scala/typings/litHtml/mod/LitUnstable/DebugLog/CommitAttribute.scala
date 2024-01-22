package typings.litHtml.mod.LitUnstable.DebugLog

import org.scalajs.dom.Element
import typings.litHtml.litHtmlStrings.`commit attribute`
import typings.litHtml.mod.RenderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitAttribute
  extends StObject
     with CommitPartEntry {
  
  var element: Element
  
  var kind: `commit attribute`
  
  var name: String
  
  var options: js.UndefOr[RenderOptions] = js.undefined
  
  var value: Any
}
object CommitAttribute {
  
  inline def apply(element: Element, name: String, value: Any): CommitAttribute = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], kind = "commit attribute", name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitAttribute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommitAttribute] (val x: Self) extends AnyVal {
    
    inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setKind(value: `commit attribute`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: RenderOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
