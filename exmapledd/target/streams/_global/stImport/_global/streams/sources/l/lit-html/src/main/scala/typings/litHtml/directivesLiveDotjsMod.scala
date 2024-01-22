package typings.litHtml

import org.scalablytyped.runtime.Instantiable1
import typings.litHtml.developmentDirectiveMod.DirectiveResult
import typings.litHtml.developmentDirectiveMod.PartInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object directivesLiveDotjsMod {
  
  @JSImport("lit-html/directives/live.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lit-html/directives/live.js", "LiveDirective")
  @js.native
  open class LiveDirective protected ()
    extends typings.litHtml.developmentDirectivesLiveMod.LiveDirective {
    def this(partInfo: PartInfo) = this()
  }
  
  inline def live(value: Any): DirectiveResult[
    Instantiable1[
      /* partInfo */ PartInfo, 
      typings.litHtml.developmentDirectivesLiveMod.LiveDirective
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("live")(value.asInstanceOf[js.Any]).asInstanceOf[DirectiveResult[
    Instantiable1[
      /* partInfo */ PartInfo, 
      typings.litHtml.developmentDirectivesLiveMod.LiveDirective
    ]
  ]]
}
