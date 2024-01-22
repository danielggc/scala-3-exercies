package typings.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSuggestionGroupItemMod {
  
  /**
    * @class
    * The <code>ui5-suggestion-group-item</code> is type of suggestion item,
    * that can be used to split the <code>ui5-input</code> suggestions into groups.
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.SuggestionGroupItem
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-suggestion-group-item
    * @implements sap.ui.webc.main.IInputSuggestionItem
    * @public
    * @since 1.0.0-rc.15
    */
  @JSImport("@ui5/webcomponents/dist/SuggestionGroupItem", JSImport.Default)
  @js.native
  open class default () extends SuggestionGroupItem
  
  /**
    * @class
    * The <code>ui5-suggestion-group-item</code> is type of suggestion item,
    * that can be used to split the <code>ui5-input</code> suggestions into groups.
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.SuggestionGroupItem
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-suggestion-group-item
    * @implements sap.ui.webc.main.IInputSuggestionItem
    * @public
    * @since 1.0.0-rc.15
    */
  @js.native
  trait SuggestionGroupItem
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    /**
      * Indicates the "grouping" nature of the component
      * to avoid tag name checks tag name to diferenciate from the standard suggestion item.
      * @protected
      */
    def groupItem: Boolean = js.native
    
    /**
      * Defines the text of the <code>ui5-suggestion-group-item</code>.
      *
      * @type {string}
      * @name sap.ui.webc.main.SuggestionGroupItem.prototype.text
      * @defaultvalue ""
      * @public
      */
    var text: String = js.native
  }
}
