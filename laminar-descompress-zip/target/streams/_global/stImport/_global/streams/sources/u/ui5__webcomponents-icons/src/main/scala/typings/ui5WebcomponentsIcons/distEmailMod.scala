package typings.ui5WebcomponentsIcons

import org.scalablytyped.runtime.Shortcut
import typings.ui5WebcomponentsIcons.ui5WebcomponentsIconsStrings.email
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEmailMod extends Shortcut {
  
  @JSImport("@ui5/webcomponents-icons/dist/email", JSImport.Default)
  @js.native
  val default: email = js.native
  
  @JSImport("@ui5/webcomponents-icons/dist/email", "accData")
  @js.native
  val accData: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
  
  @JSImport("@ui5/webcomponents-icons/dist/email", "ltr")
  @js.native
  val ltr: Boolean = js.native
  
  @JSImport("@ui5/webcomponents-icons/dist/email", "pathData")
  @js.native
  val pathData: String = js.native
  
  type _To = email
  
  /* This means you don't have to write `default`, but can instead just say `distEmailMod.foo` */
  override def _to: email = default
}
