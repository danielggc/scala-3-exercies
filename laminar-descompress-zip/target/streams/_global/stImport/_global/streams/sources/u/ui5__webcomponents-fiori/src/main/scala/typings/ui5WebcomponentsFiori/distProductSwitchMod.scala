package typings.ui5WebcomponentsFiori

import org.scalajs.dom.FocusEvent
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distProductSwitchMod {
  
  /**
    * @class
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-product-switch</code> is an SAP Fiori specific web component that is used in <code>ui5-shellbar</code>
    * and allows the user to easily switch between products.
    * <br><br>
    *
    * <h3>Keyboard Handling</h3>
    * The <code>ui5-product-switch</code> provides advanced keyboard handling.
    * When focused, the user can use the following keyboard
    * shortcuts in order to perform a navigation:
    * <br>
    * <ul>
    * <li>[TAB] - Move focus to the next interactive element after the <code>ui5-product-switch</code></li>
    * <li>[UP/DOWN] - Navigates up and down the items </li>
    * <li>[LEFT/RIGHT] - Navigates left and right the items</li>
    * </ul>
    * <br>
    * <br>
    *
    * <h3>ES6 Module Import</h3>
    * <code>import "@ui5/webcomponents-fiori/dist/ProductSwitch.js";</code>
    * <br>
    * <code>import "@ui5/webcomponents-fiori/dist/ProductSwitchItem.js";</code> (for <code>ui5-product-switch-item</code>)
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.fiori.ProductSwitch
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-product-switch
    * @appenddocs ProductSwitchItem
    * @public
    * @since 1.0.0-rc.5
    */
  @JSImport("@ui5/webcomponents-fiori/dist/ProductSwitch", JSImport.Default)
  @js.native
  open class default () extends ProductSwitch
  object default {
    
    @JSImport("@ui5/webcomponents-fiori/dist/ProductSwitch", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents-fiori/dist/ProductSwitch", "default.i18nBundle")
    @js.native
    def i18nBundle: typings.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: typings.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def onDefine(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("onDefine")().asInstanceOf[js.Promise[Unit]]
  }
  
  /**
    * @class
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-product-switch</code> is an SAP Fiori specific web component that is used in <code>ui5-shellbar</code>
    * and allows the user to easily switch between products.
    * <br><br>
    *
    * <h3>Keyboard Handling</h3>
    * The <code>ui5-product-switch</code> provides advanced keyboard handling.
    * When focused, the user can use the following keyboard
    * shortcuts in order to perform a navigation:
    * <br>
    * <ul>
    * <li>[TAB] - Move focus to the next interactive element after the <code>ui5-product-switch</code></li>
    * <li>[UP/DOWN] - Navigates up and down the items </li>
    * <li>[LEFT/RIGHT] - Navigates left and right the items</li>
    * </ul>
    * <br>
    * <br>
    *
    * <h3>ES6 Module Import</h3>
    * <code>import "@ui5/webcomponents-fiori/dist/ProductSwitch.js";</code>
    * <br>
    * <code>import "@ui5/webcomponents-fiori/dist/ProductSwitchItem.js";</code> (for <code>ui5-product-switch-item</code>)
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.fiori.ProductSwitch
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-product-switch
    * @appenddocs ProductSwitchItem
    * @public
    * @since 1.0.0-rc.5
    */
  @js.native
  trait ProductSwitch
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _ariaLabelText: String = js.native
    
    var _currentIndex: Double = js.native
    
    def _handleDown(e: KeyboardEvent): Unit = js.native
    
    def _handleResize(): Unit = js.native
    
    def _handleResizeBound(): Unit = js.native
    
    def _handleUp(e: KeyboardEvent): Unit = js.native
    
    var _itemNavigation: typings.ui5WebcomponentsBase.distDelegateItemNavigationMod.default = js.native
    
    def _onfocusin(e: FocusEvent): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    var _rowSize: Double = js.native
    
    def _setRowSize(size: Double): Unit = js.native
    
    /**
      * Indicates how many columns are displayed.
      * @private
      */
    var desktopColumns: js.UndefOr[Double] = js.native
    
    def handleProductSwitchItemClick(e: MouseEvent): Unit = js.native
    
    /**
      * Defines the items of the <code>ui5-product-switch</code>.
      *
      * @type {sap.ui.webc.fiori.IProductSwitchItem[]}
      * @name sap.ui.webc.fiori.ProductSwitch.prototype.default
      * @slot items
      * @public
      */
    var items: js.Array[typings.ui5WebcomponentsFiori.distProductSwitchItemMod.default] = js.native
  }
}
