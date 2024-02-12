package typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog

import typings.litHtml.developmentLitHtmlMod.CompiledTemplate
import typings.litHtml.developmentLitHtmlMod.Part
import typings.litHtml.developmentLitHtmlMod.RenderOptions
import typings.litHtml.developmentLitHtmlMod.Template
import typings.litHtml.developmentLitHtmlMod.TemplateInstance
import typings.litHtml.litHtmlStrings.`template updating`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateUpdating
  extends StObject
     with Entry {
  
  var instance: TemplateInstance
  
  var kind: `template updating`
  
  var options: js.UndefOr[RenderOptions] = js.undefined
  
  var parts: js.Array[js.UndefOr[Part]]
  
  var template: Template | CompiledTemplate
  
  var values: js.Array[Any]
}
object TemplateUpdating {
  
  inline def apply(
    instance: TemplateInstance,
    parts: js.Array[js.UndefOr[Part]],
    template: Template | CompiledTemplate,
    values: js.Array[Any]
  ): TemplateUpdating = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], kind = "template updating", parts = parts.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateUpdating]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemplateUpdating] (val x: Self) extends AnyVal {
    
    inline def setInstance(value: TemplateInstance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setKind(value: `template updating`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: RenderOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setParts(value: js.Array[js.UndefOr[Part]]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    inline def setPartsVarargs(value: js.UndefOr[Part]*): Self = StObject.set(x, "parts", js.Array(value*))
    
    inline def setTemplate(value: Template | CompiledTemplate): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
