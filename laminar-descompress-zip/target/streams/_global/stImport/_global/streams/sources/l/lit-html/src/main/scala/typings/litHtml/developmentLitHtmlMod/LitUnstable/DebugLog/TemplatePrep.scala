package typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog

import typings.litHtml.developmentLitHtmlMod.Template
import typings.litHtml.developmentLitHtmlMod.TemplatePart
import typings.litHtml.litHtmlStrings.`template prep`
import typings.std.HTMLTemplateElement
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplatePrep
  extends StObject
     with Entry {
  
  var clonableTemplate: HTMLTemplateElement
  
  var kind: `template prep`
  
  var parts: js.Array[TemplatePart]
  
  var strings: TemplateStringsArray
  
  var template: Template
}
object TemplatePrep {
  
  inline def apply(
    clonableTemplate: HTMLTemplateElement,
    parts: js.Array[TemplatePart],
    strings: TemplateStringsArray,
    template: Template
  ): TemplatePrep = {
    val __obj = js.Dynamic.literal(clonableTemplate = clonableTemplate.asInstanceOf[js.Any], kind = "template prep", parts = parts.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplatePrep]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemplatePrep] (val x: Self) extends AnyVal {
    
    inline def setClonableTemplate(value: HTMLTemplateElement): Self = StObject.set(x, "clonableTemplate", value.asInstanceOf[js.Any])
    
    inline def setKind(value: `template prep`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setParts(value: js.Array[TemplatePart]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    inline def setPartsVarargs(value: TemplatePart*): Self = StObject.set(x, "parts", js.Array(value*))
    
    inline def setStrings(value: TemplateStringsArray): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
    
    inline def setTemplate(value: Template): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}
