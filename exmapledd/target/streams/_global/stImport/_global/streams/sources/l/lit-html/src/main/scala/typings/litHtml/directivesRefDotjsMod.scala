package typings.litHtml

import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.Element
import typings.litHtml.developmentDirectiveMod.DirectiveResult
import typings.litHtml.developmentDirectiveMod.PartInfo
import typings.litHtml.developmentDirectivesRefMod.RefOrCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object directivesRefDotjsMod {
  
  @JSImport("lit-html/directives/ref.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lit-html/directives/ref.js", "RefDirective")
  @js.native
  open class RefDirective protected ()
    extends typings.litHtml.developmentDirectivesRefMod.RefDirective {
    def this(_partInfo: PartInfo) = this()
  }
  
  /**
    * An object that holds a ref value.
    */
  @JSImport("lit-html/directives/ref.js", "Ref")
  @js.native
  open class Ref_[T] ()
    extends typings.litHtml.developmentDirectivesRefMod.Ref_[T]
  
  inline def createRef[T](): typings.litHtml.developmentDirectivesRefMod.Ref_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRef")().asInstanceOf[typings.litHtml.developmentDirectivesRefMod.Ref_[T]]
  
  inline def ref(): DirectiveResult[Instantiable0[typings.litHtml.developmentDirectivesRefMod.RefDirective]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ref")().asInstanceOf[DirectiveResult[Instantiable0[typings.litHtml.developmentDirectivesRefMod.RefDirective]]]
  inline def ref(_ref: RefOrCallback[Element]): DirectiveResult[Instantiable0[typings.litHtml.developmentDirectivesRefMod.RefDirective]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ref")(_ref.asInstanceOf[js.Any]).asInstanceOf[DirectiveResult[Instantiable0[typings.litHtml.developmentDirectivesRefMod.RefDirective]]]
}
