package typings.litHtml

import org.scalablytyped.runtime.Instantiable1
import typings.litHtml.developmentDirectiveMod.DirectiveResult
import typings.litHtml.directiveMod.PartInfo
import typings.litHtml.directivesAsyncReplaceMod.AsyncReplaceDirective
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directivesAsyncAppendMod {
  
  @JSImport("lit-html/directives/async-append", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lit-html/directives/async-append", "AsyncAppendDirective")
  @js.native
  open class AsyncAppendDirective protected () extends AsyncReplaceDirective {
    def this(partInfo: PartInfo) = this()
    
    /* private */ var __childPart: Any = js.native
  }
  
  inline def asyncAppend(
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AsyncIterable<unknown> */ Any
  ): DirectiveResult[Instantiable1[/* partInfo */ PartInfo, AsyncAppendDirective]] = ^.asInstanceOf[js.Dynamic].applyDynamic("asyncAppend")(value.asInstanceOf[js.Any]).asInstanceOf[DirectiveResult[Instantiable1[/* partInfo */ PartInfo, AsyncAppendDirective]]]
  inline def asyncAppend(
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AsyncIterable<unknown> */ Any,
    _mapper: js.Function2[/* v */ Any, /* index */ js.UndefOr[Double], Any]
  ): DirectiveResult[Instantiable1[/* partInfo */ PartInfo, AsyncAppendDirective]] = (^.asInstanceOf[js.Dynamic].applyDynamic("asyncAppend")(value.asInstanceOf[js.Any], _mapper.asInstanceOf[js.Any])).asInstanceOf[DirectiveResult[Instantiable1[/* partInfo */ PartInfo, AsyncAppendDirective]]]
}
