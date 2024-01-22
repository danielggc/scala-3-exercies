package typings.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTableCellMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-table-cell</code> component defines the structure of the data in a single <code>ui5-table</code> cell.
    *
    * <h3>CSS Shadow Parts</h3>
    *
    * <ui5-link target="_blank" href="https://developer.mozilla.org/en-US/docs/Web/CSS/::part">CSS Shadow Parts</ui5-link> allow developers to style elements inside the Shadow DOM.
    * <br>
    * The <code>ui5-table-cell</code> exposes the following CSS Shadow Parts:
    * <ul>
    * <li>cell - Used to style the native <code>td</code> element</li>
    * </ul>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.TableCell
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-table-cell
    * @implements sap.ui.webc.main.ITableCell
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/TableCell", JSImport.Default)
  @js.native
  open class default () extends TableCell
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-table-cell</code> component defines the structure of the data in a single <code>ui5-table</code> cell.
    *
    * <h3>CSS Shadow Parts</h3>
    *
    * <ui5-link target="_blank" href="https://developer.mozilla.org/en-US/docs/Web/CSS/::part">CSS Shadow Parts</ui5-link> allow developers to style elements inside the Shadow DOM.
    * <br>
    * The <code>ui5-table-cell</code> exposes the following CSS Shadow Parts:
    * <ul>
    * <li>cell - Used to style the native <code>td</code> element</li>
    * </ul>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.TableCell
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-table-cell
    * @implements sap.ui.webc.main.ITableCell
    * @public
    */
  @js.native
  trait TableCell
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    /**
      * @private
      */
    var _popinedInline: Boolean = js.native
    
    /**
      * @private
      */
    var lastInRow: Boolean = js.native
    
    /**
      * @private
      */
    var popined: Boolean = js.native
  }
}
