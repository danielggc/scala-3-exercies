package typings.ui5Webcomponents

import org.scalajs.dom.Event
import org.scalajs.dom.EventListenerOptions
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import typings.std.AddEventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.ui5Webcomponents.anon.Wrapper
import typings.ui5Webcomponents.distCalendarMod.ICalendarPicker
import typings.ui5Webcomponents.distTypesCalendarSelectionModeMod.CalendarSelectionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDayPickerMod {
  
  /**
    * @class
    *
    * Represents the days inside a single month view of the <code>ui5-calendar</code> component.
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.DayPicker
    * @extends sap.ui.webc.main.CalendarPart
    * @tagname ui5-daypicker
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/DayPicker", JSImport.Default)
  @js.native
  open class default () extends DayPicker {
    
    /* CompleteClass */
    override def _hasNextPage(): Boolean = js.native
    
    /* CompleteClass */
    override def _hasPreviousPage(): Boolean = js.native
    
    /* CompleteClass */
    override def _showNextPage(): Unit = js.native
    
    /* CompleteClass */
    override def _showPreviousPage(): Unit = js.native
  }
  object default {
    
    @JSImport("@ui5/webcomponents/dist/DayPicker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/DayPicker", "default.i18nBundle")
    @js.native
    def i18nBundle: typings.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: typings.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  trait Day extends StObject {
    
    var _isSecondaryCalendarType: Boolean
    
    var _tabIndex: String
    
    var ariaDisabled: js.UndefOr[String] = js.undefined
    
    var ariaLabel: String
    
    var ariaSelected: String
    
    var classes: String
    
    var day: Double
    
    var disabled: Boolean
    
    var focusRef: Boolean
    
    var isHidden: js.UndefOr[Boolean] = js.undefined
    
    var secondDay: js.UndefOr[Double] = js.undefined
    
    var selected: Boolean
    
    var timestamp: String
    
    var weekNum: js.UndefOr[Double] = js.undefined
  }
  object Day {
    
    inline def apply(
      _isSecondaryCalendarType: Boolean,
      _tabIndex: String,
      ariaLabel: String,
      ariaSelected: String,
      classes: String,
      day: Double,
      disabled: Boolean,
      focusRef: Boolean,
      selected: Boolean,
      timestamp: String
    ): Day = {
      val __obj = js.Dynamic.literal(_isSecondaryCalendarType = _isSecondaryCalendarType.asInstanceOf[js.Any], _tabIndex = _tabIndex.asInstanceOf[js.Any], ariaLabel = ariaLabel.asInstanceOf[js.Any], ariaSelected = ariaSelected.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], focusRef = focusRef.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Day]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Day] (val x: Self) extends AnyVal {
      
      inline def setAriaDisabled(value: String): Self = StObject.set(x, "ariaDisabled", value.asInstanceOf[js.Any])
      
      inline def setAriaDisabledUndefined: Self = StObject.set(x, "ariaDisabled", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaSelected(value: String): Self = StObject.set(x, "ariaSelected", value.asInstanceOf[js.Any])
      
      inline def setClasses(value: String): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setFocusRef(value: Boolean): Self = StObject.set(x, "focusRef", value.asInstanceOf[js.Any])
      
      inline def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      inline def setIsHiddenUndefined: Self = StObject.set(x, "isHidden", js.undefined)
      
      inline def setSecondDay(value: Double): Self = StObject.set(x, "secondDay", value.asInstanceOf[js.Any])
      
      inline def setSecondDayUndefined: Self = StObject.set(x, "secondDay", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setWeekNum(value: Double): Self = StObject.set(x, "weekNum", value.asInstanceOf[js.Any])
      
      inline def setWeekNumUndefined: Self = StObject.set(x, "weekNum", js.undefined)
      
      inline def set_isSecondaryCalendarType(value: Boolean): Self = StObject.set(x, "_isSecondaryCalendarType", value.asInstanceOf[js.Any])
      
      inline def set_tabIndex(value: String): Self = StObject.set(x, "_tabIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait DayName extends StObject {
    
    var classes: String
    
    var name: String
    
    var ultraShortName: js.UndefOr[String] = js.undefined
  }
  object DayName {
    
    inline def apply(classes: String, name: String): DayName = {
      val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[DayName]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DayName] (val x: Self) extends AnyVal {
      
      inline def setClasses(value: String): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUltraShortName(value: String): Self = StObject.set(x, "ultraShortName", value.asInstanceOf[js.Any])
      
      inline def setUltraShortNameUndefined: Self = StObject.set(x, "ultraShortName", js.undefined)
    }
  }
  
  /**
    * @class
    *
    * Represents the days inside a single month view of the <code>ui5-calendar</code> component.
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.DayPicker
    * @extends sap.ui.webc.main.CalendarPart
    * @tagname ui5-daypicker
    * @public
    */
  @js.native
  trait DayPicker
    extends typings.ui5Webcomponents.distCalendarPartMod.default
       with ICalendarPicker {
    
    def _addTimestampToSelection(timestamp: Double): Unit = js.native
    
    /**
      * Builds the dayNames object (header of the month).
      * @param { LocaleData } localeData
      * @private
      */
    def _buildDayNames(localeData: typings.ui5WebcomponentsLocalization.distLocaleDataMod.default): Unit = js.native
    
    /**
      * Builds the "_weeks" object that represents the month.
      * @param { LocaleData }localeData
      * @private
      */
    def _buildWeeks(localeData: typings.ui5WebcomponentsLocalization.distLocaleDataMod.default): Unit = js.native
    
    var _dayNames: js.Array[DayName] = js.native
    
    def _getFirstDay(): typings.ui5WebcomponentsLocalization.distDatesCalendarDateMod.default = js.native
    
    def _getFirstDayOfWeek(): Double = js.native
    
    def _getSecondaryDay(tempDate: typings.ui5WebcomponentsLocalization.distDatesCalendarDateMod.default): typings.ui5WebcomponentsLocalization.distDatesCalendarDateMod.default = js.native
    
    /**
      * When set, the component will skip all work in onBeforeRendering and will not automatically set the focus on itself
      * @type {boolean}
      * @private
      */
    var _hidden: Boolean = js.native
    
    /**
      * Tells if the day is inside a selection range (light blue).
      * @param { number } timestamp
      * @returns { boolean }
      * @private
      */
    def _isDayInsideSelectionRange(timestamp: Double): Boolean = js.native
    
    def _isDayPressed(target: HTMLElement): Boolean = js.native
    
    /**
      * Tells if the day is selected (dark blue).
      * @param { number } timestamp
      * @returns { boolean }
      * @private
      */
    def _isDaySelected(timestamp: Double): Boolean = js.native
    
    def _isWeekend(oDate: typings.ui5WebcomponentsLocalization.distDatesCalendarDateMod.default): Boolean = js.native
    
    /**
      * Modifies the timestamp by a certain amount of days/months/years.
      * @param { number } amount
      * @param { string } unit
      * @private
      */
    def _modifyTimestampBy(amount: Double, unit: String): Unit = js.native
    
    /**
      * Called when at least one day is selected and the user presses "Shift".
      * @param { number } timestamp
      * @private
      */
    def _multipleSelection(timestamp: Double): Unit = js.native
    
    /**
      * Called upon "Home" or "End" - moves the focus to the first or last item in the row.
      * @param { boolean } homePressed
      * @private
      */
    def _onHomeOrEnd(homePressed: Boolean): Unit = js.native
    
    /**
      * Click is the same as "Enter".
      * <b>Note:</b> "Click+Shift" has the same effect as "Enter+Shift".
      * @param { MouseEvent } e
      * @private
      */
    def _onclick(e: MouseEvent): Unit = js.native
    
    def _onfocusin(): Unit = js.native
    
    def _onfocusout(): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeyup(e: KeyboardEvent): Unit = js.native
    
    /**
      * Set the hovered day as the "_secondTimestamp".
      * @param { MouseEvent } e
      * @private
      */
    def _onmouseover(e: MouseEvent): Unit = js.native
    
    def _removeTimestampFromSelection(timestamp: Double): Unit = js.native
    
    /**
      * When selectionMode="Range" and the first day in the range is selected, this is the currently hovered (when using mouse) or focused (when using keyboard) day by the user
      * @private
      */
    var _secondTimestamp: js.UndefOr[Double] = js.native
    
    /**
      * Selects/deselects a day.
      * @param { Event} e
      * @param { boolean} isShift true if the user did Click+Shift or Enter+Shift (but not Space+Shift)
      * @private
      */
    def _selectDate(e: Event, isShift: Boolean): Unit = js.native
    
    /**
      * Selects/deselects the whole row (week).
      * @private
      */
    def _selectWeek(): Unit = js.native
    
    /**
      * Sets the timestamp to an absolute value.
      * @param { number } value
      * @private
      */
    def _setTimestamp(value: Double): Unit = js.native
    
    def _toggleTimestampInSelection(timestamp: Double): Unit = js.native
    
    /**
      * During range selection, when the user is navigating with the keyboard,
      * the currently focused day is considered the "second day".
      * @private
      */
    def _updateSecondTimestamp(): Unit = js.native
    
    /**
      * @type {object}
      * @private
      */
    var _weeks: js.Array[Week] = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    def ariaRoledescription: String = js.native
    
    def hasSecondaryCalendarType: Boolean = js.native
    
    /**
      * Defines the visibility of the week numbers column.
      * <br><br>
      *
      * <b>Note:<b> For calendars other than Gregorian,
      * the week numbers are not displayed regardless of what is set.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.DayPicker.prototype.hideWeekNumbers
      * @defaultvalue false
      * @public
      * @since 1.0.0-rc.8
      */
    var hideWeekNumbers: Boolean = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    
    /**
      * An array of UTC timestamps representing the selected date or dates depending on the capabilities of the picker component.
      * @type {array}
      * @name sap.ui.webc.main.DayPicker.prototype.selectedDates
      * @public
      */
    var selectedDates: js.Array[Double] = js.native
    
    /**
      * Defines the type of selection used in the day picker component.
      * Accepted property values are:<br>
      * <ul>
      * <li><code>CalendarSelectionMode.Single</code> - enables a single date selection.(default value)</li>
      * <li><code>CalendarSelectionMode.Range</code> - enables selection of a date range.</li>
      * <li><code>CalendarSelectionMode.Multiple</code> - enables selection of multiple dates.</li>
      * </ul>
      * @type {sap.ui.webc.main.types.CalendarSelectionMode}
      * @name sap.ui.webc.main.DayPicker.prototype.selectionMode
      * @defaultvalue "Single"
      * @public
      */
    var selectionMode: CalendarSelectionMode = js.native
    
    def shouldHideWeekNumbers: Boolean = js.native
    
    def styles: Wrapper = js.native
  }
  
  trait DayPickerChangeEventDetail extends StObject {
    
    var dates: js.Array[Double]
    
    var timestamp: js.UndefOr[Double] = js.undefined
  }
  object DayPickerChangeEventDetail {
    
    inline def apply(dates: js.Array[Double]): DayPickerChangeEventDetail = {
      val __obj = js.Dynamic.literal(dates = dates.asInstanceOf[js.Any])
      __obj.asInstanceOf[DayPickerChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DayPickerChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setDates(value: js.Array[Double]): Self = StObject.set(x, "dates", value.asInstanceOf[js.Any])
      
      inline def setDatesVarargs(value: Double*): Self = StObject.set(x, "dates", js.Array(value*))
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    }
  }
  
  trait DayPickerNavigateEventDetail extends StObject {
    
    var timestamp: Double
  }
  object DayPickerNavigateEventDetail {
    
    inline def apply(timestamp: Double): DayPickerNavigateEventDetail = {
      val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[DayPickerNavigateEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DayPickerNavigateEventDetail] (val x: Self) extends AnyVal {
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  type Week = js.Array[Day | WeekNumber]
  
  trait WeekNumber extends StObject {
    
    var isHidden: Boolean
    
    var weekNum: Double
  }
  object WeekNumber {
    
    inline def apply(isHidden: Boolean, weekNum: Double): WeekNumber = {
      val __obj = js.Dynamic.literal(isHidden = isHidden.asInstanceOf[js.Any], weekNum = weekNum.asInstanceOf[js.Any])
      __obj.asInstanceOf[WeekNumber]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WeekNumber] (val x: Self) extends AnyVal {
      
      inline def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      inline def setWeekNum(value: Double): Self = StObject.set(x, "weekNum", value.asInstanceOf[js.Any])
    }
  }
}
