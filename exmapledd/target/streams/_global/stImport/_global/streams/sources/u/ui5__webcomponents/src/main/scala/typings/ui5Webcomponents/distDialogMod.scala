package typings.ui5Webcomponents

import org.scalajs.dom.DragEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import typings.ui5Webcomponents.ui5WebcomponentsStrings.`0`
import typings.ui5WebcomponentsBase.distTypesValueStateMod.ValueState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDialogMod {
  
  /**
    * @class
    * <h3 class="comment-api-title">Overview</h3>
    * The <code>ui5-dialog</code> component is used to temporarily display some information in a
    * size-limited window in front of the regular app screen.
    * It is used to prompt the user for an action or a confirmation.
    * The <code>ui5-dialog</code> interrupts the current app processing as it is the only focused UI element and
    * the main screen is dimmed/blocked.
    * The dialog combines concepts known from other technologies where the windows have
    * names such as dialog box, dialog window, pop-up, pop-up window, alert box, or message box.
    * <br><br>
    * The <code>ui5-dialog</code> is modal, which means that user action is required before returning to the parent window is possible.
    * The content of the <code>ui5-dialog</code> is fully customizable.
    *
    * <h3>Structure</h3>
    * A <code>ui5-dialog</code> consists of a header, content, and a footer for action buttons.
    * The <code>ui5-dialog</code> is usually displayed at the center of the screen.
    * Its position can be changed by the user. To enable this, you need to set the property <code>draggable</code> accordingly.
    *
    * <h3>Responsive Behavior</h3>
    * The <code>stretch</code> property can be used to stretch the
    * <code>ui5-dialog</code> on full screen.
    *
    * <h3>CSS Shadow Parts</h3>
    *
    * <ui5-link target="_blank" href="https://developer.mozilla.org/en-US/docs/Web/CSS/::part">CSS Shadow Parts</ui5-link> allow developers to style elements inside the Shadow DOM.
    * <br>
    * The <code>ui5-dialog</code> exposes the following CSS Shadow Parts:
    * <ul>
    * <li>header - Used to style the header of the component</li>
    * <li>content - Used to style the content of the component</li>
    * <li>footer - Used to style the footer of the component</li>
    * </ul>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/Dialog";</code>
    *
    * <b>Note:</b> We don't recommend nesting popup-like components (<code>ui5-dialog</code>, <code>ui5-popover</code>) inside <code>ui5-dialog</code>.
    * Ideally you should create all popups on the same level inside your HTML page and just open them from one another, rather than nesting them.
    *
    * <b>Note:</b> We don't recommend nesting popup-like components (<code>ui5-dialog</code>, <code>ui5-popover</code>) inside other components containing z-index.
    * This might break z-index management.
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.Dialog
    * @extends sap.ui.webc.main.Popup
    * @tagname ui5-dialog
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/Dialog", JSImport.Default)
  @js.native
  open class default () extends Dialog
  object default {
    
    @JSImport("@ui5/webcomponents/dist/Dialog", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def isHeader(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isHeader")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  /**
    * @class
    * <h3 class="comment-api-title">Overview</h3>
    * The <code>ui5-dialog</code> component is used to temporarily display some information in a
    * size-limited window in front of the regular app screen.
    * It is used to prompt the user for an action or a confirmation.
    * The <code>ui5-dialog</code> interrupts the current app processing as it is the only focused UI element and
    * the main screen is dimmed/blocked.
    * The dialog combines concepts known from other technologies where the windows have
    * names such as dialog box, dialog window, pop-up, pop-up window, alert box, or message box.
    * <br><br>
    * The <code>ui5-dialog</code> is modal, which means that user action is required before returning to the parent window is possible.
    * The content of the <code>ui5-dialog</code> is fully customizable.
    *
    * <h3>Structure</h3>
    * A <code>ui5-dialog</code> consists of a header, content, and a footer for action buttons.
    * The <code>ui5-dialog</code> is usually displayed at the center of the screen.
    * Its position can be changed by the user. To enable this, you need to set the property <code>draggable</code> accordingly.
    *
    * <h3>Responsive Behavior</h3>
    * The <code>stretch</code> property can be used to stretch the
    * <code>ui5-dialog</code> on full screen.
    *
    * <h3>CSS Shadow Parts</h3>
    *
    * <ui5-link target="_blank" href="https://developer.mozilla.org/en-US/docs/Web/CSS/::part">CSS Shadow Parts</ui5-link> allow developers to style elements inside the Shadow DOM.
    * <br>
    * The <code>ui5-dialog</code> exposes the following CSS Shadow Parts:
    * <ul>
    * <li>header - Used to style the header of the component</li>
    * <li>content - Used to style the content of the component</li>
    * <li>footer - Used to style the footer of the component</li>
    * </ul>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/Dialog";</code>
    *
    * <b>Note:</b> We don't recommend nesting popup-like components (<code>ui5-dialog</code>, <code>ui5-popover</code>) inside <code>ui5-dialog</code>.
    * Ideally you should create all popups on the same level inside your HTML page and just open them from one another, rather than nesting them.
    *
    * <b>Note:</b> We don't recommend nesting popup-like components (<code>ui5-dialog</code>, <code>ui5-popover</code>) inside other components containing z-index.
    * This might break z-index management.
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.Dialog
    * @extends sap.ui.webc.main.Popup
    * @tagname ui5-dialog
    * @public
    */
  @js.native
  trait Dialog
    extends typings.ui5Webcomponents.distPopupMod.default {
    
    def _attachMouseDragHandlers(): Unit = js.native
    
    def _attachMouseResizeHandlers(): Unit = js.native
    
    def _attachScreenResizeHandler(): Unit = js.native
    
    var _cachedMinHeight: js.UndefOr[Double] = js.native
    
    def _center(): Unit = js.native
    
    def _detachMouseDragHandlers(): Unit = js.native
    
    def _detachMouseResizeHandlers(): Unit = js.native
    
    def _detachScreenResizeHandler(): Unit = js.native
    
    def _dialogStateIcon: String = js.native
    
    /**
      * Determines if the header should be shown.
      */
    def _displayHeader: String | Double | Boolean = js.native
    
    def _dragMouseMoveHandler(e: MouseEvent): Unit = js.native
    
    def _dragMouseUpHandler(e: MouseEvent): Unit = js.native
    
    def _dragStartHandler(e: DragEvent): Unit = js.native
    
    def _dragWithEvent(e: KeyboardEvent): Unit = js.native
    
    def _handleDragStart(e: DragEvent): Unit = js.native
    
    def _headerTabIndex: js.UndefOr[`0`] = js.native
    
    var _initialHeight: js.UndefOr[Double] = js.native
    
    var _initialLeft: js.UndefOr[Double] = js.native
    
    var _initialTop: js.UndefOr[Double] = js.native
    
    var _initialWidth: js.UndefOr[Double] = js.native
    
    var _initialX: js.UndefOr[Double] = js.native
    
    var _initialY: js.UndefOr[Double] = js.native
    
    var _isRTL: js.UndefOr[Boolean] = js.native
    
    def _minHeight: Double = js.native
    
    var _minWidth: js.UndefOr[Double] = js.native
    
    def _movable: Boolean = js.native
    
    /**
      * Event handlers
      */
    def _onDragMouseDown(e: DragEvent): Unit = js.native
    
    def _onDragMouseMove(e: MouseEvent): Unit = js.native
    
    def _onDragMouseUp(): Unit = js.native
    
    def _onDragOrResizeKeyDown(e: KeyboardEvent): Unit = js.native
    
    def _onResizeMouseDown(e: MouseEvent): Unit = js.native
    
    def _onResizeMouseMove(e: MouseEvent): Unit = js.native
    
    def _onResizeMouseUp(): Unit = js.native
    
    def _resizeMouseMoveHandler(e: MouseEvent): Unit = js.native
    
    def _resizeMouseUpHandler(e: MouseEvent): Unit = js.native
    
    def _resizeWithEvent(e: KeyboardEvent): Unit = js.native
    
    def _revertSize(): Unit = js.native
    
    def _screenResizeHandler(): Unit = js.native
    
    var _screenResizeHandlerAttached: js.UndefOr[Boolean] = js.native
    
    def _showResizeHandle: Boolean = js.native
    
    var _x: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify int */ Any
      ] = js.native
    
    var _y: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify int */ Any
      ] = js.native
    
    /**
      * Defines the footer HTML Element.
      *
      * @type {HTMLElement[]}
      * @name sap.ui.webc.main.Dialog.prototype.footer
      * @slot
      * @public
      */
    var footer: js.Array[HTMLElement] = js.native
    
    def hasValueState: Boolean = js.native
    
    /**
      * Defines the header HTML Element.
      * <br><br>
      * <b>Note:</b> If <code>header</code> slot is provided, the labelling of the dialog is a responsibility of the application developer.
      * <code>accessibleName</code> should be used.
      *
      * @type {HTMLElement[]}
      * @name sap.ui.webc.main.Dialog.prototype.header
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
      * @name sap.ui.webc.main.Dialog.prototype.headerText
      * @defaultvalue ""
      * @public
      */
    var headerText: String = js.native
    
    /**
      * @private
      */
    var onDesktop: Boolean = js.native
    
    /**
      * @private
      */
    var onPhone: Boolean = js.native
    
    /**
      * Configures the component to be resizable.
      * If this property is set to true, the Dialog will have a resize handle in its bottom right corner in LTR languages.
      * In RTL languages, the resize handle will be placed in the bottom left corner.
      * <br><br>
      * <b>Note:</b> The component can be resizable only in desktop mode.
      * <br>
      * <b>Note:</b> Upon resizing, externally defined height and width styling will be ignored.
      * @type {boolean}
      * @name sap.ui.webc.main.Dialog.prototype.resizable
      * @defaultvalue false
      * @since 1.0.0-rc.10
      * @public
      */
    var resizable: Boolean = js.native
    
    /**
      * Shows the dialog.
      *
      * @param {boolean} [preventInitialFocus=false] Prevents applying the focus inside the popup
      * @public
      * @method
      * @name sap.ui.webc.main.Dialog#show
      * @async
      * @returns {Promise} Resolves when the dialog is open
      */
    def show(): js.Promise[Unit] = js.native
    def show(preventInitialFocus: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Defines the state of the <code>Dialog</code>.
      * <br>
      * Available options are: <code>"None"</code> (by default), <code>"Success"</code>, <code>"Warning"</code>, <code>"Information"</code> and <code>"Error"</code>.
      * @type {sap.ui.webc.base.types.ValueState}
      * @name sap.ui.webc.main.Dialog.prototype.state
      * @defaultvalue "None"
      * @public
      * @since 1.0.0-rc.15
      */
    var state: ValueState = js.native
    
    /**
      * Determines whether the component should be stretched to fullscreen.
      * <br><br>
      * <b>Note:</b> The component will be stretched to approximately
      * 90% of the viewport.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.Dialog.prototype.stretch
      * @defaultvalue false
      * @public
      */
    var stretch: Boolean = js.native
  }
}
