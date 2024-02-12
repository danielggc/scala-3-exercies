package typings.litHtml

import typings.litHtml.anon.TypeofUnsafeHTMLDirective
import typings.litHtml.developmentDirectiveMod.DirectiveResult
import typings.litHtml.developmentDirectiveMod.PartInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object directivesUnsafeHtmlDotjsMod {
  
  @JSImport("lit-html/directives/unsafe-html.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lit-html/directives/unsafe-html.js", "UnsafeHTMLDirective")
  @js.native
  open class UnsafeHTMLDirective protected ()
    extends typings.litHtml.developmentDirectivesUnsafeHtmlMod.UnsafeHTMLDirective {
    def this(partInfo: PartInfo) = this()
  }
  /* static members */
  object UnsafeHTMLDirective {
    
    @JSImport("lit-html/directives/unsafe-html.js", "UnsafeHTMLDirective")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("lit-html/directives/unsafe-html.js", "UnsafeHTMLDirective.directiveName")
    @js.native
    def directiveName: String = js.native
    inline def directiveName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("directiveName")(x.asInstanceOf[js.Any])
    
    @JSImport("lit-html/directives/unsafe-html.js", "UnsafeHTMLDirective.resultType")
    @js.native
    def resultType: Double = js.native
    inline def resultType_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resultType")(x.asInstanceOf[js.Any])
  }
  
  inline def unsafeHTML(): DirectiveResult[TypeofUnsafeHTMLDirective] = ^.asInstanceOf[js.Dynamic].applyDynamic("unsafeHTML")().asInstanceOf[DirectiveResult[TypeofUnsafeHTMLDirective]]
  inline def unsafeHTML(value: String): DirectiveResult[TypeofUnsafeHTMLDirective] = ^.asInstanceOf[js.Dynamic].applyDynamic("unsafeHTML")(value.asInstanceOf[js.Any]).asInstanceOf[DirectiveResult[TypeofUnsafeHTMLDirective]]
  inline def unsafeHTML(value: js.Symbol): DirectiveResult[TypeofUnsafeHTMLDirective] = ^.asInstanceOf[js.Dynamic].applyDynamic("unsafeHTML")(value.asInstanceOf[js.Any]).asInstanceOf[DirectiveResult[TypeofUnsafeHTMLDirective]]
}
