package typings.ui5WebcomponentsIcons

import org.scalablytyped.runtime.Shortcut
import typings.ui5WebcomponentsIcons.ui5WebcomponentsIconsStrings.inventory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInventoryMod extends Shortcut {
  
  @JSImport("@ui5/webcomponents-icons/dist/inventory", JSImport.Default)
  @js.native
  val default: inventory = js.native
  
  @JSImport("@ui5/webcomponents-icons/dist/inventory", "accData")
  @js.native
  val accData: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
  
  @JSImport("@ui5/webcomponents-icons/dist/inventory", "ltr")
  @js.native
  val ltr: Boolean = js.native
  
  @JSImport("@ui5/webcomponents-icons/dist/inventory", "pathData")
  @js.native
  val pathData: String = js.native
  
  type _To = inventory
  
  /* This means you don't have to write `default`, but can instead just say `distInventoryMod.foo` */
  override def _to: inventory = default
}
