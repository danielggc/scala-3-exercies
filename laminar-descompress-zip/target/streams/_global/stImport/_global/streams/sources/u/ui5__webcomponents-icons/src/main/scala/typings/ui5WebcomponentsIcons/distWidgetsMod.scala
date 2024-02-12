package typings.ui5WebcomponentsIcons

import org.scalablytyped.runtime.Shortcut
import typings.ui5WebcomponentsIcons.ui5WebcomponentsIconsStrings.widgets
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distWidgetsMod extends Shortcut {
  
  @JSImport("@ui5/webcomponents-icons/dist/widgets", JSImport.Default)
  @js.native
  val default: widgets = js.native
  
  @JSImport("@ui5/webcomponents-icons/dist/widgets", "accData")
  @js.native
  val accData: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
  
  @JSImport("@ui5/webcomponents-icons/dist/widgets", "ltr")
  @js.native
  val ltr: Boolean = js.native
  
  @JSImport("@ui5/webcomponents-icons/dist/widgets", "pathData")
  @js.native
  val pathData: String = js.native
  
  type _To = widgets
  
  /* This means you don't have to write `default`, but can instead just say `distWidgetsMod.foo` */
  override def _to: widgets = default
}
