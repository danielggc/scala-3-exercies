package typings.ui5WebcomponentsIcons

import org.scalablytyped.runtime.Shortcut
import typings.ui5WebcomponentsIcons.ui5WebcomponentsIconsStrings.feedback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFeedbackMod extends Shortcut {
  
  @JSImport("@ui5/webcomponents-icons/dist/feedback", JSImport.Default)
  @js.native
  val default: feedback = js.native
  
  @JSImport("@ui5/webcomponents-icons/dist/feedback", "accData")
  @js.native
  val accData: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
  
  @JSImport("@ui5/webcomponents-icons/dist/feedback", "ltr")
  @js.native
  val ltr: Boolean = js.native
  
  @JSImport("@ui5/webcomponents-icons/dist/feedback", "pathData")
  @js.native
  val pathData: String = js.native
  
  type _To = feedback
  
  /* This means you don't have to write `default`, but can instead just say `distFeedbackMod.foo` */
  override def _to: feedback = default
}
