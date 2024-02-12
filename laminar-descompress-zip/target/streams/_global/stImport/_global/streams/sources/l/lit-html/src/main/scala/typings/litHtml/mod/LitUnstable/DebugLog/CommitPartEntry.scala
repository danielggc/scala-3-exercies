package typings.litHtml.mod.LitUnstable.DebugLog

import org.scalajs.dom.Element
import org.scalajs.dom.Node
import org.scalajs.dom.Text
import typings.std.ChildNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.litHtml.mod.LitUnstable.DebugLog.CommitNothingToChildEntry
  - typings.litHtml.mod.LitUnstable.DebugLog.CommitText
  - typings.litHtml.mod.LitUnstable.DebugLog.CommitNode
  - typings.litHtml.mod.LitUnstable.DebugLog.CommitAttribute
  - typings.litHtml.mod.LitUnstable.DebugLog.CommitProperty
  - typings.litHtml.mod.LitUnstable.DebugLog.CommitBooleanAttribute
  - typings.litHtml.mod.LitUnstable.DebugLog.CommitEventListener
  - typings.litHtml.mod.LitUnstable.DebugLog.CommitToElementBinding
*/
trait CommitPartEntry
  extends StObject
     with Entry
object CommitPartEntry {
  
  inline def CommitAttribute(element: Element, name: String, value: Any): typings.litHtml.mod.LitUnstable.DebugLog.CommitAttribute = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], kind = "commit attribute", name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.litHtml.mod.LitUnstable.DebugLog.CommitAttribute]
  }
  
  inline def CommitBooleanAttribute(element: Element, name: String, value: Boolean): typings.litHtml.mod.LitUnstable.DebugLog.CommitBooleanAttribute = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], kind = "commit boolean attribute", name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.litHtml.mod.LitUnstable.DebugLog.CommitBooleanAttribute]
  }
  
  inline def CommitEventListener(
    addListener: Boolean,
    element: Element,
    name: String,
    oldListener: Any,
    removeListener: Boolean,
    value: Any
  ): typings.litHtml.mod.LitUnstable.DebugLog.CommitEventListener = {
    val __obj = js.Dynamic.literal(addListener = addListener.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], kind = "commit event listener", name = name.asInstanceOf[js.Any], oldListener = oldListener.asInstanceOf[js.Any], removeListener = removeListener.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.litHtml.mod.LitUnstable.DebugLog.CommitEventListener]
  }
  
  inline def CommitNode(start: Node, value: Node): typings.litHtml.mod.LitUnstable.DebugLog.CommitNode = {
    val __obj = js.Dynamic.literal(kind = "commit node", start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.litHtml.mod.LitUnstable.DebugLog.CommitNode]
  }
  
  inline def CommitNothingToChildEntry(start: ChildNode): typings.litHtml.mod.LitUnstable.DebugLog.CommitNothingToChildEntry = {
    val __obj = js.Dynamic.literal(kind = "commit nothing to child", start = start.asInstanceOf[js.Any], end = null)
    __obj.asInstanceOf[typings.litHtml.mod.LitUnstable.DebugLog.CommitNothingToChildEntry]
  }
  
  inline def CommitProperty(element: Element, name: String, value: Any): typings.litHtml.mod.LitUnstable.DebugLog.CommitProperty = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], kind = "commit property", name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.litHtml.mod.LitUnstable.DebugLog.CommitProperty]
  }
  
  inline def CommitText(node: Text, value: Any): typings.litHtml.mod.LitUnstable.DebugLog.CommitText = {
    val __obj = js.Dynamic.literal(kind = "commit text", node = node.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.litHtml.mod.LitUnstable.DebugLog.CommitText]
  }
  
  inline def CommitToElementBinding(element: Element, value: Any): typings.litHtml.mod.LitUnstable.DebugLog.CommitToElementBinding = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], kind = "commit to element binding", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.litHtml.mod.LitUnstable.DebugLog.CommitToElementBinding]
  }
}
