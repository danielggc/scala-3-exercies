package typings.litHtml

import org.scalablytyped.runtime.Instantiable1
import typings.litHtml.developmentDirectiveMod.DirectiveParameters
import typings.litHtml.developmentDirectiveMod.DirectiveResult
import typings.litHtml.developmentDirectiveMod.Directive_
import typings.litHtml.developmentDirectiveMod.PartInfo
import typings.litHtml.developmentLitHtmlMod.AttributePart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object developmentDirectivesLiveMod {
  
  @JSImport("lit-html/development/directives/live", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lit-html/development/directives/live", "LiveDirective")
  @js.native
  open class LiveDirective protected () extends Directive_ {
    def this(partInfo: PartInfo) = this()
    
    def render(value: Any): Any = js.native
    
    def update(part: AttributePart, param1: DirectiveParameters[this.type]): Any = js.native
  }
  
  inline def live(value: Any): DirectiveResult[Instantiable1[/* partInfo */ PartInfo, LiveDirective]] = ^.asInstanceOf[js.Dynamic].applyDynamic("live")(value.asInstanceOf[js.Any]).asInstanceOf[DirectiveResult[Instantiable1[/* partInfo */ PartInfo, LiveDirective]]]
}
