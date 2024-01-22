package typings.litHtml.mod.LitUnstable.DebugLog

import typings.litHtml.litHtmlStrings.`commit nothing to child`
import typings.litHtml.mod.Disconnectable
import typings.litHtml.mod.RenderOptions
import typings.std.ChildNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitNothingToChildEntry
  extends StObject
     with CommitPartEntry {
  
  var end: ChildNode | Null
  
  var kind: `commit nothing to child`
  
  var options: js.UndefOr[RenderOptions] = js.undefined
  
  var parent: js.UndefOr[Disconnectable] = js.undefined
  
  var start: ChildNode
}
object CommitNothingToChildEntry {
  
  inline def apply(start: ChildNode): CommitNothingToChildEntry = {
    val __obj = js.Dynamic.literal(kind = "commit nothing to child", start = start.asInstanceOf[js.Any], end = null)
    __obj.asInstanceOf[CommitNothingToChildEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommitNothingToChildEntry] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: ChildNode): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndNull: Self = StObject.set(x, "end", null)
    
    inline def setKind(value: `commit nothing to child`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: RenderOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setParent(value: Disconnectable): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setStart(value: ChildNode): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
