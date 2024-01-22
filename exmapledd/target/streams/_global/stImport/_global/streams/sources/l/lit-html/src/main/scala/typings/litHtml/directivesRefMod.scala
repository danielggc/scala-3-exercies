package typings.litHtml

import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.Element
import typings.litHtml.asyncDirectiveMod.AsyncDirective
import typings.litHtml.developmentDirectiveMod.DirectiveResult
import typings.litHtml.directiveMod.PartInfo
import typings.litHtml.mod.ElementPart
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directivesRefMod {
  
  @JSImport("lit-html/directives/ref", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lit-html/directives/ref", "RefDirective")
  @js.native
  open class RefDirective protected () extends AsyncDirective {
    def this(_partInfo: PartInfo) = this()
    
    /* private */ var _context: Any = js.native
    
    /* private */ var _element: Any = js.native
    
    /* private */ def _lastElementForRef: Any = js.native
    
    /* private */ var _ref: Any = js.native
    
    /* private */ var _updateRefValue: Any = js.native
    
    def render(): js.Symbol = js.native
    def render(_ref: RefOrCallback[Element]): js.Symbol = js.native
    
    @JSName("update")
    def update_render(
      part: ElementPart,
      param1: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: this['render'] */ js.Any
        ]
    ): js.Symbol = js.native
  }
  
  /**
    * An object that holds a ref value.
    */
  @JSImport("lit-html/directives/ref", "Ref")
  @js.native
  open class Ref_[T] () extends StObject {
    
    /**
      * The current Element value of the ref, or else `undefined` if the ref is no
      * longer rendered.
      */
    val value: js.UndefOr[T] = js.native
  }
  
  inline def createRef[T](): Ref_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRef")().asInstanceOf[Ref_[T]]
  
  inline def ref(): DirectiveResult[Instantiable0[RefDirective]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ref")().asInstanceOf[DirectiveResult[Instantiable0[RefDirective]]]
  inline def ref(_ref: RefOrCallback[Element]): DirectiveResult[Instantiable0[RefDirective]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ref")(_ref.asInstanceOf[js.Any]).asInstanceOf[DirectiveResult[Instantiable0[RefDirective]]]
  
  type RefOrCallback[T] = Ref_[T] | (js.Function1[/* el */ js.UndefOr[T], Unit])
}
