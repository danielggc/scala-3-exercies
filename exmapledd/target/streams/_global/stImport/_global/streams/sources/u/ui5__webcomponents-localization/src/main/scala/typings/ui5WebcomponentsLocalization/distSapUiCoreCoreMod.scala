package typings.ui5WebcomponentsLocalization

import typings.ui5WebcomponentsLocalization.anon.GetCalendarType
import typings.ui5WebcomponentsLocalization.anon.GetCustomLocaleData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSapUiCoreCoreMod {
  
  object default {
    
    @JSImport("@ui5/webcomponents-localization/dist/sap/ui/core/Core", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def getConfiguration(): GetCalendarType = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfiguration")().asInstanceOf[GetCalendarType]
    
    inline def getFormatSettings(): GetCustomLocaleData = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormatSettings")().asInstanceOf[GetCustomLocaleData]
    
    @JSImport("@ui5/webcomponents-localization/dist/sap/ui/core/Core", "default.getLibraryResourceBundle")
    @js.native
    def getLibraryResourceBundle: Unit = js.native
    inline def getLibraryResourceBundle_=(x: Unit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getLibraryResourceBundle")(x.asInstanceOf[js.Any])
  }
}
