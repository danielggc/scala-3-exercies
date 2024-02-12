package typings.litHtml

import org.scalablytyped.runtime.Instantiable0
import typings.litHtml.developmentDirectiveMod.DirectiveResult
import typings.litHtml.developmentDirectiveMod.PartInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object directivesKeyedDotjsMod {
  
  @JSImport("lit-html/directives/keyed.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lit-html/directives/keyed.js", "Keyed")
  @js.native
  open class Keyed_ protected ()
    extends typings.litHtml.developmentDirectivesKeyedMod.Keyed_ {
    def this(_partInfo: PartInfo) = this()
  }
  
  inline def keyed(k: Any, v: Any): DirectiveResult[Instantiable0[typings.litHtml.developmentDirectivesKeyedMod.Keyed_]] = (^.asInstanceOf[js.Dynamic].applyDynamic("keyed")(k.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[DirectiveResult[Instantiable0[typings.litHtml.developmentDirectivesKeyedMod.Keyed_]]]
}
