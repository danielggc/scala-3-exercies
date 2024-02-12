package typings.ui5WebcomponentsLocalization

import typings.ui5WebcomponentsBase.distTypesCalendarTypeMod.CalendarType
import typings.ui5WebcomponentsLocalization.anon.GetCustomLocaleData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSapUiCoreConfigurationMod {
  
  object default {
    
    @JSImport("@ui5/webcomponents-localization/dist/sap/ui/core/Configuration", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def getCalendarType(): CalendarType = ^.asInstanceOf[js.Dynamic].applyDynamic("getCalendarType")().asInstanceOf[CalendarType]
    
    inline def getFormatSettings(): GetCustomLocaleData = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormatSettings")().asInstanceOf[GetCustomLocaleData]
    
    inline def getLanguage(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguage")().asInstanceOf[js.UndefOr[String]]
    
    inline def getOriginInfo(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getOriginInfo")().asInstanceOf[Unit]
    
    inline def getSupportedLanguages(): js.Array[String] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getSupportedLanguages")().asInstanceOf[js.Array[String] | Null]
    
    inline def getTimezone(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimezone")().asInstanceOf[String]
  }
}
