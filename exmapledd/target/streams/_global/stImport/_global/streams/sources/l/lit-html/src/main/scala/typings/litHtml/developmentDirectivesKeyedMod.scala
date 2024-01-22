package typings.litHtml

import org.scalablytyped.runtime.Instantiable0
import typings.litHtml.developmentDirectiveMod.ChildPart
import typings.litHtml.developmentDirectiveMod.DirectiveParameters
import typings.litHtml.developmentDirectiveMod.DirectiveResult
import typings.litHtml.developmentDirectiveMod.Directive_
import typings.litHtml.developmentDirectiveMod.PartInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object developmentDirectivesKeyedMod {
  
  @JSImport("lit-html/development/directives/keyed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lit-html/development/directives/keyed", "Keyed")
  @js.native
  open class Keyed_ protected () extends Directive_ {
    def this(_partInfo: PartInfo) = this()
    
    var key: Any = js.native
    
    def render(k: Any, v: Any): Any = js.native
    
    def update(part: ChildPart, param1: DirectiveParameters[this.type]): Any = js.native
  }
  
  inline def keyed(k: Any, v: Any): DirectiveResult[Instantiable0[Keyed_]] = (^.asInstanceOf[js.Dynamic].applyDynamic("keyed")(k.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[DirectiveResult[Instantiable0[Keyed_]]]
}
