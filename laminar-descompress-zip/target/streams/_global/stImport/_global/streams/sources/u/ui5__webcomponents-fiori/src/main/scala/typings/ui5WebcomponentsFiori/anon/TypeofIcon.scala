package typings.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.DocumentFragment
import org.scalajs.dom.HTMLElement
import typings.litHtml.mod.RenderOptions
import typings.ui5Webcomponents.distIconMod.default
import typings.ui5WebcomponentsBase.distTypesMod.StyleData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofIcon
  extends StObject
     with Instantiable0[default] {
  
  def render: js.Function5[
    /* templateResult */ js.Object, 
    /* container */ HTMLElement | DocumentFragment, 
    /* styleStrOrHrefsArr */ js.UndefOr[String | js.Array[String]], 
    /* forStaticArea */ Boolean, 
    /* options */ RenderOptions, 
    Unit
  ] = js.native
  
  def styles: StyleData = js.native
  
  def template: Any = js.native
}
