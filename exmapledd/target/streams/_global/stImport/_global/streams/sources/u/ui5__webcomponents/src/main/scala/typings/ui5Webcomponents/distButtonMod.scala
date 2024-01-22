package typings.ui5Webcomponents

import org.scalajs.dom.EventListenerOptions
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.Node
import typings.std.AddEventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.Record
import typings.ui5Webcomponents.distColorPaletteMod.ColorPaletteNavigationItem
import typings.ui5Webcomponents.distFeaturesInputElementsFormSupportMod.IFormElement
import typings.ui5Webcomponents.distTypesButtonDesignMod.ButtonDesign
import typings.ui5Webcomponents.ui5WebcomponentsStrings._empty
import typings.ui5Webcomponents.ui5WebcomponentsStrings.img
import typings.ui5Webcomponents.ui5WebcomponentsStrings.presentation
import typings.ui5WebcomponentsBase.distI18nBundleMod.I18nText
import typings.ui5WebcomponentsBase.distTypesMod.PassiveEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distButtonMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-button</code> component represents a simple push button.
    * It enables users to trigger actions by clicking or tapping the <code>ui5-button</code>, or by pressing
    * certain keyboard keys, such as Enter.
    *
    *
    * <h3>Usage</h3>
    *
    * For the <code>ui5-button</code> UI, you can define text, icon, or both. You can also specify
    * whether the text or the icon is displayed first.
    * <br><br>
    * You can choose from a set of predefined types that offer different
    * styling to correspond to the triggered action.
    * <br><br>
    * You can set the <code>ui5-button</code> as enabled or disabled. An enabled
    * <code>ui5-button</code> can be pressed by clicking or tapping it. The button changes
    * its style to provide visual feedback to the user that it is pressed or hovered over with
    * the mouse cursor. A disabled <code>ui5-button</code> appears inactive and cannot be pressed.
    *
    * <h3>CSS Shadow Parts</h3>
    *
    * <ui5-link target="_blank" href="https://developer.mozilla.org/en-US/docs/Web/CSS/::part">CSS Shadow Parts</ui5-link> allow developers to style elements inside the Shadow DOM.
    * <br>
    * The <code>ui5-button</code> exposes the following CSS Shadow Parts:
    * <ul>
    * <li>button - Used to style the native button element</li>
    * </ul>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/Button";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.Button
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-button
    * @implements sap.ui.webc.main.IButton
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/Button", JSImport.Default)
  @js.native
  open class default ()
    extends Button
       with ColorPaletteNavigationItem {
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  }
  object default {
    
    @JSImport("@ui5/webcomponents/dist/Button", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/Button", "default.i18nBundle")
    @js.native
    def i18nBundle: typings.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: typings.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def onDefine(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("onDefine")().asInstanceOf[js.Promise[Unit]]
    
    /* static member */
    inline def typeTextMappings(): Record[String, I18nText] = ^.asInstanceOf[js.Dynamic].applyDynamic("typeTextMappings")().asInstanceOf[Record[String, I18nText]]
  }
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-button</code> component represents a simple push button.
    * It enables users to trigger actions by clicking or tapping the <code>ui5-button</code>, or by pressing
    * certain keyboard keys, such as Enter.
    *
    *
    * <h3>Usage</h3>
    *
    * For the <code>ui5-button</code> UI, you can define text, icon, or both. You can also specify
    * whether the text or the icon is displayed first.
    * <br><br>
    * You can choose from a set of predefined types that offer different
    * styling to correspond to the triggered action.
    * <br><br>
    * You can set the <code>ui5-button</code> as enabled or disabled. An enabled
    * <code>ui5-button</code> can be pressed by clicking or tapping it. The button changes
    * its style to provide visual feedback to the user that it is pressed or hovered over with
    * the mouse cursor. A disabled <code>ui5-button</code> appears inactive and cannot be pressed.
    *
    * <h3>CSS Shadow Parts</h3>
    *
    * <ui5-link target="_blank" href="https://developer.mozilla.org/en-US/docs/Web/CSS/::part">CSS Shadow Parts</ui5-link> allow developers to style elements inside the Shadow DOM.
    * <br>
    * The <code>ui5-button</code> exposes the following CSS Shadow Parts:
    * <ul>
    * <li>button - Used to style the native button element</li>
    * </ul>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/Button";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.Button
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-button
    * @implements sap.ui.webc.main.IButton
    * @public
    */
  @js.native
  trait Button extends IFormElement {
    
    def _deactivate(): Unit = js.native
    
    var _iconSettings: js.Object = js.native
    
    /**
      * @since 1.0.0-rc.13
      * @private
      */
    var _isTouch: Boolean = js.native
    
    def _onclick(e: MouseEvent): Unit = js.native
    
    def _onfocusin(e: FocusEvent): Unit = js.native
    
    def _onfocusout(): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeyup(e: KeyboardEvent): Unit = js.native
    
    def _onmousedown(e: MouseEvent): Unit = js.native
    
    def _onmouseup(e: MouseEvent): Unit = js.native
    
    def _ontouchend(): Unit = js.native
    
    var _ontouchstart: PassiveEventListenerObject = js.native
    
    /**
      * Defines the tabIndex of the component.
      * @private
      */
    var _tabIndex: String = js.native
    
    /**
      * An object of strings that defines several additional accessibility attribute values
      * for customization depending on the use case.
      *
      * It supports the following fields:
      *
      * <ul>
      * 		<li><code>expanded</code>: Indicates whether the button, or another grouping element it controls, is currently expanded or collapsed. Accepts the following string values:
      *			<ul>
      *				<li><code>true</code></li>
      *				<li><code>false</code></li>
      *			</ul>
      * 		</li>
      * 		<li><code>hasPopup</code>: Indicates the availability and type of interactive popup element, such as menu or dialog, that can be triggered by the button. Accepts the following string values:
      * 			<ul>
      *				<li><code>Dialog</code></li>
      *				<li><code>Grid</code></li>
      *				<li><code>ListBox</code></li>
      *				<li><code>Menu</code></li>
      *				<li><code>Tree</code></li>
      * 			</ul>
      * 		</li>
      * 		<li><code>controls</code>: Identifies the element (or elements) whose contents or presence are controlled by the button element. Accepts a string value.</li>
      * </ul>
      * @type {object}
      * @name sap.ui.webc.main.Button.prototype.accessibilityAttributes
      * @public
      * @since 1.2.0
      */
    var accessibilityAttributes: js.Object = js.native
    
    /**
      * Defines the accessible ARIA name of the component.
      *
      * @type {string}
      * @name sap.ui.webc.main.Button.prototype.accessibleName
      * @defaultvalue undefined
      * @public
      * @since 1.0.0-rc.15
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    /**
      * Receives id(or many ids) of the elements that label the component.
      *
      * @type {string}
      * @name sap.ui.webc.main.Button.prototype.accessibleNameRef
      * @defaultvalue ""
      * @public
      * @since 1.1.0
      */
    var accessibleNameRef: String = js.native
    
    /**
      * Used to switch the active state (pressed or not) of the component.
      * @private
      */
    var active: Boolean = js.native
    
    def ariaLabelText: js.UndefOr[String] = js.native
    
    def buttonTypeText: String = js.native
    
    /**
      * Defines the component design.
      *
      * <br><br>
      * <b>The available values are:</b>
      *
      * <ul>
      * <li><code>Default</code></li>
      * <li><code>Emphasized</code></li>
      * <li><code>Positive</code></li>
      * <li><code>Negative</code></li>
      * <li><code>Transparent</code></li>
      * <li><code>Attention</code></li>
      * </ul>
      *
      * @type {sap.ui.webc.main.types.ButtonDesign}
      * @name sap.ui.webc.main.Button.prototype.design
      * @defaultvalue "Default"
      * @public
      */
    var design: ButtonDesign = js.native
    
    /**
      * Defines whether the component is disabled.
      * A disabled component can't be pressed or
      * focused, and it is not in the tab chain.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.Button.prototype.disabled
      * @defaultvalue false
      * @public
      */
    @JSName("disabled")
    var disabled_Button: Boolean = js.native
    
    /**
      * Indicates if the elements is on focus
      * @private
      */
    var focused: Boolean = js.native
    
    def hasButtonType: Boolean = js.native
    
    /**
      * Indicates if the elements has a slotted icon
      * @private
      */
    var hasIcon: Boolean = js.native
    
    /**
      * Defines the icon, displayed as graphical element within the component.
      * The SAP-icons font provides numerous options.
      * <br><br>
      * Example:
      *
      * See all the available icons within the <ui5-link target="_blank" href="https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html" class="api-table-content-cell-link">Icon Explorer</ui5-link>.
      *
      * @type {string}
      * @name sap.ui.webc.main.Button.prototype.icon
      * @defaultvalue ""
      * @public
      */
    var icon: String = js.native
    
    /**
      * Defines whether the icon should be displayed after the component text.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.Button.prototype.iconEnd
      * @defaultvalue false
      * @public
      */
    var iconEnd: Boolean = js.native
    
    /**
      * Defines if a content has been added to the default slot
      * @private
      */
    var iconOnly: Boolean = js.native
    
    def iconRole: presentation | img | _empty = js.native
    
    def isIconOnly: Boolean = js.native
    
    /**
      * Indicates if the element if focusable
      * @private
      */
    var nonInteractive: Boolean = js.native
    
    def showIconTooltip: Boolean = js.native
    
    /**
      * When set to <code>true</code>, the component will
      * automatically submit the nearest HTML form element on <code>press</code>.
      * <br><br>
      * <b>Note:</b> For the <code>submits</code> property to have effect, you must add the following import to your project:
      * <code>import "@ui5/webcomponents/dist/features/InputElementsFormSupport.js";</code>
      *
      * @type {boolean}
      * @name sap.ui.webc.main.Button.prototype.submits
      * @defaultvalue false
      * @public
      */
    var submits: Boolean = js.native
    
    def tabIndexValue: String = js.native
    
    /**
      * Defines the text of the component.
      * <br><br>
      * <b>Note:</b> Although this slot accepts HTML Elements, it is strongly recommended that you only use text in order to preserve the intended design.
      *
      * @type {Node[]}
      * @name sap.ui.webc.main.Button.prototype.default
      * @slot
      * @public
      */
    var text: js.Array[Node] = js.native
    
    /**
      * Defines the tooltip of the component.
      * <br>
      * <b>Note:</b> A tooltip attribute should be provided for icon-only buttons, in order to represent their exact meaning/function.
      * @type {string}
      * @name sap.ui.webc.main.Button.prototype.tooltip
      * @defaultvalue ""
      * @public
      * @since 1.2.0
      */
    var tooltip: String = js.native
  }
}
