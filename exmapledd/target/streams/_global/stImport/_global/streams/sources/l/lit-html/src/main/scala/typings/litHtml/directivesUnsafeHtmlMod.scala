package typings.litHtml

import typings.litHtml.anon.TypeofUnsafeHTMLDirectiveInstantiable
import typings.litHtml.developmentDirectiveMod.DirectiveResult
import typings.litHtml.directiveMod.Directive_
import typings.litHtml.directiveMod.PartInfo
import typings.litHtml.litHtmlInts.`1`
import typings.litHtml.litHtmlInts.`2`
import typings.litHtml.mod.TemplateResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directivesUnsafeHtmlMod {
  
  @JSImport("lit-html/directives/unsafe-html", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lit-html/directives/unsafe-html", "UnsafeHTMLDirective")
  @js.native
  open class UnsafeHTMLDirective protected () extends Directive_ {
    def this(partInfo: PartInfo) = this()
    
    /* private */ var _templateResult: Any = js.native
    
    /* private */ var _value: Any = js.native
    
    def render(): js.UndefOr[js.Symbol | (TemplateResult[`1` | `2`]) | Null] = js.native
    def render(value: String): js.UndefOr[js.Symbol | (TemplateResult[`1` | `2`]) | Null] = js.native
    def render(value: js.Symbol): js.UndefOr[js.Symbol | (TemplateResult[`1` | `2`]) | Null] = js.native
  }
  /* static members */
  object UnsafeHTMLDirective {
    
    @JSImport("lit-html/directives/unsafe-html", "UnsafeHTMLDirective")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("lit-html/directives/unsafe-html", "UnsafeHTMLDirective.directiveName")
    @js.native
    def directiveName: String = js.native
    inline def directiveName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("directiveName")(x.asInstanceOf[js.Any])
    
    @JSImport("lit-html/directives/unsafe-html", "UnsafeHTMLDirective.resultType")
    @js.native
    def resultType: Double = js.native
    inline def resultType_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resultType")(x.asInstanceOf[js.Any])
  }
  
  inline def unsafeHTML(): DirectiveResult[TypeofUnsafeHTMLDirectiveInstantiable] = ^.asInstanceOf[js.Dynamic].applyDynamic("unsafeHTML")().asInstanceOf[DirectiveResult[TypeofUnsafeHTMLDirectiveInstantiable]]
  inline def unsafeHTML(value: String): DirectiveResult[TypeofUnsafeHTMLDirectiveInstantiable] = ^.asInstanceOf[js.Dynamic].applyDynamic("unsafeHTML")(value.asInstanceOf[js.Any]).asInstanceOf[DirectiveResult[TypeofUnsafeHTMLDirectiveInstantiable]]
  inline def unsafeHTML(value: js.Symbol): DirectiveResult[TypeofUnsafeHTMLDirectiveInstantiable] = ^.asInstanceOf[js.Dynamic].applyDynamic("unsafeHTML")(value.asInstanceOf[js.Any]).asInstanceOf[DirectiveResult[TypeofUnsafeHTMLDirectiveInstantiable]]
}
