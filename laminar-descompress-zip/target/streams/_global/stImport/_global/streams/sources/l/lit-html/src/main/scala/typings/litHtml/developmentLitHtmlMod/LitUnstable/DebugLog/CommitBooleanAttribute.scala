package typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog

import org.scalajs.dom.Element
import typings.litHtml.developmentLitHtmlMod.RenderOptions
import typings.litHtml.litHtmlStrings.`commit boolean attribute`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitBooleanAttribute
  extends StObject
     with CommitPartEntry {
  
  var element: Element
  
  var kind: `commit boolean attribute`
  
  var name: String
  
  var options: js.UndefOr[RenderOptions] = js.undefined
  
  var value: Boolean
}
object CommitBooleanAttribute {
  
  inline def apply(element: Element, name: String, value: Boolean): CommitBooleanAttribute = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], kind = "commit boolean attribute", name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitBooleanAttribute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommitBooleanAttribute] (val x: Self) extends AnyVal {
    
    inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setKind(value: `commit boolean attribute`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: RenderOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
