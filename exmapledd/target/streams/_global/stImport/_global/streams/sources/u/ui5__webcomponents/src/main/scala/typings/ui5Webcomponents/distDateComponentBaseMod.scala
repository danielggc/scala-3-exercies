package typings.ui5Webcomponents

import typings.ui5WebcomponentsBase.distTypesCalendarTypeMod.CalendarType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDateComponentBaseMod {
  
  /**
    * @class
    *
    * Abstract class that provides common functionality for date-related components (day picker, month picker, year picker, calendar, date picker, date range picker, date time picker)
    * This includes:
    *  - "languageAware: true" metadata setting, CLDR fetch and i18n initialization
    *  - common properties (primaryCalendar, minDate, maxDate and formatPattern) declaration and methods that operate on them
    *  - additional common methods
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.DateComponentBase
    * @extends sap.ui.webc.base.UI5Element
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/DateComponentBase", JSImport.Default)
  @js.native
  open class default () extends DateComponentBase
  object default {
    
    @JSImport("@ui5/webcomponents/dist/DateComponentBase", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/DateComponentBase", "default.i18nBundle")
    @js.native
    def i18nBundle: js.UndefOr[typings.ui5WebcomponentsBase.distI18nBundleMod.default] = js.native
    inline def i18nBundle_=(x: js.UndefOr[typings.ui5WebcomponentsBase.distI18nBundleMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def onDefine(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("onDefine")().asInstanceOf[js.Promise[Unit]]
  }
  
  /**
    * @class
    *
    * Abstract class that provides common functionality for date-related components (day picker, month picker, year picker, calendar, date picker, date range picker, date time picker)
    * This includes:
    *  - "languageAware: true" metadata setting, CLDR fetch and i18n initialization
    *  - common properties (primaryCalendar, minDate, maxDate and formatPattern) declaration and methods that operate on them
    *  - additional common methods
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.DateComponentBase
    * @extends sap.ui.webc.base.UI5Element
    * @public
    */
  @js.native
  trait DateComponentBase
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _formatPattern: String = js.native
    
    def _getCalendarDateFromString(value: String): js.UndefOr[typings.ui5WebcomponentsLocalization.distDatesCalendarDateMod.default] = js.native
    
    def _getStringFromTimestamp(timestamp: Double): String = js.native
    
    def _getTimeStampFromString(value: String): js.UndefOr[Double] = js.native
    
    def _isPattern: Boolean = js.native
    
    def _maxDate: typings.ui5WebcomponentsLocalization.distDatesCalendarDateMod.default = js.native
    
    def _minDate: typings.ui5WebcomponentsLocalization.distDatesCalendarDateMod.default = js.native
    
    def _primaryCalendarType: CalendarType = js.native
    
    /**
      * Determines the format, displayed in the input field.
      *
      * @type {string}
      * @name sap.ui.webc.main.DateComponentBase.prototype.formatPattern
      * @defaultvalue ""
      * @public
      */
    var formatPattern: String = js.native
    
    def getFormat(): Any = js.native
    
    /**
      * Determines the maximum date available for selection.
      *
      * @type {string}
      * @name sap.ui.webc.main.DateComponentBase.prototype.maxDate
      * @defaultvalue ""
      * @since 1.0.0-rc.6
      * @public
      */
    var maxDate: String = js.native
    
    /**
      * Determines the minimum date available for selection.
      *
      * @type {string}
      * @name sap.ui.webc.main.DateComponentBase.prototype.minDate
      * @defaultvalue ""
      * @since 1.0.0-rc.6
      * @public
      */
    var minDate: String = js.native
    
    /**
      * Sets a calendar type used for display.
      * If not set, the calendar type of the global configuration is used.
      * @type {sap.ui.webc.base.types.CalendarType}
      * @name sap.ui.webc.main.DateComponentBase.prototype.primaryCalendarType
      * @public
      */
    var primaryCalendarType: js.UndefOr[CalendarType] = js.native
    
    /**
      * Defines the secondary calendar type.
      * If not set, the calendar will only show the primary calendar type.
      * @type {sap.ui.webc.base.types.CalendarType}
      * @name sap.ui.webc.main.DateComponentBase.prototype.secondaryCalendarType
      * @since 1.0.0-rc.16
      * @defaultvalue undefined
      * @public
      */
    var secondaryCalendarType: js.UndefOr[CalendarType] = js.native
  }
}
