package typings.ui5WebcomponentsBase

import typings.ui5WebcomponentsBase.distTypesAnimationModeMod.AnimationMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConfigAnimationModeMod {
  
  @JSImport("@ui5/webcomponents-base/dist/config/AnimationMode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns the animation mode - "full", "basic", "minimal" or "none".
    * @public
    * @returns { AnimationMode }
    */
  inline def getAnimationMode(): AnimationMode = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnimationMode")().asInstanceOf[AnimationMode]
  
  /**
    * Sets the animation mode - "full", "basic", "minimal" or "none".
    * @public
    * @param { AnimationMode } animationMode
    */
  inline def setAnimationMode(animationMode: AnimationMode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAnimationMode")(animationMode.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
