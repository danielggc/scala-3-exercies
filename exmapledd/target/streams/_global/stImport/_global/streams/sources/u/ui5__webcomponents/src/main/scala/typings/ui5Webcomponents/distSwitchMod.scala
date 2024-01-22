package typings.ui5Webcomponents

import org.scalajs.dom.KeyboardEvent
import typings.ui5Webcomponents.distTypesSwitchDesignMod.SwitchDesign
import typings.ui5Webcomponents.ui5WebcomponentsStrings.`0`
import typings.ui5Webcomponents.ui5WebcomponentsStrings.`true`
import typings.ui5Webcomponents.ui5WebcomponentsStrings.accept
import typings.ui5Webcomponents.ui5WebcomponentsStrings.less
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSwitchMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    * The <code>ui5-switch</code> component is used for changing between binary states.
    * <br>
    * The component can display texts, that will be switched, based on the component state, via the <code>textOn</code> and <code>textOff</code> properties,
    * but texts longer than 3 letters will be cutted off.
    * <br>
    * However, users are able to customize the width of <code>ui5-switch</code> with pure CSS (<code>&lt;ui5-switch style="width: 200px"></code>), and set widths, depending on the texts they would use.
    * <br>
    * Note: the component would not automatically stretch to fit the whole text width.
    *
    * <h3>Keyboard Handling</h3>
    * The state can be changed by pressing the Space and Enter keys.
    *
    * <h3>CSS Shadow Parts</h3>
    *
    * <ui5-link target="_blank" href="https://developer.mozilla.org/en-US/docs/Web/CSS/::part">CSS Shadow Parts</ui5-link> allow developers to style elements inside the Shadow DOM.
    * <br>
    * The <code>ui5-switch</code> exposes the following CSS Shadow Parts:
    * <ul>
    * <li>slider - Used to style the track, where the handle is being slid</li>
    * <li>text-on - Used to style the <code>textOn</code> property text</li>
    * <li>text-off - Used to style the <code>textOff</code> property text</li>
    * <li>handle - Used to style the handle of the switch</li>
    * </ul>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/Switch";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.Switch
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-switch
    * @public
    * @since 0.8.0
    */
  @JSImport("@ui5/webcomponents/dist/Switch", JSImport.Default)
  @js.native
  open class default () extends Switch
  object default {
    
    @JSImport("@ui5/webcomponents/dist/Switch", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/Switch", "default.i18nBundle")
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
    * The <code>ui5-switch</code> component is used for changing between binary states.
    * <br>
    * The component can display texts, that will be switched, based on the component state, via the <code>textOn</code> and <code>textOff</code> properties,
    * but texts longer than 3 letters will be cutted off.
    * <br>
    * However, users are able to customize the width of <code>ui5-switch</code> with pure CSS (<code>&lt;ui5-switch style="width: 200px"></code>), and set widths, depending on the texts they would use.
    * <br>
    * Note: the component would not automatically stretch to fit the whole text width.
    *
    * <h3>Keyboard Handling</h3>
    * The state can be changed by pressing the Space and Enter keys.
    *
    * <h3>CSS Shadow Parts</h3>
    *
    * <ui5-link target="_blank" href="https://developer.mozilla.org/en-US/docs/Web/CSS/::part">CSS Shadow Parts</ui5-link> allow developers to style elements inside the Shadow DOM.
    * <br>
    * The <code>ui5-switch</code> exposes the following CSS Shadow Parts:
    * <ul>
    * <li>slider - Used to style the track, where the handle is being slid</li>
    * <li>text-on - Used to style the <code>textOn</code> property text</li>
    * <li>text-off - Used to style the <code>textOff</code> property text</li>
    * <li>handle - Used to style the handle of the switch</li>
    * </ul>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/Switch";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.Switch
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-switch
    * @public
    * @since 0.8.0
    */
  @js.native
  trait Switch
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _onclick(): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeyup(e: KeyboardEvent): Unit = js.native
    
    def _textOff: String = js.native
    
    def _textOn: String = js.native
    
    def accessibilityOffText: String = js.native
    
    def accessibilityOnText: String = js.native
    
    /**
      * Sets the accessible ARIA name of the component.
      *
      * <b>Note</b>: We recommend that you set an accessibleNameRef pointing to an external label or at least an <code>accessibleName</code>.
      * Providing an <code>accessibleNameRef</code> or an <code>accessibleName</code> is mandatory in the cases when <code>textOn</code> and <code>textOff</code> properties aren't set.
      * @type {string}
      * @name sap.ui.webc.main.Switch.prototype.accessibleName
      * @defaultvalue: ""
      * @public
      * @since 1.2.0
      */
    var accessibleName: String = js.native
    
    /**
      * Receives id(or many ids) of the elements that label the component.
      *
      * <b>Note</b>: We recommend that you set an accessibleNameRef pointing to an external label or at least an <code>accessibleName</code>.
      * Providing an <code>accessibleNameRef</code> or an <code>accessibleName</code> is mandatory in the cases when <code>textOn</code> and <code>textOff</code> properties aren't set.
      * @type {string}
      * @name sap.ui.webc.main.Switch.prototype.accessibleNameRef
      * @defaultvalue ""
      * @public
      * @since 1.1.0
      */
    var accessibleNameRef: String = js.native
    
    def ariaLabelText: String = js.native
    
    /**
      * Defines if the component is checked.
      * <br><br>
      * <b>Note:</b> The property can be changed with user interaction,
      * either by cliking the component, or by pressing the <code>Enter</code> or <code>Space</code> key.
      * @type {boolean}
      * @name sap.ui.webc.main.Switch.prototype.checked
      * @defaultvalue false
      * @formEvents change
      * @formProperty
      * @public
      */
    var checked: Boolean = js.native
    
    /**
      * Defines the component design.
      * <br><br>
      * <b>Note:</b> If <code>Graphical</code> type is set,
      * positive and negative icons will replace the <code>textOn</code> and <code>textOff</code>.
      *
      * @public
      * @type {sap.ui.webc.main.types.SwitchDesign}
      * @name sap.ui.webc.main.Switch.prototype.design
      * @defaultValue "Textual"
      */
    var design: SwitchDesign = js.native
    
    /**
      * Defines whether the component is disabled.
      * <br><br>
      * <b>Note:</b> A disabled component is noninteractive.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.Switch.prototype.disabled
      * @defaultvalue false
      * @public
      */
    var disabled: Boolean = js.native
    
    def effectiveAriaDisabled: js.UndefOr[`true`] = js.native
    
    def effectiveTabIndex: js.UndefOr[`0`] = js.native
    
    def graphical: Boolean = js.native
    
    def hasNoLabel: Boolean = js.native
    
    def hiddenText: String = js.native
    
    def sapNextIcon: less | accept = js.native
    
    /**
      * Defines the text, displayed when the component is not checked.
      * <br><br>
      * <b>Note:</b> We recommend using short texts, up to 3 letters (larger texts would be cut off).
      * <b>Note:</b> This property will have no effect if the theme is set to <code>sap_horizon</code>.
      * @type {string}
      * @name sap.ui.webc.main.Switch.prototype.textOff
      * @defaultvalue ""
      * @public
      */
    var textOff: String = js.native
    
    /**
      * Defines the text, displayed when the component is checked.
      *
      * <br><br>
      * <b>Note:</b> We recommend using short texts, up to 3 letters (larger texts would be cut off).
      * <b>Note:</b> This property will have no effect if the theme is set to <code>sap_horizon</code>.
      * @type {string}
      * @name sap.ui.webc.main.Switch.prototype.textOn
      * @defaultvalue ""
      * @public
      */
    var textOn: String = js.native
    
    def toggle(): Unit = js.native
    
    /**
      * Defines the tooltip of the component.
      * <br>
      * <b>Note:</b> If applicable an external label reference should always be the preferred option to provide context to the <code>ui5-switch</code> component over a tooltip.
      * @type {string}
      * @name sap.ui.webc.main.Switch.prototype.tooltip
      * @defaultvalue: ""
      * @public
      * @since 1.9.0
      */
    var tooltip: String = js.native
  }
}
