package typings.litHtml

import org.scalablytyped.runtime.Instantiable0
import typings.litHtml.developmentDirectiveMod.DirectiveResult
import typings.litHtml.directiveMod.DirectiveParameters
import typings.litHtml.directiveMod.Directive_
import typings.litHtml.directiveMod.PartInfo
import typings.litHtml.mod.Part
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directivesGuardMod {
  
  @JSImport("lit-html/directives/guard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lit-html/directives/guard", "GuardDirective")
  @js.native
  open class GuardDirective protected () extends Directive_ {
    def this(_partInfo: PartInfo) = this()
    
    /* private */ var _previousValue: Any = js.native
    
    def render(_value: Any, f: js.Function0[Any]): Any = js.native
    
    def update(_part: Part, param1: DirectiveParameters[this.type]): Any = js.native
  }
  
  inline def guard(_value: Any, f: js.Function0[Any]): DirectiveResult[Instantiable0[GuardDirective]] = (^.asInstanceOf[js.Dynamic].applyDynamic("guard")(_value.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[DirectiveResult[Instantiable0[GuardDirective]]]
}
