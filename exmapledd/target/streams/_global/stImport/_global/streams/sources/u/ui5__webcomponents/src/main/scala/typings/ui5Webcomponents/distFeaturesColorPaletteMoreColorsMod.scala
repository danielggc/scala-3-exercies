package typings.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFeaturesColorPaletteMoreColorsMod {
  
  @JSImport("@ui5/webcomponents/dist/features/ColorPaletteMoreColors", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ColorPaletteMoreColors
  object default {
    
    @JSImport("@ui5/webcomponents/dist/features/ColorPaletteMoreColors", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/features/ColorPaletteMoreColors", "default.i18nBundle")
    @js.native
    def i18nBundle: typings.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: typings.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def init(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[js.Promise[Unit]]
  }
  
  @js.native
  trait ColorPaletteMoreColors extends StObject {
    
    def colorPaletteCancelButton: String = js.native
    
    def colorPaletteDialogOKButton: String = js.native
    
    def colorPaletteDialogTitle: String = js.native
  }
}
