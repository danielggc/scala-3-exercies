package typings.ui5WebcomponentsLocalization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSapUiCoreFormatSettingsMod {
  
  object default {
    
    @JSImport("@ui5/webcomponents-localization/dist/sap/ui/core/FormatSettings", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def getCustomLocaleData(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getCustomLocaleData")().asInstanceOf[Unit]
    
    inline def getFormatLocale(): typings.ui5WebcomponentsBase.distLocaleLocaleMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormatLocale")().asInstanceOf[typings.ui5WebcomponentsBase.distLocaleLocaleMod.default]
    inline def getFormatLocale(lang: String): typings.ui5WebcomponentsBase.distLocaleLocaleMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormatLocale")(lang.asInstanceOf[js.Any]).asInstanceOf[typings.ui5WebcomponentsBase.distLocaleLocaleMod.default]
    
    inline def getLegacyDateCalendarCustomizing(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getLegacyDateCalendarCustomizing")().asInstanceOf[Unit]
    
    inline def getLegacyDateFormat(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getLegacyDateFormat")().asInstanceOf[Unit]
  }
}
