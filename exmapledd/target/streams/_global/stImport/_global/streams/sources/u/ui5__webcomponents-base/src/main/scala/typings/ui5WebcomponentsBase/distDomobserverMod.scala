package typings.ui5WebcomponentsBase

import org.scalajs.dom.MutationObserverInit
import org.scalajs.dom.Node
import typings.std.MutationCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDomobserverMod {
  
  @JSImport("@ui5/webcomponents-base/dist/DOMObserver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def observeDOMNode(node: Node, callback: MutationCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("observeDOMNode")(node.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def observeDOMNode(node: Node, callback: MutationCallback, options: MutationObserverInit): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("observeDOMNode")(node.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * @param node
    */
  inline def unobserveDOMNode(node: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unobserveDOMNode")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
