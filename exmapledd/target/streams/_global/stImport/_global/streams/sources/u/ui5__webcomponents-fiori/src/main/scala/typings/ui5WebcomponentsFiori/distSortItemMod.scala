package typings.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSortItemMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    *
    * <h3>Usage</h3>
    *
    * For the <code>ui5-sort-item</code>
    * <h3>ES6 Module Import</h3>
    *
    * <code>import @ui5/webcomponents-fiori/dist/SortItem.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.fiori.SortItem
    * @extends sap.ui.webc.base.UI5Element
    * @since 1.0.0-rc.16
    * @tagname ui5-sort-item
    * @implements sap.ui.webc.fiori.ISortItem
    * @public
    */
  @JSImport("@ui5/webcomponents-fiori/dist/SortItem", JSImport.Default)
  @js.native
  open class default () extends SortItem
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    *
    * <h3>Usage</h3>
    *
    * For the <code>ui5-sort-item</code>
    * <h3>ES6 Module Import</h3>
    *
    * <code>import @ui5/webcomponents-fiori/dist/SortItem.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.fiori.SortItem
    * @extends sap.ui.webc.base.UI5Element
    * @since 1.0.0-rc.16
    * @tagname ui5-sort-item
    * @implements sap.ui.webc.fiori.ISortItem
    * @public
    */
  @js.native
  trait SortItem
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    /**
      * Defines if the component is selected.
      *
      * @name sap.ui.webc.fiori.SortItem.prototype.selected
      * @type {boolean}
      * @defaultvalue false
      * @public
      */
    var selected: Boolean = js.native
    
    /**
      * Defines the text of the component.
      *
      * @name sap.ui.webc.fiori.SortItem.prototype.text
      * @type {string}
      * @defaultvalue ""
      * @public
      */
    var text: String = js.native
  }
}
