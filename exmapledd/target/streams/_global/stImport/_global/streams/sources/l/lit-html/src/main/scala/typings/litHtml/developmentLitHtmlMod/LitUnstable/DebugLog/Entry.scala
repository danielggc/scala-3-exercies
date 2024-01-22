package typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog

import org.scalajs.dom.DocumentFragment
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import org.scalajs.dom.Text
import typings.litHtml.developmentLitHtmlMod.ChildPart
import typings.litHtml.developmentLitHtmlMod.CompiledTemplate
import typings.litHtml.developmentLitHtmlMod.Part
import typings.litHtml.developmentLitHtmlMod.Template
import typings.litHtml.developmentLitHtmlMod.TemplateInstance
import typings.litHtml.developmentLitHtmlMod.TemplatePart
import typings.std.ChildNode
import typings.std.HTMLTemplateElement
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog.TemplatePrep
  - typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog.TemplateInstantiated
  - typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog.TemplateInstantiatedAndUpdated
  - typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog.TemplateUpdating
  - typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog.BeginRender
  - typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog.EndRender
  - typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog.CommitPartEntry
  - typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog.SetPartValue
*/
trait Entry extends StObject
object Entry {
  
  inline def BeginRender(container: HTMLElement | DocumentFragment, id: Double, value: Any): typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog.BeginRender = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = "begin render", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog.BeginRender]
  }
  
  inline def CommitAttribute(element: Element, name: String, value: Any): typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog.CommitAttribute = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], kind = "commit attribute", name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog.CommitAttribute]
  }
  
  inline def CommitBooleanAttribute(element: Element, name: String, value: Boolean): typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog.CommitBooleanAttribute = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], kind = "commit boolean attribute", name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog.CommitBooleanAttribute]
  }
  
  inline def CommitEventListener(
    addListener: Boolean,
    element: Element,
    name: String,
    oldListener: Any,
    removeListener: Boolean,
    value: Any
  ): typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog.CommitEventListener = {
    val __obj = js.Dynamic.literal(addListener = addListener.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], kind = "commit event listener", name = name.asInstanceOf[js.Any], oldListener = oldListener.asInstanceOf[js.Any], removeListener = removeListener.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog.CommitEventListener]
  }
  
  inline def CommitNode(start: Node, value: Node): typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog.CommitNode = {
    val __obj = js.Dynamic.literal(kind = "commit node", start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog.CommitNode]
  }
  
  inline def CommitNothingToChildEntry(start: ChildNode): typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog.CommitNothingToChildEntry = {
    val __obj = js.Dynamic.literal(kind = "commit nothing to child", start = start.asInstanceOf[js.Any], end = null)
    __obj.asInstanceOf[typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog.CommitNothingToChildEntry]
  }
  
  inline def CommitProperty(element: Element, name: String, value: Any): typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog.CommitProperty = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], kind = "commit property", name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog.CommitProperty]
  }
  
  inline def CommitText(node: Text, value: Any): typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog.CommitText = {
    val __obj = js.Dynamic.literal(kind = "commit text", node = node.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog.CommitText]
  }
  
  inline def CommitToElementBinding(element: Element, value: Any): typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog.CommitToElementBinding = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], kind = "commit to element binding", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog.CommitToElementBinding]
  }
  
  inline def EndRender(container: HTMLElement | DocumentFragment, id: Double, part: ChildPart, value: Any): typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog.EndRender = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = "end render", part = part.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog.EndRender]
  }
  
  inline def SetPartValue(
    part: Part,
    templateInstance: TemplateInstance,
    value: Any,
    valueIndex: Double,
    values: js.Array[Any]
  ): typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog.SetPartValue = {
    val __obj = js.Dynamic.literal(kind = "set part", part = part.asInstanceOf[js.Any], templateInstance = templateInstance.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueIndex = valueIndex.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog.SetPartValue]
  }
  
  inline def TemplateInstantiated(
    fragment: Node,
    instance: TemplateInstance,
    parts: js.Array[js.UndefOr[Part]],
    template: Template | CompiledTemplate,
    values: js.Array[Any]
  ): typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog.TemplateInstantiated = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], kind = "template instantiated", parts = parts.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog.TemplateInstantiated]
  }
  
  inline def TemplateInstantiatedAndUpdated(
    fragment: Node,
    instance: TemplateInstance,
    parts: js.Array[js.UndefOr[Part]],
    template: Template | CompiledTemplate,
    values: js.Array[Any]
  ): typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog.TemplateInstantiatedAndUpdated = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], kind = "template instantiated and updated", parts = parts.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog.TemplateInstantiatedAndUpdated]
  }
  
  inline def TemplatePrep(
    clonableTemplate: HTMLTemplateElement,
    parts: js.Array[TemplatePart],
    strings: TemplateStringsArray,
    template: Template
  ): typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog.TemplatePrep = {
    val __obj = js.Dynamic.literal(clonableTemplate = clonableTemplate.asInstanceOf[js.Any], kind = "template prep", parts = parts.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog.TemplatePrep]
  }
  
  inline def TemplateUpdating(
    instance: TemplateInstance,
    parts: js.Array[js.UndefOr[Part]],
    template: Template | CompiledTemplate,
    values: js.Array[Any]
  ): typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog.TemplateUpdating = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], kind = "template updating", parts = parts.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog.TemplateUpdating]
  }
}
