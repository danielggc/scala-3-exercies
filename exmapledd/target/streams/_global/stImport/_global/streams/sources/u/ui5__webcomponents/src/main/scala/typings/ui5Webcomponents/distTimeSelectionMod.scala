package typings.ui5Webcomponents

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.WheelEvent
import typings.ui5Webcomponents.distTimepickerUtilsTimeSliderMod.HoursConfiguration
import typings.ui5Webcomponents.ui5WebcomponentsBooleans.`true`
import typings.ui5WebcomponentsBase.distTypesCalendarTypeMod.CalendarType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTimeSelectionMod {
  
  /**
    * @class
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.TimeSelection
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-time-selection
    * @private
    * @since 1.0.0-rc.12
    */
  @JSImport("@ui5/webcomponents/dist/TimeSelection", JSImport.Default)
  @js.native
  open class default () extends TimeSelection
  object default {
    
    @JSImport("@ui5/webcomponents/dist/TimeSelection", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/TimeSelection", "default.i18nBundle")
    @js.native
    def i18nBundle: typings.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: typings.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def onDefine(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("onDefine")().asInstanceOf[js.Promise[Unit]]
  }
  
  /**
    * @class
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.TimeSelection
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-time-selection
    * @private
    * @since 1.0.0-rc.12
    */
  @js.native
  trait TimeSelection
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _activeSliders: js.Array[String] = js.native
    
    var _calendarType: CalendarType = js.native
    
    var _currentSlider: String = js.native
    
    def _currentSliderDOM: typings.ui5Webcomponents.distWheelSliderMod.default = js.native
    
    def _formatPattern: String = js.native
    
    def _handleWheel(e: WheelEvent): Unit = js.native
    
    def _hasHoursSlider: Boolean = js.native
    
    def _hasMinutesSlider: Boolean = js.native
    
    def _hasPeriodsSlider: Boolean = js.native
    
    def _hasSecondsSlider: Boolean = js.native
    
    def _hours: String = js.native
    
    def _hoursConfiguration: HoursConfiguration = js.native
    
    def _hoursSliderFocused: Boolean = js.native
    
    def _isPattern: Boolean = js.native
    
    def _minutes: String = js.native
    
    def _minutesSliderFocused: Boolean = js.native
    
    def _neededSliders: js.Array[Boolean] = js.native
    
    def _onfocusin(e: FocusEvent): Unit = js.native
    
    def _onfocusout(e: FocusEvent): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _period: js.UndefOr[String] = js.native
    
    def _periodSliderFocused: Boolean = js.native
    
    def _seconds: String = js.native
    
    def _secondsSliderFocused: Boolean = js.native
    
    def _setCurrentSlider(slider: String): Unit = js.native
    
    def dateValue: js.Date = js.native
    
    /**
      * Determines the format, displayed in the input field.
      *
      * Example:
      * HH:mm:ss -> 11:42:35
      * hh:mm:ss a -> 2:23:15 PM
      * mm:ss -> 12:04 (only minutes and seconds)
      *
      * @type {string}
      * @name sap.ui.webc.main.TimeSelection.prototype.formatPattern
      * @defaultvalue ""
      * @public
      */
    var formatPattern: String = js.native
    
    def formatValue(date: js.Date): String = js.native
    
    def getFormat(): typings.ui5WebcomponentsLocalization.distDateFormatMod.default = js.native
    
    /**
      * Hides the hours slider regardless of formatPattern
      * This property is only needed for the duration picker use case which requires non-standard slider combinations
      * @public
      * @name sap.ui.webc.main.TimeSelection.prototype.hideHours
      * @type {boolean}
      */
    var hideHours: Boolean = js.native
    
    /**
      * Hides the minutes slider regardless of formatPattern
      * This property is only needed for the duration picker use case which requires non-standard slider combinations
      * @public
      * @name sap.ui.webc.main.TimeSelection.prototype.hideMinutes
      * @type {boolean}
      */
    var hideMinutes: Boolean = js.native
    
    /**
      * Hides the seconds slider regardless of formatPattern
      * This property is only needed for the duration picker use case which requires non-standard slider combinations
      * @public
      * @name sap.ui.webc.main.TimeSelection.prototype.hideSeconds
      * @type {boolean}
      */
    var hideSeconds: Boolean = js.native
    
    def hoursArray: js.Array[String] = js.native
    
    def hoursSliderTitle: String = js.native
    
    def isValid(value: String): `true` | js.Date | js.Array[js.Date] = js.native
    
    /**
      * The maximum number of hours to be displayed for the hours slider (only needed for the duration picker use case)
      * @public
      * @name sap.ui.webc.main.TimeSelection.prototype.maxHours
      * @type {Integer}
      */
    var maxHours: js.UndefOr[Double] = js.native
    
    /**
      * The maximum number of minutes to be displayed for the minutes slider (only needed for the duration picker use case)
      * @public
      * @name sap.ui.webc.main.TimeSelection.prototype.maxMinutes
      * @type {Integer}
      */
    var maxMinutes: js.UndefOr[Double] = js.native
    
    /**
      * The maximum number of seconds to be displayed for the seconds slider (only needed for the duration picker use case)
      * @public
      * @name sap.ui.webc.main.TimeSelection.prototype.maxSeconds
      * @type {Integer}
      */
    var maxSeconds: js.UndefOr[Double] = js.native
    
    def minutesArray: js.Array[String] = js.native
    
    def minutesSliderTitle: String = js.native
    
    var minutesStep: Double = js.native
    
    def normalizeValue(value: String): String = js.native
    
    def onHoursChange(e: CustomEvent): Unit = js.native
    
    def onMinutesChange(e: CustomEvent): Unit = js.native
    
    def onPeriodChange(e: CustomEvent): Unit = js.native
    
    def onSecondsChange(e: CustomEvent): Unit = js.native
    
    def periodSliderTitle: String = js.native
    
    def periodsArray: js.Array[String] = js.native
    
    def secondsArray: js.Array[String] = js.native
    
    def secondsSliderTitle: String = js.native
    
    var secondsStep: Double = js.native
    
    def selectSlider(e: FocusEvent): Unit = js.native
    /**
      * Event handler for the "click" and "focusin" events of the sliders
      * @param event
      */
    def selectSlider(e: MouseEvent): Unit = js.native
    
    def setValue(date: js.Date): Unit = js.native
    
    def validDateValue: js.Date = js.native
    
    /**
      * Defines a formatted time value.
      *
      * @type {string}
      * @name sap.ui.webc.main.TimeSelection.prototype.value
      * @defaultvalue undefined
      * @public
      */
    var value: js.UndefOr[String] = js.native
  }
  
  trait TimeSelectionChangeEventDetail extends StObject {
    
    var valid: Boolean
    
    var value: js.UndefOr[String] = js.undefined
  }
  object TimeSelectionChangeEventDetail {
    
    inline def apply(valid: Boolean): TimeSelectionChangeEventDetail = {
      val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeSelectionChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimeSelectionChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait TimeSelectionSliderChangeEventDetail extends StObject {
    
    var slider: String
  }
  object TimeSelectionSliderChangeEventDetail {
    
    inline def apply(slider: String): TimeSelectionSliderChangeEventDetail = {
      val __obj = js.Dynamic.literal(slider = slider.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeSelectionSliderChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimeSelectionSliderChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setSlider(value: String): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
    }
  }
}
