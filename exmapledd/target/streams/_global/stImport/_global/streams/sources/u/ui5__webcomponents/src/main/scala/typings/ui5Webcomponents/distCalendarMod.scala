package typings.ui5Webcomponents

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.KeyboardEvent
import typings.ui5Webcomponents.anon.MonthButtonInfo
import typings.ui5Webcomponents.distTypesCalendarSelectionModeMod.CalendarSelectionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCalendarMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-calendar</code> component allows users to select one or more dates.
    * <br><br>
    * Currently selected dates are represented with instances of <code>ui5-date</code> as
    * children of the <code>ui5-calendar</code>. The value property of each <code>ui5-date</code> must be a
    * date string, correctly formatted according to the <code>ui5-calendar</code>'s <code>formatPattern</code> property.
    * Whenever the user changes the date selection, <code>ui5-calendar</code> will automatically create/remove instances
    * of <code>ui5-date</code> in itself, unless you prevent this behavior by calling <code>preventDefault()</code> for the
    * <code>selected-dates-change</code> event. This is useful if you want to control the selected dates externally.
    * <br><br>
    *
    * <h3>Usage</h3>
    *
    * The user can navigate to a particular date by:
    * <br>
    * <ul>
    * <li>Pressing over a month inside the months view</li>
    * <li>Pressing over an year inside the years view</li>
    * </ul>
    * <br>
    * The user can confirm a date selection by pressing over a date inside the days view.
    * <br><br>
    *
    * <h3>Keyboard Handling</h3>
    * The <code>ui5-calendar</code> provides advanced keyboard handling.
    * When a picker is showed and focused the user can use the following keyboard
    * shortcuts in order to perform a navigation:
    * <br>
    * - Day picker: <br>
    * <ul>
    * <li>[F4] - Shows month picker</li>
    * <li>[SHIFT] + [F4] - Shows year picker</li>
    * <li>[PAGEUP] - Navigate to the previous month</li>
    * <li>[PAGEDOWN] - Navigate to the next month</li>
    * <li>[SHIFT] + [PAGEUP] - Navigate to the previous year</li>
    * <li>[SHIFT] + [PAGEDOWN] - Navigate to the next year</li>
    * <li>[CTRL] + [SHIFT] + [PAGEUP] - Navigate ten years backwards</li>
    * <li>[CTRL] + [SHIFT] + [PAGEDOWN] - Navigate ten years forwards</li>
    * <li>[HOME] - Navigate to the first day of the week</li>
    * <li>[END] - Navigate to the last day of the week</li>
    * <li>[CTRL] + [HOME] - Navigate to the first day of the month</li>
    * <li>[CTRL] + [END] - Navigate to the last day of the month</li>
    * </ul>
    * <br>
    * - Month picker: <br>
    * <ul>
    * <li>[PAGEUP] - Navigate to the previous year</li>
    * <li>[PAGEDOWN] - Navigate to the next year</li>
    * <li>[HOME] - Navigate to the first month of the current row</li>
    * <li>[END] - Navigate to the last month of the current row</li>
    * <li>[CTRL] + [HOME] - Navigate to the first month of the current year</li>
    * <li>[CTRL] + [END] - Navigate to the last month of the year</li>
    * </ul>
    * <br>
    * - Year picker: <br>
    * <ul>
    * <li>[PAGEUP] - Navigate to the previous year range</li>
    * <li>[PAGEDOWN] - Navigate the next year range</li>
    * <li>[HOME] - Navigate to the first year of the current row</li>
    * <li>[END] - Navigate to the last year of the current row</li>
    * <li>[CTRL] + [HOME] - Navigate to the first year of the current year range</li>
    * <li>[CTRL] + [END] - Navigate to the last year of the current year range</li>
    * </ul>
    * <br>
    *
    * <h4>Fast Navigation</h4>
    * This component provides a build in fast navigation group which can be used via <code>F6 / Shift + F6</code> or <code> Ctrl + Alt(Option) + Down /  Ctrl + Alt(Option) + Up</code>.
    * In order to use this functionality, you need to import the following module:
    * <code>import "@ui5/webcomponents-base/dist/features/F6Navigation.js"</code>
    * <br><br>
    *
  * <h3>Calendar types</h3>
    * The component supports several calendar types - Gregorian, Buddhist, Islamic, Japanese and Persian.
    * By default the Gregorian Calendar is used. In order to use the Buddhist, Islamic, Japanese or Persian calendar,
    * you need to set the <code>primaryCalendarType</code> property and import one or more of the following modules:
    * <br><br>
    *
    * <code>import "@ui5/webcomponents-localization/dist/features/calendar/Buddhist.js";</code>
    * <br>
    * <code>import "@ui5/webcomponents-localization/dist/features/calendar/Islamic.js";</code>
    * <br>
    * <code>import "@ui5/webcomponents-localization/dist/features/calendar/Japanese.js";</code>
    * <br>
    * <code>import "@ui5/webcomponents-localization/dist/features/calendar/Persian.js";</code>
    * <br><br>
    *
    * Or, you can use the global configuration and set the <code>calendarType</code> key:
    * <br>
    * <code>
    * &lt;script data-id="sap-ui-config" type="application/json"&gt;
    * {
    *	"calendarType": "Japanese"
    * }
    * &lt;/script&gt;
    * </code>
    *
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/Calendar";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.Calendar
    * @extends sap.ui.webc.main.CalendarPart
    * @tagname ui5-calendar
    * @appenddocs CalendarDate
    * @public
    * @since 1.0.0-rc.11
    */
  @JSImport("@ui5/webcomponents/dist/Calendar", JSImport.Default)
  @js.native
  open class default () extends Calendar
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-calendar</code> component allows users to select one or more dates.
    * <br><br>
    * Currently selected dates are represented with instances of <code>ui5-date</code> as
    * children of the <code>ui5-calendar</code>. The value property of each <code>ui5-date</code> must be a
    * date string, correctly formatted according to the <code>ui5-calendar</code>'s <code>formatPattern</code> property.
    * Whenever the user changes the date selection, <code>ui5-calendar</code> will automatically create/remove instances
    * of <code>ui5-date</code> in itself, unless you prevent this behavior by calling <code>preventDefault()</code> for the
    * <code>selected-dates-change</code> event. This is useful if you want to control the selected dates externally.
    * <br><br>
    *
    * <h3>Usage</h3>
    *
    * The user can navigate to a particular date by:
    * <br>
    * <ul>
    * <li>Pressing over a month inside the months view</li>
    * <li>Pressing over an year inside the years view</li>
    * </ul>
    * <br>
    * The user can confirm a date selection by pressing over a date inside the days view.
    * <br><br>
    *
    * <h3>Keyboard Handling</h3>
    * The <code>ui5-calendar</code> provides advanced keyboard handling.
    * When a picker is showed and focused the user can use the following keyboard
    * shortcuts in order to perform a navigation:
    * <br>
    * - Day picker: <br>
    * <ul>
    * <li>[F4] - Shows month picker</li>
    * <li>[SHIFT] + [F4] - Shows year picker</li>
    * <li>[PAGEUP] - Navigate to the previous month</li>
    * <li>[PAGEDOWN] - Navigate to the next month</li>
    * <li>[SHIFT] + [PAGEUP] - Navigate to the previous year</li>
    * <li>[SHIFT] + [PAGEDOWN] - Navigate to the next year</li>
    * <li>[CTRL] + [SHIFT] + [PAGEUP] - Navigate ten years backwards</li>
    * <li>[CTRL] + [SHIFT] + [PAGEDOWN] - Navigate ten years forwards</li>
    * <li>[HOME] - Navigate to the first day of the week</li>
    * <li>[END] - Navigate to the last day of the week</li>
    * <li>[CTRL] + [HOME] - Navigate to the first day of the month</li>
    * <li>[CTRL] + [END] - Navigate to the last day of the month</li>
    * </ul>
    * <br>
    * - Month picker: <br>
    * <ul>
    * <li>[PAGEUP] - Navigate to the previous year</li>
    * <li>[PAGEDOWN] - Navigate to the next year</li>
    * <li>[HOME] - Navigate to the first month of the current row</li>
    * <li>[END] - Navigate to the last month of the current row</li>
    * <li>[CTRL] + [HOME] - Navigate to the first month of the current year</li>
    * <li>[CTRL] + [END] - Navigate to the last month of the year</li>
    * </ul>
    * <br>
    * - Year picker: <br>
    * <ul>
    * <li>[PAGEUP] - Navigate to the previous year range</li>
    * <li>[PAGEDOWN] - Navigate the next year range</li>
    * <li>[HOME] - Navigate to the first year of the current row</li>
    * <li>[END] - Navigate to the last year of the current row</li>
    * <li>[CTRL] + [HOME] - Navigate to the first year of the current year range</li>
    * <li>[CTRL] + [END] - Navigate to the last year of the current year range</li>
    * </ul>
    * <br>
    *
    * <h4>Fast Navigation</h4>
    * This component provides a build in fast navigation group which can be used via <code>F6 / Shift + F6</code> or <code> Ctrl + Alt(Option) + Down /  Ctrl + Alt(Option) + Up</code>.
    * In order to use this functionality, you need to import the following module:
    * <code>import "@ui5/webcomponents-base/dist/features/F6Navigation.js"</code>
    * <br><br>
    *
  * <h3>Calendar types</h3>
    * The component supports several calendar types - Gregorian, Buddhist, Islamic, Japanese and Persian.
    * By default the Gregorian Calendar is used. In order to use the Buddhist, Islamic, Japanese or Persian calendar,
    * you need to set the <code>primaryCalendarType</code> property and import one or more of the following modules:
    * <br><br>
    *
    * <code>import "@ui5/webcomponents-localization/dist/features/calendar/Buddhist.js";</code>
    * <br>
    * <code>import "@ui5/webcomponents-localization/dist/features/calendar/Islamic.js";</code>
    * <br>
    * <code>import "@ui5/webcomponents-localization/dist/features/calendar/Japanese.js";</code>
    * <br>
    * <code>import "@ui5/webcomponents-localization/dist/features/calendar/Persian.js";</code>
    * <br><br>
    *
    * Or, you can use the global configuration and set the <code>calendarType</code> key:
    * <br>
    * <code>
    * &lt;script data-id="sap-ui-config" type="application/json"&gt;
    * {
    *	"calendarType": "Japanese"
    * }
    * &lt;/script&gt;
    * </code>
    *
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/Calendar";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.Calendar
    * @extends sap.ui.webc.main.CalendarPart
    * @tagname ui5-calendar
    * @appenddocs CalendarDate
    * @public
    * @since 1.0.0-rc.11
    */
  @js.native
  trait Calendar
    extends typings.ui5Webcomponents.distCalendarPartMod.default {
    
    /**
      * Which picker is currently visible to the user: day/month/year
      */
    var _currentPicker: String = js.native
    
    def _currentPickerDOM: ICalendarPicker = js.native
    
    var _headerMonthButtonText: String = js.native
    
    var _headerYearButtonText: String = js.native
    
    var _headerYearButtonTextSecType: String = js.native
    
    def _isDayPickerHidden: Boolean = js.native
    
    /**
      * The month button is hidden when the month picker or year picker is shown
      * @returns {boolean}
      * @private
      */
    def _isHeaderMonthButtonHidden: Boolean = js.native
    
    def _isMonthPickerHidden: Boolean = js.native
    
    def _isYearPickerHidden: Boolean = js.native
    
    var _nextButtonDisabled: Boolean = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    var _previousButtonDisabled: Boolean = js.native
    
    /**
      * @private
      */
    def _selectedDatesTimestamps: js.Array[Double] = js.native
    
    def _setSecondaryCalendarTypeButtonText(): Unit = js.native
    
    /**
      * @private
      */
    def _setSelectedDates(selectedDates: js.Array[Double]): Unit = js.native
    
    /**
      * Defines the selected date or dates (depending on the <code>selectionMode</code> property)
      * for this calendar as instances of <code>ui5-date</code>.
      *
      * @type {sap.ui.webc.main.ICalendarDate[]}
      * @name sap.ui.webc.main.Calendar.prototype.default
      * @slot dates
      * @public
      */
    var dates: js.Array[typings.ui5Webcomponents.distCalendarDateMod.default] = js.native
    
    /**
      * Defines the visibility of the week numbers column.
      * <br><br>
      *
      * <b>Note:</b> For calendars other than Gregorian,
      * the week numbers are not displayed regardless of what is set.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.Calendar.prototype.hideWeekNumbers
      * @defaultvalue false
      * @public
      */
    var hideWeekNumbers: Boolean = js.native
    
    /**
      * The year clicked the "Next" button in the header
      */
    def onHeaderNextPress(): Unit = js.native
    
    /**
      * The year clicked the "Previous" button in the header
      */
    def onHeaderPreviousPress(): Unit = js.native
    
    /**
      * The user clicked the "month" button in the header
      */
    def onHeaderShowMonthPress(e: CustomEvent): Unit = js.native
    
    /**
      * The user clicked the "year" button in the header
      */
    def onHeaderShowYearPress(e: CustomEvent): Unit = js.native
    
    def onNavigate(e: CustomEvent): Unit = js.native
    
    def onSelectedDatesChange(e: CustomEvent): Unit = js.native
    
    def onSelectedMonthChange(e: CustomEvent): Unit = js.native
    
    def onSelectedYearChange(e: CustomEvent): Unit = js.native
    
    def secondaryCalendarTypeButtonText: js.UndefOr[MonthButtonInfo] = js.native
    
    /**
      * Returns an array of UTC timestamps, representing the selected dates.
      * @protected
      * @deprecated
      */
    def selectedDates: js.Array[Double] = js.native
    /**
      * Creates instances of <code>ui5-date</code> inside this <code>ui5-calendar</code> with values, equal to the provided UTC timestamps
      * @protected
      * @deprecated
      * @param { Array<number> } selectedDates Array of UTC timestamps
      */
    def selectedDates_=(selectedDates: js.Array[Double]): Unit = js.native
    
    /**
      * Defines the type of selection used in the calendar component.
      * Accepted property values are:<br>
      * <ul>
      * <li><code>CalendarSelectionMode.Single</code> - enables a single date selection.(default value)</li>
      * <li><code>CalendarSelectionMode.Range</code> - enables selection of a date range.</li>
      * <li><code>CalendarSelectionMode.Multiple</code> - enables selection of multiple dates.</li>
      * </ul>
      * @type {sap.ui.webc.main.types.CalendarSelectionMode}
      * @name sap.ui.webc.main.Calendar.prototype.selectionMode
      * @defaultvalue "Single"
      * @public
      */
    var selectionMode: CalendarSelectionMode = js.native
  }
  
  trait CalendarChangeEventDetail extends StObject {
    
    var dates: js.Array[Double]
    
    var timestamp: js.UndefOr[Double] = js.undefined
    
    var values: js.Array[String]
  }
  object CalendarChangeEventDetail {
    
    inline def apply(dates: js.Array[Double], values: js.Array[String]): CalendarChangeEventDetail = {
      val __obj = js.Dynamic.literal(dates = dates.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalendarChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CalendarChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setDates(value: js.Array[Double]): Self = StObject.set(x, "dates", value.asInstanceOf[js.Any])
      
      inline def setDatesVarargs(value: Double*): Self = StObject.set(x, "dates", js.Array(value*))
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  trait ICalendarPicker extends StObject {
    
    var _autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var _firstYear: js.UndefOr[Double] = js.undefined
    
    def _hasNextPage(): Boolean
    
    def _hasPreviousPage(): Boolean
    
    var _lastYear: js.UndefOr[Double] = js.undefined
    
    def _showNextPage(): Unit
    
    def _showPreviousPage(): Unit
  }
  object ICalendarPicker {
    
    inline def apply(
      _hasNextPage: () => Boolean,
      _hasPreviousPage: () => Boolean,
      _showNextPage: () => Unit,
      _showPreviousPage: () => Unit
    ): ICalendarPicker = {
      val __obj = js.Dynamic.literal(_hasNextPage = js.Any.fromFunction0(_hasNextPage), _hasPreviousPage = js.Any.fromFunction0(_hasPreviousPage), _showNextPage = js.Any.fromFunction0(_showNextPage), _showPreviousPage = js.Any.fromFunction0(_showPreviousPage))
      __obj.asInstanceOf[ICalendarPicker]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICalendarPicker] (val x: Self) extends AnyVal {
      
      inline def set_autoFocus(value: Boolean): Self = StObject.set(x, "_autoFocus", value.asInstanceOf[js.Any])
      
      inline def set_autoFocusUndefined: Self = StObject.set(x, "_autoFocus", js.undefined)
      
      inline def set_firstYear(value: Double): Self = StObject.set(x, "_firstYear", value.asInstanceOf[js.Any])
      
      inline def set_firstYearUndefined: Self = StObject.set(x, "_firstYear", js.undefined)
      
      inline def set_hasNextPage(value: () => Boolean): Self = StObject.set(x, "_hasNextPage", js.Any.fromFunction0(value))
      
      inline def set_hasPreviousPage(value: () => Boolean): Self = StObject.set(x, "_hasPreviousPage", js.Any.fromFunction0(value))
      
      inline def set_lastYear(value: Double): Self = StObject.set(x, "_lastYear", value.asInstanceOf[js.Any])
      
      inline def set_lastYearUndefined: Self = StObject.set(x, "_lastYear", js.undefined)
      
      inline def set_showNextPage(value: () => Unit): Self = StObject.set(x, "_showNextPage", js.Any.fromFunction0(value))
      
      inline def set_showPreviousPage(value: () => Unit): Self = StObject.set(x, "_showPreviousPage", js.Any.fromFunction0(value))
    }
  }
}
