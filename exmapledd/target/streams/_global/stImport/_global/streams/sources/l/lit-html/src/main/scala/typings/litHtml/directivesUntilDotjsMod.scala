package typings.litHtml

import org.scalablytyped.runtime.Instantiable0
import typings.litHtml.developmentDirectiveMod.DirectiveResult
import typings.litHtml.developmentDirectiveMod.PartInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object directivesUntilDotjsMod {
  
  @JSImport("lit-html/directives/until.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lit-html/directives/until.js", "UntilDirective")
  @js.native
  open class UntilDirective protected ()
    extends typings.litHtml.developmentDirectivesUntilMod.UntilDirective {
    def this(_partInfo: PartInfo) = this()
  }
  
  inline def until(values: Any*): DirectiveResult[Instantiable0[typings.litHtml.developmentDirectivesUntilMod.UntilDirective]] = ^.asInstanceOf[js.Dynamic].applyDynamic("until")(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[DirectiveResult[Instantiable0[typings.litHtml.developmentDirectivesUntilMod.UntilDirective]]]
}
