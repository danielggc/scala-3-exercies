package typings.ui5Webcomponents

import typings.ui5Webcomponents.distTypesTableColumnPopinDisplayMod.TableColumnPopinDisplay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTableColumnMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-table-column</code> component allows to define column specific properties that are applied
    * when rendering the <code>ui5-table</code> component.
    *
    * <h3>CSS Shadow Parts</h3>
    *
    * <ui5-link target="_blank" href="https://developer.mozilla.org/en-US/docs/Web/CSS/::part">CSS Shadow Parts</ui5-link> allow developers to style elements inside the Shadow DOM.
    * <br>
    * The <code>ui5-table-column</code> exposes the following CSS Shadow Parts:
    * <ul>
    * <li>column - Used to style the native <code>th</code> element</li>
    * </ul>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.TableColumn
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-table-column
    * @implements sap.ui.webc.main.ITableColumn
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/TableColumn", JSImport.Default)
  @js.native
  open class default () extends TableColumn
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-table-column</code> component allows to define column specific properties that are applied
    * when rendering the <code>ui5-table</code> component.
    *
    * <h3>CSS Shadow Parts</h3>
    *
    * <ui5-link target="_blank" href="https://developer.mozilla.org/en-US/docs/Web/CSS/::part">CSS Shadow Parts</ui5-link> allow developers to style elements inside the Shadow DOM.
    * <br>
    * The <code>ui5-table-column</code> exposes the following CSS Shadow Parts:
    * <ul>
    * <li>column - Used to style the native <code>th</code> element</li>
    * </ul>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.TableColumn
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-table-column
    * @implements sap.ui.webc.main.ITableColumn
    * @public
    */
  @js.native
  trait TableColumn
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    /**
      * According to your <code>minWidth</code> settings, the component can be hidden
      * in different screen sizes.
      * <br><br>
      * Setting this property to <code>true</code>, shows this column as pop-in instead of hiding it.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.TableColumn.prototype.demandPopin
      * @defaultvalue false
      * @public
      */
    var demandPopin: Boolean = js.native
    
    /**
      * @private
      */
    var first: Boolean = js.native
    
    /**
      * @private
      */
    var last: Boolean = js.native
    
    /**
      * Defines the minimum table width required to display this column. By default it is always displayed.
      * <br><br>
      * The responsive behavior of the <code>ui5-table</code> is determined by this property. As an example, by setting
      * <code>minWidth</code> property to <code>400</code> sets the minimum width to 400 pixels, and	shows this column on tablet (and desktop) but hides it on mobile.
      * <br>
      * For further responsive design options, see <code>demandPopin</code> property.
      *
      * @type {sap.ui.webc.base.types.Integer}
      * @name sap.ui.webc.main.TableColumn.prototype.minWidth
      * @defaultvalue Infinity
      * @public
      */
    var minWidth: Double = js.native
    
    /**
      * Defines how the popin row is displayed.
      *
      * <br><br>
      * <b>The available values are:</b>
      *
      * <ul>
      * <li><code>Block</code></li>
      * <li><code>Inline</code></li>
      * </ul>
      *
      * @type {TableColumnPopinDisplay}
      * @name sap.ui.webc.main.TableColumn.prototype.popinDisplay
      * @defaultvalue "Block"
      * @public
      */
    var popinDisplay: TableColumnPopinDisplay = js.native
    
    /**
      * The text for the column when it pops in.
      *
      * @type {string}
      * @name sap.ui.webc.main.TableColumn.prototype.popinText
      * @defaultvalue ""
      * @public
      */
    var popinText: String = js.native
  }
}
