package typings.ui5WebcomponentsIcons

import org.scalablytyped.runtime.Shortcut
import typings.ui5WebcomponentsIcons.ui5WebcomponentsIconsStrings.`zoom-out`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distZoomOutMod extends Shortcut {
  
  @JSImport("@ui5/webcomponents-icons/dist/zoom-out", JSImport.Default)
  @js.native
  val default: `zoom-out` = js.native
  
  object accData {
    
    @JSImport("@ui5/webcomponents-icons/dist/zoom-out", "accData")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ui5/webcomponents-icons/dist/zoom-out", "accData.defaultText")
    @js.native
    def defaultText: String = js.native
    inline def defaultText_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultText")(x.asInstanceOf[js.Any])
    
    @JSImport("@ui5/webcomponents-icons/dist/zoom-out", "accData.key")
    @js.native
    def key: String = js.native
    inline def key_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("key")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@ui5/webcomponents-icons/dist/zoom-out", "ltr")
  @js.native
  val ltr: Boolean = js.native
  
  @JSImport("@ui5/webcomponents-icons/dist/zoom-out", "pathData")
  @js.native
  val pathData: String = js.native
  
  type _To = `zoom-out`
  
  /* This means you don't have to write `default`, but can instead just say `distZoomOutMod.foo` */
  override def _to: `zoom-out` = default
}
