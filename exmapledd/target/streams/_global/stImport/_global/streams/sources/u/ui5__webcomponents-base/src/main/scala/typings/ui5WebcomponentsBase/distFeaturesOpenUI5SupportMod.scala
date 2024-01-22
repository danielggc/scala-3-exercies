package typings.ui5WebcomponentsBase

import typings.ui5WebcomponentsBase.anon.AnimationMode
import typings.ui5WebcomponentsBase.distAssetRegistriesLocaleDataMod.CLDRData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFeaturesOpenUI5SupportMod {
  
  @JSImport("@ui5/webcomponents-base/dist/features/OpenUI5Support", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with OpenUI5Support
  object default {
    
    @JSImport("@ui5/webcomponents-base/dist/features/OpenUI5Support", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def attachListeners(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attachListeners")().asInstanceOf[Unit]
    
    /* static member */
    inline def cssVariablesLoaded(): js.UndefOr[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("cssVariablesLoaded")().asInstanceOf[js.UndefOr[Boolean]]
    
    /* static member */
    inline def getConfigurationSettingsObject(): js.UndefOr[AnimationMode] = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfigurationSettingsObject")().asInstanceOf[js.UndefOr[AnimationMode]]
    
    /* static member */
    inline def getLocaleDataObject(): js.UndefOr[CLDRData] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleDataObject")().asInstanceOf[js.UndefOr[CLDRData]]
    
    /* static member */
    inline def getNextZIndex(): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextZIndex")().asInstanceOf[js.UndefOr[Double]]
    
    /* static member */
    inline def init(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[js.Promise[Unit]]
    
    /* static member */
    inline def isLoaded(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLoaded")().asInstanceOf[Boolean]
    
    /* static member */
    inline def listenForThemeChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_listenForThemeChange")().asInstanceOf[Unit]
    
    /* static member */
    inline def setInitialZIndex(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setInitialZIndex")().asInstanceOf[Unit]
  }
  
  trait OpenUI5Support extends StObject
}
