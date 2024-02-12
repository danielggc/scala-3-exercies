package typings.ui5WebcomponentsFiori

import org.scalajs.dom.HTMLElement
import typings.ui5WebcomponentsFiori.anon.Label
import typings.ui5WebcomponentsFiori.distTypesBarDesignMod.BarDesign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBarMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    * The Bar is a container which is primarily used to hold titles, buttons and input elements
    * and its design and functionality is the basis for page headers and footers.
    * The component consists of three areas to hold its content - startContent slot, default slot and endContent slot.
    * It has the capability to center content, such as a title, while having other components on the left and right side.
    *
    * <h3>Usage</h3>
    * With the use of the design property, you can set the style of the Bar to appear designed like a Header, Subheader, Footer and FloatingFooter.
    * <br>
    * <b>Note:</b> Do not place a Bar inside another Bar or inside any bar-like component. Doing so may cause unpredictable behavior.
    *
    * <h3>Responsive Behavior</h3>
    * The default slot will be centered in the available space between the startContent and the endContent areas,
    * therefore it might not always be centered in the entire bar.
    *
    * <h3>CSS Shadow Parts</h3>
    *
    * <ui5-link target="_blank" href="https://developer.mozilla.org/en-US/docs/Web/CSS/::part">CSS Shadow Parts</ui5-link> allow developers to style elements inside the Shadow DOM.
    * <br>
    * The <code>ui5-bar</code> exposes the following CSS Shadow Parts:
    * <ul>
    * <li>bar - Used to style the wrapper of the content of the component</li>
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
    * <code>import "@ui5/webcomponents-fiori/dist/Bar.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.fiori.Bar
    * @implements sap.ui.webc.fiori.IBar
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-bar
    * @public
    * @since 1.0.0-rc.11
    */
  @JSImport("@ui5/webcomponents-fiori/dist/Bar", JSImport.Default)
  @js.native
  open class default () extends Bar
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    * The Bar is a container which is primarily used to hold titles, buttons and input elements
    * and its design and functionality is the basis for page headers and footers.
    * The component consists of three areas to hold its content - startContent slot, default slot and endContent slot.
    * It has the capability to center content, such as a title, while having other components on the left and right side.
    *
    * <h3>Usage</h3>
    * With the use of the design property, you can set the style of the Bar to appear designed like a Header, Subheader, Footer and FloatingFooter.
    * <br>
    * <b>Note:</b> Do not place a Bar inside another Bar or inside any bar-like component. Doing so may cause unpredictable behavior.
    *
    * <h3>Responsive Behavior</h3>
    * The default slot will be centered in the available space between the startContent and the endContent areas,
    * therefore it might not always be centered in the entire bar.
    *
    * <h3>CSS Shadow Parts</h3>
    *
    * <ui5-link target="_blank" href="https://developer.mozilla.org/en-US/docs/Web/CSS/::part">CSS Shadow Parts</ui5-link> allow developers to style elements inside the Shadow DOM.
    * <br>
    * The <code>ui5-bar</code> exposes the following CSS Shadow Parts:
    * <ul>
    * <li>bar - Used to style the wrapper of the content of the component</li>
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
    * <code>import "@ui5/webcomponents-fiori/dist/Bar.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.fiori.Bar
    * @implements sap.ui.webc.fiori.IBar
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-bar
    * @public
    * @since 1.0.0-rc.11
    */
  @js.native
  trait Bar
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _handleResizeBound(): Unit = js.native
    
    def accInfo: Label = js.native
    
    /**
      * Defines the component's design.
      *
      * <br><br>
      * <b>Note:</b>
      * Available options are:
      * <ul>
      * <li><code>Header</code></li>
      * <li><code>Subheader</code></li>
      * <li><code>Footer</code></li>
      * <li><code>FloatingFooter</code></li>
      * </ul>
      *
      * @type {sap.ui.webc.fiori.types.BarDesign}
      * @name sap.ui.webc.fiori.Bar.prototype.design
      * @defaultvalue "Header"
      * @public
      */
    var design: BarDesign = js.native
    
    /**
      * Defines the content at the end of the bar
      * @type {HTMLElement[]}
      * @name sap.ui.webc.fiori.Bar.prototype.endContent
      * @slot
      * @public
      */
    var endContent: js.Array[HTMLElement] = js.native
    
    def handleResize(): Unit = js.native
    
    /**
      * Defines the content in the middle of the bar
      * @type {HTMLElement[]}
      * @name sap.ui.webc.fiori.Bar.prototype.default
      * @slot middleContent
      * @public
      */
    var middleContent: js.Array[HTMLElement] = js.native
    
    /**
      * Defines the content at the start of the bar
      * @type {HTMLElement[]}
      * @name sap.ui.webc.fiori.Bar.prototype.startContent
      * @slot
      * @public
      */
    var startContent: js.Array[HTMLElement] = js.native
  }
}
