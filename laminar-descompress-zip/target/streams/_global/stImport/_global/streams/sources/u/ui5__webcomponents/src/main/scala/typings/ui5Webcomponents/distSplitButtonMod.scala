package typings.ui5Webcomponents

import org.scalajs.dom.Event
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.Node
import typings.std.Record
import typings.ui5Webcomponents.anon.AriaHaspopup
import typings.ui5Webcomponents.anon.HandleEvent
import typings.ui5Webcomponents.distTypesButtonDesignMod.ButtonDesign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSplitButtonMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * <code>ui5-split-button</code> enables users to trigger actions. It is constructed of two separate actions -
    * default action and arrow action that can be activated by clicking or tapping, or by
    * pressing certain keyboard keys - <code>Space</code> or <code>Enter</code> for default action,
    * and <code>Arrow Down</code> or <code>Arrow Up</code> for arrow action.
    *
    * <h3>Usage</h3>
    *
    * <code>ui5-split-button</code> consists two separate buttons:
    * <ul>
    * <li>for the first one (default action) you can define some <code>text</code> or an <code>icon</code>, or both.
    * Also, it is possible to define different icon for active state of this button - <code>activeIcon</code>.</li>
    * <li>the second one (arrow action) contains only <code>slim-arrow-down</code> icon.</li>
    * </ul>
    * You can choose a <code>design</code> from a set of predefined types (the same as for ui5-button) that offer
    * different styling to correspond to the triggered action. Both text and arrow actions have the same design.
    * <br><br>
    * You can set the <code>ui5-split-button</code> as enabled or disabled. Both parts of an enabled
    * <code>ui5-split-button</code> can be pressed by clicking or tapping it, or by certain keys, which changes
    * the style to provide visual feedback to the user that it is pressed or hovered over with
    * the mouse cursor. A disabled <code>ui5-split-button</code> appears inactive and any of the two buttons
    * cannot be pressed.
    *
    * <h3>Keyboard Handling</h3>
    * <ul>
    * <li><code>Space</code> or <code>Enter</code> - triggers the default action</li>
    * <li><code>Shift</code> or <code>Escape</code> - if <code>Space</code> is pressed, releases the default action button without triggering the click event.</li>
    * <li><code>Arrow Down</code>, <code>Arrow Up</code>, <code>Alt</code>+<code>Arrow Down</code>, <code>Alt</code>+<code>Arrow Up</code>, or <code>F4</code> - triggers the arrow action
    * There are separate events that are fired on activating of <code>ui5-split-button</code> parts:
    * <ul>
    * <li><code>click</code> for the first button (default action)</li>
    * <li><code>arrow-click</code> for the second button (arrow action)</li>
    * </ul>
    * </ul>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/SplitButton.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.SplitButton
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-split-button
    * @public
    * @since 1.1.0
    */
  @JSImport("@ui5/webcomponents/dist/SplitButton", JSImport.Default)
  @js.native
  open class default () extends SplitButton
  object default {
    
    @JSImport("@ui5/webcomponents/dist/SplitButton", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/SplitButton", "default.i18nBundle")
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
    * <code>ui5-split-button</code> enables users to trigger actions. It is constructed of two separate actions -
    * default action and arrow action that can be activated by clicking or tapping, or by
    * pressing certain keyboard keys - <code>Space</code> or <code>Enter</code> for default action,
    * and <code>Arrow Down</code> or <code>Arrow Up</code> for arrow action.
    *
    * <h3>Usage</h3>
    *
    * <code>ui5-split-button</code> consists two separate buttons:
    * <ul>
    * <li>for the first one (default action) you can define some <code>text</code> or an <code>icon</code>, or both.
    * Also, it is possible to define different icon for active state of this button - <code>activeIcon</code>.</li>
    * <li>the second one (arrow action) contains only <code>slim-arrow-down</code> icon.</li>
    * </ul>
    * You can choose a <code>design</code> from a set of predefined types (the same as for ui5-button) that offer
    * different styling to correspond to the triggered action. Both text and arrow actions have the same design.
    * <br><br>
    * You can set the <code>ui5-split-button</code> as enabled or disabled. Both parts of an enabled
    * <code>ui5-split-button</code> can be pressed by clicking or tapping it, or by certain keys, which changes
    * the style to provide visual feedback to the user that it is pressed or hovered over with
    * the mouse cursor. A disabled <code>ui5-split-button</code> appears inactive and any of the two buttons
    * cannot be pressed.
    *
    * <h3>Keyboard Handling</h3>
    * <ul>
    * <li><code>Space</code> or <code>Enter</code> - triggers the default action</li>
    * <li><code>Shift</code> or <code>Escape</code> - if <code>Space</code> is pressed, releases the default action button without triggering the click event.</li>
    * <li><code>Arrow Down</code>, <code>Arrow Up</code>, <code>Alt</code>+<code>Arrow Down</code>, <code>Alt</code>+<code>Arrow Up</code>, or <code>F4</code> - triggers the arrow action
    * There are separate events that are fired on activating of <code>ui5-split-button</code> parts:
    * <ul>
    * <li><code>click</code> for the first button (default action)</li>
    * <li><code>arrow-click</code> for the second button (arrow action)</li>
    * </ul>
    * </ul>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/SplitButton.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.SplitButton
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-split-button
    * @public
    * @since 1.1.0
    */
  @js.native
  trait SplitButton
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    /**
      * Defines the active state of the arrow button
      * @type {boolean}
      * @defaultvalue false
      * @private
      */
    var _arrowButtonActive: Boolean = js.native
    
    def _fireArrowClick(): Unit = js.native
    def _fireArrowClick(e: Event): Unit = js.native
    
    def _fireClick(): Unit = js.native
    def _fireClick(e: Event): Unit = js.native
    
    def _onFocusIn(e: FocusEvent): Unit = js.native
    
    def _onFocusOut(e: FocusEvent): Unit = js.native
    
    def _onKeyDown(e: KeyboardEvent): Unit = js.native
    
    def _onKeyUp(e: KeyboardEvent): Unit = js.native
    
    def _setTabIndexValue(): Unit = js.native
    
    /**
      * Indicates if there is SHIFT or ESCAPE key pressed
      * @type {boolean}
      * @defaultvalue false
      * @private
      */
    var _shiftOrEscapePressed: Boolean = js.native
    
    /**
      * Indicates if there is Space key pressed
      * @type {boolean}
      * @defaultvalue false
      * @private
      */
    var _spacePressed: Boolean = js.native
    
    /**
      * Accessibility-related properties for inner elements of the Split Button
      *
      * @type {object}
      * @private
      */
    var _splitButtonAccInfo: Record[String, Boolean] = js.native
    
    /**
      * Defines the tabIndex of the component.
      * @type {string}
      * @defaultvalue ""
      * @private
      */
    var _tabIndex: String = js.native
    
    /**
      * Defines the active state of the text button
      * @type {boolean}
      * @defaultvalue false
      * @private
      */
    var _textButtonActive: Boolean = js.native
    
    /**
      * Defines the icon of the text button
      * @type {string}
      * @defaultvalue ""
      * @private
      */
    var _textButtonIcon: String = js.native
    
    var _textButtonPress: HandleEvent = js.native
    
    def _textButtonRelease(): Unit = js.native
    
    def accessibilityInfo: AriaHaspopup = js.native
    
    /**
      * Defines the accessible ARIA name of the component.
      *
      * @type {string}
      * @name sap.ui.webc.main.SplitButton.prototype.accessibleName
      * @defaultvalue: ""
      * @public
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    /**
      * Defines the icon to be displayed in active state as graphical element within the component.
      *
      * @type {string}
      * @name sap.ui.webc.main.SplitButton.prototype.activeIcon
      * @defaultvalue ""
      * @public
      */
    var activeIcon: String = js.native
    
    def ariaLabelText: String = js.native
    
    def arrowButton: js.UndefOr[typings.ui5Webcomponents.distButtonMod.default | Null] = js.native
    
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
      * @name sap.ui.webc.main.SplitButton.prototype.design
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
      * @name sap.ui.webc.main.SplitButton.prototype.disabled
      * @defaultvalue false
      * @public
      */
    var disabled: Boolean = js.native
    
    /**
      * Indicates if the elements is on focus
      * @type {boolean}
      * @defaultvalue false
      * @private
      */
    var focused: Boolean = js.native
    
    /**
      * Defines the icon to be displayed as graphical element within the component.
      * The SAP-icons font provides numerous options.
      * <br><br>
      * Example:
      *
      * See all the available icons in the <ui5-link target="_blank" href="https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html" class="api-table-content-cell-link">Icon Explorer</ui5-link>.
      *
      * @type {string}
      * @name sap.ui.webc.main.SplitButton.prototype.icon
      * @defaultvalue ""
      * @public
      */
    var icon: String = js.native
    
    /**
      * Defines the text of the component.
      * <br><br>
      * <b>Note:</b> Although this slot accepts HTML Elements, it is strongly recommended that you only use text in order to preserve the intended design.
      *
      * @type {Node[]}
      * @name sap.ui.webc.main.SplitButton.prototype.default
      * @slot
      * @public
      */
    var text: js.Array[Node] = js.native
    
    def textButton: js.UndefOr[typings.ui5Webcomponents.distButtonMod.default | Null] = js.native
    
    def textButtonAccText: String | Null = js.native
  }
}
