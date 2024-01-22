package typings.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMenuItemMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * <code>ui5-menu-item</code> is the item to use inside a <code>ui5-menu</code>.
    * An arbitrary hierarchy structure can be represented by recursively nesting menu items.
    *
    * <h3>Usage</h3>
    *
    * <code>ui5-menu-item</code> is an abstract element, representing a node in a <code>ui5-menu</code>. The menu itself is rendered as a list,
    * and each <code>ui5-menu-item</code> is represented by a list item (<code>ui5-li</code>) in that list. Therefore, you should only use
    * <code>ui5-menu-item</code> directly in your apps. The <code>ui5-li</code> list item is internal for the list, and not intended for public use.
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/MenuItem.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.MenuItem
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-menu-item
    * @implements sap.ui.webc.main.IMenuItem
    * @since 1.3.0
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/MenuItem", JSImport.Default)
  @js.native
  open class default () extends MenuItem
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * <code>ui5-menu-item</code> is the item to use inside a <code>ui5-menu</code>.
    * An arbitrary hierarchy structure can be represented by recursively nesting menu items.
    *
    * <h3>Usage</h3>
    *
    * <code>ui5-menu-item</code> is an abstract element, representing a node in a <code>ui5-menu</code>. The menu itself is rendered as a list,
    * and each <code>ui5-menu-item</code> is represented by a list item (<code>ui5-li</code>) in that list. Therefore, you should only use
    * <code>ui5-menu-item</code> directly in your apps. The <code>ui5-li</code> list item is internal for the list, and not intended for public use.
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/MenuItem.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.MenuItem
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-menu-item
    * @implements sap.ui.webc.main.IMenuItem
    * @since 1.3.0
    * @public
    */
  @js.native
  trait MenuItem
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _additionalText: String = js.native
    
    /**
      * Defines whether the submenu closing must be prevented
      */
    var _preventSubMenuClose: Boolean = js.native
    
    /**
      * Indicates whether any of the element siblings have children items.
      */
    var _siblingsWithChildren: Boolean = js.native
    
    /**
      * Indicates whether any of the element siblings have icon.
      */
    var _siblingsWithIcon: Boolean = js.native
    
    /**
      * Stores Menu object with submenu items
      */
    var _subMenu: js.UndefOr[typings.ui5Webcomponents.distMenuMod.default] = js.native
    
    /**
      * Defines the accessible ARIA name of the component.
      *
      * @name sap.ui.webc.main.MenuItem.prototype.accessibleName
      * @type {string}
      * @defaultvalue ""
      * @public
      * @since 1.7.0
      */
    var accessibleName: String = js.native
    
    /**
      * Defines the <code>additionalText</code>, displayed in the end of the menu item.
      * <b>Note:</b> The additional text would not be displayed if the item has a submenu.
      *
      * @name sap.ui.webc.main.MenuItem.prototype.additionalText
      * @type {string}
      * @public
      * @since 1.8.0
      */
    var additionalText: String = js.native
    
    def ariaLabelledByText: String = js.native
    
    /**
      * Defines whether <code>ui5-menu-item</code> is in disabled state.
      * <br><br>
      * <b>Note:</b> A disabled <code>ui5-menu-item</code> is noninteractive.
      *
      * @name sap.ui.webc.main.MenuItem.prototype.disabled
      * @type {boolean}
      * @defaultvalue false
      * @public
      */
    var disabled: Boolean = js.native
    
    def hasChildren: Boolean = js.native
    
    def hasDummyIcon: Boolean = js.native
    
    /**
      * Defines the icon to be displayed as graphical element within the component.
      * The SAP-icons font provides numerous options.
      * <br><br>
      <b>* Example:</b>
      * See all the available icons in the <ui5-link target="_blank" href="https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html" class="api-table-content-cell-link">Icon Explorer</ui5-link>.
      *
      * @name sap.ui.webc.main.MenuItem.prototype.icon
      * @type {string}
      * @defaultvalue ""
      * @public
      */
    var icon: String = js.native
    
    /**
      * Defines the items of this component.
      *
      * @name sap.ui.webc.main.MenuItem.prototype.default
      * @type {sap.ui.webc.main.IMenuItem[]}
      * @slot items
      * @public
      */
    var items: js.Array[MenuItem] = js.native
    
    /**
      * Defines whether a visual separator should be rendered before the item.
      *
      * @name sap.ui.webc.main.MenuItem.prototype.startsSection
      * @type {boolean}
      * @defaultvalue false
      * @public
      */
    var startsSection: Boolean = js.native
    
    def subMenuOpened: Boolean = js.native
    
    /**
      * Defines the text of the tree item.
      *
      * @name sap.ui.webc.main.MenuItem.prototype.text
      * @type {string}
      * @defaultValue ""
      * @public
      */
    var text: String = js.native
  }
}
