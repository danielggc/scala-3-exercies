package typings.ui5WebcomponentsFiori

import org.scalajs.dom.HTMLElement
import typings.ui5WebcomponentsFiori.anon.Content
import typings.ui5WebcomponentsFiori.distTypesPageBackgroundDesignMod.PageBackgroundDesign
import typings.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.`0`
import typings.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.`0rem`
import typings.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.`2Dot75rem`
import typings.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.`3Dot5rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPageMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-page</code> is a container component that holds one whole screen of an application.
    * The page has three distinct areas that can hold content - a header, content area and a footer.
    * <h3>Structure</h3>
    * <h4>Header</h4>
    * The top most area of the page is occupied by the header. The standard header includes a navigation button and a title.
    * <h4>Content</h4>
    * The content occupies the main part of the page. Only the content area is scrollable by default.
    * This can be prevented by setting  <code>enableScrolling</code> to <code>false</code>.
    * <h4>Footer</h4>
    * The footer is optional and occupies the fixed bottom part of the page. Alternatively, the footer can be floating above the bottom part of the content.
    * This is enabled with the <code>floatingFooter</code> property.
    *
    * <b>Note:</b> <code>ui5-page</code> occipues the whole available space of its parent. In order to achieve the intended design you have to make sure
    * that there is enough space for the <code>ui5-page</code> to be rendered.
    *
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents-fiori/dist/Page.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.fiori.Page
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-page
    * @since 1.0.0-rc.12
    * @public
    */
  @JSImport("@ui5/webcomponents-fiori/dist/Page", JSImport.Default)
  @js.native
  open class default () extends Page
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-page</code> is a container component that holds one whole screen of an application.
    * The page has three distinct areas that can hold content - a header, content area and a footer.
    * <h3>Structure</h3>
    * <h4>Header</h4>
    * The top most area of the page is occupied by the header. The standard header includes a navigation button and a title.
    * <h4>Content</h4>
    * The content occupies the main part of the page. Only the content area is scrollable by default.
    * This can be prevented by setting  <code>enableScrolling</code> to <code>false</code>.
    * <h4>Footer</h4>
    * The footer is optional and occupies the fixed bottom part of the page. Alternatively, the footer can be floating above the bottom part of the content.
    * This is enabled with the <code>floatingFooter</code> property.
    *
    * <b>Note:</b> <code>ui5-page</code> occipues the whole available space of its parent. In order to achieve the intended design you have to make sure
    * that there is enough space for the <code>ui5-page</code> to be rendered.
    *
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents-fiori/dist/Page.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.fiori.Page
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-page
    * @since 1.0.0-rc.12
    * @public
    */
  @js.native
  trait Page
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _contentBottom: `0` | `2Dot75rem` = js.native
    
    def _contentPaddingBottom: `0` | `3Dot5rem` = js.native
    
    def _contentTop: `2Dot75rem` | `0rem` = js.native
    
    def _updateMediaRange(): Unit = js.native
    
    /**
      * Defines the background color of the <code>ui5-page</code>.
      * <br><br>
      * <b>Note:</b> When a ui5-list is placed inside the page, we recommend using “List” to ensure better color contrast.
      * <br><br>
      * Available options are:
      * <ul>
      * <li><code>Solid</code></li> (default)
      * <li><code>Transparent</code></li>
      * <li><code>List</code></li>
      * </ul>
      * @type {sap.ui.webc.fiori.types.PageBackgroundDesign}
      * @name sap.ui.webc.fiori.Page.prototype.backgroundDesign
      * @defaultvalue "Solid"
      * @public
      */
    var backgroundDesign: PageBackgroundDesign = js.native
    
    /**
      * Defines the content HTML Element.
      *
      * @type {HTMLElement[]}
      * @name sap.ui.webc.fiori.Page.prototype.default
      * @slot content
      * @public
      */
    var content: js.Array[HTMLElement] = js.native
    
    /**
      * Disables vertical scrolling of page content.
      * If set to true, there will be no vertical scrolling at all.
      *
      * @type {boolean}
      * @name sap.ui.webc.fiori.Page.prototype.disableScrolling
      * @defaultvalue false
      * @public
      */
    var disableScrolling: Boolean = js.native
    
    /**
      * Defines if the footer should float over the content.
      * <br><br>
      * <b>Note:</b> When set to true the footer floats over the content with a slight offset from the bottom, otherwise it is fixed at the very bottom of the page.
      * @type {boolean}
      * @name sap.ui.webc.fiori.Page.prototype.floatingFooter
      * @defaultvalue true
      * @public
      */
    var floatingFooter: Boolean = js.native
    
    /**
      * Defines the footer HTML Element.
      *
      * @type {sap.ui.webc.fiori.IBar}
      * @name sap.ui.webc.fiori.Page.prototype.footer
      * @slot
      * @public
      */
    var footer: js.Array[HTMLElement] = js.native
    
    /**
      * Defines the header HTML Element.
      *
      * @type {sap.ui.webc.fiori.IBar}
      * @name sap.ui.webc.fiori.Page.prototype.header
      * @slot
      * @public
      */
    var header: js.Array[HTMLElement] = js.native
    
    /**
      * Defines the footer visibility.
      *
      * @type {boolean}
      * @name sap.ui.webc.fiori.Page.prototype.hideFooter
      * @defaultvalue false
      * @public
      */
    var hideFooter: Boolean = js.native
    
    /**
      * Defines the current media query size.
      *
      * @type {string}
      * @private
      * @since 1.0.0-rc.15
      */
    var mediaRange: String = js.native
    
    def styles: Content = js.native
    
    def updateMediaRange(): Unit = js.native
  }
}
