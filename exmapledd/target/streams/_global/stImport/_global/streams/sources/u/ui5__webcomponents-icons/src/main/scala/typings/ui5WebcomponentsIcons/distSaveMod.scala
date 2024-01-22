package typings.ui5WebcomponentsIcons

import org.scalablytyped.runtime.Shortcut
import typings.ui5WebcomponentsIcons.ui5WebcomponentsIconsStrings.save
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSaveMod extends Shortcut {
  
  @JSImport("@ui5/webcomponents-icons/dist/save", JSImport.Default)
  @js.native
  val default: save = js.native
  
  object accData {
    
    @JSImport("@ui5/webcomponents-icons/dist/save", "accData")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ui5/webcomponents-icons/dist/save", "accData.defaultText")
    @js.native
    def defaultText: String = js.native
    inline def defaultText_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultText")(x.asInstanceOf[js.Any])
    
    @JSImport("@ui5/webcomponents-icons/dist/save", "accData.key")
    @js.native
    def key: String = js.native
    inline def key_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("key")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@ui5/webcomponents-icons/dist/save", "ltr")
  @js.native
  val ltr: Boolean = js.native
  
  @JSImport("@ui5/webcomponents-icons/dist/save", "pathData")
  @js.native
  val pathData: String = js.native
  
  type _To = save
  
  /* This means you don't have to write `default`, but can instead just say `distSaveMod.foo` */
  override def _to: save = default
}
