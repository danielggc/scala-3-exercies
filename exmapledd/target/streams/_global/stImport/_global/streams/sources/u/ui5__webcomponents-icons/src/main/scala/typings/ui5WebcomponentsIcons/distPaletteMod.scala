package typings.ui5WebcomponentsIcons

import org.scalablytyped.runtime.Shortcut
import typings.ui5WebcomponentsIcons.ui5WebcomponentsIconsStrings.palette
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPaletteMod extends Shortcut {
  
  @JSImport("@ui5/webcomponents-icons/dist/palette", JSImport.Default)
  @js.native
  val default: palette = js.native
  
  @JSImport("@ui5/webcomponents-icons/dist/palette", "accData")
  @js.native
  val accData: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
  
  @JSImport("@ui5/webcomponents-icons/dist/palette", "ltr")
  @js.native
  val ltr: Boolean = js.native
  
  @JSImport("@ui5/webcomponents-icons/dist/palette", "pathData")
  @js.native
  val pathData: String = js.native
  
  type _To = palette
  
  /* This means you don't have to write `default`, but can instead just say `distPaletteMod.foo` */
  override def _to: palette = default
}
