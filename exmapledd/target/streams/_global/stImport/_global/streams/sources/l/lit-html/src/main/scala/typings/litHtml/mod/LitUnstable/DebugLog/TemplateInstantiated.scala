package typings.litHtml.mod.LitUnstable.DebugLog

import org.scalajs.dom.Node
import typings.litHtml.litHtmlStrings.`template instantiated`
import typings.litHtml.mod.CompiledTemplate
import typings.litHtml.mod.Part
import typings.litHtml.mod.RenderOptions
import typings.litHtml.mod.Template
import typings.litHtml.mod.TemplateInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateInstantiated
  extends StObject
     with Entry {
  
  var fragment: Node
  
  var instance: TemplateInstance
  
  var kind: `template instantiated`
  
  var options: js.UndefOr[RenderOptions] = js.undefined
  
  var parts: js.Array[js.UndefOr[Part]]
  
  var template: Template | CompiledTemplate
  
  var values: js.Array[Any]
}
object TemplateInstantiated {
  
  inline def apply(
    fragment: Node,
    instance: TemplateInstance,
    parts: js.Array[js.UndefOr[Part]],
    template: Template | CompiledTemplate,
    values: js.Array[Any]
  ): TemplateInstantiated = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], kind = "template instantiated", parts = parts.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateInstantiated]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemplateInstantiated] (val x: Self) extends AnyVal {
    
    inline def setFragment(value: Node): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    
    inline def setInstance(value: TemplateInstance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setKind(value: `template instantiated`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: RenderOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setParts(value: js.Array[js.UndefOr[Part]]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    inline def setPartsVarargs(value: js.UndefOr[Part]*): Self = StObject.set(x, "parts", js.Array(value*))
    
    inline def setTemplate(value: Template | CompiledTemplate): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
