package typings.litHtml

import org.scalablytyped.runtime.Instantiable1
import typings.litHtml.developmentDirectiveMod.DirectiveResult
import typings.litHtml.developmentDirectiveMod.PartInfo
import typings.std.HTMLTemplateElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object directivesTemplateContentDotjsMod {
  
  @JSImport("lit-html/directives/template-content.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lit-html/directives/template-content.js", "TemplateContentDirective")
  @js.native
  open class TemplateContentDirective protected ()
    extends typings.litHtml.developmentDirectivesTemplateContentMod.TemplateContentDirective {
    def this(partInfo: PartInfo) = this()
  }
  
  inline def templateContent(template: HTMLTemplateElement): DirectiveResult[
    Instantiable1[
      /* partInfo */ PartInfo, 
      typings.litHtml.developmentDirectivesTemplateContentMod.TemplateContentDirective
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("templateContent")(template.asInstanceOf[js.Any]).asInstanceOf[DirectiveResult[
    Instantiable1[
      /* partInfo */ PartInfo, 
      typings.litHtml.developmentDirectivesTemplateContentMod.TemplateContentDirective
    ]
  ]]
}
