package typings.ui5WebcomponentsFiori

import org.scalajs.dom.FocusEvent
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distProductSwitchItemMod {
  
  /**
    * @class
    * <h3 class="comment-api-title">Overview</h3>
    * The <code>ui5-product-switch-item</code> web component represents the items displayed in the
    * <code>ui5-product-switch</code> web component.
    * <br><br>
    * <b>Note:</b> <code>ui5-product-switch-item</code> is not supported when used outside of <code>ui5-product-switch</code>.
    * <br><br>
    *
    * <h3>Keyboard Handling</h3>
    * The <code>ui5-product-switch</code> provides advanced keyboard handling.
    * When focused, the user can use the following keyboard
    * shortcuts in order to perform a navigation:
    * <br>
    * <ul>
    * <li>[SPACE/ENTER/RETURN] - Trigger <code>ui5-click</code> event</li>
    * </ul>
    *
    * <h3>ES6 Module Import</h3>
    * <code>import "@ui5/webcomponents-fiori/dist/ProductSwitchItem.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.fiori.ProductSwitchItem
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-product-switch-item
    * @public
    * @implements sap.ui.webc.fiori.IProductSwitchItem
    * @since 1.0.0-rc.5
    */
  @JSImport("@ui5/webcomponents-fiori/dist/ProductSwitchItem", JSImport.Default)
  @js.native
  open class default () extends ProductSwitchItem
  
  /**
    * @class
    * <h3 class="comment-api-title">Overview</h3>
    * The <code>ui5-product-switch-item</code> web component represents the items displayed in the
    * <code>ui5-product-switch</code> web component.
    * <br><br>
    * <b>Note:</b> <code>ui5-product-switch-item</code> is not supported when used outside of <code>ui5-product-switch</code>.
    * <br><br>
    *
    * <h3>Keyboard Handling</h3>
    * The <code>ui5-product-switch</code> provides advanced keyboard handling.
    * When focused, the user can use the following keyboard
    * shortcuts in order to perform a navigation:
    * <br>
    * <ul>
    * <li>[SPACE/ENTER/RETURN] - Trigger <code>ui5-click</code> event</li>
    * </ul>
    *
    * <h3>ES6 Module Import</h3>
    * <code>import "@ui5/webcomponents-fiori/dist/ProductSwitchItem.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.fiori.ProductSwitchItem
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-product-switch-item
    * @public
    * @implements sap.ui.webc.fiori.IProductSwitchItem
    * @since 1.0.0-rc.5
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ui5WebcomponentsBase.distDelegateItemNavigationMod.ITabbable because var conflicts: id. Inlined _tabIndex */ @js.native
  trait ProductSwitchItem
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _deactivate(): Unit = js.native
    
    def _fireItemClick(): Unit = js.native
    
    def _onfocusin(e: FocusEvent): Unit = js.native
    
    def _onfocusout(): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeyup(e: KeyboardEvent): Unit = js.native
    
    def _onmousedown(): Unit = js.native
    
    /**
      * Defines the component tabindex.
      */
    var _tabIndex: String = js.native
    
    /**
      * Used to switch the active state (pressed or not) of the component.
      * @private
      */
    /* private */ var active: Any = js.native
    
    /**
      * Indicates whether the element is focused.
      * @private
      */
    /* private */ var focused: Any = js.native
    
    /**
      * Defines the icon to be displayed as a graphical element within the component.
      * <br><br>
      * Example:
      * <br>
      * <pre>ui5-product-switch-item icon="palette"</pre>
      *
      * See all the available icons in the <ui5-link target="_blank" href="https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html" class="api-table-content-cell-link">Icon Explorer</ui5-link>.
      *
      * @type {string}
      * @name sap.ui.webc.fiori.ProductSwitchItem.prototype.icon
      * @defaultvalue ""
      * @public
      */
    var icon: String = js.native
    
    /**
      * Used to set the selected state of the component. Only one selected in a sequence.
      * <b>Note:</b> Set by the <code>ProductSwitch</code>
      */
    var selected: Boolean = js.native
    
    /**
      * Defines the subtitle of the component.
      * @type {string}
      * @name sap.ui.webc.fiori.ProductSwitchItem.prototype.subtitleText
      * @defaultvalue ""
      * @since 1.0.0-rc.15
      * @public
      */
    var subtitleText: String = js.native
    
    /**
      * Defines a target where the <code>targetSrc</code> content must be open.
      * <br><br>
      * Available options are:
      * <ul>
      * <li><code>_self</code></li>
      * <li><code>_top</code></li>
      * <li><code>_blank</code></li>
      * <li><code>_parent</code></li>
      * <li><code>_search</code></li>
      * </ul>
      *
      * @type {string}
      * @name sap.ui.webc.fiori.ProductSwitchItem.prototype.target
      * @public
      */
    var target: String = js.native
    
    /**
      * Defines the component target URI. Supports standard hyperlink behavior.
      * @type {string}
      * @name sap.ui.webc.fiori.ProductSwitchItem.prototype.targetSrc
      * @defaultvalue ""
      * @public
      */
    var targetSrc: String = js.native
    
    /**
      * Defines the title of the component.
      * @type {string}
      * @name sap.ui.webc.fiori.ProductSwitchItem.prototype.titleText
      * @defaultvalue ""
      * @since 1.0.0-rc.15
      * @public
      */
    var titleText: String = js.native
  }
}
