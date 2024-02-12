package typings.ui5WebcomponentsIcons

import org.scalablytyped.runtime.Shortcut
import typings.ui5WebcomponentsIcons.ui5WebcomponentsIconsStrings.`message-success`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMessageSuccessMod extends Shortcut {
  
  @JSImport("@ui5/webcomponents-icons/dist/message-success", JSImport.Default)
  @js.native
  val default: `message-success` = js.native
  
  object accData {
    
    @JSImport("@ui5/webcomponents-icons/dist/message-success", "accData")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ui5/webcomponents-icons/dist/message-success", "accData.defaultText")
    @js.native
    def defaultText: String = js.native
    inline def defaultText_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultText")(x.asInstanceOf[js.Any])
    
    @JSImport("@ui5/webcomponents-icons/dist/message-success", "accData.key")
    @js.native
    def key: String = js.native
    inline def key_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("key")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@ui5/webcomponents-icons/dist/message-success", "ltr")
  @js.native
  val ltr: Boolean = js.native
  
  @JSImport("@ui5/webcomponents-icons/dist/message-success", "pathData")
  @js.native
  val pathData: String = js.native
  
  type _To = `message-success`
  
  /* This means you don't have to write `default`, but can instead just say `distMessageSuccessMod.foo` */
  override def _to: `message-success` = default
}
