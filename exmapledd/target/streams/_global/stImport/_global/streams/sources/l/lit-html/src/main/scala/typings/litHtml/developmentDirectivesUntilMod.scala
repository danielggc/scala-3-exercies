package typings.litHtml

import org.scalablytyped.runtime.Instantiable0
import typings.litHtml.developmentAsyncDirectiveMod.AsyncDirective
import typings.litHtml.developmentDirectiveMod.DirectiveResult
import typings.litHtml.developmentDirectiveMod.PartInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object developmentDirectivesUntilMod {
  
  @JSImport("lit-html/development/directives/until", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lit-html/development/directives/until", "UntilDirective")
  @js.native
  open class UntilDirective protected () extends AsyncDirective {
    def this(_partInfo: PartInfo) = this()
    
    /* private */ var __lastRenderedIndex: Any = js.native
    
    /* private */ var __pauser: Any = js.native
    
    /* private */ var __values: Any = js.native
    
    /* private */ var __weakThis: Any = js.native
  }
  
  inline def until(values: Any*): DirectiveResult[Instantiable0[UntilDirective]] = ^.asInstanceOf[js.Dynamic].applyDynamic("until")(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[DirectiveResult[Instantiable0[UntilDirective]]]
}
