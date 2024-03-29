package typings.ui5Webcomponents

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSuggestionListItemMod {
  
  /**
    * @class
    * The <code>ui5-li-suggestion-item</code> represents the suggestion item in the <code>ui5-input</code>
    * suggestion popover.
    *
    * <h3>CSS Shadow Parts</h3>
    *
    * <ui5-link target="_blank" href="https://developer.mozilla.org/en-US/docs/Web/CSS/::part">CSS Shadow Parts</ui5-link> allow developers to style elements inside the Shadow DOM.
    * <br>
    * The <code>ui5-li-suggestion-item</code> exposes the following CSS Shadow Parts:
    * <ul>
    * <li>title - Used to style the title of the suggestion list item</li>
    * <li>description - Used to style the description of the suggestion list item</li>
    * <li>info - Used to style the info of the suggestion list item</li>
    * </ul>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.SuggestionListItem
    * @extends sap.ui.webc.main.StandardListItem
    * @tagname ui5-li-suggestion-item
    */
  @JSImport("@ui5/webcomponents/dist/SuggestionListItem", JSImport.Default)
  @js.native
  open class default () extends SuggestionListItem
  
  /**
    * @class
    * The <code>ui5-li-suggestion-item</code> represents the suggestion item in the <code>ui5-input</code>
    * suggestion popover.
    *
    * <h3>CSS Shadow Parts</h3>
    *
    * <ui5-link target="_blank" href="https://developer.mozilla.org/en-US/docs/Web/CSS/::part">CSS Shadow Parts</ui5-link> allow developers to style elements inside the Shadow DOM.
    * <br>
    * The <code>ui5-li-suggestion-item</code> exposes the following CSS Shadow Parts:
    * <ul>
    * <li>title - Used to style the title of the suggestion list item</li>
    * <li>description - Used to style the description of the suggestion list item</li>
    * <li>info - Used to style the info of the suggestion list item</li>
    * </ul>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.SuggestionListItem
    * @extends sap.ui.webc.main.StandardListItem
    * @tagname ui5-li-suggestion-item
    */
  @js.native
  trait SuggestionListItem
    extends typings.ui5Webcomponents.distStandardListItemMod.default {
    
    def effectiveTitle: String = js.native
    
    def groupItem: Boolean = js.native
    
    def hasDescription: String | Double = js.native
    
    /**
      * Defines a description that can contain HTML.
      * <b>Note:</b> If not specified, the <code>description</code> property will be used.
      * <br>
      * @type {HTMLElement}
      * @name sap.ui.webc.main.SuggestionListItem.prototype.richDescription
      * @since 1.0.0-rc.8
      * @slot
      * @public
      */
    var richDescription: js.Array[HTMLElement] = js.native
    
    /**
      * @type {Node}
      * @name sap.ui.webc.main.SuggestionListItem.prototype.default
      */
    var titleText: js.Array[Node] = js.native
  }
}
