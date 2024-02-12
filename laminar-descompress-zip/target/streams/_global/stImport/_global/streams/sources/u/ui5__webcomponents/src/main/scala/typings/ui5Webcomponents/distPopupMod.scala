package typings.ui5Webcomponents

import org.scalajs.dom.Event
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import typings.ui5Webcomponents.anon.BlockLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPopupMod {
  
  /**
    * @class
    * <h3 class="comment-api-title">Overview</h3>
    * Base class for all popup Web Components.
    *
    * If you need to create your own popup-like custom UI5 Web Components, it is highly recommended that you extend
    * at least Popup in order to have consistency with other popups in terms of modal behavior and z-index management.
    *
    * 1. The Popup class handles modality:
    *  - The "isModal" getter can be overridden by derivatives to provide their own conditions when they are modal or not
    *  - Derivatives may call the "blockPageScrolling" and "unblockPageScrolling" static methods to temporarily remove scrollbars on the html element
    *  - Derivatives may call the "open" and "close" methods which handle focus, manage the popup registry and for modal popups, manage the blocking layer
    *
    *  2. Provides blocking layer (relevant for modal popups only):
    *   - It is in the static area
    *   - Controlled by the "open" and "close" methods
    *
    * 3. The Popup class "traps" focus:
    *  - Derivatives may call the "applyInitialFocus" method (usually when opening, to transfer focus inside the popup)
    *
    * 4. The Popup class automatically assigns "z-index"
    *  - Each time a popup is opened, it gets a higher than the previously opened popup z-index
    *
    * 5. The template of this component exposes two inline partials you can override in derivatives:
    *  - beforeContent (upper part of the box, useful for header/title/close button)
    *  - afterContent (lower part, useful for footer/action buttons)
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.Popup
    * @extends sap.ui.webc.base.UI5Element
    * @public
    */
  /**
    * Fired before the component is opened. This event can be cancelled, which will prevent the popup from opening. <b>This event does not bubble.</b>
    *
    * @public
    * @event sap.ui.webc.main.Popup#before-open
    * @allowPreventDefault
    */
  /* note: abstract class */ @JSImport("@ui5/webcomponents/dist/Popup", JSImport.Default)
  @js.native
  open class default () extends Popup
  object default {
    
    @JSImport("@ui5/webcomponents/dist/Popup", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Temporarily removes scrollbars from the html element
      * @protected
      */
    /* static member */
    inline def blockPageScrolling(popup: Popup): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("blockPageScrolling")(popup.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Restores scrollbars on the html element, if needed
      * @protected
      */
    /* static member */
    inline def unblockPageScrolling(popup: Popup): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unblockPageScrolling")(popup.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  /**
    * @class
    * <h3 class="comment-api-title">Overview</h3>
    * Base class for all popup Web Components.
    *
    * If you need to create your own popup-like custom UI5 Web Components, it is highly recommended that you extend
    * at least Popup in order to have consistency with other popups in terms of modal behavior and z-index management.
    *
    * 1. The Popup class handles modality:
    *  - The "isModal" getter can be overridden by derivatives to provide their own conditions when they are modal or not
    *  - Derivatives may call the "blockPageScrolling" and "unblockPageScrolling" static methods to temporarily remove scrollbars on the html element
    *  - Derivatives may call the "open" and "close" methods which handle focus, manage the popup registry and for modal popups, manage the blocking layer
    *
    *  2. Provides blocking layer (relevant for modal popups only):
    *   - It is in the static area
    *   - Controlled by the "open" and "close" methods
    *
    * 3. The Popup class "traps" focus:
    *  - Derivatives may call the "applyInitialFocus" method (usually when opening, to transfer focus inside the popup)
    *
    * 4. The Popup class automatically assigns "z-index"
    *  - Each time a popup is opened, it gets a higher than the previously opened popup z-index
    *
    * 5. The template of this component exposes two inline partials you can override in derivatives:
    *  - beforeContent (upper part of the box, useful for header/title/close button)
    *  - afterContent (lower part, useful for footer/action buttons)
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.Popup
    * @extends sap.ui.webc.base.UI5Element
    * @public
    */
  /**
    * Fired before the component is opened. This event can be cancelled, which will prevent the popup from opening. <b>This event does not bubble.</b>
    *
    * @public
    * @event sap.ui.webc.main.Popup#before-open
    * @allowPreventDefault
    */
  @js.native
  trait Popup
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    /**
      * Adds the popup to the "opened popups registry"
      * @protected
      */
    def _addOpenedPopup(): Unit = js.native
    
    /**
      * Ensures ariaLabel is never null or empty string
      * @returns {string|undefined}
      * @protected
      */
    def _ariaLabel: js.UndefOr[String] = js.native
    
    /**
      * Return the ID of an element in the shadow DOM that is going to label this popup
      *
      * @protected
      * @abstract
      * @returns {string | undefined}
      */
    def _ariaLabelledBy: js.UndefOr[String] = js.native
    
    /**
      * Return the value for aria-modal for this popup
      *
      * @protected
      * @abstract
      * @returns {string}
      */
    def _ariaModal: String = js.native
    
    var _blockLayerHidden: Boolean = js.native
    
    /**
      * @private
      */
    var _disableInitialFocus: Boolean = js.native
    
    def _displayProp: String = js.native
    
    var _focusedElementBeforeOpen: js.UndefOr[HTMLElement | Null] = js.native
    
    def _onfocusout(e: FocusEvent): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onmousedown(e: MouseEvent): Unit = js.native
    
    def _onmouseup(): Unit = js.native
    
    /**
      * Shows the block layer (for modal popups only) and sets the correct z-index for the purpose of popup stacking
      * @protected
      */
    def _open(preventInitialFocus: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Prevents the user from interacting with the content under the block layer
      */
    def _preventBlockLayerFocus(e: KeyboardEvent): Unit = js.native
    def _preventBlockLayerFocus(e: MouseEvent): Unit = js.native
    
    /**
      * Removes the popup from the "opened popups registry"
      * @protected
      */
    def _removeOpenedPopup(): Unit = js.native
    
    def _resize(): Unit = js.native
    
    def _resizeHandler(): Unit = js.native
    
    def _role: String = js.native
    
    def _root: HTMLElement = js.native
    
    def _scroll(e: Event): Unit = js.native
    
    var _shouldFocusRoot: js.UndefOr[Boolean] = js.native
    
    /**
      * Sets "block" display to the popup. The property can be overriden by derivatives of Popup.
      * @protected
      */
    def _show(): Unit = js.native
    
    var _zIndex: js.UndefOr[Double] = js.native
    
    /**
      * Defines the accessible name of the component.
      *
      * @type {string}
      * @name sap.ui.webc.main.Popup.prototype.accessibleName
      * @defaultvalue undefined
      * @public
      * @since 1.0.0-rc.15
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    /**
      * Defines the IDs of the elements that label the component.
      *
      * @type {string}
      * @name sap.ui.webc.main.Popup.prototype.accessibleNameRef
      * @defaultvalue ""
      * @public
      * @since 1.1.0
      */
    var accessibleNameRef: String = js.native
    
    /**
      * Focuses the element denoted by <code>initialFocus</code>, if provided,
      * or the first focusable element otherwise.
      * @public
      * @method
      * @name sap.ui.webc.main.Popup#applyFocus
      * @async
      * @returns {Promise} Promise that resolves when the focus is applied
      */
    def applyFocus(): js.Promise[Unit] = js.native
    
    /**
      * Use this method to focus the element denoted by "initialFocus", if provided, or the first focusable element otherwise.
      * @protected
      */
    def applyInitialFocus(): js.Promise[Unit] = js.native
    
    /**
      * Closes the popup.
      * @public
      * @method
      * @name sap.ui.webc.main.Popup#close
      * @returns {void}
      */
    def close(): Unit = js.native
    def close(escPressed: Boolean): Unit = js.native
    def close(escPressed: Boolean, preventRegistryUpdate: Boolean): Unit = js.native
    def close(escPressed: Boolean, preventRegistryUpdate: Boolean, preventFocusRestore: Boolean): Unit = js.native
    def close(escPressed: Boolean, preventRegistryUpdate: Unit, preventFocusRestore: Boolean): Unit = js.native
    def close(escPressed: Unit, preventRegistryUpdate: Boolean): Unit = js.native
    def close(escPressed: Unit, preventRegistryUpdate: Boolean, preventFocusRestore: Boolean): Unit = js.native
    def close(escPressed: Unit, preventRegistryUpdate: Unit, preventFocusRestore: Boolean): Unit = js.native
    
    /**
      * Defines the content of the Popup.
      * @type {HTMLElement[]}
      * @name sap.ui.webc.main.Popup.prototype.default
      * @slot content
      * @public
      */
    var content: js.Array[HTMLElement] = js.native
    
    def contentDOM: HTMLElement = js.native
    
    /**
      * Focus trapping
      * @private
      */
    def forwardToFirst(): js.Promise[Unit] = js.native
    
    /**
      * Focus trapping
      * @private
      */
    def forwardToLast(): js.Promise[Unit] = js.native
    
    /**
      * Sets "none" display to the popup
      * @protected
      */
    def hide(): Unit = js.native
    
    /**
      * Defines the ID of the HTML Element, which will get the initial focus.
      *
      * @type {string}
      * @name sap.ui.webc.main.Popup.prototype.initialFocus
      * @defaultvalue ""
      * @public
      */
    var initialFocus: String = js.native
    
    def isFocusWithin(): Boolean = js.native
    
    /**
      * Implement this getter with relevant logic regarding the modality of the popup (e.g. based on a public property)
      *
      * @protected
      * @abstract
      * @returns {boolean}
      */
    def isModal: Boolean = js.native
    
    /**
      * Tells if the component is opened
      * @public
      * @method
      * @name sap.ui.webc.main.Popup#isOpen
      * @returns {boolean}
      */
    def isOpen(): Boolean = js.native
    
    /**
      * Indicates if the element is the top modal popup
      *
      * This property is calculated automatically
      *
      * @private
      * @type {boolean}
      * @defaultvalue false
      */
    var isTopModalPopup: Boolean = js.native
    
    /**
      * Defines the current media query size.
      *
      * @type {string}
      * @private
      */
    var mediaRange: String = js.native
    
    /**
      * Indicates if the element is open
      * @public
      * @type {boolean}
      * @name sap.ui.webc.main.Popup.prototype.open
      * @defaultvalue false
      * @since 1.2.0
      */
    var open: Boolean = js.native
    
    /**
      * Indicates if the element is already open
      * @private
      * @type {boolean}
      * @defaultvalue false
      */
    var opened: Boolean = js.native
    
    /**
      * Defines if the focus should be returned to the previously focused element,
      * when the popup closes.
      * @type {boolean}
      * @name sap.ui.webc.main.Popup.prototype.preventFocusRestore
      * @defaultvalue false
      * @public
      * @since 1.0.0-rc.8
      */
    var preventFocusRestore: Boolean = js.native
    
    /**
      * Returns the focus to the previously focused element
      * @protected
      */
    def resetFocus(): Unit = js.native
    
    /**
      * Implement this getter with relevant logic in order to hide the block layer (f.e. based on a public property)
      *
      * @protected
      * @abstract
      * @returns {boolean}
      */
    def shouldHideBackdrop: Boolean = js.native
    
    def styles: BlockLayer = js.native
  }
  
  trait PopupBeforeCloseEventDetail extends StObject {
    
    var escPressed: Boolean
  }
  object PopupBeforeCloseEventDetail {
    
    inline def apply(escPressed: Boolean): PopupBeforeCloseEventDetail = {
      val __obj = js.Dynamic.literal(escPressed = escPressed.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopupBeforeCloseEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopupBeforeCloseEventDetail] (val x: Self) extends AnyVal {
      
      inline def setEscPressed(value: Boolean): Self = StObject.set(x, "escPressed", value.asInstanceOf[js.Any])
    }
  }
  
  trait PopupScrollEventDetail extends StObject {
    
    var scrollTop: Double
    
    var targetRef: HTMLElement
  }
  object PopupScrollEventDetail {
    
    inline def apply(scrollTop: Double, targetRef: HTMLElement): PopupScrollEventDetail = {
      val __obj = js.Dynamic.literal(scrollTop = scrollTop.asInstanceOf[js.Any], targetRef = targetRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopupScrollEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopupScrollEventDetail] (val x: Self) extends AnyVal {
      
      inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
      
      inline def setTargetRef(value: HTMLElement): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
    }
  }
}
