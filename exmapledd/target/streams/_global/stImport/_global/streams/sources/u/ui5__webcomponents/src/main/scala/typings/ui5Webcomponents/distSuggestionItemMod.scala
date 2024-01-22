package typings.ui5Webcomponents

import typings.ui5Webcomponents.distTypesListItemTypeMod.ListItemType
import typings.ui5WebcomponentsBase.distTypesValueStateMod.ValueState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSuggestionItemMod {
  
  /**
    * @class
    * The <code>ui5-suggestion-item</code> represents the suggestion item of the <code>ui5-input</code>.
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.SuggestionItem
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-suggestion-item
    * @implements sap.ui.webc.main.IInputSuggestionItem
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/SuggestionItem", JSImport.Default)
  @js.native
  open class default () extends SuggestionItem
  
  /**
    * @class
    * The <code>ui5-suggestion-item</code> represents the suggestion item of the <code>ui5-input</code>.
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.SuggestionItem
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-suggestion-item
    * @implements sap.ui.webc.main.IInputSuggestionItem
    * @public
    */
  @js.native
  trait SuggestionItem
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    /**
      * Defines the <code>additionalText</code>, displayed in the end of the item.
      * @type {string}
      * @name sap.ui.webc.main.SuggestionItem.prototype.additionalText
      * @since 1.0.0-rc.15
      * @public
      */
    var additionalText: String = js.native
    
    /**
      * Defines the state of the <code>additionalText</code>.
      * <br><br>
      * Available options are: <code>"None"</code> (by default), <code>"Success"</code>, <code>"Information"</code>, <code>"Warning"</code> and <code>"Error"</code>.
      * @type {sap.ui.webc.base.types.ValueState}
      * @name sap.ui.webc.main.SuggestionItem.prototype.additionalTextState
      * @defaultvalue "None"
      * @since 1.0.0-rc.15
      * @public
      */
    var additionalTextState: ValueState = js.native
    
    /**
      * Defines the description displayed right under the item text, if such is present.
      * @type {string}
      * @name sap.ui.webc.main.SuggestionItem.prototype.description
      * @defaultvalue: ""
      * @public
      */
    var description: String = js.native
    
    def groupItem: Boolean = js.native
    
    /**
      * Defines the <code>icon</code> source URI.
      * <br><br>
      * <b>Note:</b>
      * SAP-icons font provides numerous built-in icons. To find all the available icons, see the
      * <ui5-link target="_blank" href="https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html" class="api-table-content-cell-link">Icon Explorer</ui5-link>.
      *
      * @type {string}
      * @name sap.ui.webc.main.SuggestionItem.prototype.icon
      * @public
      */
    var icon: String = js.native
    
    /**
      * Defines whether the <code>icon</code> should be displayed in the beginning of the item or in the end.
      * <br><br>
      * <b>Note:</b> If <code>image</code> is set, the <code>icon</code> would be displayed after the <code>image</code>.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.SuggestionItem.prototype.iconEnd
      * @defaultvalue false
      * @public
      */
    var iconEnd: Boolean = js.native
    
    /**
      * Defines the <code>image</code> source URI.
      * <br><br>
      * <b>Note:</b> The <code>image</code> would be displayed in the beginning of the item.
      *
      * @type {string}
      * @name sap.ui.webc.main.SuggestionItem.prototype.image
      * @public
      */
    var image: String = js.native
    
    /**
      * Defines the text of the component.
      *
      * @type {string}
      * @name sap.ui.webc.main.SuggestionItem.prototype.text
      * @defaultvalue ""
      * @public
      */
    var text: String = js.native
    
    /**
      * Defines the visual indication and behavior of the item.
      * Available options are <code>Active</code> (by default), <code>Inactive</code> and <code>Detail</code>.
      * <br><br>
      * <b>Note:</b> When set to <code>Active</code>, the item will provide visual response upon press and hover,
      * while when <code>Inactive</code> or <code>Detail</code> - will not.
      *
      * @type {sap.ui.webc.main.types.ListItemType}
      * @name sap.ui.webc.main.SuggestionItem.prototype.type
      * @defaultvalue "Active"
      * @public
      * @since 1.0.0-rc.8
      */
    var `type`: ListItemType = js.native
  }
}
