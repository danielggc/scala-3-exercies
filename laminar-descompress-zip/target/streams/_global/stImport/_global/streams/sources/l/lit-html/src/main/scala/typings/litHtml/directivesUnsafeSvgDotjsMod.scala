package typings.litHtml

import org.scalablytyped.runtime.Instantiable0
import typings.litHtml.anon.TypeofUnsafeSVGDirective
import typings.litHtml.developmentDirectiveMod.DirectiveResult
import typings.litHtml.developmentDirectiveMod.PartInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object directivesUnsafeSvgDotjsMod {
  
  @JSImport("lit-html/directives/unsafe-svg.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lit-html/directives/unsafe-svg.js", "UnsafeSVGDirective")
  @js.native
  open class UnsafeSVGDirective protected ()
    extends typings.litHtml.developmentDirectivesUnsafeSvgMod.UnsafeSVGDirective {
    def this(partInfo: PartInfo) = this()
  }
  object UnsafeSVGDirective {
    
    @JSImport("lit-html/directives/unsafe-svg.js", "UnsafeSVGDirective")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("lit-html/directives/unsafe-svg.js", "UnsafeSVGDirective.directiveName")
    @js.native
    def directiveName: String = js.native
    inline def directiveName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("directiveName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("lit-html/directives/unsafe-svg.js", "UnsafeSVGDirective.resultType")
    @js.native
    def resultType: Double = js.native
    inline def resultType_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resultType")(x.asInstanceOf[js.Any])
  }
  
  inline def unsafeSVG(): DirectiveResult[
    TypeofUnsafeSVGDirective & Instantiable0[typings.litHtml.developmentDirectivesUnsafeSvgMod.UnsafeSVGDirective]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("unsafeSVG")().asInstanceOf[DirectiveResult[
    TypeofUnsafeSVGDirective & Instantiable0[typings.litHtml.developmentDirectivesUnsafeSvgMod.UnsafeSVGDirective]
  ]]
  inline def unsafeSVG(value: String): DirectiveResult[
    TypeofUnsafeSVGDirective & Instantiable0[typings.litHtml.developmentDirectivesUnsafeSvgMod.UnsafeSVGDirective]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("unsafeSVG")(value.asInstanceOf[js.Any]).asInstanceOf[DirectiveResult[
    TypeofUnsafeSVGDirective & Instantiable0[typings.litHtml.developmentDirectivesUnsafeSvgMod.UnsafeSVGDirective]
  ]]
  inline def unsafeSVG(value: js.Symbol): DirectiveResult[
    TypeofUnsafeSVGDirective & Instantiable0[typings.litHtml.developmentDirectivesUnsafeSvgMod.UnsafeSVGDirective]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("unsafeSVG")(value.asInstanceOf[js.Any]).asInstanceOf[DirectiveResult[
    TypeofUnsafeSVGDirective & Instantiable0[typings.litHtml.developmentDirectivesUnsafeSvgMod.UnsafeSVGDirective]
  ]]
}
