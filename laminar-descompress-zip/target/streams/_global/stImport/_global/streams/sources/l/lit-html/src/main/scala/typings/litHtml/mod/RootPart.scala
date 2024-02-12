package typings.litHtml.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RootPart extends ChildPart {
  
  /**
    * Sets the connection state for `AsyncDirective`s contained within this root
    * ChildPart.
    *
    * lit-html does not automatically monitor the connectedness of DOM rendered;
    * as such, it is the responsibility of the caller to `render` to ensure that
    * `part.setConnected(false)` is called before the part object is potentially
    * discarded, to ensure that `AsyncDirective`s have a chance to dispose of
    * any resources being held. If a `RootPart` that was previously
    * disconnected is subsequently re-connected (and its `AsyncDirective`s should
    * re-connect), `setConnected(true)` should be called.
    *
    * @param isConnected Whether directives within this tree should be connected
    * or not
    */
  def setConnected(isConnected: Boolean): Unit = js.native
}
