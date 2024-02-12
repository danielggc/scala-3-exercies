package typings.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFilterItemOptionMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    *
    * <h3>Usage</h3>
    *
    * For the <code>ui5-filter-item-option</code>
    * <h3>ES6 Module Import</h3>
    *
    * <code>import @ui5/webcomponents-fiori/dist/FilterItemOption.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.fiori.FilterItemOption
    * @extends sap.ui.webc.base.UI5Element
    * @since 1.0.0-rc.16
    * @tagname ui5-filter-item-option
    * @implements sap.ui.webc.fiori.IFilterItemOption
    * @public
    */
  @JSImport("@ui5/webcomponents-fiori/dist/FilterItemOption", JSImport.Default)
  @js.native
  open class default () extends FilterItemOption
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    *
    * <h3>Usage</h3>
    *
    * For the <code>ui5-filter-item-option</code>
    * <h3>ES6 Module Import</h3>
    *
    * <code>import @ui5/webcomponents-fiori/dist/FilterItemOption.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.fiori.FilterItemOption
    * @extends sap.ui.webc.base.UI5Element
    * @since 1.0.0-rc.16
    * @tagname ui5-filter-item-option
    * @implements sap.ui.webc.fiori.IFilterItemOption
    * @public
    */
  @js.native
  trait FilterItemOption
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    /**
      * Defines if the component is selected.
      *
      * @name sap.ui.webc.fiori.FilterItemOption.prototype.selected
      * @type {boolean}
      * @defaultvalue false
      * @public
      */
    var selected: Boolean = js.native
    
    /**
      * Defines the text of the component.
      *
      * @name sap.ui.webc.fiori.FilterItemOption.prototype.text
      * @type {string}
      * @defaultvalue ""
      * @public
      */
    var text: String = js.native
  }
}
