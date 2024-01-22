package typings.ui5Webcomponents

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.TouchEvent
import typings.ui5Webcomponents.anon.EndHandle
import typings.ui5Webcomponents.ui5WebcomponentsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRangeSliderMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    * Represents a numerical interval and two handles (grips) to select a sub-range within it.
    * The purpose of the component to enable visual selection of sub-ranges within a given interval.
    *
    * <h3>Structure</h3>
    * The most important properties of the Range Slider are:
    * <ul>
    * <li>min - The minimum value of the slider range.</li>
    * <li>max - The maximum value of the slider range.</li>
    * <li>value - The current value of the slider.</li>
    * <li>step - Determines the increments in which the slider will move.</li>
    * <li>showTooltip - Determines if a tooltip should be displayed above the handle.</li>
    * <li>showTickmarks - Displays a visual divider between the step values.</li>
    * <li>labelInterval - Labels some or all of the tickmarks with their values.</li>
    * </ul>
    * <h4>Notes:</h4>
    * <ul>
    * <li>The right and left handle can be moved individually and their positions could therefore switch.</li>
    * <li>The entire range can be moved along the interval.</li>
    * </ul>
    * <h3>Usage</h3>
    * The most common use case is to select and move sub-ranges on a continuous numerical scale.
    *
    * <h3>Responsive Behavior</h3>
    * You can move the currently selected range by clicking on it and dragging it along the interval.
    *
    * <h3>CSS Shadow Parts</h3>
    *
    * <ui5-link target="_blank" href="https://developer.mozilla.org/en-US/docs/Web/CSS/::part">CSS Shadow Parts</ui5-link> allow developers to style elements inside the Shadow DOM.
    * <br>
    * The <code>ui5-range-slider</code> exposes the following CSS Shadow Parts:
    * <ul>
    * <li>progress-container - Used to style the progress container(the horizontal bar which visually represents the range between the minimum and maximum value) of the <code>ui5-range-slider</code>.</li>
    * <li>progress-bar - Used to style the progress bar, which shows the progress of the <code>ui5-range-slider</code>.</li>
    * <li>handle - Used to style the handles of the <code>ui5-range-slider</code>.</li>
    * </ul>
    *
    * <h3>Keyboard Handling</h3>
    *
    * <ul>
    * <li><code>Left or Down Arrow</code> - Moves a component's handle or the entire selection one step to the left;</li>
    * <li><code>Right or Up Arrow</code> - Moves a component's handle or the entire selection one step to the right;</li>
    * <li><code>Left or Down Arrow + Ctrl/Cmd</code> - Moves a component's handle to the left or the entire range with step equal to 1/10th of the entire range;</li>
    * <li><code>Right or Up Arrow + Ctrl/Cmd</code> - Moves a component's handle to the right or the entire range with step equal to 1/10th of the entire range;</li>
    * <li><code>Plus</code> - Same as <code>Right or Up Arrow</code>;</li>
    * <li><code>Minus</code> - Same as <code>Left or Down Arrow</code>;</li>
    * <li><code>Home</code> - Moves the entire selection or the selected handle to the beginning of the component's range;</li>
    * <li><code>End</code> - Moves the entire selection or the selected handle to the end of the component's range;</li>
    * <li><code>Page Up</code> - Same as <code>Right or Up Arrow + Ctrl/Cmd</code>;</li>
    * <li><code>Page Down</code> - Same as <code>Left or Down Arrow + Ctrl/Cmd</code>;</li>
    * <li><code>Escape</code> - Resets the <code>startValue</code> and <code>endValue</code> properties to the values prior the component focusing;</li>
    * </ul>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/RangeSlider";</code>
    *
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.RangeSlider
    * @extends sap.ui.webc.main.SliderBase
    * @tagname ui5-range-slider
    * @since 1.0.0-rc.11
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/RangeSlider", JSImport.Default)
  @js.native
  open class default () extends RangeSlider
  object default {
    
    @JSImport("@ui5/webcomponents/dist/RangeSlider", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/RangeSlider", "default.i18nBundle")
    @js.native
    def i18nBundle: typings.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: typings.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def onDefine(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("onDefine")().asInstanceOf[js.Promise[Unit]]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ui5Webcomponents.ui5WebcomponentsStrings.startValue
    - typings.ui5Webcomponents.ui5WebcomponentsStrings.endValue
  */
  trait AffectedValue extends StObject
  object AffectedValue {
    
    inline def endValue: typings.ui5Webcomponents.ui5WebcomponentsStrings.endValue = "endValue".asInstanceOf[typings.ui5Webcomponents.ui5WebcomponentsStrings.endValue]
    
    inline def startValue: typings.ui5Webcomponents.ui5WebcomponentsStrings.startValue = "startValue".asInstanceOf[typings.ui5Webcomponents.ui5WebcomponentsStrings.startValue]
  }
  
  trait AriaHandlesText extends StObject {
    
    var endHandleText: js.UndefOr[String] = js.undefined
    
    var startHandleText: js.UndefOr[String] = js.undefined
  }
  object AriaHandlesText {
    
    inline def apply(): AriaHandlesText = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AriaHandlesText]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AriaHandlesText] (val x: Self) extends AnyVal {
      
      inline def setEndHandleText(value: String): Self = StObject.set(x, "endHandleText", value.asInstanceOf[js.Any])
      
      inline def setEndHandleTextUndefined: Self = StObject.set(x, "endHandleText", js.undefined)
      
      inline def setStartHandleText(value: String): Self = StObject.set(x, "startHandleText", value.asInstanceOf[js.Any])
      
      inline def setStartHandleTextUndefined: Self = StObject.set(x, "startHandleText", js.undefined)
    }
  }
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    * Represents a numerical interval and two handles (grips) to select a sub-range within it.
    * The purpose of the component to enable visual selection of sub-ranges within a given interval.
    *
    * <h3>Structure</h3>
    * The most important properties of the Range Slider are:
    * <ul>
    * <li>min - The minimum value of the slider range.</li>
    * <li>max - The maximum value of the slider range.</li>
    * <li>value - The current value of the slider.</li>
    * <li>step - Determines the increments in which the slider will move.</li>
    * <li>showTooltip - Determines if a tooltip should be displayed above the handle.</li>
    * <li>showTickmarks - Displays a visual divider between the step values.</li>
    * <li>labelInterval - Labels some or all of the tickmarks with their values.</li>
    * </ul>
    * <h4>Notes:</h4>
    * <ul>
    * <li>The right and left handle can be moved individually and their positions could therefore switch.</li>
    * <li>The entire range can be moved along the interval.</li>
    * </ul>
    * <h3>Usage</h3>
    * The most common use case is to select and move sub-ranges on a continuous numerical scale.
    *
    * <h3>Responsive Behavior</h3>
    * You can move the currently selected range by clicking on it and dragging it along the interval.
    *
    * <h3>CSS Shadow Parts</h3>
    *
    * <ui5-link target="_blank" href="https://developer.mozilla.org/en-US/docs/Web/CSS/::part">CSS Shadow Parts</ui5-link> allow developers to style elements inside the Shadow DOM.
    * <br>
    * The <code>ui5-range-slider</code> exposes the following CSS Shadow Parts:
    * <ul>
    * <li>progress-container - Used to style the progress container(the horizontal bar which visually represents the range between the minimum and maximum value) of the <code>ui5-range-slider</code>.</li>
    * <li>progress-bar - Used to style the progress bar, which shows the progress of the <code>ui5-range-slider</code>.</li>
    * <li>handle - Used to style the handles of the <code>ui5-range-slider</code>.</li>
    * </ul>
    *
    * <h3>Keyboard Handling</h3>
    *
    * <ul>
    * <li><code>Left or Down Arrow</code> - Moves a component's handle or the entire selection one step to the left;</li>
    * <li><code>Right or Up Arrow</code> - Moves a component's handle or the entire selection one step to the right;</li>
    * <li><code>Left or Down Arrow + Ctrl/Cmd</code> - Moves a component's handle to the left or the entire range with step equal to 1/10th of the entire range;</li>
    * <li><code>Right or Up Arrow + Ctrl/Cmd</code> - Moves a component's handle to the right or the entire range with step equal to 1/10th of the entire range;</li>
    * <li><code>Plus</code> - Same as <code>Right or Up Arrow</code>;</li>
    * <li><code>Minus</code> - Same as <code>Left or Down Arrow</code>;</li>
    * <li><code>Home</code> - Moves the entire selection or the selected handle to the beginning of the component's range;</li>
    * <li><code>End</code> - Moves the entire selection or the selected handle to the end of the component's range;</li>
    * <li><code>Page Up</code> - Same as <code>Right or Up Arrow + Ctrl/Cmd</code>;</li>
    * <li><code>Page Down</code> - Same as <code>Left or Down Arrow + Ctrl/Cmd</code>;</li>
    * <li><code>Escape</code> - Resets the <code>startValue</code> and <code>endValue</code> properties to the values prior the component focusing;</li>
    * </ul>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/RangeSlider";</code>
    *
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.RangeSlider
    * @extends sap.ui.webc.main.SliderBase
    * @tagname ui5-range-slider
    * @since 1.0.0-rc.11
    * @public
    */
  @js.native
  trait RangeSlider
    extends typings.ui5Webcomponents.distSliderBaseMod.default {
    
    def _areValuesReversed(): Boolean = js.native
    
    def _ariaDisabled: js.UndefOr[`true`] = js.native
    
    def _ariaHandlesText: AriaHandlesText = js.native
    
    def _ariaLabelledByEndHandleRefs: String = js.native
    
    def _ariaLabelledByProgressBarRefs: String = js.native
    
    def _ariaLabelledByStartHandleRefs: String = js.native
    
    def _ariaLabelledByText: String = js.native
    
    /**
      * Calculates startValue/endValue properties when the whole range is moved.
      *
      * Uses the change of the position of the start handle and adds the initially
      * selected range to it, to determine the whole range offset.
      *
      * @param {Integer} currentPageXPos The current horizontal position of the cursor/touch
      * @param {Integer} initialStartHandlePageXPos The initial horizontal position of the start handle
      *
      * @private
      */
    def _calculateRangeOffset(currentPageXPos: Double, initialStartHandlePageXPos: Double): js.Array[Double] = js.native
    
    /**
      * Computes the new value based on the difference of the current cursor location from the
      * start of the interaction.
      *
      * @param {Integer} currentPageXPos The current horizontal position of the cursor/touch
      * @param {Integer} initialStartHandlePageXPos The initial horizontal position of the start handle
      *
      * @private
      */
    def _calculateStartValueByOffset(currentPageXPos: Double, initialStartHandlePageXPos: Double): Double = js.native
    
    def _endHandle: HTMLElement = js.native
    
    var _endValueAtBeginningOfAction: js.UndefOr[Double] = js.native
    
    var _endValueInitial: js.UndefOr[Double] = js.native
    
    var _firstHandlePositionFromStart: js.UndefOr[Double] = js.native
    
    var _handeIsPressed: Boolean = js.native
    
    def _handleActionKeyPress(e: KeyboardEvent): Unit = js.native
    
    /**
      * Calculates the start and end values when the 'Home" or 'End' keys
      * are pressed on the selected range bar.
      *
      * @private
      */
    def _homeEndForSelectedRange(e: KeyboardEvent, affectedValue: String, min: Double, max: Double): Unit = js.native
    
    var _initialPageXPosition: js.UndefOr[Double] = js.native
    
    var _initialStartHandlePageX: js.UndefOr[Double] = js.native
    
    var _isPressInCurrentRange: Boolean = js.native
    
    def _onfocusin(): Unit = js.native
    
    /**
      * Handles focus out event of the focusable components inner elements.
      * Prevent focusout when the focus is getting initially set within the slider before the
      * slider customElement itself is finished focusing.
      *
      * Prevents the focus from leaving the Range Slider when the focus is managed between
      * its inner elements in result of user interactions.
      *
      * Resets the stored Range Slider's initial values saved when it was first focused
      *
      * @private
      */
    def _onfocusout(): Unit = js.native
    
    /**
      * Determines where the press occured and which values of the Range Slider
      * handles should be updated on further interaction.
      *
      * If the press is not in the selected range or over one of the Range Slider handles
      * determines which one from the value/endValue properties has to be updated
      * after the user action (based on closest handle).
      *
      * Set flags if the press is over a handle or in the selected range,
      * in such cases no values are changed on interaction start, but could be
      * updated later when dragging.
      *
      * @private
      */
    def _pressTargetAndAffectedValue(clientX: Double, value: Double): Unit = js.native
    
    def _progressBar: HTMLElement = js.native
    
    var _reversedValues: Boolean = js.native
    
    def _saveInteractionStartData(e: MouseEvent, newValue: Double): Unit = js.native
    /**
      * Determines and saves needed values from the start of the interaction:
      *
      * Is the value calculated is within the currently selected range;
      * Initial pageX position of the start handle affected by the interaction;
      * Initial pageX value of the pressed postion;
      * Affected value property by the action;
      *
      * @private
      */
    def _saveInteractionStartData(e: TouchEvent, newValue: Double): Unit = js.native
    
    var _secondHandlePositionFromStart: js.UndefOr[Double] = js.native
    
    var _selectedRange: js.UndefOr[Double] = js.native
    
    /**
      * Sets the value property (start/end) that will get updated
      * by a user action depending on that user action's characteristics
      * - mouse press position - cursor coordinates relative to the start/end handles
      * - selected inner element via a keyboard navigation
      *
      * @param {string} affectedValue The value that will get modified by the interaction
      * @private
      */
    def _setAffectedValue(): Unit = js.native
    def _setAffectedValue(affectedValue: AffectedValue): Unit = js.native
    
    /**
      * Determines affected value (start/end) depending on the currently
      * active inner element within the Range Slider - used in the keyboard handling.
      *
      * @private
      */
    def _setAffectedValueByFocusedElement(): Unit = js.native
    
    /**
      * Flag if press action is made on the currently selected range of values
      *
      * @param {boolean} isPressInCurrentRange Did the current press action occur in the current range (between the two handles)
      * @private
      */
    def _setIsPressInCurrentRange(isPressInCurrentRange: Boolean): Unit = js.native
    
    /**
      * Flag that we have swapped the values of the 'start' and 'end' properties,
      * to correctly switch the focus within the component from one handle to another
      * when the swapping is finished. As we only swap property values and not
      * the handle elements themselves, we must also swap their focus.
      *
      * @private
      */
    def _setValuesAreReversed(): Unit = js.native
    
    def _startHandle: HTMLElement = js.native
    
    var _startValueAtBeginningOfAction: js.UndefOr[Double] = js.native
    
    var _startValueInitial: js.UndefOr[Double] = js.native
    
    /**
      * Swaps the start and end values of the handles if one came accros the other:
      * - If the start value is greater than the endValue swap them and their handles
      * - If the endValue become less than the start value swap them and their handles
      *
      * Switches the focus to the opposite of the currently focused handle.
      *
      * Note: Only the property values are reversed, the DOM elements of the handles
      * corresponding to them are never switched.
      *
      * @private
      */
    def _swapValues(): Unit = js.native
    
    /**
      * Updates the visual representation of the component by calculating
      * the styles of the handles and the range selection based on the new state.
      *
      * @private
      */
    def _updateHandlesAndRange(newValue: Double): Unit = js.native
    
    def _updateValueOnHandleDrag(event: MouseEvent): Unit = js.native
    /**
      * Updates UI and state when dragging a single Range Slider handle
      *
      * @private
      */
    def _updateValueOnHandleDrag(event: TouchEvent): Unit = js.native
    
    def _updateValueOnRangeDrag(event: MouseEvent): Unit = js.native
    /**
      * Updates UI and state when dragging of the whole selected range
      *
      * @private
      */
    def _updateValueOnRangeDrag(event: TouchEvent): Unit = js.native
    
    var _valueAffected: js.UndefOr[AffectedValue] = js.native
    
    /**
      * Defines end point of a selection - position of a second handle on the slider.
      * <br><br>
      *
      * @type {sap.ui.webc.base.types.Float}
      * @name sap.ui.webc.main.RangeSlider.prototype.endValue
      * @defaultvalue 100
      * @formEvents change input
      * @formProperty
      * @public
      */
    var endValue: Double = js.native
    
    var rangePressed: Boolean = js.native
    
    /**
      * Defines start point of a selection - position of a first handle on the slider.
      * <br><br>
      *
      * @type {sap.ui.webc.base.types.Float}
      * @name sap.ui.webc.main.RangeSlider.prototype.startValue
      * @defaultvalue 0
      * @formEvents change input
      * @formProperty
      * @public
      */
    var startValue: Double = js.native
    
    def styles: EndHandle = js.native
    
    def syncUIAndState(): Unit = js.native
    
    def tickmarksObject: js.Array[Boolean] = js.native
    
    def tooltipEndValue: String = js.native
    
    def tooltipStartValue: String = js.native
    
    /**
      * Update values, stored inner state and the visual UI representation of the component.
      * If no specific type of value property is passed - the range is selected - update both handles,
      * otherwise update the handle corresponding to the affected by the user interacton value prop.
      *
      * @private
      */
    def update(): Unit = js.native
    def update(affectedValue: String): Unit = js.native
    def update(affectedValue: String, startValue: Double): Unit = js.native
    def update(affectedValue: String, startValue: Double, endValue: Double): Unit = js.native
    def update(affectedValue: String, startValue: Unit, endValue: Double): Unit = js.native
    def update(affectedValue: Unit, startValue: Double): Unit = js.native
    def update(affectedValue: Unit, startValue: Double, endValue: Double): Unit = js.native
    def update(affectedValue: Unit, startValue: Unit, endValue: Double): Unit = js.native
  }
}
