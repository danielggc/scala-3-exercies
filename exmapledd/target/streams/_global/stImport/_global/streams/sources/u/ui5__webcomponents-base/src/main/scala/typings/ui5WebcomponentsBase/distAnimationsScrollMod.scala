package typings.ui5WebcomponentsBase

import org.scalajs.dom.HTMLElement
import typings.ui5WebcomponentsBase.anon.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAnimationsScrollMod {
  
  @JSImport("@ui5/webcomponents-base/dist/animations/scroll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(element: HTMLElement, dx: Double, dy: Double): Promise = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any])).asInstanceOf[Promise]
}
