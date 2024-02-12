package typings.ui5Webcomponents

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import typings.ui5Webcomponents.ui5WebcomponentsStrings.Bottom
import typings.ui5Webcomponents.ui5WebcomponentsStrings.Left
import typings.ui5Webcomponents.ui5WebcomponentsStrings.Right
import typings.ui5Webcomponents.ui5WebcomponentsStrings.Top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMenuMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * <code>ui5-menu</code> component represents a hierarchical menu structure.
    *
    * <h3>Usage</h3>
    *
    * <code>ui5-menu</code> contains <code>ui5-menu-item</code> components.
    * An arbitrary hierarchy structure can be represented by recursively nesting menu items.
    *
    * <h3>Keyboard Handling</h3>
    *
    * The <code>ui5-menu</code> provides advanced keyboard handling.
    * The user can use the following keyboard shortcuts in order to navigate trough the tree:
    * <ul>
    * <li><code>Arrow Up</code> / <code>Arrow Down</code> - Navigates up and down the menu items that are currently visible.</li>
    * <li><code>Arrow Right</code>, <code>Space</code> or <code>Enter</code> - Opens a sub-menu if there are menu items nested
    * in the currently clicked menu item.</li>
    * <li><code>Arrow Left</code> or <code>Escape</code> - Closes the currently opened sub-menu.</li>
    * </ul>
    * Note: if the text ditrection is set to Right-to-left (RTL), <code>Arrow Right</code> and <code>Arrow Left</code> functionality is swapped.
    * <br>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/Menu.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.Menu
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-menu
    * @appenddocs MenuItem
    * @since 1.3.0
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/Menu", JSImport.Default)
  @js.native
  open class default () extends Menu
  object default {
    
    @JSImport("@ui5/webcomponents/dist/Menu", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/Menu", "default.i18nBundle")
    @js.native
    def i18nBundle: typings.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: typings.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def onDefine(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("onDefine")().asInstanceOf[js.Promise[Unit]]
  }
  
  trait CurrentItem extends StObject {
    
    var ariaHasPopup: js.UndefOr[String] = js.undefined
    
    var item: typings.ui5Webcomponents.distMenuItemMod.default
    
    var position: Double
  }
  object CurrentItem {
    
    inline def apply(item: typings.ui5Webcomponents.distMenuItemMod.default, position: Double): CurrentItem = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrentItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CurrentItem] (val x: Self) extends AnyVal {
      
      inline def setAriaHasPopup(value: String): Self = StObject.set(x, "ariaHasPopup", value.asInstanceOf[js.Any])
      
      inline def setAriaHasPopupUndefined: Self = StObject.set(x, "ariaHasPopup", js.undefined)
      
      inline def setItem(value: typings.ui5Webcomponents.distMenuItemMod.default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * <code>ui5-menu</code> component represents a hierarchical menu structure.
    *
    * <h3>Usage</h3>
    *
    * <code>ui5-menu</code> contains <code>ui5-menu-item</code> components.
    * An arbitrary hierarchy structure can be represented by recursively nesting menu items.
    *
    * <h3>Keyboard Handling</h3>
    *
    * The <code>ui5-menu</code> provides advanced keyboard handling.
    * The user can use the following keyboard shortcuts in order to navigate trough the tree:
    * <ul>
    * <li><code>Arrow Up</code> / <code>Arrow Down</code> - Navigates up and down the menu items that are currently visible.</li>
    * <li><code>Arrow Right</code>, <code>Space</code> or <code>Enter</code> - Opens a sub-menu if there are menu items nested
    * in the currently clicked menu item.</li>
    * <li><code>Arrow Left</code> or <code>Escape</code> - Closes the currently opened sub-menu.</li>
    * </ul>
    * Note: if the text ditrection is set to Right-to-left (RTL), <code>Arrow Right</code> and <code>Arrow Left</code> functionality is swapped.
    * <br>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/Menu.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.Menu
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-menu
    * @appenddocs MenuItem
    * @since 1.3.0
    * @public
    */
  @js.native
  trait Menu
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _afterPopoverClose(): Unit = js.native
    
    def _afterPopoverOpen(): Unit = js.native
    
    def _beforePopoverClose(e: CustomEvent): Unit = js.native
    
    def _beforePopoverOpen(e: CustomEvent): Unit = js.native
    
    def _closeItemSubMenu(item: typings.ui5Webcomponents.distMenuItemMod.default): Unit = js.native
    def _closeItemSubMenu(item: typings.ui5Webcomponents.distMenuItemMod.default, forceClose: Boolean): Unit = js.native
    
    def _closeSubMenuPopover(subMenu: Menu): Unit = js.native
    def _closeSubMenuPopover(subMenu: Menu, forceClose: Boolean): Unit = js.native
    
    def _createPopover(): js.Promise[typings.ui5Webcomponents.distResponsivePopoverMod.default] = js.native
    
    def _createSubMenu(item: typings.ui5Webcomponents.distMenuItemMod.default, openerId: String): Unit = js.native
    
    /**
      * Defines the currently available menu items.
      * (in case of non-phone devices these are the items of the menu,
      * but for phone devices the items of the currently opened sub-menu
      * will be populated here)
      * @type {array}
      * @private
      */
    var _currentItems: js.Array[CurrentItem] = js.native
    
    /**
      * Defines if the menu is sub-menu (not first-level).
      * @type {boolean}
      * @defaultvalue false
      * @private
      */
    var _isSubMenu: Boolean = js.native
    
    def _itemClick(e: CustomEvent): Unit = js.native
    
    def _itemKeyDown(e: KeyboardEvent): Unit = js.native
    
    def _itemMouseOut(e: MouseEvent): Unit = js.native
    
    def _itemMouseOver(e: MouseEvent): Unit = js.native
    
    def _navigateBack(): Unit = js.native
    
    def _openItemSubMenu(item: typings.ui5Webcomponents.distMenuItemMod.default, opener: HTMLElement, actionId: String): Unit = js.native
    
    /**
      * Stores menu item that have sub-menu opened.
      */
    var _openedSubMenuItem: js.UndefOr[typings.ui5Webcomponents.distMenuItemMod.default] = js.native
    
    /**
      * Stores a list of parent menu items for each sub-menu (on phone).
      * @type {array}
      * @private
      */
    var _parentItemsStack: js.Array[typings.ui5Webcomponents.distMenuItemMod.default] = js.native
    
    /**
      * Stores parent menu item (if there is such).
      */
    var _parentMenuItem: js.UndefOr[typings.ui5Webcomponents.distMenuItemMod.default] = js.native
    
    /**
      * Stores the ResponsivePopover instance
      */
    var _popover: js.UndefOr[typings.ui5Webcomponents.distResponsivePopoverMod.default] = js.native
    
    def _prepareCurrentItems(items: js.Array[typings.ui5Webcomponents.distMenuItemMod.default]): Unit = js.native
    
    def _prepareSubMenuDesktopTablet(item: typings.ui5Webcomponents.distMenuItemMod.default, opener: HTMLElement, actionId: String): Unit = js.native
    
    def _prepareSubMenuPhone(item: typings.ui5Webcomponents.distMenuItemMod.default): Unit = js.native
    
    /**
      * Stores id of a list item that opened sub-menu.
      * @type {string}
      * @private
      */
    var _subMenuOpenerId: String = js.native
    
    /**
      * Closes the Menu.
      * @public
      * @method
      * @name sap.ui.webc.main.Menu#close
      */
    def close(): Unit = js.native
    
    /**
      * Defines the header text of the menu (displayed on mobile).
      *
      * @name sap.ui.webc.main.Menu.prototype.headerText
      * @type {string}
      * @defaultvalue ""
      * @public
      */
    var headerText: String = js.native
    
    def isPhone: Boolean = js.native
    
    def isRtl: Boolean = js.native
    
    def isSubMenuOpened: Boolean = js.native
    
    /**
      * Defines the items of this component.
      * <br><br>
      * <b>Note:</b> Use <code>ui5-menu-item</code> for the intended design.
      *
      * @name sap.ui.webc.main.Menu.prototype.default
      * @type {sap.ui.webc.main.IMenuItem[]}
      * @slot items
      * @public
      */
    var items: js.Array[typings.ui5Webcomponents.distMenuItemMod.default] = js.native
    
    def itemsWithChildren: Boolean = js.native
    
    def itemsWithIcon: Boolean = js.native
    
    def labelBack: String = js.native
    
    def labelClose: String = js.native
    
    def menuHeaderTextPhone: String = js.native
    
    /**
      * Indicates if the menu is open
      *
      * @name sap.ui.webc.main.Menu.prototype.open
      * @public
      * @type {boolean}
      * @defaultvalue false
      * @since 1.10.0
      */
    var open: Boolean = js.native
    
    /**
      * Defines the ID or DOM Reference of the element that the menu is shown at
      *
      * @name sap.ui.webc.main.Menu.prototype.opener
      * @public
      * @type {sap.ui.webc.base.types.DOMReference}
      * @defaultvalue ""
      * @since 1.10.0
      */
    var opener: HTMLElement | String = js.native
    
    def placementType: Left | Right | Bottom = js.native
    
    /**
      * Shows the Menu near the opener element.
      * @param {HTMLElement} opener the element that the popover is shown at
      * @public
      * @method
      * @name sap.ui.webc.main.Menu#showAt
      */
    def showAt(opener: HTMLElement): js.Promise[Unit] = js.native
    
    def verticalAlign: Bottom | Top = js.native
  }
}
