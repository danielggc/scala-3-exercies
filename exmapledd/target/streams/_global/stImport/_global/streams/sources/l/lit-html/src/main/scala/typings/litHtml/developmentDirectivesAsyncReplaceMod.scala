package typings.litHtml

import org.scalablytyped.runtime.Instantiable0
import typings.litHtml.developmentAsyncDirectiveMod.AsyncDirective
import typings.litHtml.developmentDirectiveMod.DirectiveParameters
import typings.litHtml.developmentDirectiveMod.DirectiveResult
import typings.litHtml.developmentDirectiveMod.PartInfo
import typings.litHtml.developmentLitHtmlMod.ChildPart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object developmentDirectivesAsyncReplaceMod {
  
  @JSImport("lit-html/development/directives/async-replace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lit-html/development/directives/async-replace", "AsyncReplaceDirective")
  @js.native
  open class AsyncReplaceDirective protected () extends AsyncDirective {
    def this(_partInfo: PartInfo) = this()
    
    /* private */ var __pauser: Any = js.native
    
    /* private */ var __value: Any = js.native
    
    /* private */ var __weakThis: Any = js.native
    
    /* protected */ def commitValue(value: Any, _index: Double): Unit = js.native
    
    def render[T](
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AsyncIterable<T> */ Any
    ): js.Symbol = js.native
    def render[T](
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AsyncIterable<T> */ Any,
      _mapper: Mapper[T]
    ): js.Symbol = js.native
    
    def update(_part: ChildPart, param1: DirectiveParameters[this.type]): js.UndefOr[js.Symbol] = js.native
  }
  
  inline def asyncReplace(
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AsyncIterable<unknown> */ Any
  ): DirectiveResult[Instantiable0[AsyncReplaceDirective]] = ^.asInstanceOf[js.Dynamic].applyDynamic("asyncReplace")(value.asInstanceOf[js.Any]).asInstanceOf[DirectiveResult[Instantiable0[AsyncReplaceDirective]]]
  inline def asyncReplace(
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AsyncIterable<unknown> */ Any,
    _mapper: Mapper[Any]
  ): DirectiveResult[Instantiable0[AsyncReplaceDirective]] = (^.asInstanceOf[js.Dynamic].applyDynamic("asyncReplace")(value.asInstanceOf[js.Any], _mapper.asInstanceOf[js.Any])).asInstanceOf[DirectiveResult[Instantiable0[AsyncReplaceDirective]]]
  
  type Mapper[T] = js.Function2[/* v */ T, /* index */ js.UndefOr[Double], Any]
}
