package typings.ui5Webcomponents

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.WheelEvent
import typings.ui5Webcomponents.anon.Selected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distWheelSliderMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * <h3>Usage</h3>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/WheelSlider.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.WheelSlider
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-wheelslider
    * @public
    * @since 1.0.0-rc.6
    */
  @JSImport("@ui5/webcomponents/dist/WheelSlider", JSImport.Default)
  @js.native
  open class default () extends WheelSlider
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * <h3>Usage</h3>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/WheelSlider.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.WheelSlider
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-wheelslider
    * @public
    * @since 1.0.0-rc.6
    */
  @js.native
  trait WheelSlider
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _buildItemsToShow(): Unit = js.native
    
    var _currentElementIndex: Double = js.native
    
    def _getCurrentRepetition(): Double = js.native
    
    def _handleArrayBorderReached(currentIndex: Double): Double = js.native
    
    def _handleScrollTouchEnd(): Unit = js.native
    
    /**
      *
      * @param {event} e Wheel Event
      * @private
      *
      * The listener for this event can't be passive as it calls preventDefault()
      */
    def _handleWheel(e: WheelEvent): Unit = js.native
    
    def _itemCellHeight: Double = js.native
    
    def _itemDown(): Unit = js.native
    
    def _itemUp(): Unit = js.native
    
    var _items: js.Array[String] = js.native
    
    var _itemsToShow: js.Array[Selected] = js.native
    
    def _onArrowDown(e: KeyboardEvent): Unit = js.native
    
    def _onArrowUp(e: KeyboardEvent): Unit = js.native
    
    def _onclick(e: MouseEvent): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    var _prevWheelTimestamp: js.UndefOr[Double] = js.native
    
    var _scroller: typings.ui5WebcomponentsBase.distDelegateScrollEnablementMod.default = js.native
    
    def _selectElement(element: HTMLElement): Unit = js.native
    
    def _selectElementByIndex(currentIndex: Double): Unit = js.native
    
    def _selectLimitCell(e: KeyboardEvent, isMax: Boolean): Unit = js.native
    
    def _timesMultipliedOnCyclic(): Double = js.native
    
    def _updateScrolling(): Unit = js.native
    
    def collapseSlider(): Unit = js.native
    
    /**
      * Indicates if the wheelslider has a cyclic behaviour.
      * @type {boolean}
      * @name sap.ui.webc.main.WheelSlider.prototype.cyclic
      * @defaultvalue false
      * @public
      */
    var cyclic: Boolean = js.native
    
    /**
      * Defines whether the component is disabled
      * (default is set to <code>false</code>).
      * A disabled component can't be pressed or
      * focused, and it is not in the tab chain.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.WheelSlider.prototype.disabled
      * @defaultvalue false
      * @public
      */
    var disabled: Boolean = js.native
    
    def expandSlider(): Unit = js.native
    
    /**
      * Indicates if the wheelslider is expanded.
      * @type {boolean}
      * @name sap.ui.webc.main.WheelSlider.prototype.expanded
      * @defaultvalue false
      * @public
      */
    var expanded: Boolean = js.native
    
    /**
      * Defines the label of the wheelslider.
      * @type {string}
      * @name sap.ui.webc.main.WheelSlider.prototype.label
      * @defaultvalue ""
      * @public
      */
    var label: String = js.native
    
    /**
      * Defines the currently selected value
      * @type {string}
      * @name sap.ui.webc.main.WheelSlider.prototype.value
      * @defaultvalue ""
      * @public
      */
    var value: String = js.native
  }
  
  trait WheelSliderSelectEventDetail extends StObject {
    
    var value: String
  }
  object WheelSliderSelectEventDetail {
    
    inline def apply(value: String): WheelSliderSelectEventDetail = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[WheelSliderSelectEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WheelSliderSelectEventDetail] (val x: Self) extends AnyVal {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
