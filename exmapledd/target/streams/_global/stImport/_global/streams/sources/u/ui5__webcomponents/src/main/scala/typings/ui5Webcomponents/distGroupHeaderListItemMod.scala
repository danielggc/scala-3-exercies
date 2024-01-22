package typings.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distGroupHeaderListItemMod {
  
  /**
    * @class
    * The <code>ui5-li-groupheader</code> is a special list item, used only to separate other list items into logical groups.
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.GroupHeaderListItem
    * @extends sap.ui.webc.main.ListItemBase
    * @tagname ui5-li-groupheader
    * @implements sap.ui.webc.main.IListItem
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/GroupHeaderListItem", JSImport.Default)
  @js.native
  open class default () extends GroupHeaderListItem
  object default {
    
    @JSImport("@ui5/webcomponents/dist/GroupHeaderListItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Defines the text of the component.
      * <br>
      * <b>Note:</b> Although this slot accepts HTML Elements, it is strongly recommended that you only use text in order to preserve the intended design.
      *
      * @type {Node[]}
      * @name sap.ui.webc.main.GroupHeaderListItem.prototype.default
      * @slot
      * @public
      */
    /* static member */
    @JSImport("@ui5/webcomponents/dist/GroupHeaderListItem", "default.i18nBundle")
    @js.native
    def i18nBundle: typings.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: typings.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def onDefine(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("onDefine")().asInstanceOf[js.Promise[Unit]]
  }
  
  /**
    * @class
    * The <code>ui5-li-groupheader</code> is a special list item, used only to separate other list items into logical groups.
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.GroupHeaderListItem
    * @extends sap.ui.webc.main.ListItemBase
    * @tagname ui5-li-groupheader
    * @implements sap.ui.webc.main.IListItem
    * @public
    */
  @js.native
  trait GroupHeaderListItem
    extends typings.ui5Webcomponents.distListItemBaseMod.default {
    
    /**
      * Defines the text alternative of the component.
      * Note: If not provided a default text alternative will be set, if present.
      *
      * @type {string}
      * @name sap.ui.webc.main.GroupHeaderListItem.prototype.accessibleName
      * @defaultvalue ""
      * @public
      * @since 1.0.0-rc.15
      */
    var accessibleName: String = js.native
    
    def ariaLabelText: String = js.native
    
    def groupHeaderText: String = js.native
    
    def groupItem: Boolean = js.native
  }
}
