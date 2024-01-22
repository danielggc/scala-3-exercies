package typings.ui5Webcomponents

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.WheelEvent
import typings.ui5WebcomponentsBase.distTypesValueStateMod.ValueState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTimePickerBaseMod {
  
  /**
    * @class
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.TimePickerBase
    * @extends sap.ui.webc.base.UI5Element
    * @public
    * @since 1.0.0-rc.6
    */
  @JSImport("@ui5/webcomponents/dist/TimePickerBase", JSImport.Default)
  @js.native
  open class default () extends TimePickerBase
  object default {
    
    @JSImport("@ui5/webcomponents/dist/TimePickerBase", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/TimePickerBase", "default.i18nBundle")
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
    * @alias sap.ui.webc.main.TimePickerBase
    * @extends sap.ui.webc.base.UI5Element
    * @public
    * @since 1.0.0-rc.6
    */
  @js.native
  trait TimePickerBase
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _canOpenPicker(): Boolean = js.native
    
    def _effectiveValue: js.UndefOr[String] = js.native
    
    /**
      * @abstract
      * @protected
      */
    def _formatPattern: js.UndefOr[String] = js.native
    
    def _getInput(): typings.ui5Webcomponents.distInputMod.default = js.native
    
    def _getInputField(): js.Promise[HTMLInputElement | typings.ui5Webcomponents.distInputMod.default | Null] = js.native
    
    def _getPopover(): js.Promise[typings.ui5Webcomponents.distResponsivePopoverMod.default] = js.native
    
    def _handleInputChange(e: CustomEvent): Unit = js.native
    
    def _handleInputClick(): js.Promise[Unit] = js.native
    
    def _handleInputLiveChange(e: CustomEvent): Unit = js.native
    
    /**
      *
      * @param {event} e Wheel Event
      * @private
      *
      * The listener for this event can't be passive as it calls preventDefault()
      */
    def _handleWheel(e: WheelEvent): Unit = js.native
    
    def _isPattern: Boolean = js.native
    
    var _isPickerOpen: Boolean = js.native
    
    def _modifyValueBy(amount: Double, unit: String): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    /**
      * @abstract
      * @protected
      */
    def _placeholder: js.UndefOr[String] = js.native
    
    def _timeSelectionValue: js.UndefOr[String] = js.native
    
    def _updateValueAndFireEvents(value: String, normalizeValue: Boolean, eventsNames: js.Array[String]): Unit = js.native
    def _updateValueAndFireEvents(value: Unit, normalizeValue: Boolean, eventsNames: js.Array[String]): Unit = js.native
    
    def _updateValueState(): Unit = js.native
    
    def cancelButtonLabel: String = js.native
    
    /**
      * Closes the picker
      * @public
      * @method
      * @name sap.ui.webc.main.TimePickerBase#closePicker
      */
    def closePicker(): js.Promise[Unit] = js.native
    
    /**
      * Determines whether the <code>ui5-time-picker</code> is displayed as disabled.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.TimePickerBase.prototype.disabled
      * @defaultvalue false
      * @public
      */
    var disabled: Boolean = js.native
    
    /**
      * Formats a Java Script date object into a string representing a locale date and time
      * according to the <code>formatPattern</code> property of the TimePicker instance
      * @param {object} date A Java Script date object to be formatted as string
      * @public
      * @method
      * @name sap.ui.webc.main.TimePickerBase#formatValue
      * @returns {string}
      */
    def formatValue(date: js.Date): String = js.native
    
    def getFormat(): Any = js.native
    
    /**
      * Checks if the picker is open
      * @public
      * @method
      * @name sap.ui.webc.main.TimePickerBase#isOpen
      * @returns {boolean}
      */
    def isOpen(): Boolean = js.native
    
    /**
      * Checks if a value is valid against the current <code>formatPattern</code> value.
      *
      * <br><br>
      * <b>Note:</b> an empty string is considered as valid value.
      * @param {string} value The value to be tested against the current date format
      * @public
      * @method
      * @name sap.ui.webc.main.TimePickerBase#isValid
      * @returns {boolean}
      */
    def isValid(): Boolean = js.native
    def isValid(value: String): Boolean = js.native
    
    def normalizeValue(value: String): String = js.native
    
    def onResponsivePopoverAfterClose(): Unit = js.native
    
    def onTimeSelectionChange(e: CustomEvent): Unit = js.native
    
    /**
      * @protected
      */
    def openIconName: String = js.native
    
    /**
      * Opens the picker.
      * @async
      * @public
      * @method
      * @name sap.ui.webc.main.TimePickerBase#openPicker
      * @returns {Promise} Resolves when the picker is open
      */
    def openPicker(): js.Promise[Unit] = js.native
    
    /**
      * Determines whether the <code>ui5-time-picker</code> is displayed as readonly.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.TimePickerBase.prototype.readonly
      * @defaultvalue false
      * @public
      */
    var readonly: Boolean = js.native
    
    def submitButtonLabel: String = js.native
    
    def submitPickers(): Unit = js.native
    
    var tempValue: js.UndefOr[String] = js.native
    
    def togglePicker(): Unit = js.native
    
    /**
      * Defines a formatted time value.
      *
      * @type {string}
      * @name sap.ui.webc.main.TimePickerBase.prototype.value
      * @defaultvalue undefined
      * @formEvents change input
      * @formProperty
      * @public
      */
    var value: js.UndefOr[String] = js.native
    
    /**
      * Defines the value state of the <code>ui5-time-picker</code>.
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
      * @name sap.ui.webc.main.TimePickerBase.prototype.valueState
      * @defaultvalue "None"
      * @public
      */
    var valueState: ValueState = js.native
    
    /**
      * Defines the value state message that will be displayed as pop up under the <code>ui5-time-picker</code>.
      * <br><br>
      *
      * <b>Note:</b> If not specified, a default text (in the respective language) will be displayed.
      * <br>
      * <b>Note:</b> The <code>valueStateMessage</code> would be displayed,
      * when the <code>ui5-time-picker</code> is in <code>Information</code>, <code>Warning</code> or <code>Error</code> value state.
      * @type {HTMLElement}
      * @name sap.ui.webc.main.TimePickerBase.prototype.valueStateMessage
      * @since 1.0.0-rc.8
      * @slot
      * @public
      */
    var valueStateMessage: js.Array[HTMLElement] = js.native
  }
}
