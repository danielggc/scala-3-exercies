package typings.ui5WebcomponentsFiori

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.DragEvent
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typings.ui5Webcomponents.distTypesListModeMod.ListMode
import typings.ui5WebcomponentsFiori.distTypesUploadCollectionDnDModeMod.UploadCollectionDnDOverlayMode
import typings.ui5WebcomponentsFiori.distUploadUtilsUploadCollectionBodyDnDMod.DnDEventListener
import typings.ui5WebcomponentsFiori.distUploadUtilsUploadCollectionBodyDnDMod.DnDEventListenerParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUploadCollectionMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    * This component allows you to represent files before uploading them to a server, with the help of <code>ui5-upload-collection-item</code>.
    * It also allows you to show already uploaded files.
    *
    * <h3>ES6 Module Import</h3>
    * <code>import "@ui5/webcomponents-fiori/dist/UploadCollection.js";</code>
    * <br>
    * <code>import "@ui5/webcomponents-fiori/dist/UploadCollectionItem.js";</code> (for <code>ui5-upload-collection-item</code>)
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.fiori.UploadCollection
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-upload-collection
    * @appenddocs UploadCollectionItem
    * @public
    * @since 1.0.0-rc.7
    */
  @JSImport("@ui5/webcomponents-fiori/dist/UploadCollection", JSImport.Default)
  @js.native
  open class default () extends UploadCollection
  object default {
    
    @JSImport("@ui5/webcomponents-fiori/dist/UploadCollection", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents-fiori/dist/UploadCollection", "default.i18nBundle")
    @js.native
    def i18nBundle: typings.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: typings.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def onDefine(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("onDefine")().asInstanceOf[js.Promise[Unit]]
  }
  
  trait ItemDeleteEventDetail extends StObject {
    
    var item: HTMLElement
  }
  object ItemDeleteEventDetail {
    
    inline def apply(item: HTMLElement): ItemDeleteEventDetail = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemDeleteEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemDeleteEventDetail] (val x: Self) extends AnyVal {
      
      inline def setItem(value: HTMLElement): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  trait SelectionChangeEventDetail extends StObject {
    
    var selectedItems: js.Array[HTMLElement]
  }
  object SelectionChangeEventDetail {
    
    inline def apply(selectedItems: js.Array[HTMLElement]): SelectionChangeEventDetail = {
      val __obj = js.Dynamic.literal(selectedItems = selectedItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectionChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setSelectedItems(value: js.Array[HTMLElement]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemsVarargs(value: HTMLElement*): Self = StObject.set(x, "selectedItems", js.Array(value*))
    }
  }
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    * This component allows you to represent files before uploading them to a server, with the help of <code>ui5-upload-collection-item</code>.
    * It also allows you to show already uploaded files.
    *
    * <h3>ES6 Module Import</h3>
    * <code>import "@ui5/webcomponents-fiori/dist/UploadCollection.js";</code>
    * <br>
    * <code>import "@ui5/webcomponents-fiori/dist/UploadCollectionItem.js";</code> (for <code>ui5-upload-collection-item</code>)
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.fiori.UploadCollection
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-upload-collection
    * @appenddocs UploadCollectionItem
    * @public
    * @since 1.0.0-rc.7
    */
  @js.native
  trait UploadCollection
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _bodyDnDHandler(param: DnDEventListenerParam): Unit = js.native
    @JSName("_bodyDnDHandler")
    var _bodyDnDHandler_Original: DnDEventListener = js.native
    
    def _dndOverlay: js.UndefOr[Element | Null] = js.native
    
    /**
      * Indicates what overlay to show when files are being dragged.
      *
      * @type {sap.ui.webc.fiori.types.UploadCollectionDnDOverlayMode}
      * @defaultvalue "None"
      * @private
      */
    var _dndOverlayMode: UploadCollectionDnDOverlayMode = js.native
    
    def _dndOverlayText: String = js.native
    
    def _noDataDescription: String = js.native
    
    def _noDataText: String = js.native
    
    def _onItemDelete(e: CustomEvent): Unit = js.native
    
    def _onSelectionChange(e: CustomEvent): Unit = js.native
    
    def _ondragenter(e: DragEvent): Unit = js.native
    
    def _ondragleave(): Unit = js.native
    
    def _ondragover(e: DragEvent): Unit = js.native
    
    def _ondrop(e: DragEvent): Unit = js.native
    
    def _roleDescription: String = js.native
    
    def _root: Element | Null = js.native
    
    def _showDndOverlay: Boolean = js.native
    
    def _showNoData: Boolean = js.native
    
    /**
      * Defines the accessible ARIA name of the component.
      *
      * @type {string}
      * @name sap.ui.webc.fiori.UploadCollection.prototype.accessibleName
      * @defaultvalue ""
      * @public
      * @since 1.0.0-rc.16
      */
    var accessibleName: String = js.native
    
    def bodyDnDHandler(e: DnDEventListenerParam): Unit = js.native
    
    /**
      * Defines the <code>ui5-upload-collection</code> header.
      * <br><br>
      * <b>Note:</b> If <code>header</code> slot is provided,
      * the labelling of the <code>UploadCollection</code> is a responsibility of the application developer.
      * <code>accessibleName</code> should be used.
      *
      * @type {HTMLElement[]}
      * @name sap.ui.webc.fiori.UploadCollection.prototype.header
      * @slot
      * @public
      */
    var header: js.Array[HTMLElement] = js.native
    
    /**
      * By default there will be drag and drop overlay shown over the <code>ui5-upload-collection</code> when files
      * are dragged. If you don't intend to use drag and drop, set this property.
      * <br><br>
      * <b>Note:</b> It is up to the application developer to add handler for <code>drop</code> event and handle it.
      * <code>ui5-upload-collection</code> only displays an overlay.
      *
      * @type {boolean}
      * @name sap.ui.webc.fiori.UploadCollection.prototype.hideDragOverlay
      * @defaultvalue false
      * @public
      */
    var hideDragOverlay: Boolean = js.native
    
    /**
      * Defines the items of the <code>ui5-upload-collection</code>.
      * <br><b>Note:</b> Use <code>ui5-upload-collection-item</code> for the intended design.
      *
      * @type {sap.ui.webc.fiori.IUploadCollectionItem[]}
      * @name sap.ui.webc.fiori.UploadCollection.prototype.default
      * @slot items
      * @public
      */
    var items: js.Array[HTMLElement] = js.native
    
    /**
      * Defines the mode of the <code>ui5-upload-collection</code>.
      *
      * <br><br>
      * <b>Note:</b>
      * <ul>
      * <li><code>None</code></li>
      * <li><code>SingleSelect</code></li>
      * <li><code>MultiSelect</code></li>
      * <li><code>Delete</code></li>
      * </ul>
      *
      * @type {sap.ui.webc.main.types.ListMode}
      * @name sap.ui.webc.fiori.UploadCollection.prototype.mode
      * @defaultvalue "None"
      * @public
      */
    var mode: ListMode = js.native
    
    /**
      * Allows you to set your own text for the 'No data' description.
      *
      * @type {string}
      * @name sap.ui.webc.fiori.UploadCollection.prototype.noDataDescription
      * @defaultvalue ""
      * @public
      */
    var noDataDescription: String = js.native
    
    /**
      * Allows you to set your own text for the 'No data' text.
      *
      * @type {string}
      * @name sap.ui.webc.fiori.UploadCollection.prototype.noDataText
      * @defaultvalue ""
      * @public
      */
    var noDataText: String = js.native
  }
}
