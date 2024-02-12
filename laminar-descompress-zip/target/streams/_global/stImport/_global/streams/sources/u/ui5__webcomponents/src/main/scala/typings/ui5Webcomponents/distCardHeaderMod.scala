package typings.ui5Webcomponents

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import typings.ui5Webcomponents.ui5WebcomponentsStrings.button
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCardHeaderMod {
  
  /**
    * @class
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-card-header</code> is a component, meant to be used as a header of the <code>ui5-card</code> component.
    * It displays valuable information, that can be defined with several properties, such as: <code>titleText</code>, <code>subtitleText</code>, <code>status</code>
    * and two slots: <code>avatar</code> and <code>action</code>.
    *
    * <h3>Keyboard handling</h3>
    * In case you enable <code>interactive</code> property, you can press the <code>ui5-card-header</code> by Space and Enter keys.
    *
    * <h3>CSS Shadow Parts</h3>
    *
    * <ui5-link target="_blank" href="https://developer.mozilla.org/en-US/docs/Web/CSS/::part">CSS Shadow Parts</ui5-link> allow developers to style elements inside the Shadow DOM.
    * <br>
    * The <code>ui5-card</code> exposes the following CSS Shadow Parts:
    * <ul>
    * <li>root - Used to style the root DOM element of the CardHeader</li>
    * <li>title - Used to style the title of the CardHeader</li>
    * <li>subtitle - Used to style the subtitle of the CardHeader</li>
    * <li>status - Used to style the status of the CardHeader</li>
    * </ul>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/CardHeader";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.CardHeader
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-card-header
    * @public
    * @since 1.0.0-rc.15
    */
  @JSImport("@ui5/webcomponents/dist/CardHeader", JSImport.Default)
  @js.native
  open class default () extends CardHeader
  object default {
    
    @JSImport("@ui5/webcomponents/dist/CardHeader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/CardHeader", "default.i18nBundle")
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
    * The <code>ui5-card-header</code> is a component, meant to be used as a header of the <code>ui5-card</code> component.
    * It displays valuable information, that can be defined with several properties, such as: <code>titleText</code>, <code>subtitleText</code>, <code>status</code>
    * and two slots: <code>avatar</code> and <code>action</code>.
    *
    * <h3>Keyboard handling</h3>
    * In case you enable <code>interactive</code> property, you can press the <code>ui5-card-header</code> by Space and Enter keys.
    *
    * <h3>CSS Shadow Parts</h3>
    *
    * <ui5-link target="_blank" href="https://developer.mozilla.org/en-US/docs/Web/CSS/::part">CSS Shadow Parts</ui5-link> allow developers to style elements inside the Shadow DOM.
    * <br>
    * The <code>ui5-card</code> exposes the following CSS Shadow Parts:
    * <ul>
    * <li>root - Used to style the root DOM element of the CardHeader</li>
    * <li>title - Used to style the title of the CardHeader</li>
    * <li>subtitle - Used to style the subtitle of the CardHeader</li>
    * <li>status - Used to style the status of the CardHeader</li>
    * </ul>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/CardHeader";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.CardHeader
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-card-header
    * @public
    * @since 1.0.0-rc.15
    */
  @js.native
  trait CardHeader
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _actionsFocusin(): Unit = js.native
    
    def _actionsFocusout(): Unit = js.native
    
    /**
      * Define the <code>aria-level</code> attribute of the component
      * <b>Note: </b> If the interactive property is set, <code>aria-level</code> attribute is not rendered at all.
      * @private
      * @type {sap.ui.webc.base.types.Integer}
      * @defaultValue 3
      */
    var _ariaLevel: Double = js.native
    
    def _click(e: MouseEvent): Unit = js.native
    
    var _headerActive: Boolean = js.native
    
    def _keydown(e: KeyboardEvent): Unit = js.native
    
    def _keyup(e: KeyboardEvent): Unit = js.native
    
    def _root: HTMLElement = js.native
    
    /**
      * Defines an action, displayed in the right most part of the header.
      * @type {HTMLElement[]}
      * @slot
      * @name sap.ui.webc.main.CardHeader.prototype.action
      * @public
      */
    var action: js.Array[HTMLElement] = js.native
    
    def ariaCardAvatarLabel: String = js.native
    
    def ariaLabelledBy: js.UndefOr[String] = js.native
    
    @JSName("ariaRoleDescription")
    def ariaRoleDescription_MCardHeader: String = js.native
    
    def ariaRoleFocusableElement: button | Null = js.native
    
    /**
      * Defines an avatar image, displayed in the left most part of the header.
      * @type {HTMLElement[]}
      * @slot
      * @name sap.ui.webc.main.CardHeader.prototype.avatar
      * @public
      */
    var avatar: js.Array[HTMLElement] = js.native
    
    def hasAction: Boolean = js.native
    
    def hasAvatar: Boolean = js.native
    
    /**
      * Defines if the component would be interactive,
      * e.g gets hover effect, gets focus outline and <code>click</code> event is fired, when pressed.
      * @type {boolean}
      * @defaultvalue false
      * @name sap.ui.webc.main.CardHeader.prototype.interactive
      * @public
      */
    var interactive: Boolean = js.native
    
    /**
      * Defines the status text.
      * @type {string}
      * @defaultvalue ""
      * @name sap.ui.webc.main.CardHeader.prototype.status
      * @public
      */
    var status: String = js.native
    
    /**
      * Defines the subtitle text.
      * @type {string}
      * @defaultvalue ""
      * @name sap.ui.webc.main.CardHeader.prototype.subtitleText
      * @public
      */
    var subtitleText: String = js.native
    
    /**
      * Defines the title text.
      * @type {string}
      * @defaultvalue ""
      * @name sap.ui.webc.main.CardHeader.prototype.titleText
      * @public
      */
    var titleText: String = js.native
  }
}
