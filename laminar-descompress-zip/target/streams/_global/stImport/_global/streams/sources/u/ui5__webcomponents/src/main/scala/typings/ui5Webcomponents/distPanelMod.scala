package typings.ui5Webcomponents

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import typings.ui5Webcomponents.anon.AriaLabelledby
import typings.ui5Webcomponents.anon.Content
import typings.ui5Webcomponents.distTypesPanelAccessibleRoleMod.PanelAccessibleRole
import typings.ui5Webcomponents.distTypesTitleLevelMod.TitleLevel
import typings.ui5Webcomponents.ui5WebcomponentsBooleans.`true`
import typings.ui5Webcomponents.ui5WebcomponentsStrings.`-1`
import typings.ui5Webcomponents.ui5WebcomponentsStrings.`0`
import typings.ui5Webcomponents.ui5WebcomponentsStrings.heading
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPanelMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-panel</code> component is a container which has a header and a
    * content area and is used
    * for grouping and displaying information. It can be collapsed to save space on the screen.
    *
    * <h3>Guidelines:</h3>
    * <ul>
    * <li>Nesting two or more panels is not recommended.</li>
    * <li>Do not stack too many panels on one page.</li>
    * </ul>
    *
    * <h3>Structure</h3>
    * The panel's header area consists of a title bar with a header text or custom header.
    * <br>
    * The header is clickable and can be used to toggle between the expanded and collapsed state. It includes an icon which rotates depending on the state.
    * <br>
    * The custom header can be set through the <code>header</code> slot and it may contain arbitraray content, such as: title, buttons or any other HTML elements.
    * <br>
    * The content area can contain an arbitrary set of controls.
    * <br><b>Note:</b> The custom header is not clickable out of the box, but in this case the icon is interactive and allows to show/hide the content area.
    *
    * <h3>Responsive Behavior</h3>
    * <ul>
    * <li>If the width of the panel is set to 100% (default), the panel and its children are
    * resized responsively,
    * depending on its parent container.</li>
    * <li>If the panel has a fixed height, it will take up the space even if the panel is
    * collapsed.</li>
    * <li>When the panel is expandable (the <code>fixed</code> property is set to <code>false</code>),
    * an arrow icon (pointing to the right) appears in front of the header.</li>
    * <li>When the animation is activated, expand/collapse uses a smooth animation to open or
    * close the content area.</li>
    * <li>When the panel expands/collapses, the arrow icon rotates 90 degrees
    * clockwise/counter-clockwise.</li>
    * </ul>
    *
    * <h3>CSS Shadow Parts</h3>
    *
    * <ui5-link target="_blank" href="https://developer.mozilla.org/en-US/docs/Web/CSS/::part">CSS Shadow Parts</ui5-link> allow developers to style elements inside the Shadow DOM.
    * <br>
    * The <code>ui5-panel</code> exposes the following CSS Shadow Parts:
    * <ul>
    * <li>header - Used to style the wrapper of the header</li>
    * <li>content - Used to style the wrapper of the content</li>
    * </ul>
    *
    * <h3>Keyboard Handling</h3>
    *
    * <h4>Fast Navigation</h4>
    * This component provides a build in fast navigation group which can be used via <code>F6 / Shift + F6</code> or <code> Ctrl + Alt(Option) + Down /  Ctrl + Alt(Option) + Up</code>.
    * In order to use this functionality, you need to import the following module:
    * <code>import "@ui5/webcomponents-base/dist/features/F6Navigation.js"</code>
    * <br><br>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/Panel";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.Panel
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-panel
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/Panel", JSImport.Default)
  @js.native
  open class default () extends Panel
  object default {
    
    @JSImport("@ui5/webcomponents/dist/Panel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Defines the content of the component.
      * The content is visible only when the component is expanded.
      *
      * @type {Node[]}
      * @name sap.ui.webc.main.Panel.prototype.default
      * @slot
      * @public
      */
    /* static member */
    @JSImport("@ui5/webcomponents/dist/Panel", "default.i18nBundle")
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
    * The <code>ui5-panel</code> component is a container which has a header and a
    * content area and is used
    * for grouping and displaying information. It can be collapsed to save space on the screen.
    *
    * <h3>Guidelines:</h3>
    * <ul>
    * <li>Nesting two or more panels is not recommended.</li>
    * <li>Do not stack too many panels on one page.</li>
    * </ul>
    *
    * <h3>Structure</h3>
    * The panel's header area consists of a title bar with a header text or custom header.
    * <br>
    * The header is clickable and can be used to toggle between the expanded and collapsed state. It includes an icon which rotates depending on the state.
    * <br>
    * The custom header can be set through the <code>header</code> slot and it may contain arbitraray content, such as: title, buttons or any other HTML elements.
    * <br>
    * The content area can contain an arbitrary set of controls.
    * <br><b>Note:</b> The custom header is not clickable out of the box, but in this case the icon is interactive and allows to show/hide the content area.
    *
    * <h3>Responsive Behavior</h3>
    * <ul>
    * <li>If the width of the panel is set to 100% (default), the panel and its children are
    * resized responsively,
    * depending on its parent container.</li>
    * <li>If the panel has a fixed height, it will take up the space even if the panel is
    * collapsed.</li>
    * <li>When the panel is expandable (the <code>fixed</code> property is set to <code>false</code>),
    * an arrow icon (pointing to the right) appears in front of the header.</li>
    * <li>When the animation is activated, expand/collapse uses a smooth animation to open or
    * close the content area.</li>
    * <li>When the panel expands/collapses, the arrow icon rotates 90 degrees
    * clockwise/counter-clockwise.</li>
    * </ul>
    *
    * <h3>CSS Shadow Parts</h3>
    *
    * <ui5-link target="_blank" href="https://developer.mozilla.org/en-US/docs/Web/CSS/::part">CSS Shadow Parts</ui5-link> allow developers to style elements inside the Shadow DOM.
    * <br>
    * The <code>ui5-panel</code> exposes the following CSS Shadow Parts:
    * <ul>
    * <li>header - Used to style the wrapper of the header</li>
    * <li>content - Used to style the wrapper of the content</li>
    * </ul>
    *
    * <h3>Keyboard Handling</h3>
    *
    * <h4>Fast Navigation</h4>
    * This component provides a build in fast navigation group which can be used via <code>F6 / Shift + F6</code> or <code> Ctrl + Alt(Option) + Down /  Ctrl + Alt(Option) + Up</code>.
    * In order to use this functionality, you need to import the following module:
    * <code>import "@ui5/webcomponents-base/dist/features/F6Navigation.js"</code>
    * <br><br>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/Panel";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.Panel
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-panel
    * @public
    */
  @js.native
  trait Panel
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    var _animationRunning: Boolean = js.native
    
    var _contentExpanded: Boolean = js.native
    
    /**
      * @private
      */
    var _hasHeader: Boolean = js.native
    
    def _headerClick(e: MouseEvent): Unit = js.native
    
    def _headerKeyDown(e: KeyboardEvent): Unit = js.native
    
    def _headerKeyUp(e: KeyboardEvent): Unit = js.native
    
    def _headerOnTarget(target: HTMLElement): Boolean = js.native
    
    def _toggleButtonClick(e: MouseEvent): Unit = js.native
    
    def _toggleOpen(): Unit = js.native
    
    def accInfo: AriaLabelledby = js.native
    
    def accRole: String = js.native
    
    /**
      * Defines the accessible ARIA name of the component.
      *
      * @type {string}
      * @name sap.ui.webc.main.Panel.prototype.accessibleName
      * @defaultvalue ""
      * @public
      * @since 1.0.0-rc.15
      */
    var accessibleName: String = js.native
    
    /**
      * Sets the accessible ARIA role of the component.
      * Depending on the usage, you can change the role from the default <code>Form</code>
      * to <code>Region</code> or <code>Complementary</code>.
      *
      * @type {sap.ui.webc.main.types.PanelAccessibleRole}
      * @name sap.ui.webc.main.Panel.prototype.accessibleRole
      * @defaultvalue "Form"
      * @public
      */
    var accessibleRole: PanelAccessibleRole = js.native
    
    def ariaLabelledbyReference: js.UndefOr[String] = js.native
    
    /**
      * Indicates whether the component is collapsed and only the header is displayed.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.Panel.prototype.collapsed
      * @defaultvalue false
      * @public
      */
    var collapsed: Boolean = js.native
    
    def effectiveAccessibleName: js.UndefOr[String] = js.native
    
    def expanded: Boolean = js.native
    
    /**
      * Determines whether the component is in a fixed state that is not
      * expandable/collapsible by user interaction.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.Panel.prototype.fixed
      * @defaultvalue false
      * @public
      */
    var fixed: Boolean = js.native
    
    def fixedPanelAriaLabelledbyReference: js.UndefOr[String] = js.native
    
    def hasHeaderOrHeaderText: String | `true` = js.native
    
    /**
      * Defines the component header area.
      * <br><br>
      * <b>Note:</b> When a header is provided, the <code>headerText</code> property is ignored.
      *
      * @type {HTMLElement[]}
      * @name sap.ui.webc.main.Panel.prototype.header
      * @slot
      * @public
      */
    var header: js.Array[HTMLElement] = js.native
    
    def headerAriaLevel: String = js.native
    
    /**
      * Defines the "aria-level" of component heading,
      * set by the <code>headerText</code>.
      * <br><br>
      * Available options are: <code>"H6"</code> to <code>"H1"</code>.
      * @type {sap.ui.webc.main.types.TitleLevel}
      * @name sap.ui.webc.main.Panel.prototype.headerLevel
      * @defaultvalue "H2"
      * @public
      */
    var headerLevel: TitleLevel = js.native
    
    def headerTabIndex: `0` | `-1` = js.native
    
    /**
      * This property is used to set the header text of the component.
      * The text is visible in both expanded and collapsed states.
      * <br><br>
      * <b>Note:</b> This property is overridden by the <code>header</code> slot.
      *
      * @type {string}
      * @name sap.ui.webc.main.Panel.prototype.headerText
      * @defaultvalue ""
      * @public
      */
    var headerText: String = js.native
    
    def headingWrapperAriaLevel: js.UndefOr[String] = js.native
    
    def headingWrapperRole: js.UndefOr[heading] = js.native
    
    /**
      * Indicates whether the transition between the expanded and the collapsed state of the component is animated. By default the animation is enabled.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.Panel.prototype.noAnimation
      * @defaultvalue false
      * @public
      * @since 1.0.0-rc.16
      */
    var noAnimation: Boolean = js.native
    
    def nonFixedInternalHeader: Boolean = js.native
    
    def nonFocusableButton: Boolean = js.native
    
    def shouldNotAnimate(): Boolean = js.native
    
    def shouldToggle(element: HTMLElement): Boolean = js.native
    
    def styles: Content = js.native
    
    def toggleButtonTitle: String = js.native
    
    /**
      * When set to <code>true</code>, the <code>accessibleName</code> property will be
      * applied not only on the panel root itself, but on its toggle button too.
      * <b>Note:</b> This property only has effect if <code>accessibleName</code> is set and a header slot is provided.
      * @type {boolean}
      * @defaultvalue false
      * @private
      */
    var useAccessibleNameForToggleButton: Boolean = js.native
  }
}
