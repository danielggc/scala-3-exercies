package typings.ui5Webcomponents

import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBreadcrumbsItemMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-breadcrumbs-item</code> component defines the content of an item in <code>ui5-breadcrumbs</code>.
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.BreadcrumbsItem
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-breadcrumbs-item
    * @implements sap.ui.webc.main.IBreadcrumbsItem
    * @public
    * @since 1.0.0-rc.15
    */
  @JSImport("@ui5/webcomponents/dist/BreadcrumbsItem", JSImport.Default)
  @js.native
  open class default () extends BreadcrumbsItem
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-breadcrumbs-item</code> component defines the content of an item in <code>ui5-breadcrumbs</code>.
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.BreadcrumbsItem
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-breadcrumbs-item
    * @implements sap.ui.webc.main.IBreadcrumbsItem
    * @public
    * @since 1.0.0-rc.15
    */
  @js.native
  trait BreadcrumbsItem
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    var _accessibleNameText: js.UndefOr[String] = js.native
    
    /**
      * Defines the accessible ARIA name of the item.
      *
      * @type {string}
      * @name sap.ui.webc.main.BreadcrumbsItem.prototype.accessibleName
      * @defaultvalue undefined
      * @public
      */
    var accessibleName: String = js.native
    
    /**
      * Defines the link href.
      * <br><br>
      * <b>Note:</b> Standard hyperlink behavior is supported.
      *
      * @type {string}
      * @name sap.ui.webc.main.BreadcrumbsItem.prototype.href
      * @defaultvalue ""
      * @public
      */
    var href: String = js.native
    
    def stableDomRef: String = js.native
    
    /**
      * Defines the link target.
      * <br><br>
      * Available options are:
      * <ul>
      * <li><code>_self</code></li>
      * <li><code>_top</code></li>
      * <li><code>_blank</code></li>
      * <li><code>_parent</code></li>
      * <li><code>_search</code></li>
      * </ul>
      * <br><br>
      * <b>Note:<b> This property must only be used when the <code>href</code> property is set.
      *
      * @type {string}
      * @name sap.ui.webc.main.BreadcrumbsItem.prototype.target
      * @defaultvalue undefined
      * @public
      */
    var target: js.UndefOr[String] = js.native
    
    /**
      * Defines the text of the component.
      * <br><br>
      * <b>Note:</b> Although this slot accepts HTML Elements, it is strongly recommended that you only use text in order to preserve the intended design.
      *
      * @type {Node[]}
      * @name sap.ui.webc.main.BreadcrumbsItem.prototype.default
      * @slot
      * @public
      */
    var text: js.Array[Node] = js.native
  }
}
