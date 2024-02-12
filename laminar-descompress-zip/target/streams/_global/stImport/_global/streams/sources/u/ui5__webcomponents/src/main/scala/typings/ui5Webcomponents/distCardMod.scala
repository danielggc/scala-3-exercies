package typings.ui5Webcomponents

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCardMod {
  
  /**
    * @class
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-card</code> is a component that represents information in the form of a
    * tile with separate header and content areas.
    * The content area of a <code>ui5-card</code> can be arbitrary HTML content.
    * The header can be used through slot <code>header</code>. For which there is a <code>ui5-card-header</code> component to achieve the card look and fill.
    *
    * Note: We recommend the usage of <code>ui5-card-header</code> for the header slot, so advantage can be taken for keyboard handling, styling and accessibility.
    *
    * <h3>CSS Shadow Parts</h3>
    *
    * <ui5-link target="_blank" href="https://developer.mozilla.org/en-US/docs/Web/CSS/::part">CSS Shadow Parts</ui5-link> allow developers to style elements inside the Shadow DOM.
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/Card";</code>
    * <br>
    * <code>import "@ui5/webcomponents/dist/CardHeader.js";</code> (for <code>ui5-card-header</code>)
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.Card
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-card
    * @public
    * @appenddocs CardHeader
    */
  @JSImport("@ui5/webcomponents/dist/Card", JSImport.Default)
  @js.native
  open class default () extends Card
  object default {
    
    @JSImport("@ui5/webcomponents/dist/Card", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/Card", "default.i18nBundle")
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
    * The <code>ui5-card</code> is a component that represents information in the form of a
    * tile with separate header and content areas.
    * The content area of a <code>ui5-card</code> can be arbitrary HTML content.
    * The header can be used through slot <code>header</code>. For which there is a <code>ui5-card-header</code> component to achieve the card look and fill.
    *
    * Note: We recommend the usage of <code>ui5-card-header</code> for the header slot, so advantage can be taken for keyboard handling, styling and accessibility.
    *
    * <h3>CSS Shadow Parts</h3>
    *
    * <ui5-link target="_blank" href="https://developer.mozilla.org/en-US/docs/Web/CSS/::part">CSS Shadow Parts</ui5-link> allow developers to style elements inside the Shadow DOM.
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/Card";</code>
    * <br>
    * <code>import "@ui5/webcomponents/dist/CardHeader.js";</code> (for <code>ui5-card-header</code>)
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.Card
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-card
    * @public
    * @appenddocs CardHeader
    */
  @js.native
  trait Card
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _ariaCardContentLabel: String = js.native
    
    def _getAriaLabel: String = js.native
    
    def _hasHeader: Boolean = js.native
    
    /**
      * Defines the accessible name of the component, which is used as the name of the card region and should be unique per card.
      * <b>Note:</b> <code>accessibleName</code> should be always set, unless <code>accessibleNameRef</code> is set.
      *
      *
      * @type {string}
      * @defaultvalue ""
      * @name sap.ui.webc.main.Card.prototype.accessibleName
      * @public
      * @since 1.0.0-rc.16
      */
    var accessibleName: String = js.native
    
    /**
      * Defines the IDs of the elements that label the component.
      *
      * @type {string}
      * @defaultvalue ""
      * @name sap.ui.webc.main.Card.prototype.accessibleNameRef
      * @public
      * @since 1.0.0-rc.16
      */
    var accessibleNameRef: String = js.native
    
    /**
      * Defines the content of the component.
      * @type {HTMLElement[]}
      * @slot content
      * @name sap.ui.webc.main.Card.prototype.default
      * @public
      */
    var content: js.Array[HTMLElement] = js.native
    
    /**
      * Defines the header of the component.
      * <br><br>
      * <b>Note:</b> Use <code>ui5-card-header</code> for the intended design.
      * @type {HTMLElement[]}
      * @since 1.0.0-rc.15
      * @slot header
      * @name sap.ui.webc.main.Card.prototype.header
      * @public
      */
    var header: js.Array[HTMLElement] = js.native
  }
}
