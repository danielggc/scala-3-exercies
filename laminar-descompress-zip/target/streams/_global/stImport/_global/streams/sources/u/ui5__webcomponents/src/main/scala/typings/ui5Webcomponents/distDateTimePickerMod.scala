package typings.ui5Webcomponents

import org.scalajs.dom.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDateTimePickerMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    * The <code>DateTimePicker</code> component alows users to select both date (day, month and year) and time (hours, minutes and seconds)
    * and for the purpose it consists of input field and Date/Time picker.
    *
    * <h3>Usage</h3>
    *
    * Use the <code>DateTimePicker</code> if you need a combined date and time input component.
    * Don't use it if you want to use either date, or time value.
    * In this case, use the <code>DatePicker</code> or the <code>TimePicker</code> components instead.
    * <br><br>
    * The user can set date/time by:
    * <ul>
    * <li>using the calendar and the time selectors</li>
    * <li>typing in the input field</li>
    * </ul>
    *
    * Programmatically, to set date/time for the <code>DateTimePicker</code>, use the <code>value</code> property
    *
    * <h3>Formatting</h3>
    *
    * The value entered by typing into the input field must fit to the used date/time format.
    * <br><br>
    * Supported format options are pattern-based on Unicode LDML Date Format notation.
    * For more information, see <ui5-link target="_blank" href="https://unicode.org/reports/tr35/tr35-dates.html#Date_Field_Symbol_Table" class="api-table-content-cell-link">UTS #35: Unicode Locale Data Markup Language</ui5-link>.
    * <br><br>
    * <b>Example:</b> the following format <code>dd/MM/yyyy, hh:mm:ss aa</code>
    * corresponds the <code>13/04/2020, 03:16:16 AM</code> value.
    * <br>
    * The small 'h' defines "12" hours format and the "aa" symbols - "AM/PM" time periods.
    *
    * <br><br>
    * <b>Example:</b> the following format <code>dd/MM/yyyy, HH:mm:ss</code>
    * corresponds the <code>13/04/2020, 15:16:16</code> value.
    * <br>
    * The capital 'H' indicates "24" hours format.
    *
    * <br><br>
    * <b>Note:</b> If the <code>formatPattern</code> does NOT include time,
    * the <code>DateTimePicker</code> will fallback to the default time format according to the locale.
    *
    * <br><br>
    * <b>Note:</b> If no placeholder is set to the <code>DateTimePicker</code>,
    * the current <code>formatPattern</code> is displayed as a placeholder.
    * If another placeholder is needed, it must be set or in case no placeholder is needed - it can be set to an empty string.
    *
    * <br><br>
    * <b>Note:</b> If the user input does NOT match the <code>formatPattern</code>,
    * the <code>DateTimePicker</code> makes an attempt to parse it based on the
    * locale settings.
    *
    * <h3>Responsive behavior</h3>
    *
    * The <code>DateTimePicker</code> is responsive and fully adapts to all devices.
    * For larger screens, such as tablet or desktop, it is displayed as a popover, while
    * on phone devices, it is displayed full screen.
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/DateTimePicker.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.DateTimePicker
    * @extends sap.ui.webc.main.DatePicker
    * @tagname ui5-datetime-picker
    * @since 1.0.0-rc.7
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/DateTimePicker", JSImport.Default)
  @js.native
  open class default () extends DateTimePicker
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    * The <code>DateTimePicker</code> component alows users to select both date (day, month and year) and time (hours, minutes and seconds)
    * and for the purpose it consists of input field and Date/Time picker.
    *
    * <h3>Usage</h3>
    *
    * Use the <code>DateTimePicker</code> if you need a combined date and time input component.
    * Don't use it if you want to use either date, or time value.
    * In this case, use the <code>DatePicker</code> or the <code>TimePicker</code> components instead.
    * <br><br>
    * The user can set date/time by:
    * <ul>
    * <li>using the calendar and the time selectors</li>
    * <li>typing in the input field</li>
    * </ul>
    *
    * Programmatically, to set date/time for the <code>DateTimePicker</code>, use the <code>value</code> property
    *
    * <h3>Formatting</h3>
    *
    * The value entered by typing into the input field must fit to the used date/time format.
    * <br><br>
    * Supported format options are pattern-based on Unicode LDML Date Format notation.
    * For more information, see <ui5-link target="_blank" href="https://unicode.org/reports/tr35/tr35-dates.html#Date_Field_Symbol_Table" class="api-table-content-cell-link">UTS #35: Unicode Locale Data Markup Language</ui5-link>.
    * <br><br>
    * <b>Example:</b> the following format <code>dd/MM/yyyy, hh:mm:ss aa</code>
    * corresponds the <code>13/04/2020, 03:16:16 AM</code> value.
    * <br>
    * The small 'h' defines "12" hours format and the "aa" symbols - "AM/PM" time periods.
    *
    * <br><br>
    * <b>Example:</b> the following format <code>dd/MM/yyyy, HH:mm:ss</code>
    * corresponds the <code>13/04/2020, 15:16:16</code> value.
    * <br>
    * The capital 'H' indicates "24" hours format.
    *
    * <br><br>
    * <b>Note:</b> If the <code>formatPattern</code> does NOT include time,
    * the <code>DateTimePicker</code> will fallback to the default time format according to the locale.
    *
    * <br><br>
    * <b>Note:</b> If no placeholder is set to the <code>DateTimePicker</code>,
    * the current <code>formatPattern</code> is displayed as a placeholder.
    * If another placeholder is needed, it must be set or in case no placeholder is needed - it can be set to an empty string.
    *
    * <br><br>
    * <b>Note:</b> If the user input does NOT match the <code>formatPattern</code>,
    * the <code>DateTimePicker</code> makes an attempt to parse it based on the
    * locale settings.
    *
    * <h3>Responsive behavior</h3>
    *
    * The <code>DateTimePicker</code> is responsive and fully adapts to all devices.
    * For larger screens, such as tablet or desktop, it is displayed as a popover, while
    * on phone devices, it is displayed full screen.
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/DateTimePicker.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.DateTimePicker
    * @extends sap.ui.webc.main.DatePicker
    * @tagname ui5-datetime-picker
    * @since 1.0.0-rc.7
    * @public
    */
  @js.native
  trait DateTimePicker
    extends typings.ui5Webcomponents.distDatePickerMod.default {
    
    /**
      * Handles clicking on the <code>cancel</code> button, within the picker`s footer,
      * that would disregard the user selection.
      */
    def _cancelClick(): Unit = js.native
    
    /**
      * @private
      */
    var _currentTimeSlider: String = js.native
    
    /**
      * Handles the date/time switch available in <code>phoneMode</code> to switch
      * between the date and time views.
      * @param {Event} e
      */
    def _dateTimeSwitchChange(e: CustomEvent): Unit = js.native
    
    /**
      * Handles document resize to switch between <code>phoneMode</code> and normal appearance.
      */
    def _handleResize(): Unit = js.native
    
    def _handleResizeBound(): Unit = js.native
    
    /**
      * Defines if the <code>DateTimePicker</code> should be displayed in phone mode.
      * The phone mode turns on when the component is used on small screens or phone devices.
      * In phone mode the user can see either the calendar view, or the time view
      * and can switch between the views via toggle buttons.
      * @type {boolean}
      * @defaultvalue false
      * @private
      */
    var _phoneMode: Boolean = js.native
    
    /**
      * Selected, but not yet confirmed date/time
      * @private
      */
    var _previewValues: PreviewValues = js.native
    
    /**
      * Defines the visibility of the time view in <code>phoneMode</code>.
      * For more information, see the <code>phoneMode</code> property.
      *
      * <br><br>
      * <b>Note:</b> The date view would be displayed by default.
      * @type {boolean}
      * @defaultvalue false
      * @private
      */
    var _showTimeView: Boolean = js.native
    
    /**
      * Handles clicking on the <code>submit</code> button, within the picker`s footer.
      */
    def _submitClick(): Unit = js.native
    
    def _submitDisabled: Boolean = js.native
    
    def _timeSelectionValue: String = js.native
    
    def btnCancelLabel: String = js.native
    
    def btnDateLabel: String = js.native
    
    def btnOKLabel: String = js.native
    
    def btnTimeLabel: String = js.native
    
    def getPicker(): js.Promise[typings.ui5Webcomponents.distResponsivePopoverMod.default] = js.native
    
    def getSelectedDateTime(): js.Date = js.native
    
    def onTimeSelectionChange(e: CustomEvent): Unit = js.native
    
    def onTimeSliderChange(e: CustomEvent): Unit = js.native
    
    def showDateView: Boolean = js.native
    
    def showTimeView: Boolean = js.native
  }
  
  trait PreviewValues extends StObject {
    
    var calendarTimestamp: js.UndefOr[Double] = js.undefined
    
    var calendarValue: js.UndefOr[String] = js.undefined
    
    var timeSelectionValue: js.UndefOr[String] = js.undefined
  }
  object PreviewValues {
    
    inline def apply(): PreviewValues = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreviewValues]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PreviewValues] (val x: Self) extends AnyVal {
      
      inline def setCalendarTimestamp(value: Double): Self = StObject.set(x, "calendarTimestamp", value.asInstanceOf[js.Any])
      
      inline def setCalendarTimestampUndefined: Self = StObject.set(x, "calendarTimestamp", js.undefined)
      
      inline def setCalendarValue(value: String): Self = StObject.set(x, "calendarValue", value.asInstanceOf[js.Any])
      
      inline def setCalendarValueUndefined: Self = StObject.set(x, "calendarValue", js.undefined)
      
      inline def setTimeSelectionValue(value: String): Self = StObject.set(x, "timeSelectionValue", value.asInstanceOf[js.Any])
      
      inline def setTimeSelectionValueUndefined: Self = StObject.set(x, "timeSelectionValue", js.undefined)
    }
  }
}
