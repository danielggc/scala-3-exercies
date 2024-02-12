package typings.litHtml.mod.LitUnstable.DebugLog

import org.scalajs.dom.Text
import typings.litHtml.litHtmlStrings.`commit text`
import typings.litHtml.mod.RenderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitText
  extends StObject
     with CommitPartEntry {
  
  var kind: `commit text`
  
  var node: Text
  
  var options: js.UndefOr[RenderOptions] = js.undefined
  
  var value: Any
}
object CommitText {
  
  inline def apply(node: Text, value: Any): CommitText = {
    val __obj = js.Dynamic.literal(kind = "commit text", node = node.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitText]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommitText] (val x: Self) extends AnyVal {
    
    inline def setKind(value: `commit text`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setNode(value: Text): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: RenderOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
