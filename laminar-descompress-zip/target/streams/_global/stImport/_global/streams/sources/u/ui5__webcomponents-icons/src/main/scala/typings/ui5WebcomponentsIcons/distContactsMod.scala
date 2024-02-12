package typings.ui5WebcomponentsIcons

import org.scalablytyped.runtime.Shortcut
import typings.ui5WebcomponentsIcons.ui5WebcomponentsIconsStrings.contacts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distContactsMod extends Shortcut {
  
  @JSImport("@ui5/webcomponents-icons/dist/contacts", JSImport.Default)
  @js.native
  val default: contacts = js.native
  
  @JSImport("@ui5/webcomponents-icons/dist/contacts", "accData")
  @js.native
  val accData: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
  
  @JSImport("@ui5/webcomponents-icons/dist/contacts", "ltr")
  @js.native
  val ltr: Boolean = js.native
  
  @JSImport("@ui5/webcomponents-icons/dist/contacts", "pathData")
  @js.native
  val pathData: String = js.native
  
  type _To = contacts
  
  /* This means you don't have to write `default`, but can instead just say `distContactsMod.foo` */
  override def _to: contacts = default
}
