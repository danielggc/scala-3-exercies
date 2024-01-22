package typings.ui5WebcomponentsBase

import org.scalajs.dom.Event
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilCreateLinkInHeadMod {
  
  @JSImport("@ui5/webcomponents-base/dist/util/createLinkInHead", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(href: String): js.Promise[Event] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(href.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Event]]
  inline def default(href: String, attributes: Record[String, String]): js.Promise[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(href.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Event]]
}
