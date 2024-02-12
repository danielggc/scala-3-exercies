package typings.ui5WebcomponentsIcons

import org.scalablytyped.runtime.Shortcut
import typings.ui5WebcomponentsIcons.ui5WebcomponentsIconsStrings.`back-to-top`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBackToTopMod extends Shortcut {
  
  @JSImport("@ui5/webcomponents-icons/dist/back-to-top", JSImport.Default)
  @js.native
  val default: `back-to-top` = js.native
  
  object accData {
    
    @JSImport("@ui5/webcomponents-icons/dist/back-to-top", "accData")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ui5/webcomponents-icons/dist/back-to-top", "accData.defaultText")
    @js.native
    def defaultText: String = js.native
    inline def defaultText_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultText")(x.asInstanceOf[js.Any])
    
    @JSImport("@ui5/webcomponents-icons/dist/back-to-top", "accData.key")
    @js.native
    def key: String = js.native
    inline def key_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("key")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@ui5/webcomponents-icons/dist/back-to-top", "ltr")
  @js.native
  val ltr: Boolean = js.native
  
  @JSImport("@ui5/webcomponents-icons/dist/back-to-top", "pathData")
  @js.native
  val pathData: String = js.native
  
  type _To = `back-to-top`
  
  /* This means you don't have to write `default`, but can instead just say `distBackToTopMod.foo` */
  override def _to: `back-to-top` = default
}
