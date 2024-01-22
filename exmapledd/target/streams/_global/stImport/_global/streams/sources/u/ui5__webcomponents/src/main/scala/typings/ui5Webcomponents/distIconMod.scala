package typings.ui5Webcomponents

import org.scalajs.dom.FocusEvent
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import typings.ui5Webcomponents.distTypesIconDesignMod.IconDesign
import typings.ui5Webcomponents.ui5WebcomponentsBooleans.`false`
import typings.ui5Webcomponents.ui5WebcomponentsBooleans.`true`
import typings.ui5Webcomponents.ui5WebcomponentsStrings.`0`
import typings.ui5Webcomponents.ui5WebcomponentsStrings.ltr
import typings.ui5WebcomponentsBase.distI18nBundleMod.I18nText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIconMod {
  
  /**
    * @class
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-icon</code> component represents an SVG icon.
    * There are two main scenarios how the <code>ui5-icon</code> component is used:
    * as a purely decorative element, <br>
    * or as an interactive element that can be focused and clicked.
    *
    * <h3>Usage</h3>
    *
    * 1. <b>Get familiar with the icons collections.</b>
    * <br>
    * Before displaying an icon, you need to explore the icons collections to find and import the desired icon.
    * <br>
    * Currently there are 3 icons collection, available as 3 npm packages:
    * <br>
    *
    * <ul>
    * <li>
    * <ui5-link target="_blank" href="https://www.npmjs.com/package/@ui5/webcomponents-icons" class="api-table-content-cell-link">@ui5/webcomponents-icons</ui5-link> represents the "SAP-icons" collection and includes the following
    * <ui5-link target="_blank" href="https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html#/overview/SAP-icons" class="api-table-content-cell-link">icons</ui5-link>.
    * </li>
    * <li>
    * <ui5-link target="_blank" href="https://www.npmjs.com/package/@ui5/webcomponents-icons-tnt" class="api-table-content-cell-link">@ui5/webcomponents-icons-tnt</ui5-link> represents the "tnt" collection and includes the following
    * <ui5-link target="_blank" href="https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html#/overview/SAP-icons-TNT" class="api-table-content-cell-link">icons</ui5-link>.
    * </li>
    * <li>
    * <ui5-link target="_blank" href="https://www.npmjs.com/package/@ui5/webcomponents-icons-business-suite" class="api-table-content-cell-link">@ui5/webcomponents-icons-icons-business-suite</ui5-link> represents the "business-suite" collection and includes the following
    * <ui5-link target="_blank" href="https://ui5.sap.com/test-resources/sap/m/demokit/iconExplorer/webapp/index.html#/overview/BusinessSuiteInAppSymbols" class="api-table-content-cell-link">icons</ui5-link>.
    * </li>
    * </ul>
    *
    * 2. <b>After exploring the icons collections, add one or more of the packages as dependencies to your project.</b>
    * <br>
    * <code>npm i @ui5/webcomponents-icons</code><br>
    * <code>npm i @ui5/webcomponents-icons-tnt</code><br>
    * <code>npm i @ui5/webcomponents-icons-business-suite</code>
    * <br><br>
    *
    * 3. <b>Then, import the desired icon</b>.
    * <br>
    * <code>import "@ui5/{package_name}/dist/{icon_name}.js";</code>
    * <br><br>
    *
    * <b>For Example</b>:
    * <br>
    *
    * For the standard "SAP-icons" icon collection, import an icon from the <code>@ui5/webcomponents-icons</code> package:
    * <br>
    * <code>import "@ui5/webcomponents-icons/dist/employee.js";</code>
    * <br><br>
    *
    * For the "tnt" (SAP Fiori Tools) icon collection, import an icon from the <code>@ui5/webcomponents-icons-tnt</code> package:
    * <br>
    * <code>import "@ui5/webcomponents-icons-tnt/dist/antenna.js";</code>
    * <br><br>
    *
    * For the "business-suite" (SAP Business Suite) icon collection, import an icon from the <code>@ui5/webcomponents-icons-business-suite</code> package:
    * <br>
    * <code>import "@ui5/webcomponents-icons-business-suite/dist/ab-testing.js";</code>
    * <br><br>
    *
    * 4. <b>Display the icon using the <code>ui5-icon</code> web component.</b><br>
    * Set the icon collection ("SAP-icons", "tnt" or "business-suite" - "SAP-icons" is the default icon collection and can be skipped)<br>
    * and the icon name to the <code>name</code> property.
    * <br><br>
    *
    * <code>&lt;ui5-icon name="employee">&lt;/ui5-icon></code><br>
    * <code>&lt;ui5-icon name="tnt/antenna">&lt;/ui5-icon></code><br>
    * <code>&lt;ui5-icon name="business-suite/ab-testing">&lt;/ui5-icon></code>
    *
    * <h3>Keyboard Handling</h3>
    *
    * <ul>
    * <li>[SPACE, ENTER, RETURN] - Fires the <code>click</code> event if the <code>interactive</code> property is set to true.</li>
    * <li>[SHIFT] - If [SPACE] or [ENTER],[RETURN] is pressed, pressing [SHIFT] releases the ui5-icon without triggering the click event.</li>
    * </ul>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/Icon.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.Icon
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-icon
    * @implements sap.ui.webc.main.IIcon
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/Icon", JSImport.Default)
  @js.native
  open class default () extends Icon
  
  /**
    * @class
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-icon</code> component represents an SVG icon.
    * There are two main scenarios how the <code>ui5-icon</code> component is used:
    * as a purely decorative element, <br>
    * or as an interactive element that can be focused and clicked.
    *
    * <h3>Usage</h3>
    *
    * 1. <b>Get familiar with the icons collections.</b>
    * <br>
    * Before displaying an icon, you need to explore the icons collections to find and import the desired icon.
    * <br>
    * Currently there are 3 icons collection, available as 3 npm packages:
    * <br>
    *
    * <ul>
    * <li>
    * <ui5-link target="_blank" href="https://www.npmjs.com/package/@ui5/webcomponents-icons" class="api-table-content-cell-link">@ui5/webcomponents-icons</ui5-link> represents the "SAP-icons" collection and includes the following
    * <ui5-link target="_blank" href="https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html#/overview/SAP-icons" class="api-table-content-cell-link">icons</ui5-link>.
    * </li>
    * <li>
    * <ui5-link target="_blank" href="https://www.npmjs.com/package/@ui5/webcomponents-icons-tnt" class="api-table-content-cell-link">@ui5/webcomponents-icons-tnt</ui5-link> represents the "tnt" collection and includes the following
    * <ui5-link target="_blank" href="https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html#/overview/SAP-icons-TNT" class="api-table-content-cell-link">icons</ui5-link>.
    * </li>
    * <li>
    * <ui5-link target="_blank" href="https://www.npmjs.com/package/@ui5/webcomponents-icons-business-suite" class="api-table-content-cell-link">@ui5/webcomponents-icons-icons-business-suite</ui5-link> represents the "business-suite" collection and includes the following
    * <ui5-link target="_blank" href="https://ui5.sap.com/test-resources/sap/m/demokit/iconExplorer/webapp/index.html#/overview/BusinessSuiteInAppSymbols" class="api-table-content-cell-link">icons</ui5-link>.
    * </li>
    * </ul>
    *
    * 2. <b>After exploring the icons collections, add one or more of the packages as dependencies to your project.</b>
    * <br>
    * <code>npm i @ui5/webcomponents-icons</code><br>
    * <code>npm i @ui5/webcomponents-icons-tnt</code><br>
    * <code>npm i @ui5/webcomponents-icons-business-suite</code>
    * <br><br>
    *
    * 3. <b>Then, import the desired icon</b>.
    * <br>
    * <code>import "@ui5/{package_name}/dist/{icon_name}.js";</code>
    * <br><br>
    *
    * <b>For Example</b>:
    * <br>
    *
    * For the standard "SAP-icons" icon collection, import an icon from the <code>@ui5/webcomponents-icons</code> package:
    * <br>
    * <code>import "@ui5/webcomponents-icons/dist/employee.js";</code>
    * <br><br>
    *
    * For the "tnt" (SAP Fiori Tools) icon collection, import an icon from the <code>@ui5/webcomponents-icons-tnt</code> package:
    * <br>
    * <code>import "@ui5/webcomponents-icons-tnt/dist/antenna.js";</code>
    * <br><br>
    *
    * For the "business-suite" (SAP Business Suite) icon collection, import an icon from the <code>@ui5/webcomponents-icons-business-suite</code> package:
    * <br>
    * <code>import "@ui5/webcomponents-icons-business-suite/dist/ab-testing.js";</code>
    * <br><br>
    *
    * 4. <b>Display the icon using the <code>ui5-icon</code> web component.</b><br>
    * Set the icon collection ("SAP-icons", "tnt" or "business-suite" - "SAP-icons" is the default icon collection and can be skipped)<br>
    * and the icon name to the <code>name</code> property.
    * <br><br>
    *
    * <code>&lt;ui5-icon name="employee">&lt;/ui5-icon></code><br>
    * <code>&lt;ui5-icon name="tnt/antenna">&lt;/ui5-icon></code><br>
    * <code>&lt;ui5-icon name="business-suite/ab-testing">&lt;/ui5-icon></code>
    *
    * <h3>Keyboard Handling</h3>
    *
    * <ul>
    * <li>[SPACE, ENTER, RETURN] - Fires the <code>click</code> event if the <code>interactive</code> property is set to true.</li>
    * <li>[SHIFT] - If [SPACE] or [ENTER],[RETURN] is pressed, pressing [SHIFT] releases the ui5-icon without triggering the click event.</li>
    * </ul>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/Icon.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.Icon
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-icon
    * @implements sap.ui.webc.main.IIcon
    * @public
    */
  @js.native
  trait Icon
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    /**
      * Enforce "ltr" direction, based on the icons collection metadata.
      */
    def _dir: js.UndefOr[ltr] = js.native
    
    def _onClickHandler(e: MouseEvent): Unit = js.native
    
    def _onFocusInHandler(): Unit = js.native
    
    def _onFocusOutHandler(): Unit = js.native
    
    var _onclick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
    
    var _onfocusin: js.UndefOr[js.Function1[/* event */ FocusEvent, Unit]] = js.native
    
    var _onfocusout: js.UndefOr[js.Function1[/* event */ FocusEvent, Unit]] = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeyup(e: KeyboardEvent): Unit = js.native
    
    def _tabIndex: js.UndefOr[`0`] = js.native
    
    /**
      * @private
      */
    var accData: I18nText = js.native
    
    /**
      * Defines the text alternative of the component.
      * If not provided a default text alternative will be set, if present.
      * <br><br>
      * <b>Note:</b> Every icon should have a text alternative in order to
      * calculate its accessible name.
      *
      * @name sap.ui.webc.main.Icon.prototype.accessibleName
      * @type {string}
      * @defaultvalue ""
      * @public
      */
    var accessibleName: String = js.native
    
    /**
      * Defines the accessibility role of the component.
      * @name sap.ui.webc.main.Icon.prototype.accessibleRole
      * @type {string}
      * @defaultvalue ""
      * @public
      * @since 1.1.0
      */
    var accessibleRole: String = js.native
    
    /**
      * Defines the ARIA hidden state of the component.
      * Note: If the role is presentation the default value of aria-hidden will be true.
      * @private
      * @since 1.0.0-rc.15
      */
    @JSName("ariaHidden")
    var ariaHidden_Icon: String = js.native
    
    var customSvg: js.UndefOr[js.Object] = js.native
    
    /**
      * Defines the component semantic design.
      *
      * <br><br>
      * <b>The available values are:</b>
      *
      * <ul>
      * <li><code>Contrast</code></li>
      * <li><code>Critical</code></li>
      * <li><code>Default</code></li>
      * <li><code>Information</code></li>
      * <li><code>Negative</code></li>
      * <li><code>Neutral</code></li>
      * <li><code>NonInteractive</code></li>
      * <li><code>Positive</code></li>
      * </ul>
      *
      * @type {sap.ui.webc.main.types.IconDesign}
      * @name sap.ui.webc.main.Icon.prototype.design
      * @defaultvalue "Default"
      * @public
      * @since 1.9.2
      */
    var design: IconDesign = js.native
    
    /**
      * @private
      */
    var effectiveAccessibleName: js.UndefOr[String] = js.native
    
    def effectiveAccessibleRole: String = js.native
    
    def effectiveAriaHidden: js.UndefOr[String | `true`] = js.native
    
    /**
      * @private
      */
    var focused: Boolean = js.native
    
    def hasIconTooltip: js.UndefOr[String | `false`] = js.native
    
    /**
      * Defines if the icon is interactive (focusable and pressable)
      * @name sap.ui.webc.main.Icon.prototype.interactive
      * @type {boolean}
      * @defaultvalue false
      * @public
      * @since 1.0.0-rc.8
      */
    var interactive: Boolean = js.native
    
    /**
      * @private
      */
    var invalid: Boolean = js.native
    
    def isDecorative: Boolean = js.native
    
    var ltr: js.UndefOr[Boolean] = js.native
    
    /**
      * Defines the unique identifier (icon name) of the component.
      * <br>
      *
      * To browse all available icons, see the
      * <ui5-link target="_blank" href="https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html" class="api-table-content-cell-link">SAP Icons</ui5-link>,
      * <ui5-link target="_blank" href="https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html#/overview/SAP-icons-TNT" class="api-table-content-cell-link">SAP Fiori Tools</ui5-link> and
      * <ui5-link target="_blank" href="https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html" class="api-table-content-cell-link">SAP Business Suite</ui5-link> collections.
      * <br>
      *
      * Example:
      * <br>
      * <code>name='add'</code>, <code>name='delete'</code>, <code>name='employee'</code>.
      * <br><br>
      *
      * <b>Note:</b> To use the SAP Fiori Tools icons,
      * you need to set the <code>tnt</code> prefix in front of the icon's name.
      * <br>
      *
      * Example:
      * <br>
      * <code>name='tnt/antenna'</code>, <code>name='tnt/actor'</code>, <code>name='tnt/api'</code>.
      * <br><br>
      *
      * <b>Note:</b> To use the SAP Business Suite icons,
      * you need to set the <code>business-suite</code> prefix in front of the icon's name.
      * <br>
      *
      * Example:
      * <br>
      * <code>name='business-suite/3d'</code>, <code>name='business-suite/1x2-grid-layout'</code>, <code>name='business-suite/4x4-grid-layout'</code>.
      * @name sap.ui.webc.main.Icon.prototype.name
      * @type {string}
      * @defaultvalue ""
      * @public
      */
    var name: String = js.native
    
    var packageName: js.UndefOr[String] = js.native
    
    /**
      * @private
      */
    var pathData: js.Array[String] = js.native
    
    /**
      * Defines whether the component should have a tooltip.
      * <br><br>
      * <b>Note:</b> The tooltip text should be provided via the <code>accessible-name</code> property.
      *
      * @name sap.ui.webc.main.Icon.prototype.showTooltip
      * @type {boolean}
      * @defaultvalue false
      * @public
      */
    var showTooltip: Boolean = js.native
    
    var viewBox: js.UndefOr[String] = js.native
  }
}
