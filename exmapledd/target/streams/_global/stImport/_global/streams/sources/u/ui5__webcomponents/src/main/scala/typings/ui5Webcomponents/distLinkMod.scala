package typings.ui5Webcomponents

import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import typings.std.Record
import typings.ui5Webcomponents.distTypesLinkDesignMod.LinkDesign
import typings.ui5Webcomponents.distTypesWrappingTypeMod.WrappingType
import typings.ui5WebcomponentsBase.distI18nBundleMod.I18nText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLinkMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    * The <code>ui5-link</code> is a hyperlink component that is used to navigate to other
    * apps and web pages, or to trigger actions.
    * It is a clickable text element, visualized in such a way that it stands out
    * from the standard text.
    * On hover, it changes its style to an underlined text to provide additional feedback to the user.
    *
    *
    * <h3>Usage</h3>
    *
    * You can set the <code>ui5-link</code> to be enabled or disabled.
    * <br><br>
    * To create a visual hierarchy in large lists of links, you can set the less important links as
    * <code>Subtle</code> or the more important ones as <code>Emphasized</code>,
    * by using the <code>design</code> property.
    * <br><br>
    * If the <code>href</code> property is set, the link behaves as the HTML
    * anchor tag (<code>&lt;a&gt;&lt;a&#47;&gt;</code>) and opens the specified URL in the given target frame (<code>target</code> property).
    * To specify where the linked content is opened, you can use the <code>target</code> property.
    *
    * <h3>Responsive behavior</h3>
    *
    * If there is not enough space, the text of the <code>ui5-link</code> becomes truncated.
    * If the <code>wrappingType</code> property is set to <code>"Normal"</code>, the text is displayed
    * on several lines instead of being truncated.
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/Link";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.Link
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-link
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/Link", JSImport.Default)
  @js.native
  open class default () extends Link
  object default {
    
    @JSImport("@ui5/webcomponents/dist/Link", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/Link", "default.i18nBundle")
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
    * The <code>ui5-link</code> is a hyperlink component that is used to navigate to other
    * apps and web pages, or to trigger actions.
    * It is a clickable text element, visualized in such a way that it stands out
    * from the standard text.
    * On hover, it changes its style to an underlined text to provide additional feedback to the user.
    *
    *
    * <h3>Usage</h3>
    *
    * You can set the <code>ui5-link</code> to be enabled or disabled.
    * <br><br>
    * To create a visual hierarchy in large lists of links, you can set the less important links as
    * <code>Subtle</code> or the more important ones as <code>Emphasized</code>,
    * by using the <code>design</code> property.
    * <br><br>
    * If the <code>href</code> property is set, the link behaves as the HTML
    * anchor tag (<code>&lt;a&gt;&lt;a&#47;&gt;</code>) and opens the specified URL in the given target frame (<code>target</code> property).
    * To specify where the linked content is opened, you can use the <code>target</code> property.
    *
    * <h3>Responsive behavior</h3>
    *
    * If there is not enough space, the text of the <code>ui5-link</code> becomes truncated.
    * If the <code>wrappingType</code> property is set to <code>"Normal"</code>, the text is displayed
    * on several lines instead of being truncated.
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/Link";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.Link
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-link
    * @public
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ui5WebcomponentsBase.distDelegateItemNavigationMod.ITabbable because var conflicts: id. Inlined _tabIndex */ @js.native
  trait Link
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    /**
      * Defines the text of the component.
      * <br><b>Note:</b> Although this slot accepts HTML Elements, it is strongly recommended that you only use text in order to preserve the intended design.
      *
      * @type {Node[]}
      * @name sap.ui.webc.main.Link.prototype.default
      * @slot
      * @public
      */
    var _dummyAnchor: HTMLAnchorElement = js.native
    
    def _isCrossOrigin(): Boolean = js.native
    
    def _onclick(e: KeyboardEvent): Unit = js.native
    def _onclick(e: MouseEvent): Unit = js.native
    
    def _onfocusin(e: FocusEvent): Unit = js.native
    
    def _onfocusout(): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeyup(e: KeyboardEvent): Unit = js.native
    
    var _rel: js.UndefOr[String] = js.native
    
    var _tabIndex: String = js.native
    
    /**
      * An object of strings that defines several additional accessibility attribute values
      * for customization depending on the use case.
      *
      * It supports the following fields:
      *
      * <ul>
      * 		<li><code>expanded</code>: Indicates whether the anchor element, or another grouping element it controls, is currently expanded or collapsed. Accepts the following string values:
      *			<ul>
      *				<li><code>true</code></li>
      *				<li><code>false</code></li>
      *			</ul>
      * 		</li>
      * 		<li><code>hasPopup</code>: Indicates the availability and type of interactive popup element, such as menu or dialog, that can be triggered by the anchor element. Accepts the following string values:
      * 			<ul>
      *				<li><code>Dialog</code></li>
      *				<li><code>Grid</code></li>
      *				<li><code>ListBox</code></li>
      *				<li><code>Menu</code></li>
      *				<li><code>Tree</code></li>
      * 			</ul>
      * 		</li>
      * </ul>
      * @type {object}
      * @name sap.ui.webc.main.Link.prototype.accessibilityAttributes
      * @public
      * @since 1.1.0
      */
    var accessibilityAttributes: js.Object = js.native
    
    /**
      * Defines the accessible ARIA name of the component.
      *
      * @type {string}
      * @name sap.ui.webc.main.Link.prototype.accessibleName
      * @defaultvalue ""
      * @public
      * @since 1.2.0
      */
    var accessibleName: String = js.native
    
    /**
      * Receives id(or many ids) of the elements that label the input
      *
      * @type {string}
      * @name sap.ui.webc.main.Link.prototype.accessibleNameRef
      * @defaultvalue ""
      * @public
      * @since 1.0.0-rc.15
      */
    var accessibleNameRef: String = js.native
    
    /**
      * Defines the ARIA role of the component.
      *
      * <b>Note:</b> Use the "button" role in cases when navigation is not expected to occur and the href property is not defined.
      *
      * @type {string}
      * @name sap.ui.webc.main.Link.prototype.accessibleRole
      * @defaultvalue "link"
      * @public
      * @since 1.9.0
      */
    var accessibleRole: String = js.native
    
    def ariaLabelText: js.UndefOr[String] = js.native
    
    /**
      * Defines the component design.
      * <br><br>
      * <b>Note:</b> Avaialble options are <code>Default</code>, <code>Subtle</code>, and <code>Emphasized</code>.
      *
      * @type {sap.ui.webc.main.types.LinkDesign}
      * @name sap.ui.webc.main.Link.prototype.design
      * @defaultvalue "Default"
      * @public
      */
    var design: LinkDesign = js.native
    
    /**
      * Defines whether the component is disabled.
      * <br><br>
      * <b>Note:</b> When disabled, the click event cannot be triggered by the user.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.Link.prototype.disabled
      * @defaultvalue false
      * @public
      */
    var disabled: Boolean = js.native
    
    def effectiveAccRole: String = js.native
    
    def effectiveTabIndex: String = js.native
    
    /**
      * Indicates if the element is on focus.
      * @private
      */
    var focused: Boolean = js.native
    
    def hasLinkType: Boolean = js.native
    
    /**
      * Defines the component href.
      * <br><br>
      * <b>Note:</b> Standard hyperlink behavior is supported.
      *
      * @type {string}
      * @name sap.ui.webc.main.Link.prototype.href
      * @defaultvalue ""
      * @public
      */
    var href: String = js.native
    
    def linkTypeText: String = js.native
    
    def parsedRef: js.UndefOr[String] = js.native
    
    /**
      * Defines the component target.
      * <br><br>
      * <b>Notes:</b>
      *
      * <ul>
      * <li><code>_self</code></li>
      * <li><code>_top</code></li>
      * <li><code>_blank</code></li>
      * <li><code>_parent</code></li>
      * <li><code>_search</code></li>
      * </ul>
      *
      * <b>This property must only be used when the <code>href</code> property is set.</b>
      *
      * @type {string}
      * @name sap.ui.webc.main.Link.prototype.target
      * @defaultvalue ""
      * @public
      */
    var target: String = js.native
    
    /**
      * Defines how the text of a component will be displayed when there is not enough space.
      * Available options are:
      * <ul>
      * <li><code>None</code> - The text will be truncated with an ellipsis.</li>
      * <li><code>Normal</code> - The text will wrap. The words will not be broken based on hyphenation.</li>
      * </ul>
      *
      * @type {sap.ui.webc.main.types.WrappingType}
      * @name sap.ui.webc.main.Link.prototype.wrappingType
      * @defaultvalue "None"
      * @public
      */
    var wrappingType: WrappingType = js.native
  }
  
  trait LinkClickEventDetail extends StObject {
    
    var altKey: Boolean
    
    var ctrlKey: Boolean
    
    var metaKey: Boolean
    
    var shiftKey: Boolean
  }
  object LinkClickEventDetail {
    
    inline def apply(altKey: Boolean, ctrlKey: Boolean, metaKey: Boolean, shiftKey: Boolean): LinkClickEventDetail = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkClickEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinkClickEventDetail] (val x: Self) extends AnyVal {
      
      inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
      
      inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
      
      inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    }
  }
}
