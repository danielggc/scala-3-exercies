package typings.ui5WebcomponentsBase

import typings.std.ClassDecorator
import typings.ui5WebcomponentsBase.distUi5elementmetadataMod.EventData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDecoratorsEventMod {
  
  @JSImport("@ui5/webcomponents-base/dist/decorators/event", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns an event class decorator.
    *
    * @param { string } name the event name
    * @param { EventData } data the event data
    * @returns { ClassDecorator }
    */
  inline def default(name: String): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator]
  inline def default(name: String, data: EventData): ClassDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[ClassDecorator]
}
