package typings.ui5Webcomponents

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.DOMRect
import org.scalajs.dom.Event
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.TouchEvent
import typings.ui5Webcomponents.ui5WebcomponentsStrings.`-1`
import typings.ui5Webcomponents.ui5WebcomponentsStrings.`0`
import typings.ui5Webcomponents.ui5WebcomponentsStrings.left_
import typings.ui5Webcomponents.ui5WebcomponentsStrings.right_
import typings.ui5WebcomponentsBase.distTypesMod.PassiveEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSliderBaseMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.SliderBase
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-slider
    * @public
    */
  /**
    * Fired when the value changes and the user has finished interacting with the slider.
    *
    * @event sap.ui.webc.main.SliderBase#change
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/SliderBase", JSImport.Default)
  @js.native
  open class default () extends SliderBase
  object default {
    
    @JSImport("@ui5/webcomponents/dist/SliderBase", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Locks the given value between min and max boundaries based on slider properties
      *
      * @protected
      */
    /* static member */
    inline def clipValue(value: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clipValue")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Computes the new value (in %) from the pageX position of the cursor.
      * Returns the value rounded to a precision of at most 2 digits after decimal point.
      *
      * @protected
      */
    /* static member */
    inline def computedValueFromPageX(
      pageX: Double,
      min: Double,
      max: Double,
      boundingClientRect: DOMRect,
      directionStart: DirectionStart
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computedValueFromPageX")(pageX.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], boundingClientRect.asInstanceOf[js.Any], directionStart.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Calculates the precision (decimal places) of a number, returns 0 if integer
      * Handles scientific notation cases.
      * @private
      */
    /* static member */
    inline def getDecimalPrecisionOfNumber(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("_getDecimalPrecisionOfNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getPageXValueFromEvent(e: MouseEvent): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getPageXValueFromEvent")(e.asInstanceOf[js.Any]).asInstanceOf[Double]
    /**
      * Gets pageX value from event on user interaction with the Slider
      *
      * @protected
      */
    /* static member */
    inline def getPageXValueFromEvent(e: TouchEvent): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getPageXValueFromEvent")(e.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * "Stepify" the raw value - calculate the new value depending on the specified step property
      *
      * @protected
      */
    /* static member */
    inline def getSteppedValue(value: Double, stepSize: Double, min: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSteppedValue")(value.asInstanceOf[js.Any], stepSize.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def getValueFromInteraction(
      e: MouseEvent,
      stepSize: Double,
      min: Double,
      max: Double,
      boundingClientRect: DOMRect,
      directionStart: DirectionStart
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getValueFromInteraction")(e.asInstanceOf[js.Any], stepSize.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], boundingClientRect.asInstanceOf[js.Any], directionStart.asInstanceOf[js.Any])).asInstanceOf[Double]
    /**
      * Sets the slider value from an event
      *
      * @protected
      */
    /* static member */
    inline def getValueFromInteraction(
      e: TouchEvent,
      stepSize: Double,
      min: Double,
      max: Double,
      boundingClientRect: DOMRect,
      directionStart: DirectionStart
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getValueFromInteraction")(e.asInstanceOf[js.Any], stepSize.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], boundingClientRect.asInstanceOf[js.Any], directionStart.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Goes through the key shortcuts available for the component and returns 'true' if the event is triggered by one.
      *
      * @private
      */
    /* static member */
    inline def isActionKey(e: KeyboardEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isActionKey")(e.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def isBigStepAction(e: KeyboardEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isBigStepAction")(e.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def isDecreaseValueAction(e: KeyboardEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isDecreaseValueAction")(e.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def isIncreaseValueAction(e: KeyboardEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isIncreaseValueAction")(e.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ui5Webcomponents.ui5WebcomponentsStrings.left_
    - typings.ui5Webcomponents.ui5WebcomponentsStrings.right_
  */
  trait DirectionStart extends StObject
  object DirectionStart {
    
    inline def left: left_ = "left".asInstanceOf[left_]
    
    inline def right: right_ = "right".asInstanceOf[right_]
  }
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.SliderBase
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-slider
    * @public
    */
  /**
    * Fired when the value changes and the user has finished interacting with the slider.
    *
    * @event sap.ui.webc.main.SliderBase#change
    * @public
    */
  @js.native
  trait SliderBase
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _ariaLabelledByHandleRefs: String = js.native
    
    /**
      * Calculates the labels amount, width and text and creates them
      *
      * @private
      */
    def _createLabels(): Unit = js.native
    
    def _effectiveMax: Double = js.native
    
    def _effectiveMin: Double = js.native
    
    /**
      * Normalizes a new <code>step</code> property value.
      * If tickmarks are enabled recreates them according to it.
      *
      * @private
      */
    def _effectiveStep: Double = js.native
    
    def _handleActionKeyPress(e: Event): Unit = js.native
    
    def _handleActionKeyPressBase(e: KeyboardEvent, affectedPropName: String): Double = js.native
    
    def _handleFocusOnMouseDown(e: MouseEvent): Unit = js.native
    /**
      * Forward the focus to an inner inner part within the component on press
      *
      * @private
      */
    def _handleFocusOnMouseDown(e: TouchEvent): Unit = js.native
    
    def _handleMove(e: MouseEvent): Unit = js.native
    def _handleMove(e: TouchEvent): Unit = js.native
    
    /**
      * Handle the responsiveness of the Slider's UI elements when resizing
      *
      * @private
      */
    def _handleResize(): Unit = js.native
    
    def _handleUp(): Unit = js.native
    
    var _hiddenTickmarks: Boolean = js.native
    
    /**
      * Return if an inside element within the component is currently being focused
      *
      * @private
      */
    def _isFocusing(): Boolean = js.native
    
    var _isInnerElementFocusing: Boolean = js.native
    
    var _isUserInteraction: Boolean = js.native
    
    var _labelValues: js.UndefOr[js.Array[String]] = js.native
    
    var _labelWidth: Double = js.native
    
    def _labels: js.Array[String] = js.native
    
    var _labelsOverlapping: Boolean = js.native
    
    def _moveHandler(e: MouseEvent): Unit = js.native
    def _moveHandler(e: TouchEvent): Unit = js.native
    
    var _oldNumberOfLabels: js.UndefOr[Double] = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeyup(): Unit = js.native
    
    def _onmousedown(e: MouseEvent): Unit = js.native
    def _onmousedown(e: TouchEvent): Unit = js.native
    
    /**
      * Hides the tooltip(s) if the <code>showTooltip</code> property is set to true
      *
      * @private
      */
    def _onmouseout(): Unit = js.native
    
    /** Shows the tooltip(s) if the <code>showTooltip</code> property is set to true
      *
      * @private
      */
    def _onmouseover(): Unit = js.native
    
    var _ontouchstart: PassiveEventListenerObject = js.native
    
    /**
      * Flags if an inner element is currently being focused
      *
      * @private
      */
    def _preserveFocus(isFocusing: Boolean): Unit = js.native
    
    /**
      * Prevent focus out when inner element within the component is currently being in process of focusing in.
      * In theory this can be achieved either if the shadow root is focusable and 'delegatesFocus' attribute of
      * the .attachShadow() customElement method is set to true, or if we forward it manually.
      * As we use lit-element as base of our core UI5 element class that 'delegatesFocus' property is not set to 'true' and
      * we have to manage the focus here. If at some point in the future this changes, the focus delegating logic could be
      * removed as it will become redundant.
      *
      * When we manually set the focus on mouseDown to the first focusable element inside the shadowDom,
      * that inner focus (shadowRoot.activeElement) is set a moment before the global document.activeElement
      * is set to the customElement (ui5-slider) causing a 'race condition'.
      *
      * In order for a element within the shadowRoot to be focused, the global document.activeElement MUST be the parent
      * customElement of the shadow root, in our case the ui5-slider component. Because of that after our focusin of the handle,
      * a focusout event fired by the browser immidiatly after, resetting the focus. Focus out must be manually prevented
      * in both initial focusing and switching the focus between inner elements of the component cases.
      * Note: If we set the focus to the handle with a timeout or a bit later in time, on a mouseup or click event it will
      * work fine and we will avoid the described race condition as our host customElement will be already finished focusing.
      * However, that does not work for us as we need the focus to be set to the handle exactly on mousedown,
      * because of the nature of the component and its available drag interactions.
      *
      * @private
      */
    def _preventFocusOut(): Unit = js.native
    
    def _resizeHandler(): Unit = js.native
    
    /**
      * Calculates space between tickmarks
      *
      * @private
      */
    def _spaceBetweenTickmarks(): Double = js.native
    
    var _stateStorage: StateStorage = js.native
    
    def _tabIndex: `0` | `-1` = js.native
    
    def _tickmarksCount: Double = js.native
    
    /**
      * @private
      */
    var _tooltipVisibility: String = js.native
    
    def _upHandler(): Unit = js.native
    
    /**
      * Notify in case of a invalid step value type
      *
      * @private
      */
    def _validateStep(step: Double): Unit = js.native
    
    /**
      * Defines the accessible ARIA name of the component.
      *
      * @type {string}
      * @name sap.ui.webc.main.SliderBase.prototype.accessibleName
      * @defaultvalue: ""
      * @public
      * @since 1.4.0
      */
    var accessibleName: String = js.native
    
    /**
      * Returns the start side of a direction - left for LTR, right for RTL
      */
    def directionStart: left_ | right_ = js.native
    
    /**
      * Defines whether the slider is in disabled state.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.SliderBase.prototype.disabled
      * @defaultvalue false
      * @public
      */
    var disabled: Boolean = js.native
    
    /**
      * Manages the focus between the component's inner elements
      * @protected
      */
    def focusInnerElement(): Unit = js.native
    
    /**
      * Returns the last stored value of a property
      *
      * @protected
      */
    def getStoredPropertyState(prop: String): js.UndefOr[Double] = js.native
    
    def handleDownBase(e: MouseEvent): Double = js.native
    /**
      * Called when the user starts interacting with the slider.
      * After a down event on the slider root, listen for move events on window, so the slider value
      * is updated even if the user drags the pointer outside the slider root.
      *
      * @protected
      */
    def handleDownBase(e: TouchEvent): Double = js.native
    
    /**
      * Called when the user finish interacting with the slider
      * Fires an <code>change</code> event indicating a final value change, after user interaction is finished.
      *
      * @protected
      */
    def handleUpBase(): Unit = js.native
    
    /**
      * In order to always keep the visual UI representation and the internal
      * state in sync, the component has a 'state storage' that is updated when the
      * current state is changed due to a user action.
      *
      * Check if the previously saved state is outdated. That would mean
      * a property has been changed programmatically because the previous state
      * is always updated in the interaction handlers.
      *
      * Will return true if any of the properties is not equal to its previously
      * stored value.
      *
      * @protected
      */
    def isCurrentStateOutdated(): Boolean = js.native
    
    /**
      * Check if one or more properties have been updated compared to their last
      * saved values in the state storage.
      *
      * @protected
      */
    def isPropertyUpdated(props: String*): Boolean = js.native
    
    /**
      * Displays a label with a value on every N-th step.
      * <br><br>
      * <b>Note:</b> The step and tickmarks properties must be enabled.
      * Example - if the step value is set to 2 and the label interval is also specified to 2 - then every second
      * tickmark will be labelled, which means every 4th value number.
      *
      * @type {sap.ui.webc.base.types.Integer}
      * @name sap.ui.webc.main.SliderBase.prototype.labelInterval
      * @defaultvalue 0
      * @public
      */
    var labelInterval: Double = js.native
    
    /**
      * Defines the maximum value of the slider.
      *
      * @type {sap.ui.webc.base.types.Float}
      * @name sap.ui.webc.main.SliderBase.prototype.max
      * @defaultvalue 100
      * @public
      */
    var max: Double = js.native
    
    /**
      * Defines the minimum value of the slider.
      *
      * @type {sap.ui.webc.base.types.Float}
      * @name sap.ui.webc.main.SliderBase.prototype.min
      * @defaultvalue 0
      * @public
      */
    var min: Double = js.native
    
    var notResized: Boolean = js.native
    
    /**
      * Enables tickmarks visualization for each step.
      * <br><br>
      * <b>Note:</b> The step must be a positive number.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.SliderBase.prototype.showTickmarks
      * @defaultvalue false
      * @public
      */
    var showTickmarks: Boolean = js.native
    
    /**
      * Enables handle tooltip displaying the current value.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.SliderBase.prototype.showTooltip
      * @defaultvalue false
      * @public
      */
    var showTooltip: Boolean = js.native
    
    /**
      * Defines the size of the slider's selection intervals (e.g. min = 0, max = 10, step = 5 would result in possible selection of the values 0, 5, 10).
      * <br><br>
      * <b>Note:</b> If set to 0 the slider handle movement is disabled. When negative number or value other than a number, the component fallbacks to its default value.
      *
      * @type {sap.ui.webc.base.types.Integer}
      * @name sap.ui.webc.main.SliderBase.prototype.step
      * @defaultvalue 1
      * @public
      */
    var step: Double = js.native
    
    /**
      * Updates the previously saved in the _stateStorage values of one or more properties.
      *
      * @protected
      */
    def storePropertyState(props: String*): Unit = js.native
    
    /**
      * Updates state storage for the value-related property
      * Fires an <code>input</code> event indicating a value change via interaction that is not yet finished.
      *
      * @protected
      */
    def updateStateStorageAndFireInputEvent(valueType: String): Unit = js.native
  }
  
  type StateStorage = StringDictionary[js.UndefOr[Double]]
}
