package typings.ui5Webcomponents

import org.scalajs.dom.DOMRect
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import typings.ui5Webcomponents.distTypesPopoverHorizontalAlignMod.PopoverHorizontalAlign
import typings.ui5Webcomponents.distTypesPopoverPlacementTypeMod.PopoverPlacementType
import typings.ui5Webcomponents.distTypesPopoverVerticalAlignMod.PopoverVerticalAlign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPopoverMod {
  
  @JSImport("@ui5/webcomponents/dist/Popover", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-popover</code> component displays additional information for an object
    * in a compact way and without leaving the page.
    * The Popover can contain various UI elements, such as fields, tables, images, and charts.
    * It can also include actions in the footer.
    *
    * <h3>Structure</h3>
    *
    * The popover has three main areas:
    * <ul>
    * <li>Header (optional)</li>
    * <li>Content</li>
    * <li>Footer (optional)</li>
    * </ul>
    *
    * <b>Note:</b> The <code>ui5-popover</code> is closed when the user clicks
    * or taps outside the popover
    * or selects an action within the popover. You can prevent this with the
    * <code>modal</code> property.
    *
    * <h3>CSS Shadow Parts</h3>
    *
    * <ui5-link target="_blank" href="https://developer.mozilla.org/en-US/docs/Web/CSS/::part">CSS Shadow Parts</ui5-link> allow developers to style elements inside the Shadow DOM.
    * <br>
    * The <code>ui5-popover</code> exposes the following CSS Shadow Parts:
    * <ul>
    * <li>header - Used to style the header of the component</li>
    * <li>content - Used to style the content of the component</li>
    * <li>footer - Used to style the footer of the component</li>
    * </ul>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/Popover.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.Popover
    * @extends sap.ui.webc.main.Popup
    * @tagname ui5-popover
    * @since 1.0.0-rc.6
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/Popover", JSImport.Default)
  @js.native
  open class default () extends Popover
  
  inline def instanceOfPopover(`object`: Any): /* is @ui5/webcomponents.@ui5/webcomponents/dist/Popover.Popover */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("instanceOfPopover")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is @ui5/webcomponents.@ui5/webcomponents/dist/Popover.Popover */ Boolean]
  
  trait ArrowPosition extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object ArrowPosition {
    
    inline def apply(x: Double, y: Double): ArrowPosition = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArrowPosition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArrowPosition] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait CalculatedPlacement extends StObject {
    
    var arrow: ArrowPosition
    
    var left: Double
    
    var placementType: PopoverPlacementType
    
    var top: Double
  }
  object CalculatedPlacement {
    
    inline def apply(arrow: ArrowPosition, left: Double, placementType: PopoverPlacementType, top: Double): CalculatedPlacement = {
      val __obj = js.Dynamic.literal(arrow = arrow.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], placementType = placementType.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalculatedPlacement]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CalculatedPlacement] (val x: Self) extends AnyVal {
      
      inline def setArrow(value: ArrowPosition): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setPlacementType(value: PopoverPlacementType): Self = StObject.set(x, "placementType", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-popover</code> component displays additional information for an object
    * in a compact way and without leaving the page.
    * The Popover can contain various UI elements, such as fields, tables, images, and charts.
    * It can also include actions in the footer.
    *
    * <h3>Structure</h3>
    *
    * The popover has three main areas:
    * <ul>
    * <li>Header (optional)</li>
    * <li>Content</li>
    * <li>Footer (optional)</li>
    * </ul>
    *
    * <b>Note:</b> The <code>ui5-popover</code> is closed when the user clicks
    * or taps outside the popover
    * or selects an action within the popover. You can prevent this with the
    * <code>modal</code> property.
    *
    * <h3>CSS Shadow Parts</h3>
    *
    * <ui5-link target="_blank" href="https://developer.mozilla.org/en-US/docs/Web/CSS/::part">CSS Shadow Parts</ui5-link> allow developers to style elements inside the Shadow DOM.
    * <br>
    * The <code>ui5-popover</code> exposes the following CSS Shadow Parts:
    * <ul>
    * <li>header - Used to style the header of the component</li>
    * <li>content - Used to style the content of the component</li>
    * <li>footer - Used to style the footer of the component</li>
    * </ul>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/Popover.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.Popover
    * @extends sap.ui.webc.main.Popup
    * @tagname ui5-popover
    * @since 1.0.0-rc.6
    * @public
    */
  @js.native
  trait Popover
    extends typings.ui5Webcomponents.distPopupMod.default {
    
    /**
      * Adjust the desired top position to compensate for shift of the screen
      * caused by opened keyboard on iOS which affects all elements with position:fixed.
      * @private
      * @param {int} top The target top in px.
      * @returns {int} The adjusted top in px.
      */
    def _adjustForIOSKeyboard(top: Double): Double = js.native
    
    /**
      * Hook for descendants to hide footer.
      */
    def _displayFooter: Boolean = js.native
    
    /**
      * Hook for descendants to hide header.
      */
    def _displayHeader: Boolean = js.native
    
    var _left: js.UndefOr[Double] = js.native
    
    var _maxHeight: js.UndefOr[Double] = js.native
    
    var _maxWidth: js.UndefOr[Double] = js.native
    
    var _oldPlacement: js.UndefOr[CalculatedPlacement] = js.native
    
    var _opener: js.UndefOr[HTMLElement] = js.native
    
    var _openerRect: js.UndefOr[DOMRect] = js.native
    
    var _preventRepositionAndClose: js.UndefOr[Boolean] = js.native
    
    var _top: js.UndefOr[Double] = js.native
    
    var _width: js.UndefOr[String] = js.native
    
    /**
      * Returns the calculated placement depending on the free space
      *
      * @private
      */
    var actualPlacementType: PopoverPlacementType = js.native
    
    /**
      * Determines if there is no enough space, the component can be placed
      * over the target.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.Popover.prototype.allowTargetOverlap
      * @defaultvalue false
      * @public
      */
    var allowTargetOverlap: Boolean = js.native
    
    def arrowDOM: Element = js.native
    
    /**
      * Sets the X translation of the arrow
      *
      * @private
      */
    var arrowTranslateX: Double = js.native
    
    /**
      * Sets the Y translation of the arrow
      *
      * @private
      */
    var arrowTranslateY: Double = js.native
    
    /**
      * @private
      */
    def calcPlacement(targetRect: DOMRect, popoverSize: PopoverSize): CalculatedPlacement = js.native
    
    /**
      * Defines whether the content is scrollable.
      *
      * @type {boolean}
      * @defaultvalue false
      * @private
      */
    var disableScrolling: Boolean = js.native
    
    /**
      * Fallbacks to new placement, prioritizing <code>Left</code> and <code>Right</code> placements.
      * @private
      */
    def fallbackPlacement(clientWidth: Double, clientHeight: Double, targetRect: DOMRect, popoverSize: PopoverSize): js.UndefOr[PopoverPlacementType] = js.native
    
    /**
      * Defines the footer HTML Element.
      *
      * @type {HTMLElement[]}
      * @name sap.ui.webc.main.Popover.prototype.footer
      * @slot
      * @public
      */
    var footer: js.Array[HTMLElement] = js.native
    
    def getActualPlacementType(targetRect: DOMRect, popoverSize: PopoverSize): PopoverPlacementType = js.native
    
    /**
      * Calculates the position for the arrow.
      * @private
      * @param targetRect BoundingClientRect of the target element
      * @param {{width: number, height: number}} popoverSize Width and height of the popover
      * @param left Left offset of the popover
      * @param top Top offset of the popover
      * @param isVertical If the popover is positioned vertically to the target element
      * @param {number} borderRadius Value of the border-radius property
      * @returns {{x: number, y: number}} Arrow's coordinates
      */
    def getArrowPosition(
      targetRect: DOMRect,
      popoverSize: PopoverSize,
      left: Double,
      top: Double,
      isVertical: Boolean,
      borderRadius: Double
    ): ArrowPosition = js.native
    
    def getHorizontalTop(targetRect: DOMRect, popoverSize: PopoverSize): Double = js.native
    
    def getPopoverSize(): PopoverSize = js.native
    
    def getVerticalLeft(targetRect: DOMRect, popoverSize: PopoverSize): Double = js.native
    
    /**
      * Defines the header HTML Element.
      *
      * @type {HTMLElement[]}
      * @name sap.ui.webc.main.Popover.prototype.header
      * @slot
      * @public
      */
    var header: js.Array[HTMLElement] = js.native
    
    /**
      * Defines the header text.
      * <br><br>
      * <b>Note:</b> If <code>header</code> slot is provided, the <code>headerText</code> is ignored.
      *
      * @type {string}
      * @name sap.ui.webc.main.Popover.prototype.headerText
      * @defaultvalue ""
      * @public
      */
    var headerText: String = js.native
    
    /**
      * Determines whether the component arrow is hidden.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.Popover.prototype.hideArrow
      * @defaultvalue false
      * @public
      * @since 1.0.0-rc.15
      */
    var hideArrow: Boolean = js.native
    
    /**
      * Defines whether the block layer will be shown if modal property is set to true.
      * @type {boolean}
      * @name sap.ui.webc.main.Popover.prototype.hideBackdrop
      * @defaultvalue false
      * @public
      * @since 1.0.0-rc.10
      */
    var hideBackdrop: Boolean = js.native
    
    /**
      * Determines the horizontal alignment of the component.
      * <br><br>
      * Available options are:
      * <ul>
      * <li><code>Center</code></li>
      * <li><code>Left</code></li>
      * <li><code>Right</code></li>
      * <li><code>Stretch</code></li>
      * </ul>
      *
      * @type {sap.ui.webc.main.types.PopoverHorizontalAlign}
      * @name sap.ui.webc.main.Popover.prototype.horizontalAlign
      * @defaultvalue "Center"
      * @public
      */
    var horizontalAlign: PopoverHorizontalAlign = js.native
    
    def isOpenerClicked(e: MouseEvent): Boolean = js.native
    
    def isOpenerOutsideViewport(openerRect: DOMRect): Boolean = js.native
    
    /**
      * Defines whether the component should close when
      * clicking/tapping outside of the popover.
      * If enabled, it blocks any interaction with the background.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.Popover.prototype.modal
      * @defaultvalue false
      * @public
      */
    var modal: Boolean = js.native
    
    /**
      * Defines the ID or DOM Reference of the element that the popover is shown at
      * @public
      * @type {sap.ui.webc.base.types.DOMReference}
      * @name sap.ui.webc.main.Popover.prototype.opener
      * @defaultvalue undefined
      * @since 1.2.0
      */
    var opener: js.UndefOr[HTMLElement | String] = js.native
    
    /**
      * Determines on which side the component is placed at.
      * <br><br>
      * Available options are:
      * <ul>
      * <li><code>Left</code></li>
      * <li><code>Right</code></li>
      * <li><code>Top</code></li>
      * <li><code>Bottom</code></li>
      * </ul>
      *
      * @type {sap.ui.webc.main.types.PopoverPlacementType}
      * @name sap.ui.webc.main.Popover.prototype.placementType
      * @defaultvalue "Right"
      * @public
      */
    var placementType: PopoverPlacementType = js.native
    
    def reposition(): Unit = js.native
    
    def shouldCloseDueToNoOpener(openerRect: DOMRect): Boolean = js.native
    
    def shouldCloseDueToOverflow(placement: PopoverPlacementType, openerRect: DOMRect): Boolean = js.native
    
    /**
      * Shows the popover.
      * @param {HTMLElement} opener the element that the popover is shown at
      * @param {boolean} [preventInitialFocus=false] prevents applying the focus inside the popover
      * @public
      * @async
      * @method
      * @name sap.ui.webc.main.Popover#showAt
      * @async
      * @returns {Promise} Resolved when the popover is open
      */
    def showAt(opener: HTMLElement): js.Promise[Unit] = js.native
    def showAt(opener: HTMLElement, preventInitialFocus: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Determines the vertical alignment of the component.
      * <br><br>
      * Available options are:
      * <ul>
      * <li><code>Center</code></li>
      * <li><code>Top</code></li>
      * <li><code>Bottom</code></li>
      * <li><code>Stretch</code></li>
      * </ul>
      *
      * @type {sap.ui.webc.main.types.PopoverVerticalAlign}
      * @name sap.ui.webc.main.Popover.prototype.verticalAlign
      * @defaultvalue "Center"
      * @public
      */
    var verticalAlign: PopoverVerticalAlign = js.native
  }
  
  trait PopoverSize extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object PopoverSize {
    
    inline def apply(height: Double, width: Double): PopoverSize = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopoverSize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopoverSize] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
