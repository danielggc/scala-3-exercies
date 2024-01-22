package typings.ui5Webcomponents

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import typings.ui5Webcomponents.anon.AriaLabel
import typings.ui5Webcomponents.anon.Min
import typings.ui5Webcomponents.distFeaturesInputElementsFormSupportMod.IFormElement
import typings.ui5Webcomponents.distTypesInputTypeMod.InputType
import typings.ui5WebcomponentsBase.distTypesMod.Timeout
import typings.ui5WebcomponentsBase.distTypesValueStateMod.ValueState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distStepInputMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-step-input</code> consists of an input field and buttons with icons to increase/decrease the value
    * with the predefined step.
    * <br><br>
    * The user can change the value of the component by pressing the increase/decrease buttons,
    * by typing a number directly, by using the keyboard up/down and page up/down,
    * or by using the mouse scroll wheel. Decimal values are supported.
    *
    * <h3>Usage</h3>
    *
    * The default step is 1 but the app developer can set a different one.
    *
    * App developers can set a maximum and minimum value for the <code>StepInput</code>.
    * The increase/decrease button and the up/down keyboard navigation become disabled when
    * the value reaches the max/min or a new value is entered from the input which is greater/less than the max/min.
    * <br><br>
    * <h4>When to use:</h4>
    * <ul>
    * <li>To adjust amounts, quantities, or other values quickly.</li>
    * <li>To adjust values for a specific step.</li>
    * </ul>
    *
    * <h4>When not to use:</h4>
    * <ul>
    * <li>To enter a static number (for example, postal code, phone number, or ID). In this case,
    * use the regular <code>ui5-input</code> instead.</li>
    * <li>To display a value that rarely needs to be adjusted and does not pertain to a particular step.
    * In this case, use the regular <code>ui5-input</code> instead.</li>
    * <li>To enter dates and times. In this case, use date/time related components instead.</li>
    * </ul>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/StepInput.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.StepInput
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-step-input
    * @since 1.0.0-rc.13
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/StepInput", JSImport.Default)
  @js.native
  open class default () extends StepInput
  object default {
    
    @JSImport("@ui5/webcomponents/dist/StepInput", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/StepInput", "default.i18nBundle")
    @js.native
    def i18nBundle: typings.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: typings.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def onDefine(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("onDefine")().asInstanceOf[js.Promise[Unit]]
  }
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-step-input</code> consists of an input field and buttons with icons to increase/decrease the value
    * with the predefined step.
    * <br><br>
    * The user can change the value of the component by pressing the increase/decrease buttons,
    * by typing a number directly, by using the keyboard up/down and page up/down,
    * or by using the mouse scroll wheel. Decimal values are supported.
    *
    * <h3>Usage</h3>
    *
    * The default step is 1 but the app developer can set a different one.
    *
    * App developers can set a maximum and minimum value for the <code>StepInput</code>.
    * The increase/decrease button and the up/down keyboard navigation become disabled when
    * the value reaches the max/min or a new value is entered from the input which is greater/less than the max/min.
    * <br><br>
    * <h4>When to use:</h4>
    * <ul>
    * <li>To adjust amounts, quantities, or other values quickly.</li>
    * <li>To adjust values for a specific step.</li>
    * </ul>
    *
    * <h4>When not to use:</h4>
    * <ul>
    * <li>To enter a static number (for example, postal code, phone number, or ID). In this case,
    * use the regular <code>ui5-input</code> instead.</li>
    * <li>To display a value that rarely needs to be adjusted and does not pertain to a particular step.
    * In this case, use the regular <code>ui5-input</code> instead.</li>
    * <li>To enter dates and times. In this case, use date/time related components instead.</li>
    * </ul>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/StepInput.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.StepInput
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-step-input
    * @since 1.0.0-rc.13
    * @public
    */
  @js.native
  trait StepInput extends IFormElement {
    
    var _btnDown: Boolean = js.native
    
    /**
      * Calculates the time which should be waited until _spinValue function is called.
      */
    def _calcWaitTimeout(): Double = js.native
    
    def _decIconClickable: Boolean = js.native
    
    var _decIconDisabled: Boolean = js.native
    
    def _decSpin(): Unit = js.native
    
    def _decValue(e: CustomEvent): Unit = js.native
    
    def _fireChangeEvent(): Unit = js.native
    
    def _incIconClickable: Boolean = js.native
    
    var _incIconDisabled: Boolean = js.native
    
    def _incSpin(): Unit = js.native
    
    def _incValue(e: CustomEvent): Unit = js.native
    
    var _initialValueState: js.UndefOr[ValueState] = js.native
    
    var _inputFocused: Boolean = js.native
    
    def _isFocused: Boolean = js.native
    
    /**
      * Value modifier - modifies the value of the component, validates the new value and enables/disables increment and
      * decrement buttons according to the value and min/max values (if set). Fires <code>change</code> event when requested
      *
      * @param {Float} modifier modifies the value of the component with the given modifier (positive or negative)
      * @param {boolean} fireChangeEvent if <code>true</code>, fires <code>change</code> event when the value is changed
      */
    def _modifyValue(modifier: Double): Unit = js.native
    def _modifyValue(modifier: Double, fireChangeEvent: Boolean): Unit = js.native
    
    def _onButtonFocusOut(): Unit = js.native
    
    def _onInputChange(): Unit = js.native
    
    def _onInputFocusIn(): Unit = js.native
    
    def _onInputFocusOut(): Unit = js.native
    
    def _onfocusin(): Unit = js.native
    
    def _onfocusout(): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _preciseValue(value: Double): Double = js.native
    
    var _previousValue: Double = js.native
    
    /**
      * Resets spin process
      */
    def _resetSpin(): Unit = js.native
    
    /**
      * Resets spin process when mouse outs + or - buttons
      */
    def _resetSpinOut(): Unit = js.native
    
    def _setButtonState(): Unit = js.native
    
    var _speed: Double = js.native
    
    var _spinStarted: Boolean = js.native
    
    var _spinTimeoutId: Timeout = js.native
    
    /**
      * Called when the increment or decrement button is pressed and held to set new value.
      * @param {boolean} increment - is this the increment button or not so the values should be spin accordingly up or down
      * @param {boolean} resetVariables - whether to reset the spin-related variables or not
      */
    def _spinValue(increment: Boolean): Unit = js.native
    def _spinValue(increment: Boolean, resetVariables: Boolean): Unit = js.native
    
    def _validate(): Unit = js.native
    
    def _valuePrecisioned: String = js.native
    
    var _waitTimeout: Double = js.native
    
    def accInfo: AriaLabel = js.native
    
    /**
      * Defines the accessible ARIA name of the component.
      *
      * @name sap.ui.webc.main.StepInput.prototype.accessibleName
      * @type {string}
      * @public
      * @since 1.0.0-rc.15
      */
    var accessibleName: String = js.native
    
    /**
      * Receives id(or many ids) of the elements that label the component.
      *
      * @name sap.ui.webc.main.StepInput.prototype.accessibleNameRef
      * @type {string}
      * @defaultvalue ""
      * @public
      * @since 1.0.0-rc.15
      */
    var accessibleNameRef: String = js.native
    
    def decIconName: String = js.native
    
    def decIconTitle: String = js.native
    
    /**
      * Determines whether the component is displayed as disabled.
      *
      * @name sap.ui.webc.main.StepInput.prototype.disabled
      * @type {boolean}
      * @defaultvalue false
      * @public
      */
    @JSName("disabled")
    var disabled_StepInput: Boolean = js.native
    
    var focused: Boolean = js.native
    
    /**
      * The slot is used to render native <code>input</code> HTML element within Light DOM to enable form submit,
      * when <code>name</code> property is set.
      *
      * @type {HTMLElement[]}
      * @slot
      * @private
      */
    var formSupport: js.Array[HTMLElement] = js.native
    
    def incIconName: String = js.native
    
    def incIconTitle: String = js.native
    
    def input: typings.ui5Webcomponents.distInputMod.default = js.native
    
    def inputAttributes: Min = js.native
    
    def inputOuter: Element = js.native
    
    /**
      * Defines a maximum value of the component.
      *
      * @name sap.ui.webc.main.StepInput.prototype.max
      * @type {sap.ui.webc.base.types.Float}
      * @public
      */
    var max: js.UndefOr[Double] = js.native
    
    /**
      * Defines a minimum value of the component.
      *
      * @name sap.ui.webc.main.StepInput.prototype.min
      * @type {sap.ui.webc.base.types.Float}
      * @public
      */
    var min: js.UndefOr[Double] = js.native
    
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
      * @name sap.ui.webc.main.StepInput.prototype.name
      * @type {string}
      * @defaultvalue ""
      * @public
      */
    @JSName("name")
    var name_StepInput: String = js.native
    
    /**
      * Defines a short hint, intended to aid the user with data entry when the
      * component has no value.
      *
      * <br><br>
      * <b>Note:</b> When no placeholder is set, the format pattern is displayed as a placeholder.
      * Passing an empty string as the value of this property will make the component appear empty - without placeholder or format pattern.
      *
      * @name sap.ui.webc.main.StepInput.prototype.placeholder
      * @type {string}
      * @defaultvalue undefined
      * @public
      */
    var placeholder: js.UndefOr[String] = js.native
    
    /**
      * Determines whether the component is displayed as read-only.
      *
      * @name sap.ui.webc.main.StepInput.prototype.readonly
      * @type {boolean}
      * @defaultvalue false
      * @public
      */
    var readonly: Boolean = js.native
    
    /**
      * Defines whether the component is required.
      *
      * @name sap.ui.webc.main.StepInput.prototype.required
      * @type {boolean}
      * @defaultvalue false
      * @public
      */
    @JSName("required")
    var required_StepInput: Boolean = js.native
    
    /**
      * Defines a step of increasing/decreasing the value of the component.
      *
      * @name sap.ui.webc.main.StepInput.prototype.step
      * @type {sap.ui.webc.base.types.Float}
      * @defaultvalue 1
      * @public
      */
    var step: Double = js.native
    
    def `type`: InputType = js.native
    
    /**
      * Determines the number of digits after the decimal point of the component.
      *
      * @name sap.ui.webc.main.StepInput.prototype.valuePrecision
      * @type {sap.ui.webc.base.types.Integer}
      * @defaultvalue 0
      * @public
      */
    var valuePrecision: Double = js.native
    
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
      * @name sap.ui.webc.main.StepInput.prototype.valueState
      * @type {sap.ui.webc.base.types.ValueState}
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
      * @slot
      * @name sap.ui.webc.main.StepInput.prototype.valueStateMessage
      * @public
      */
    var valueStateMessage: js.Array[HTMLElement] = js.native
    
    /**
      * Defines a value of the component.
      *
      * @name sap.ui.webc.main.StepInput.prototype.value
      * @type {sap.ui.webc.base.types.Float}
      * @defaultvalue 0
      * @public
      */
    @JSName("value")
    var value_StepInput: Double = js.native
  }
}
