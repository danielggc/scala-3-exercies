package typings.litHtml

import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.DocumentFragment
import typings.litHtml.developmentDirectiveMod.DirectiveResult
import typings.litHtml.directiveMod.Directive_
import typings.litHtml.directiveMod.PartInfo
import typings.std.HTMLTemplateElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directivesTemplateContentMod {
  
  @JSImport("lit-html/directives/template-content", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lit-html/directives/template-content", "TemplateContentDirective")
  @js.native
  open class TemplateContentDirective protected () extends Directive_ {
    def this(partInfo: PartInfo) = this()
    
    /* private */ var _previousTemplate: Any = js.native
    
    def render(template: HTMLTemplateElement): DocumentFragment | js.Symbol = js.native
  }
  
  inline def templateContent(template: HTMLTemplateElement): DirectiveResult[Instantiable1[/* partInfo */ PartInfo, TemplateContentDirective]] = ^.asInstanceOf[js.Dynamic].applyDynamic("templateContent")(template.asInstanceOf[js.Any]).asInstanceOf[DirectiveResult[Instantiable1[/* partInfo */ PartInfo, TemplateContentDirective]]]
}
