package typings.ui5WebcomponentsLocalization

import typings.ui5WebcomponentsBase.distAssetRegistriesLocaleDataMod.CLDRData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSapBaseUtilLoaderExtensionsMod {
  
  object default {
    
    @JSImport("@ui5/webcomponents-localization/dist/sap/base/util/LoaderExtensions", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def loadResource(moduleName: String): CLDRData = ^.asInstanceOf[js.Dynamic].applyDynamic("loadResource")(moduleName.asInstanceOf[js.Any]).asInstanceOf[CLDRData]
  }
}
