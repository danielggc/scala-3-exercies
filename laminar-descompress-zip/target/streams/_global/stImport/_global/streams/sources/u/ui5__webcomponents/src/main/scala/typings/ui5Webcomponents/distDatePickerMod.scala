package typings.ui5Webcomponents

import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import typings.ui5Webcomponents.anon.AriaAutoComplete
import typings.ui5Webcomponents.anon.MainWidth
import typings.ui5Webcomponents.anon.TypeofFormSupportT
import typings.ui5Webcomponents.distTypesInputTypeMod.InputType
import typings.ui5WebcomponentsBase.distTypesValueStateMod.ValueState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDatePickerMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-date-picker</code> component provides an input field with assigned calendar which opens on user action.
    * The <code>ui5-date-picker</code> allows users to select a localized date using touch,
    * mouse, or keyboard input. It consists of two parts: the date input field and the
    * date picker.
    *
    * <h3>Usage</h3>
    *
    * The user can enter a date by:
    * <ul>
    * <li>Using the calendar that opens in a popup</li>
    * <li>Typing it in directly in the input field</li>
    * </ul>
    * <br><br>
    * When the user makes an entry and presses the enter key, the calendar shows the corresponding date.
    * When the user directly triggers the calendar display, the actual date is displayed.
    *
    * <h3>Formatting</h3>
    *
    * If a date is entered by typing it into
    * the input field, it must fit to the used date format.
    * <br><br>
    * Supported format options are pattern-based on Unicode LDML Date Format notation.
    * For more information, see <ui5-link target="_blank" href="http://unicode.org/reports/tr35/#Date_Field_Symbol_Table" class="api-table-content-cell-link">UTS #35: Unicode Locale Data Markup Language</ui5-link>.
    * <br><br>
    * For example, if the <code>format-pattern</code> is "yyyy-MM-dd",
    * a valid value string is "2015-07-30" and the same is displayed in the input.
    *
    * <h3>Keyboard Handling</h3>
    * The <code>ui5-date-picker</code> provides advanced keyboard handling.
    * If the <code>ui5-date-picker</code> is focused,
    * you can open or close the drop-down by pressing <code>F4</code>, <code>ALT+UP</code> or <code>ALT+DOWN</code> keys.
    * Once the drop-down is opened, you can use the <code>UP</code>, <code>DOWN</code>, <code>LEFT</code>, <code>RIGHT</code> arrow keys
    * to navigate through the dates and select one by pressing the <code>Space</code> or <code>Enter</code> keys. Moreover you can
    * use TAB to reach the buttons for changing month and year.
    * <br>
    *
    * If the <code>ui5-date-picker</code> input field is focused and its corresponding picker dialog is not opened,
    * then users can increment or decrement the date referenced by <code>dateValue</code> property
    * by using the following shortcuts:
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
    * <pre><code>&lt;script data-id="sap-ui-config" type="application/json"&gt;
    * {
    *	"calendarType": "Japanese"
    * }
    * &lt;/script&gt;</code></pre>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/DatePicker";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.DatePicker
    * @extends sap.ui.webc.main.DateComponentBase
    * @tagname ui5-date-picker
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/DatePicker", JSImport.Default)
  @js.native
  open class default () extends DatePicker
  object default {
    
    @JSImport("@ui5/webcomponents/dist/DatePicker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/DatePicker", "default.i18nBundle")
    @js.native
    def i18nBundle: typings.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: typings.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-date-picker</code> component provides an input field with assigned calendar which opens on user action.
    * The <code>ui5-date-picker</code> allows users to select a localized date using touch,
    * mouse, or keyboard input. It consists of two parts: the date input field and the
    * date picker.
    *
    * <h3>Usage</h3>
    *
    * The user can enter a date by:
    * <ul>
    * <li>Using the calendar that opens in a popup</li>
    * <li>Typing it in directly in the input field</li>
    * </ul>
    * <br><br>
    * When the user makes an entry and presses the enter key, the calendar shows the corresponding date.
    * When the user directly triggers the calendar display, the actual date is displayed.
    *
    * <h3>Formatting</h3>
    *
    * If a date is entered by typing it into
    * the input field, it must fit to the used date format.
    * <br><br>
    * Supported format options are pattern-based on Unicode LDML Date Format notation.
    * For more information, see <ui5-link target="_blank" href="http://unicode.org/reports/tr35/#Date_Field_Symbol_Table" class="api-table-content-cell-link">UTS #35: Unicode Locale Data Markup Language</ui5-link>.
    * <br><br>
    * For example, if the <code>format-pattern</code> is "yyyy-MM-dd",
    * a valid value string is "2015-07-30" and the same is displayed in the input.
    *
    * <h3>Keyboard Handling</h3>
    * The <code>ui5-date-picker</code> provides advanced keyboard handling.
    * If the <code>ui5-date-picker</code> is focused,
    * you can open or close the drop-down by pressing <code>F4</code>, <code>ALT+UP</code> or <code>ALT+DOWN</code> keys.
    * Once the drop-down is opened, you can use the <code>UP</code>, <code>DOWN</code>, <code>LEFT</code>, <code>RIGHT</code> arrow keys
    * to navigate through the dates and select one by pressing the <code>Space</code> or <code>Enter</code> keys. Moreover you can
    * use TAB to reach the buttons for changing month and year.
    * <br>
    *
    * If the <code>ui5-date-picker</code> input field is focused and its corresponding picker dialog is not opened,
    * then users can increment or decrement the date referenced by <code>dateValue</code> property
    * by using the following shortcuts:
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
    * <pre><code>&lt;script data-id="sap-ui-config" type="application/json"&gt;
    * {
    *	"calendarType": "Japanese"
    * }
    * &lt;/script&gt;</code></pre>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/DatePicker";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.DatePicker
    * @extends sap.ui.webc.main.DateComponentBase
    * @tagname ui5-date-picker
    * @public
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.std.EventTarget because Already inherited
  - scala.Any because Already inherited
  - typings.std.Node because Already inherited
  - scala.AnyRef because Already inherited
  - scala.Any because Already inherited
  - typings.std.Slottable because Already inherited
  - typings.std.NonDocumentTypeChildNode because Already inherited
  - typings.std.InnerHTML because Already inherited
  - typings.std.ChildNode because Already inherited
  - typings.std.Animatable because Already inherited
  - typings.std.ARIAMixin because Already inherited
  - js.Any because Already inherited
  - scala.AnyRef because Already inherited
  - typings.std.HTMLOrSVGElement because Already inherited
  - typings.std.GlobalEventHandlers because Already inherited
  - typings.std.ElementContentEditable because Already inherited
  - typings.std.ElementCSSInlineStyle because Already inherited
  - typings.std.DocumentAndElementEventHandlers because Already inherited
  - typings.std.Element because Already inherited
  - js.Object because Already inherited
  - js.Any because Already inherited
  - typings.std.HTMLElement because Already inherited
  - js.Object because Already inherited
  - typings.ui5WebcomponentsBase.distUi5elementMod.UI5Element because Already inherited
  - typings.ui5WebcomponentsBase.distUi5elementMod.default because Already inherited
  - typings.ui5Webcomponents.distFeaturesInputElementsFormSupportMod.IFormElement because var conflicts: __id, _changedState, _childChangeListeners, _doNotSyncAttributes, _domRefReadyPromise, _eventProvider, _fullyConnected, _getRealDomRef, _inDOM, _onComponentStateFinalized, _slotChangeListeners, _state, _suppressInvalidation, accessKey, ariaAtomic, ariaAutoComplete, ariaBusy, ariaChecked, ariaColCount, ariaColIndex, ariaColIndexText, ariaColSpan, ariaCurrent, ariaDisabled, ariaExpanded, ariaHasPopup, ariaHidden, ariaInvalid, ariaKeyShortcuts, ariaLabel, ariaLevel, ariaLive, ariaModal, ariaMultiLine, ariaMultiSelectable, ariaOrientation, ariaPlaceholder, ariaPosInSet, ariaPressed, ariaReadOnly, ariaRequired, ariaRoleDescription, ariaRowCount, ariaRowIndex, ariaRowIndexText, ariaRowSpan, ariaSelected, ariaSetSize, ariaSort, ariaValueMax, ariaValueMin, ariaValueNow, ariaValueText, autocapitalize, autofocus, className, contentEditable, dir, draggable, enterKeyHint, hidden, id, inert, innerHTML, innerText, inputMode, lang, nodeValue, nonce, onabort, onanimationcancel, onanimationend, onanimationiteration, onanimationstart, onauxclick, onbeforeinput, onblur, oncancel, oncanplay, oncanplaythrough, onchange, onclick, onclose, oncontextmenu, oncopy, oncuechange, oncut, ondblclick, ondrag, ondragend, ondragenter, ondragleave, ondragover, ondragstart, ondrop, ondurationchange, onemptied, onended, onerror, onfocus, onformdata, onfullscreenchange, onfullscreenerror, ongotpointercapture, oninput, oninvalid, onkeydown, onkeypress, onkeyup, onload, onloadeddata, onloadedmetadata, onloadstart, onlostpointercapture, onmousedown, onmouseenter, onmouseleave, onmousemove, onmouseout, onmouseover, onmouseup, onpaste, onpause, onplay, onplaying, onpointercancel, onpointerdown, onpointerenter, onpointerleave, onpointermove, onpointerout, onpointerover, onpointerup, onprogress, onratechange, onreset, onresize, onscroll, onsecuritypolicyviolation, onseeked, onseeking, onselect, onselectionchange, onselectstart, onslotchange, onstalled, onsubmit, onsuspend, ontimeupdate, ontoggle, ontouchcancel, ontouchend, ontouchmove, ontouchstart, ontransitioncancel, ontransitionend, ontransitionrun, ontransitionstart, onvolumechange, onwaiting, onwebkitanimationend, onwebkitanimationiteration, onwebkitanimationstart, onwebkittransitionend, onwheel, outerHTML, outerText, role, scrollLeft, scrollTop, slot, spellcheck, staticAreaItem, tabIndex, textContent, title, translate. Inlined value, name, disabled, required, multiple, checked */ @js.native
  trait DatePicker
    extends typings.ui5Webcomponents.distDateComponentBaseMod.default {
    
    var FormSupport: js.UndefOr[
        Instantiable0[typings.ui5Webcomponents.distFeaturesInputElementsFormSupportMod.default] & TypeofFormSupportT
      ] = js.native
    
    /**
      * Defines whether the value help icon is hidden
      * @private
      */
    def _ariaHidden: Boolean = js.native
    
    var _calendarCurrentPicker: String = js.native
    
    /**
      * Used to provide selectedDates to the calendar based on the component's state
      * Override in derivatives to provide different rules for setting the calendar's selected dates
      * @protected
      * @returns { array } the selected dates
      */
    def _calendarSelectedDates: js.Array[String] = js.native
    
    /**
      * Override in derivatives to change calendar selection mode
      * @returns {string}
      * @protected
      */
    def _calendarSelectionMode: String = js.native
    
    /**
      * Used to provide a timestamp to the Calendar (to focus it to a relevant date when open) based on the component's state
      * Override in derivatives to provide the calendar a timestamp based on their properties
      * By default focus the calendar on the selected date if set, or the current day otherwise
      * @protected
      * @returns { number } the calendar timestamp
      */
    def _calendarTimestamp: Double = js.native
    
    def _canOpenPicker(): Boolean = js.native
    
    /**
      * Checks if the provided value is valid and within valid range.
      * @protected
      * @param { string } value
      * @returns { boolean }
      */
    def _checkValueValidity(value: String): Boolean = js.native
    
    def _click(e: MouseEvent): Unit = js.native
    
    def _displayFormat: String = js.native
    
    def _getInput(): typings.ui5Webcomponents.distInputMod.default = js.native
    
    def _headerTitleText: String = js.native
    
    var _isPickerOpen: Boolean = js.native
    
    /**
      *
      * @param { number } amount
      * @param { string } unit
      * @protected
      */
    def _modifyDateValue(amount: Double, unit: String): Unit = js.native
    
    /**
      * The ui5-input "change" event handler - fire change event when the user focuses out of the input
      * @protected
      */
    def _onInputChange(e: Event): Unit = js.native
    
    /**
      * The ui5-input "input" event handler - fire input even when the user types
      * @protected
      */
    def _onInputInput(e: KeyboardEvent): Unit = js.native
    
    /**
      * The ui5-input "submit" event handler - fire change event when the user presses enter
      * @protected
      */
    def _onInputSubmit(): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    /**
      * @protected
      */
    def _placeholder: String = js.native
    
    def _respPopover(): js.Promise[typings.ui5Webcomponents.distResponsivePopoverMod.default] = js.native
    
    var _respPopoverConfig: js.Object = js.native
    
    /**
      * Defines whether the dialog on mobile should have header
      * @private
      */
    def _shouldHideHeader: Boolean = js.native
    
    def _toggleAndFocusInput(): Unit = js.native
    
    def _updateValueAndFireEvents(value: String, normalizeValue: Boolean, events: js.Array[String]): Unit = js.native
    def _updateValueAndFireEvents(value: String, normalizeValue: Boolean, events: js.Array[String], updateValue: Boolean): Unit = js.native
    
    def _updateValueState(): Unit = js.native
    
    def accInfo: AriaAutoComplete = js.native
    
    /**
      * Defines the aria-label attribute for the component.
      *
      * @type {string}
      * @name sap.ui.webc.main.DatePicker.prototype.accessibleName
      * @defaultvalue ""
      * @public
      * @since 1.0.0-rc.15
      */
    var accessibleName: String = js.native
    
    /**
      * Receives id(or many ids) of the elements that label the component.
      *
      * @type {string}
      * @name sap.ui.webc.main.DatePicker.prototype.accessibleNameRef
      * @defaultvalue ""
      * @public
      * @since 1.0.0-rc.15
      */
    var accessibleNameRef: String = js.native
    
    var checked: js.UndefOr[Boolean] = js.native
    
    /**
      * Closes the picker.
      * @public
      * @method
      * @name sap.ui.webc.main.DatePicker#closePicker
      */
    def closePicker(): Unit = js.native
    
    def dateAriaDescription: String = js.native
    
    /**
      * Currently selected date represented as a Local JavaScript Date instance.
      *
      * @public
      * @readonly
      * @name sap.ui.webc.main.DatePicker.prototype.dateValue
      * @type { Date }
      */
    def dateValue: js.Date | Null = js.native
    
    def dateValueUTC: js.Date | Null = js.native
    
    /**
      * Determines whether the component is displayed as disabled.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.DatePicker.prototype.disabled
      * @defaultvalue false
      * @public
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * The slot is used to render native <code>input</code> HTML element within Light DOM to enable form submit,
      * when <code>name</code> property is set.
      * @type {HTMLElement[]}
      * @slot
      * @private
      */
    var formSupport: js.Array[HTMLElement] = js.native
    
    /**
      * Formats a Java Script date object into a string representing a locale date
      * according to the <code>formatPattern</code> property of the DatePicker instance
      * @public
      * @method
      * @name sap.ui.webc.main.DatePicker#formatValue
      * @param {object} date A Java Script date object to be formatted as string
      * @returns {string} The date as string
      */
    def formatValue(date: js.Date): String = js.native
    
    /**
      * Defines the visibility of the week numbers column.
      * <br><br>
      *
      * <b>Note:</b> For calendars other than Gregorian,
      * the week numbers are not displayed regardless of what is set.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.DatePicker.prototype.hideWeekNumbers
      * @defaultvalue false
      * @public
      * @since 1.0.0-rc.8
      */
    var hideWeekNumbers: Boolean = js.native
    
    /**
      * Checks if a date is between the minimum and maximum date.
      * @public
      * @method
      * @name sap.ui.webc.main.DatePicker#isInValidRange
      * @param { string } [value=""] A value to be checked
      * @returns { boolean }
      */
    def isInValidRange(): Boolean = js.native
    def isInValidRange(value: String): Boolean = js.native
    
    /**
      * Checks if the picker is open.
      * @public
      * @method
      * @name sap.ui.webc.main.DatePicker#isOpen
      * @returns {boolean} true if the picker is open, false otherwise
      */
    def isOpen(): Boolean = js.native
    
    /**
      * Checks if a value is valid against the current date format of the DatePicker.
      * @public
      * @method
      * @name sap.ui.webc.main.DatePicker#isValid
      * @param { string } [value=""] A value to be tested against the current date format
      * @returns { boolean }
      */
    def isValid(): Boolean = js.native
    def isValid(value: String): Boolean = js.native
    
    var liveValue: js.UndefOr[String] = js.native
    
    var multiple: js.UndefOr[Boolean] = js.native
    
    /**
      * Determines the name with which the component will be submitted in an HTML form.
      *
      * <br><br>
      * <b>Important:</b> For the <code>name</code> property to have effect, you must add the following import to your project:
      * <code>import "@ui5/webcomponents/dist/features/InputElementsFormSupport.js";</code>
      *
      * <br><br>
      * <b>Note:</b> When set, a native <code>input</code> HTML element
      * will be created inside the component so that it can be submitted as
      * part of an HTML form. Do not use this property unless you need to submit a form.
      *
      * @type {string}
      * @name sap.ui.webc.main.DatePicker.prototype.name
      * @defaultvalue ""
      * @public
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * The parser understands many formats, but we need one format
      * @protected
      */
    def normalizeValue(value: String): String = js.native
    
    /**
      * The user clicked the "month" button in the header
      */
    def onHeaderShowMonthPress(): Unit = js.native
    
    /**
      * The user clicked the "year" button in the header
      */
    def onHeaderShowYearPress(): Unit = js.native
    
    /**
      * @protected
      */
    def onResponsivePopoverAfterClose(): Unit = js.native
    
    /**
      * The user selected a new date in the calendar
      * @param event
      * @protected
      */
    def onSelectedDatesChange(e: CustomEvent): Unit = js.native
    
    def openIconName: String = js.native
    
    def openIconTitle: String = js.native
    
    /**
      * Opens the picker.
      * @public
      * @async
      * @method
      * @name sap.ui.webc.main.DatePicker#openPicker
      * @returns {Promise} Resolves when the picker is open
      */
    def openPicker(): js.Promise[Unit] = js.native
    
    def phone: Boolean = js.native
    
    /**
      * Defines a short hint, intended to aid the user with data entry when the
      * component has no value.
      *
      * <br><br>
      * <b>Note:</b> When no placeholder is set, the format pattern is displayed as a placeholder.
      * Passing an empty string as the value of this property will make the component appear empty - without placeholder or format pattern.
      *
      * @type {string}
      * @name sap.ui.webc.main.DatePicker.prototype.placeholder
      * @defaultvalue undefined
      * @public
      */
    var placeholder: js.UndefOr[String] = js.native
    
    /**
      * Determines whether the component is displayed as read-only.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.DatePicker.prototype.readonly
      * @defaultvalue false
      * @public
      */
    var readonly: Boolean = js.native
    
    /**
      * Defines whether the component is required.
      *
      * @since 1.0.0-rc.9
      * @type {boolean}
      * @name sap.ui.webc.main.DatePicker.prototype.required
      * @defaultvalue false
      * @public
      */
    var required: js.UndefOr[Boolean] = js.native
    
    var responsivePopover: js.UndefOr[typings.ui5Webcomponents.distResponsivePopoverMod.default] = js.native
    
    def showFooter: Boolean = js.native
    
    def showHeader: Boolean = js.native
    
    def styles: MainWidth = js.native
    
    def togglePicker(): Unit = js.native
    
    def `type`: InputType = js.native
    
    /**
      * Defines a formatted date value.
      *
      * @type {string}
      * @name sap.ui.webc.main.DatePicker.prototype.value
      * @defaultvalue ""
      * @formEvents change input
      * @formProperty
      * @public
      */
    var value: js.UndefOr[Double | String] = js.native
    
    /**
      * Defines the value state of the component.
      * <br><br>
      * Available options are:
      * <ul>
      * <li><code>None</code></li>
      * <li><code>Error</code></li>
      * <li><code>Warning</code></li>
      * <li><code>Success</code></li>
      * <li><code>Information</code></li>
      * </ul>
      *
      * @type {sap.ui.webc.base.types.ValueState}
      * @name sap.ui.webc.main.DatePicker.prototype.valueState
      * @defaultvalue "None"
      * @public
      */
    var valueState: ValueState = js.native
    
    /**
      * Defines the value state message that will be displayed as pop up under the component.
      * <br><br>
      *
      * <b>Note:</b> If not specified, a default text (in the respective language) will be displayed.
      * <br>
      * <b>Note:</b> The <code>valueStateMessage</code> would be displayed,
      * when the component is in <code>Information</code>, <code>Warning</code> or <code>Error</code> value state.
      * @type {HTMLElement}
      * @name sap.ui.webc.main.DatePicker.prototype.valueStateMessage
      * @since 1.0.0-rc.7
      * @slot
      * @public
      */
    var valueStateMessage: js.Array[HTMLElement] = js.native
  }
  
  trait DatePickerChangeEventDetail extends StObject {
    
    var dates: js.Array[Double]
    
    var values: js.Array[String]
  }
  object DatePickerChangeEventDetail {
    
    inline def apply(dates: js.Array[Double], values: js.Array[String]): DatePickerChangeEventDetail = {
      val __obj = js.Dynamic.literal(dates = dates.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatePickerChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DatePickerChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setDates(value: js.Array[Double]): Self = StObject.set(x, "dates", value.asInstanceOf[js.Any])
      
      inline def setDatesVarargs(value: Double*): Self = StObject.set(x, "dates", js.Array(value*))
      
      inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
}
