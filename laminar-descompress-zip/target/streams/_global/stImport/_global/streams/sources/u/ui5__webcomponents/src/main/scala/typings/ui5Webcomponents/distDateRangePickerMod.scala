package typings.ui5Webcomponents

import typings.ui5Webcomponents.ui5WebcomponentsStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDateRangePickerMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    * The DateRangePicker enables the users to enter a localized date range using touch, mouse, keyboard input, or by selecting a date range in the calendar.
    *
    * <h3>Usage</h3>
    * The user can enter a date by:
    * Using the calendar that opens in a popup or typing it in directly in the input field (not available for mobile devices).
    * For the <code>ui5-daterange-picker</code>
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/DateRangePicker.js";</code>
    *
    * <h3>Keyboard Handling</h3>
    * The <code>ui5-daterange-picker</code> provides advanced keyboard handling.
    * <br>
    *
    * When the <code>ui5-daterange-picker</code> input field is focused the user can
    * increment or decrement respectively the range start or end date, depending on where the cursor is.
    * The following shortcuts are available:
    * <br>
    * <ul>
    * <li>[PAGEDOWN] - Decrements the corresponding day of the month by one</li>
    * <li>[SHIFT] + [PAGEDOWN] - Decrements the corresponding month by one</li>
    * <li>[SHIFT] + [CTRL] + [PAGEDOWN] - Decrements the corresponding year by one</li>
    * <li>[PAGEUP] - Increments the corresponding day of the month by one</li>
    * <li>[SHIFT] + [PAGEUP] - Increments the corresponding month by one</li>
    * <li>[SHIFT] + [CTRL] + [PAGEUP] - Increments the corresponding year by one</li>
    * </ul>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.DateRangePicker
    * @extends sap.ui.webc.main.DatePicker
    * @tagname ui5-daterange-picker
    * @since 1.0.0-rc.8
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/DateRangePicker", JSImport.Default)
  @js.native
  open class default () extends DateRangePicker
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    * The DateRangePicker enables the users to enter a localized date range using touch, mouse, keyboard input, or by selecting a date range in the calendar.
    *
    * <h3>Usage</h3>
    * The user can enter a date by:
    * Using the calendar that opens in a popup or typing it in directly in the input field (not available for mobile devices).
    * For the <code>ui5-daterange-picker</code>
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/DateRangePicker.js";</code>
    *
    * <h3>Keyboard Handling</h3>
    * The <code>ui5-daterange-picker</code> provides advanced keyboard handling.
    * <br>
    *
    * When the <code>ui5-daterange-picker</code> input field is focused the user can
    * increment or decrement respectively the range start or end date, depending on where the cursor is.
    * The following shortcuts are available:
    * <br>
    * <ul>
    * <li>[PAGEDOWN] - Decrements the corresponding day of the month by one</li>
    * <li>[SHIFT] + [PAGEDOWN] - Decrements the corresponding month by one</li>
    * <li>[SHIFT] + [CTRL] + [PAGEDOWN] - Decrements the corresponding year by one</li>
    * <li>[PAGEUP] - Increments the corresponding day of the month by one</li>
    * <li>[SHIFT] + [PAGEUP] - Increments the corresponding month by one</li>
    * <li>[SHIFT] + [CTRL] + [PAGEUP] - Increments the corresponding year by one</li>
    * </ul>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.DateRangePicker
    * @extends sap.ui.webc.main.DatePicker
    * @tagname ui5-daterange-picker
    * @since 1.0.0-rc.8
    * @public
    */
  @js.native
  trait DateRangePicker
    extends typings.ui5Webcomponents.distDatePickerMod.default {
    
    /**
      * Builds a string value out of two UTC timestamps - this method is the counterpart to _extractFirstTimestamp/_extractLastTimestamp
      * @private
      */
    def _buildValue(): String = js.native
    def _buildValue(firstDateTimestamp: Double): String = js.native
    def _buildValue(firstDateTimestamp: Double, lastDateTimestamp: Double): String = js.native
    def _buildValue(firstDateTimestamp: Unit, lastDateTimestamp: Double): String = js.native
    
    def _effectiveDelimiter: String = js.native
    
    def _endDateTimestamp: js.UndefOr[Double] = js.native
    
    /**
      * Returns a UTC timestamp, representing the first date in the value string or undefined if the value is empty
      * @private
      */
    def _extractFirstTimestamp(value: String): js.UndefOr[Double] = js.native
    
    /**
      * Returns a UTC timestamp, representing the last date in the value string or undefined if the value is empty or there is just one date
      * @private
      */
    def _extractLastTimestamp(value: String): js.UndefOr[Double] = js.native
    
    /* private */ var _prevDelimiter: Any = js.native
    
    def _splitValueByDelimiter(value: String): js.Array[String] = js.native
    
    def _startDateTimestamp: js.UndefOr[Double] = js.native
    
    def _tempTimestamp: Double | _empty = js.native
    
    /**
      * The first date in the range during selection (this is a temporary value, not the first date in the value range)
      *
      * @private
      */
    var _tempValue: String = js.native
    
    /**
      * Determines the symbol which separates the dates.
      * If not supplied, the default time interval delimiter for the current locale will be used.
      *
      * @type {string}
      * @name sap.ui.webc.main.DateRangePicker.prototype.delimiter
      * @defaultvalue "-"
      * @public
      */
    var delimiter: String = js.native
    
    /**
      * Returns the end date of the currently selected range as JavaScript Date instance.
      *
      * @readonly
      * @type {Date}
      * @public
      * @name sap.ui.webc.main.DateRangePicker.prototype.endDateValue
      */
    def endDateValue: js.Date = js.native
    
    /**
      * Returns the start date of the currently selected range as JavaScript Date instance.
      *
      * @readonly
      * @type {Date}
      * @public
      * @name sap.ui.webc.main.DateRangePicker.prototype.startDateValue
      */
    def startDateValue: js.Date = js.native
  }
}
