package typings.ui5WebcomponentsIcons

import org.scalablytyped.runtime.Shortcut
import typings.ui5WebcomponentsIcons.ui5WebcomponentsIconsStrings.notification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNotificationMod extends Shortcut {
  
  @JSImport("@ui5/webcomponents-icons/dist/notification", JSImport.Default)
  @js.native
  val default: notification = js.native
  
  @JSImport("@ui5/webcomponents-icons/dist/notification", "accData")
  @js.native
  val accData: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
  
  @JSImport("@ui5/webcomponents-icons/dist/notification", "ltr")
  @js.native
  val ltr: Boolean = js.native
  
  @JSImport("@ui5/webcomponents-icons/dist/notification", "pathData")
  @js.native
  val pathData: String = js.native
  
  type _To = notification
  
  /* This means you don't have to write `default`, but can instead just say `distNotificationMod.foo` */
  override def _to: notification = default
}
