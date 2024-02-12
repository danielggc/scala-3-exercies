package typings.ui5Webcomponents

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.Element
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import typings.std.WeakMap
import typings.ui5Webcomponents.distTypesBreadcrumbsDesignMod.BreadcrumbsDesign
import typings.ui5Webcomponents.distTypesBreadcrumbsSeparatorStyleMod.BreadcrumbsSeparatorStyle
import typings.ui5Webcomponents.ui5WebcomponentsStrings.listbox
import typings.ui5WebcomponentsBase.distDelegateItemNavigationMod.ITabbable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBreadcrumbsMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    * Enables users to navigate between items by providing a list of links to previous steps in the user's navigation path.
    * It helps the user to be aware of their location within the application and allows faster navigation.
    * <br><br>
    * The last three steps can be accessed as links directly, while the remaining links prior to them are available
    * in a drop-down menu.
    * <br><br>
    * You can choose the type of separator to be used from a number of predefined options.
    *
    * <h3>Keyboard Handling</h3>
    * The <code>ui5-breadcrumbs</code> provides advanced keyboard handling.
    * <br>
    * <ul>
    * <li>[F4, ALT+UP, ALT+DOWN, SPACE, ENTER] - If the dropdown arrow is focused - opens/closes the drop-down.</li>
    * <li>[SPACE, ENTER] - Activates the focused item and triggers the <code>item-click</code> event.</li>
    * <li>[ESC] - Closes the drop-down.</li>
    * <li>[LEFT] - If the drop-down is closed - navigates one item to the left.</li>
    * <li>[RIGHT] - If the drop-down is closed - navigates one item to the right.</li>
    * <li>[UP] - If the drop-down is open - moves focus to the next item.</li>
    * <li>[DOWN] - If the drop-down is open - moves focus to the previous item.</li>
    * <li>[HOME] - Navigates to the first item.</li>
    * <li>[END] - Navigates to the last item.</li>
    * </ul>
    * <br>
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.Breadcrumbs
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-breadcrumbs
    * @appenddocs BreadcrumbsItem
    * @public
    * @since 1.0.0-rc.15
    */
  @JSImport("@ui5/webcomponents/dist/Breadcrumbs", JSImport.Default)
  @js.native
  open class default () extends Breadcrumbs
  object default {
    
    @JSImport("@ui5/webcomponents/dist/Breadcrumbs", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/Breadcrumbs", "default.i18nBundle")
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
    * Enables users to navigate between items by providing a list of links to previous steps in the user's navigation path.
    * It helps the user to be aware of their location within the application and allows faster navigation.
    * <br><br>
    * The last three steps can be accessed as links directly, while the remaining links prior to them are available
    * in a drop-down menu.
    * <br><br>
    * You can choose the type of separator to be used from a number of predefined options.
    *
    * <h3>Keyboard Handling</h3>
    * The <code>ui5-breadcrumbs</code> provides advanced keyboard handling.
    * <br>
    * <ul>
    * <li>[F4, ALT+UP, ALT+DOWN, SPACE, ENTER] - If the dropdown arrow is focused - opens/closes the drop-down.</li>
    * <li>[SPACE, ENTER] - Activates the focused item and triggers the <code>item-click</code> event.</li>
    * <li>[ESC] - Closes the drop-down.</li>
    * <li>[LEFT] - If the drop-down is closed - navigates one item to the left.</li>
    * <li>[RIGHT] - If the drop-down is closed - navigates one item to the right.</li>
    * <li>[UP] - If the drop-down is open - moves focus to the next item.</li>
    * <li>[DOWN] - If the drop-down is open - moves focus to the previous item.</li>
    * <li>[HOME] - Navigates to the first item.</li>
    * <li>[END] - Navigates to the last item.</li>
    * </ul>
    * <br>
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.Breadcrumbs
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-breadcrumbs
    * @appenddocs BreadcrumbsItem
    * @public
    * @since 1.0.0-rc.15
    */
  @js.native
  trait Breadcrumbs
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _accessibleNameText: String = js.native
    
    def _ariaHasPopup: js.UndefOr[listbox] = js.native
    
    var _breadcrumbItemWidths: WeakMap[typings.ui5Webcomponents.distBreadcrumbsItemMod.default, Double] = js.native
    
    /**
      * Caches the space required to render the content
      * @private
      */
    def _cacheWidths(): Unit = js.native
    
    def _cancelButtonText: String = js.native
    
    def _closeRespPopover(): Unit = js.native
    
    /**
      * Getter for accessible name of the current location. Includes the position of the current location and the size of the breadcrumbs
      */
    def _currentLocationAccName: String = js.native
    
    def _currentLocationLabel: typings.ui5Webcomponents.distLabelMod.default | Null = js.native
    
    def _currentLocationText: String = js.native
    
    def _dropdownArrowAccessibleNameText: String = js.native
    
    /**
      * Getter for the interactive element that opens the overflow
      * @private
      */
    def _dropdownArrowLink: typings.ui5Webcomponents.distLinkMod.default = js.native
    
    var _dropdownArrowLinkWidth: Double = js.native
    
    def _endsWithCurrentLocationLabel: Boolean = js.native
    
    def _getElementWidth(element: HTMLElement): Double = js.native
    
    /**
      * Obtains the items for navigation via keyboard
      * @private
      */
    def _getFocusableItems(): js.Array[ITabbable] = js.native
    
    def _getItemAccessibleName(item: typings.ui5Webcomponents.distBreadcrumbsItemMod.default, position: Double, size: Double): String = js.native
    
    def _getItemPositionText(position: Double, size: Double): String = js.native
    
    def _getItems(): js.Array[typings.ui5Webcomponents.distBreadcrumbsItemMod.default] = js.native
    
    def _getTotalContentWidth(): Double = js.native
    
    def _hasVisibleContent(item: typings.ui5Webcomponents.distBreadcrumbsItemMod.default): String | Boolean = js.native
    
    def _initItemNavigation(): Unit = js.native
    
    def _isCurrentLocationLabelFocused: Boolean | Null = js.native
    
    def _isDropdownArrowFocused: Boolean = js.native
    
    def _isItemVisible(item: typings.ui5Webcomponents.distBreadcrumbsItemMod.default): String | Boolean = js.native
    
    def _isOverflowEmpty: Boolean = js.native
    
    def _isPickerOpen: Boolean = js.native
    
    var _itemNavigation: typings.ui5WebcomponentsBase.distDelegateItemNavigationMod.default = js.native
    
    var _labelFocusAdaptor: FocusAdaptor = js.native
    
    /**
      * Getter for the list of links corresponding to the abstract breadcrumb items
      */
    def _links: js.Array[typings.ui5Webcomponents.distLinkMod.default] = js.native
    
    /**
      * Getter for the list of abstract breadcrumb items to be rendered as links outside the overflow
      */
    def _linksData: js.Array[typings.ui5Webcomponents.distBreadcrumbsItemMod.default] = js.native
    
    /**
      * Returns the maximum allowed count of items in the overflow
      * with respect to the UX requirement to never overflow the last visible item
      */
    def _maxAllowedOverflowSize: Double = js.native
    
    def _onLabelPress(e: KeyboardEvent): Unit = js.native
    def _onLabelPress(e: MouseEvent): Unit = js.native
    
    def _onLinkPress(e: CustomEvent): Unit = js.native
    
    def _onOverflowListItemSelect(e: CustomEvent): Unit = js.native
    
    def _onResizeHandler(): Unit = js.native
    
    def _onfocusin(e: FocusEvent): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeyup(e: KeyboardEvent): Unit = js.native
    
    def _openRespPopover(): js.Promise[Unit] = js.native
    
    /**
      * Getter for the list of abstract breadcrumb items to be rendered as list-items inside the overflow
      */
    def _overflowItemsData: js.Array[typings.ui5Webcomponents.distBreadcrumbsItemMod.default] = js.native
    
    /**
      * Holds the number of items in the overflow.
      *
      * @type {sap.ui.webc.base.types.Integer}
      * @defaultvalue 0
      * @private
      */
    var _overflowSize: Double = js.native
    
    def _preprocessItems(): Unit = js.native
    
    def _respPopover(): js.Promise[typings.ui5Webcomponents.distResponsivePopoverMod.default] = js.native
    
    def _toggleRespPopover(): js.Promise[Unit] = js.native
    
    def _updateOverflow(): Unit = js.native
    
    def _visibleItems: js.Array[typings.ui5Webcomponents.distBreadcrumbsItemMod.default] = js.native
    
    /**
      * Defines the visual indication and behavior of the breadcrumbs.
      * Available options are <code>Standard</code> (by default) and <code>NoCurrentPage</code>.
      * <br><br>
      * <b>Note:</b> The <code>Standard</code> breadcrumbs show the current page as the last item in the trail.
      * The last item contains only plain text and is not a link.
      *
      * @type {sap.ui.webc.main.types.BreadcrumbsDesign}
      * @name sap.ui.webc.main.Breadcrumbs.prototype.design
      * @defaultvalue "Standard"
      * @public
      */
    var design: BreadcrumbsDesign = js.native
    
    def getCurrentLocationLabelWrapper(): HTMLElement | Null = js.native
    
    /**
      * Defines the component items.
      *
      * <br><br>
      * <b>Note:</b> Use the <code>ui5-breadcrumbs-item</code> component to define the desired items.
      * @type {sap.ui.webc.main.IBreadcrumbsItem[]}
      * @name sap.ui.webc.main.Breadcrumbs.prototype.default
      * @slot items
      * @public
      */
    var items: js.Array[typings.ui5Webcomponents.distBreadcrumbsItemMod.default] = js.native
    
    var responsivePopover: js.UndefOr[typings.ui5Webcomponents.distResponsivePopoverMod.default] = js.native
    
    /**
      * Determines the visual style of the separator between the breadcrumb items.
      *
      * <br><br>
      * Available options are:
      * <ul>
      * <li><code>Slash</code></li>
      * <li><code>BackSlash</code></li>
      * <li><code>DoubleBackSlash</code></li>
      * <li><code>DoubleGreaterThan</code></li>
      * <li><code>DoubleSlash</code></li>
      * <li><code>GreaterThan</code></li>
      * </ul>
      *
      * @type {sap.ui.webc.main.types.BreadcrumbsSeparatorStyle}
      * @name sap.ui.webc.main.Breadcrumbs.prototype.separatorStyle
      * @defaultvalue "Slash"
      * @public
      */
    var separatorStyle: BreadcrumbsSeparatorStyle = js.native
  }
  
  trait FocusAdaptor
    extends StObject
       with ITabbable {
    
    def getlabelWrapper(): Element | Null
  }
  object FocusAdaptor {
    
    inline def apply(_tabIndex: String, getlabelWrapper: () => Element | Null, id: String): FocusAdaptor = {
      val __obj = js.Dynamic.literal(_tabIndex = _tabIndex.asInstanceOf[js.Any], getlabelWrapper = js.Any.fromFunction0(getlabelWrapper), id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[FocusAdaptor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FocusAdaptor] (val x: Self) extends AnyVal {
      
      inline def setGetlabelWrapper(value: () => Element | Null): Self = StObject.set(x, "getlabelWrapper", js.Any.fromFunction0(value))
    }
  }
}
