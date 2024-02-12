package typings.ui5WebcomponentsIcons

import org.scalablytyped.runtime.Shortcut
import typings.ui5WebcomponentsIcons.ui5WebcomponentsIconsStrings.permission
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPermissionMod extends Shortcut {
  
  @JSImport("@ui5/webcomponents-icons/dist/permission", JSImport.Default)
  @js.native
  val default: permission = js.native
  
  @JSImport("@ui5/webcomponents-icons/dist/permission", "accData")
  @js.native
  val accData: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
  
  @JSImport("@ui5/webcomponents-icons/dist/permission", "ltr")
  @js.native
  val ltr: Boolean = js.native
  
  @JSImport("@ui5/webcomponents-icons/dist/permission", "pathData")
  @js.native
  val pathData: String = js.native
  
  type _To = permission
  
  /* This means you don't have to write `default`, but can instead just say `distPermissionMod.foo` */
  override def _to: permission = default
}
