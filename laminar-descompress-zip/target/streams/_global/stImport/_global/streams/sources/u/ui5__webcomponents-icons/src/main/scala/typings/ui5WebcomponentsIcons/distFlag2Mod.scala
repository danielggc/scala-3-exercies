package typings.ui5WebcomponentsIcons

import org.scalablytyped.runtime.Shortcut
import typings.ui5WebcomponentsIcons.ui5WebcomponentsIconsStrings.`flag-2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFlag2Mod extends Shortcut {
  
  @JSImport("@ui5/webcomponents-icons/dist/flag-2", JSImport.Default)
  @js.native
  val default: `flag-2` = js.native
  
  object accData {
    
    @JSImport("@ui5/webcomponents-icons/dist/flag-2", "accData")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ui5/webcomponents-icons/dist/flag-2", "accData.defaultText")
    @js.native
    def defaultText: String = js.native
    inline def defaultText_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultText")(x.asInstanceOf[js.Any])
    
    @JSImport("@ui5/webcomponents-icons/dist/flag-2", "accData.key")
    @js.native
    def key: String = js.native
    inline def key_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("key")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@ui5/webcomponents-icons/dist/flag-2", "ltr")
  @js.native
  val ltr: Boolean = js.native
  
  @JSImport("@ui5/webcomponents-icons/dist/flag-2", "pathData")
  @js.native
  val pathData: String = js.native
  
  type _To = `flag-2`
  
  /* This means you don't have to write `default`, but can instead just say `distFlag2Mod.foo` */
  override def _to: `flag-2` = default
}
