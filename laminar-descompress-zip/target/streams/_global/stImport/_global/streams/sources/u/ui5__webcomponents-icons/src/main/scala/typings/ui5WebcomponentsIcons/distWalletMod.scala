package typings.ui5WebcomponentsIcons

import org.scalablytyped.runtime.Shortcut
import typings.ui5WebcomponentsIcons.ui5WebcomponentsIconsStrings.wallet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distWalletMod extends Shortcut {
  
  @JSImport("@ui5/webcomponents-icons/dist/wallet", JSImport.Default)
  @js.native
  val default: wallet = js.native
  
  @JSImport("@ui5/webcomponents-icons/dist/wallet", "accData")
  @js.native
  val accData: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
  
  @JSImport("@ui5/webcomponents-icons/dist/wallet", "ltr")
  @js.native
  val ltr: Boolean = js.native
  
  @JSImport("@ui5/webcomponents-icons/dist/wallet", "pathData")
  @js.native
  val pathData: String = js.native
  
  type _To = wallet
  
  /* This means you don't have to write `default`, but can instead just say `distWalletMod.foo` */
  override def _to: wallet = default
}
