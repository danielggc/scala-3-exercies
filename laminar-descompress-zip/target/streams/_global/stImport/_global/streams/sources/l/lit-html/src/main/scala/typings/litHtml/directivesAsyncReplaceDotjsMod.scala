package typings.litHtml

import org.scalablytyped.runtime.Instantiable0
import typings.litHtml.developmentDirectiveMod.DirectiveResult
import typings.litHtml.developmentDirectiveMod.PartInfo
import typings.litHtml.developmentDirectivesAsyncReplaceMod.Mapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object directivesAsyncReplaceDotjsMod {
  
  @JSImport("lit-html/directives/async-replace.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lit-html/directives/async-replace.js", "AsyncReplaceDirective")
  @js.native
  open class AsyncReplaceDirective protected ()
    extends typings.litHtml.developmentDirectivesAsyncReplaceMod.AsyncReplaceDirective {
    def this(_partInfo: PartInfo) = this()
  }
  
  inline def asyncReplace(
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AsyncIterable<unknown> */ Any
  ): DirectiveResult[
    Instantiable0[typings.litHtml.developmentDirectivesAsyncReplaceMod.AsyncReplaceDirective]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("asyncReplace")(value.asInstanceOf[js.Any]).asInstanceOf[DirectiveResult[
    Instantiable0[typings.litHtml.developmentDirectivesAsyncReplaceMod.AsyncReplaceDirective]
  ]]
  inline def asyncReplace(
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AsyncIterable<unknown> */ Any,
    _mapper: Mapper[Any]
  ): DirectiveResult[
    Instantiable0[typings.litHtml.developmentDirectivesAsyncReplaceMod.AsyncReplaceDirective]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("asyncReplace")(value.asInstanceOf[js.Any], _mapper.asInstanceOf[js.Any])).asInstanceOf[DirectiveResult[
    Instantiable0[typings.litHtml.developmentDirectivesAsyncReplaceMod.AsyncReplaceDirective]
  ]]
}
