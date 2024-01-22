package typings.litHtml

import typings.litHtml.directiveMod.Directive_
import typings.litHtml.directiveMod.PartInfo
import typings.litHtml.mod.ChildPart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directivesRepeatMod {
  
  @JSImport("lit-html/directives/repeat", "RepeatDirective")
  @js.native
  open class RepeatDirective protected () extends Directive_ {
    def this(partInfo: PartInfo) = this()
    
    /* private */ var _getValuesAndKeys: Any = js.native
    
    /* private */ var _itemKeys: Any = js.native
    
    def render[T](items: js.Iterable[T], keyFn: ItemTemplate[T] | KeyFn[T], template: ItemTemplate[T]): js.Array[Any] = js.native
    def render[T](items: js.Iterable[T], template: ItemTemplate[T]): js.Array[Any] = js.native
    
    def update[T](
      containerPart: ChildPart,
      param1: js.Tuple3[js.Iterable[T], KeyFn[T] | ItemTemplate[T], ItemTemplate[T]]
    ): js.Array[Any] | js.Symbol = js.native
  }
  
  @JSImport("lit-html/directives/repeat", "repeat")
  @js.native
  val repeat: RepeatDirectiveFn = js.native
  
  type ItemTemplate[T] = js.Function2[/* item */ T, /* index */ Double, Any]
  
  type KeyFn[T] = js.Function2[/* item */ T, /* index */ Double, Any]
  
  @js.native
  trait RepeatDirectiveFn extends StObject {
    
    def apply[T](items: js.Iterable[T], keyFnOrTemplate: ItemTemplate[T] | KeyFn[T]): Any = js.native
    def apply[T](items: js.Iterable[T], keyFnOrTemplate: ItemTemplate[T] | KeyFn[T], template: ItemTemplate[T]): Any = js.native
  }
}
