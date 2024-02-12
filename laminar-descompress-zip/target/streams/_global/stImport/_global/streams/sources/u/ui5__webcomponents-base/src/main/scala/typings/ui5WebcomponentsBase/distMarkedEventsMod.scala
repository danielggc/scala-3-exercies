package typings.ui5WebcomponentsBase

import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMarkedEventsMod {
  
  @JSImport("@ui5/webcomponents-base/dist/MarkedEvents", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns the marker for the given event.
    */
  inline def getEventMark(event: Event): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventMark")(event.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def markEvent(event: Event, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("markEvent")(event.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
