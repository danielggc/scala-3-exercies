package typings.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCustomListItemMod {
  
  /**
    * @class
    *
    * A component to be used as custom list item within the <code>ui5-list</code>
    * the same way as the standard <code>ui5-li</code>.
    *
    * The component accepts arbitrary HTML content to allow full customization.
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.CustomListItem
    * @extends sap.ui.webc.main.ListItem
    * @tagname ui5-li-custom
    * @implements sap.ui.webc.main.IListItem
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/CustomListItem", JSImport.Default)
  @js.native
  open class default () extends CustomListItem
  
  /**
    * @class
    *
    * A component to be used as custom list item within the <code>ui5-list</code>
    * the same way as the standard <code>ui5-li</code>.
    *
    * The component accepts arbitrary HTML content to allow full customization.
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.CustomListItem
    * @extends sap.ui.webc.main.ListItem
    * @tagname ui5-li-custom
    * @implements sap.ui.webc.main.IListItem
    * @public
    */
  @js.native
  trait CustomListItem
    extends typings.ui5Webcomponents.distListItemMod.default {
    
    /**
      * Defines the text alternative of the component.
      * Note: If not provided a default text alternative will be set, if present.
      *
      * @type {string}
      * @name sap.ui.webc.main.CustomListItem.prototype.accessibleName
      * @defaultvalue ""
      * @public
      * @since 1.0.0-rc.15
      */
    var accessibleName: String = js.native
  }
}
