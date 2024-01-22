package typings.litHtml.mod.LitUnstable.DebugLog

import org.scalajs.dom.Node
import typings.litHtml.litHtmlStrings.`commit node`
import typings.litHtml.mod.Disconnectable
import typings.litHtml.mod.RenderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitNode
  extends StObject
     with CommitPartEntry {
  
  var kind: `commit node`
  
  var options: js.UndefOr[RenderOptions] = js.undefined
  
  var parent: js.UndefOr[Disconnectable] = js.undefined
  
  var start: Node
  
  var value: Node
}
object CommitNode {
  
  inline def apply(start: Node, value: Node): CommitNode = {
    val __obj = js.Dynamic.literal(kind = "commit node", start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommitNode] (val x: Self) extends AnyVal {
    
    inline def setKind(value: `commit node`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: RenderOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setParent(value: Disconnectable): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setStart(value: Node): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Node): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
