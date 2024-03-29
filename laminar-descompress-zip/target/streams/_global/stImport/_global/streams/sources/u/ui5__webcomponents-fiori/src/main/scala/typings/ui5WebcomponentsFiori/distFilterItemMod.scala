package typings.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFilterItemMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    *
    * <h3>Usage</h3>
    *
    * For the <code>ui5-filter-item</code>
    * <h3>ES6 Module Import</h3>
    *
    * <code>import @ui5/webcomponents-fiori/dist/FilterItem.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.fiori.FilterItem
    * @extends sap.ui.webc.base.UI5Element
    * @since 1.0.0-rc.16
    * @tagname ui5-filter-item
    * @implements sap.ui.webc.fiori.IFilterItem
    * @public
    */
  @JSImport("@ui5/webcomponents-fiori/dist/FilterItem", JSImport.Default)
  @js.native
  open class default () extends FilterItem
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    *
    * <h3>Usage</h3>
    *
    * For the <code>ui5-filter-item</code>
    * <h3>ES6 Module Import</h3>
    *
    * <code>import @ui5/webcomponents-fiori/dist/FilterItem.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.fiori.FilterItem
    * @extends sap.ui.webc.base.UI5Element
    * @since 1.0.0-rc.16
    * @tagname ui5-filter-item
    * @implements sap.ui.webc.fiori.IFilterItem
    * @public
    */
  @js.native
  trait FilterItem
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    /**
      * Defines the additional text of the component.
      *
      * @name sap.ui.webc.fiori.FilterItem.prototype.additionalText
      * @type {string}
      * @defaultvalue ""
      * @public
      */
    var additionalText: String = js.native
    
    /**
      * Defines the text of the component.
      *
      * @name sap.ui.webc.fiori.FilterItem.prototype.text
      * @type {string}
      * @defaultvalue ""
      * @public
      */
    var text: String = js.native
    
    /**
      * Defines the <code>values</code> list.
      * @name sap.ui.webc.fiori.FilterItem.prototype.values
      * @type {sap.ui.webc.fiori.IFilterItemOption[]}
      * @slot values
      * @public
      */
    var values: js.Array[typings.ui5WebcomponentsFiori.distFilterItemOptionMod.default] = js.native
  }
}
