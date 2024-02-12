package typings.litHtml

import org.scalablytyped.runtime.Instantiable0
import typings.litHtml.developmentDirectiveMod.DirectiveResult
import typings.litHtml.developmentDirectiveMod.PartInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object directivesGuardDotjsMod {
  
  @JSImport("lit-html/directives/guard.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lit-html/directives/guard.js", "GuardDirective")
  @js.native
  open class GuardDirective protected ()
    extends typings.litHtml.developmentDirectivesGuardMod.GuardDirective {
    def this(_partInfo: PartInfo) = this()
  }
  
  inline def guard(_value: Any, f: js.Function0[Any]): DirectiveResult[Instantiable0[typings.litHtml.developmentDirectivesGuardMod.GuardDirective]] = (^.asInstanceOf[js.Dynamic].applyDynamic("guard")(_value.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[DirectiveResult[Instantiable0[typings.litHtml.developmentDirectivesGuardMod.GuardDirective]]]
}
