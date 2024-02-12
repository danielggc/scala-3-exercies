package typings.ui5Webcomponents

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import typings.ui5Webcomponents.anon.Error
import typings.ui5Webcomponents.distFeaturesInputElementsFormSupportMod.IFormElement
import typings.ui5Webcomponents.distTypesWrappingTypeMod.WrappingType
import typings.ui5Webcomponents.ui5WebcomponentsStrings.`true`
import typings.ui5Webcomponents.ui5WebcomponentsStrings.mixed
import typings.ui5WebcomponentsBase.distTypesValueStateMod.ValueState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCheckBoxMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * Allows the user to set a binary value, such as true/false or yes/no for an item.
    * <br><br>
    * The <code>ui5-checkbox</code> component consists of a box and a label that describes its purpose.
    * If it's checked, an indicator is displayed inside the box.
    * To check/uncheck the <code>ui5-checkbox</code>, the user has to click or tap the square
    * box or its label.
    * <br><br>
    * The <code>ui5-checkbox</code> component only has 2 states - checked and unchecked.
    * Clicking or tapping toggles the <code>ui5-checkbox</code> between checked and unchecked state.
    *
    * <h3>Usage</h3>
    *
    * You can define the checkbox text with via the <code>text</code> property. If the text exceeds the available width, it is truncated by default.
    * In case you prefer text to wrap, set the <code>wrappingType</code> property to "Normal".
    * The touchable area for toggling the <code>ui5-checkbox</code> ends where the text ends.
    * <br><br>
    * You can disable the <code>ui5-checkbox</code> by setting the <code>disabled</code> property to
    * <code>true</code>,
    * or use the <code>ui5-checkbox</code> in read-only mode by setting the <code>readonly</code>
    * property to <code>true</code>.
    *
    * <br><br>
    * <h3>Keyboard Handling</h3>
    *
    * The user can use the following keyboard shortcuts to toggle the checked state of the <code>ui5-checkbox</code>.
    * <ul>
    * <li>[SPACE, ENTER] - Toggles between different states: checked, not checked.</li>
    * </ul>
    * <br><br>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/CheckBox";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.CheckBox
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-checkbox
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/CheckBox", JSImport.Default)
  @js.native
  open class default () extends CheckBox
  object default {
    
    @JSImport("@ui5/webcomponents/dist/CheckBox", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/CheckBox", "default.i18nBundle")
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
    *
    * Allows the user to set a binary value, such as true/false or yes/no for an item.
    * <br><br>
    * The <code>ui5-checkbox</code> component consists of a box and a label that describes its purpose.
    * If it's checked, an indicator is displayed inside the box.
    * To check/uncheck the <code>ui5-checkbox</code>, the user has to click or tap the square
    * box or its label.
    * <br><br>
    * The <code>ui5-checkbox</code> component only has 2 states - checked and unchecked.
    * Clicking or tapping toggles the <code>ui5-checkbox</code> between checked and unchecked state.
    *
    * <h3>Usage</h3>
    *
    * You can define the checkbox text with via the <code>text</code> property. If the text exceeds the available width, it is truncated by default.
    * In case you prefer text to wrap, set the <code>wrappingType</code> property to "Normal".
    * The touchable area for toggling the <code>ui5-checkbox</code> ends where the text ends.
    * <br><br>
    * You can disable the <code>ui5-checkbox</code> by setting the <code>disabled</code> property to
    * <code>true</code>,
    * or use the <code>ui5-checkbox</code> in read-only mode by setting the <code>readonly</code>
    * property to <code>true</code>.
    *
    * <br><br>
    * <h3>Keyboard Handling</h3>
    *
    * The user can use the following keyboard shortcuts to toggle the checked state of the <code>ui5-checkbox</code>.
    * <ul>
    * <li>[SPACE, ENTER] - Toggles between different states: checked, not checked.</li>
    * </ul>
    * <br><br>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/CheckBox";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.CheckBox
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-checkbox
    * @public
    */
  @js.native
  trait CheckBox extends IFormElement {
    
    def _deactivate(): Unit = js.native
    
    def _enableFormSupport(): Unit = js.native
    
    def _onclick(): Unit = js.native
    
    def _onfocusout(): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeyup(e: KeyboardEvent): Unit = js.native
    
    def _onmousedown(): Unit = js.native
    
    def _onmouseup(): Unit = js.native
    
    /**
      * Defines the accessible ARIA name of the component.
      *
      * @type {string}
      * @public
      * @name sap.ui.webc.main.CheckBox.prototype.accessibleName
      * @defaultvalue ""
      * @since 1.1.0
      */
    var accessibleName: String = js.native
    
    /**
      * Receives id(or many ids) of the elements that label the component
      * @type {string}
      * @defaultvalue ""
      * @name sap.ui.webc.main.CheckBox.prototype.accessibleNameRef
      * @public
      * @since 1.1.0
      */
    var accessibleNameRef: String = js.native
    
    /**
      * Defines the active state (pressed or not) of the component.
      * @private
      */
    var active: Boolean = js.native
    
    def ariaDescribedBy: js.UndefOr[String] = js.native
    
    def ariaLabelText: js.UndefOr[String] = js.native
    
    def ariaLabelledBy: js.UndefOr[String] = js.native
    
    def ariaReadonly: js.UndefOr[`true`] = js.native
    
    def canToggle(): Boolean = js.native
    
    /**
      * Defines if the component is checked.
      * <br><br>
      * <b>Note:</b> The property can be changed with user interaction,
      * either by cliking/tapping on the component, or by
      * pressing the Enter or Space key.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.CheckBox.prototype.checked
      * @defaultvalue false
      * @formEvents change
      * @formProperty
      * @public
      */
    @JSName("checked")
    var checked_CheckBox: Boolean = js.native
    
    /**
      * Defines whether the component is disabled.
      * <br><br>
      * <b>Note:</b> A disabled component is completely noninteractive.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.CheckBox.prototype.disabled
      * @defaultvalue false
      * @public
      */
    @JSName("disabled")
    var disabled_CheckBox: Boolean = js.native
    
    def effectiveAriaChecked: Boolean | mixed = js.native
    
    def effectiveAriaDisabled: js.UndefOr[`true`] = js.native
    
    def effectiveTabIndex: js.UndefOr[String] = js.native
    
    /**
      * The slot is used to render native <code>input</code> HTML element within Light DOM to enable form submit,
      * when <code>name</code> property is set.
      * @type {HTMLElement[]}
      * @slot
      * @private
      */
    var formSupport: js.Array[HTMLElement] = js.native
    
    def hasValueState: Boolean = js.native
    
    /**
      * Defines whether the component is displayed as partially checked.
      * <br><br>
      * <b>Note:</b> The indeterminate state can be set only programmatically and can’t be achieved by user
      * interaction and the resulting visual state depends on the values of the <code>indeterminate</code>
      * and <code>checked</code> properties:
      * <ul>
      * <li> If the component is checked and indeterminate, it will be displayed as partially checked
      * <li> If the component is checked and it is not indeterminate, it will be displayed as checked
      * <li> If the component is not checked, it will be displayed as not checked regardless value of the indeterminate attribute
      * </ul>
      *
      * @type {boolean}
      * @name sap.ui.webc.main.CheckBox.prototype.indeterminate
      * @defaultvalue false
      * @public
      * @since 1.0.0-rc.15
      */
    var indeterminate: Boolean = js.native
    
    def isCompletelyChecked: Boolean = js.native
    
    /**
      * Determines the name with which the component will be submitted in an HTML form.
      *
      * <br><br>
      * <b>Important:</b> For the <code>name</code> property to have effect, you must add the following import to your project:
      * <code>import "@ui5/webcomponents/dist/features/InputElementsFormSupport.js";</code>
      *
      * <br><br>
      * <b>Note:</b> When set, a native <code>input</code> HTML element
      * will be created inside the component so that it can be submitted as
      * part of an HTML form. Do not use this property unless you need to submit a form.
      *
      * @type {string}
      * @name sap.ui.webc.main.CheckBox.prototype.name
      * @defaultvalue ""
      * @public
      */
    @JSName("name")
    var name_CheckBox: String = js.native
    
    /**
      * Defines whether the component is read-only.
      * <br><br>
      * <b>Note:</b> A red-only component is not editable,
      * but still provides visual feedback upon user interaction.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.CheckBox.prototype.readonly
      * @defaultvalue false
      * @public
      */
    var readonly: Boolean = js.native
    
    /**
      * Defines whether the component is required.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.CheckBox.prototype.required
      * @defaultvalue false
      * @public
      * @since 1.3.0
      */
    @JSName("required")
    var required_CheckBox: Boolean = js.native
    
    /**
      * Defines the text of the component.
      *
      * @type {string}
      * @name sap.ui.webc.main.CheckBox.prototype.text
      * @defaultvalue ""
      * @public
      */
    var text: String = js.native
    
    def toggle(): this.type = js.native
    
    /**
      * Defines the value state of the component.
      *
      * <br><br>
      * <b>Note:</b>
      *
      * <ul>
      * <li><code>Warning</code></li>
      * <li><code>Error</code></li>
      * <li><code>None</code>(default)</li>
      * <li><code>Success</code></li>
      * <li><code>Information</code></li>
      * </ul>
      *
      * @type {sap.ui.webc.base.types.ValueState}
      * @name sap.ui.webc.main.CheckBox.prototype.valueState
      * @defaultvalue "None"
      * @public
      */
    var valueState: ValueState = js.native
    
    def valueStateText: js.UndefOr[String] = js.native
    
    def valueStateTextMappings(): Error = js.native
    
    /**
      * Defines whether the component text wraps when there is not enough space.
      * <br><br>
      * Available options are:
      * <ul>
      * <li><code>None</code> - The text will be truncated with an ellipsis.</li>
      * <li><code>Normal</code> - The text will wrap. The words will not be broken based on hyphenation.</li>
      * </ul>
      *
      * @type {sap.ui.webc.main.types.WrappingType}
      * @name sap.ui.webc.main.CheckBox.prototype.wrappingType
      * @defaultvalue "None"
      * @public
      */
    var wrappingType: WrappingType = js.native
  }
}
