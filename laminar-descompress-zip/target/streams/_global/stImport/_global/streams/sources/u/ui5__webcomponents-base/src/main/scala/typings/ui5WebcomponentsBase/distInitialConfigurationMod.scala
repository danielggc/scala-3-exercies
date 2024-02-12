package typings.ui5WebcomponentsBase

import typings.ui5WebcomponentsBase.distConfigFormatSettingsMod.FormatSettings
import typings.ui5WebcomponentsBase.distTypesAnimationModeMod.AnimationMode
import typings.ui5WebcomponentsBase.distTypesCalendarTypeMod.CalendarType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInitialConfigurationMod {
  
  @JSImport("@ui5/webcomponents-base/dist/InitialConfiguration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAnimationMode(): AnimationMode = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnimationMode")().asInstanceOf[AnimationMode]
  
  /**
    * Get the configured calendar type
    * @returns { String } the name of the configured calendar type
    */
  inline def getCalendarType(): js.UndefOr[CalendarType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCalendarType")().asInstanceOf[js.UndefOr[CalendarType]]
  
  /**
    * Returns if the default language, that is inlined at build time,
    * should be fetched over the network instead.
    * @returns {Boolean}
    */
  inline def getFetchDefaultLanguage(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getFetchDefaultLanguage")().asInstanceOf[Boolean]
  
  inline def getFormatSettings(): FormatSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormatSettings")().asInstanceOf[FormatSettings]
  
  inline def getLanguage(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguage")().asInstanceOf[js.UndefOr[String]]
  
  inline def getNoConflict(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getNoConflict")().asInstanceOf[Boolean]
  
  inline def getRTL(): js.UndefOr[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRTL")().asInstanceOf[js.UndefOr[Boolean]]
  
  inline def getTheme(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTheme")().asInstanceOf[String]
  
  inline def getThemeRoot(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getThemeRoot")().asInstanceOf[js.UndefOr[String]]
}
