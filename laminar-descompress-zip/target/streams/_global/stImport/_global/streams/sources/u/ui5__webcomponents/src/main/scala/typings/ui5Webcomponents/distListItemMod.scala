package typings.ui5Webcomponents

import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.TouchEvent
import typings.ui5Webcomponents.anon.AriaExpanded
import typings.ui5Webcomponents.distTypesHasPopupMod.HasPopup
import typings.ui5Webcomponents.distTypesListItemTypeMod.ListItemType
import typings.ui5Webcomponents.distTypesListModeMod.ListMode
import typings.ui5WebcomponentsBase.distTypesMod.PassiveEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distListItemMod {
  
  /**
    * @class
    * A class to serve as a base
    * for the <code>StandardListItem</code> and <code>CustomListItem</code> classes.
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.ListItem
    * @extends sap.ui.webc.main.ListItemBase
    * @public
    */
  /* note: abstract class */ @JSImport("@ui5/webcomponents/dist/ListItem", JSImport.Default)
  @js.native
  open class default () extends ListItem
  object default {
    
    @JSImport("@ui5/webcomponents/dist/ListItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/ListItem", "default.i18nBundle")
    @js.native
    def i18nBundle: typings.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: typings.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def onDefine(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("onDefine")().asInstanceOf[js.Promise[Unit]]
  }
  
  trait IAccessibleListItem extends StObject {
    
    var accessibleName: js.UndefOr[String] = js.undefined
    
    var accessibleNameRef: js.UndefOr[String] = js.undefined
  }
  object IAccessibleListItem {
    
    inline def apply(): IAccessibleListItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAccessibleListItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAccessibleListItem] (val x: Self) extends AnyVal {
      
      inline def setAccessibleName(value: String): Self = StObject.set(x, "accessibleName", value.asInstanceOf[js.Any])
      
      inline def setAccessibleNameRef(value: String): Self = StObject.set(x, "accessibleNameRef", value.asInstanceOf[js.Any])
      
      inline def setAccessibleNameRefUndefined: Self = StObject.set(x, "accessibleNameRef", js.undefined)
      
      inline def setAccessibleNameUndefined: Self = StObject.set(x, "accessibleName", js.undefined)
    }
  }
  
  /**
    * @class
    * A class to serve as a base
    * for the <code>StandardListItem</code> and <code>CustomListItem</code> classes.
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.ListItem
    * @extends sap.ui.webc.main.ListItemBase
    * @public
    */
  @js.native
  trait ListItem
    extends typings.ui5Webcomponents.distListItemBaseMod.default {
    
    def _accInfo: AriaExpanded = js.native
    
    def _accessibleNameRef: String = js.native
    
    def _ariaSelected: js.UndefOr[Boolean] = js.native
    
    var _level: js.UndefOr[Double] = js.native
    
    var _mode: ListMode = js.native
    
    def _onclick(e: MouseEvent): Unit = js.native
    
    def _onmousedown(e: MouseEvent): Unit = js.native
    
    def _onmouseup(e: MouseEvent): Unit = js.native
    
    def _ontouchend(e: TouchEvent): Unit = js.native
    
    var _ontouchstart: PassiveEventListenerObject = js.native
    
    /**
      * Used to define the role of the list item.
      *
      * @private
      * @type {string}
      * @name sap.ui.webc.main.ListItem.prototype.accessibleRole
      * @defaultvalue ""
      * @since 1.3.0
      *
      */
    var accessibleRole: String = js.native
    
    /**
      * Defines the description for the accessible role of the component.
      * @protected
      * @type {string}
      * @name sap.ui.webc.main.ListItem.prototype.accessibleRoleDescription
      * @defaultvalue undefined
      * @since 1.10.0
      */
    var accessibleRoleDescription: js.UndefOr[String] = js.native
    
    /**
      * Indicates if the list item is actionable, e.g has hover and pressed effects.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.ListItem.prototype.actionable
      * @private
      */
    var actionable: Boolean = js.native
    
    def activate(): Unit = js.native
    
    /**
      * Indicates if the list item is active, e.g pressed down with the mouse or the keyboard keys.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.ListItem.prototype.active
      * @private
      */
    var active: Boolean = js.native
    
    /**
      * Defines the availability and type of interactive popup element that can be triggered by the component on which the property is set.
      * @type {sap.ui.webc.main.types.HasPopup}
      * @name sap.ui.webc.main.ListItem.prototype.ariaHaspopup
      * @since 1.10.0
      * @private
      */
    var ariaHaspopup: js.UndefOr[HasPopup] = js.native
    
    def ariaSelectedText: js.UndefOr[String] = js.native
    
    def deactivate(): Unit = js.native
    
    def deactivateByKey(e: KeyboardEvent): Unit = js.native
    
    /**
      * Defines the delete button, displayed in "Delete" mode.
      * <b>Note:</b> While the slot allows custom buttons, to match
      * design guidelines, please use the <code>ui5-button</code> component.
      * <b>Note:</b> When the slot is not present, a built-in delete button will be displayed.
      * @type {sap.ui.webc.main.IButton}
      * @name sap.ui.webc.main.ListItem.prototype.deleteButton
      * @since 1.9.0
      * @slot
      * @public
      */
    var deleteButton: js.Array[HTMLElement] = js.native
    
    def deleteText: String = js.native
    
    /**
      * Used in UploadCollectionItem
      * @private
      */
    var disableDeleteButton: Boolean = js.native
    
    def fireItemPress(e: Event): Unit = js.native
    
    def hasDeleteButtonSlot: Boolean = js.native
    
    def isInactive: Boolean = js.native
    
    def modeDelete: Boolean = js.native
    
    def modeMultiSelect: Boolean = js.native
    
    def modeSingleSelect: Boolean = js.native
    
    /**
      * The navigated state of the list item.
      * If set to <code>true</code>, a navigation indicator is displayed at the end of the list item.
      *
      * @public
      * @type {boolean}
      * @name sap.ui.webc.main.ListItem.prototype.navigated
      * @since 1.10.0
      */
    var navigated: Boolean = js.native
    
    def onDelete(): Unit = js.native
    
    def onDetailClick(): Unit = js.native
    
    def onMultiSelectionComponentPress(e: MouseEvent): Unit = js.native
    
    def onSingleSelectionComponentPress(e: MouseEvent): Unit = js.native
    
    def placeSelectionElementAfter: Boolean = js.native
    
    def placeSelectionElementBefore: Boolean = js.native
    
    /**
      * Used in UploadCollectionItem
      */
    def renderDeleteButton: Boolean = js.native
    
    /**
      * Used to define the role of the list item.
      *
      * @private
      * @type {string}
      * @name sap.ui.webc.main.ListItem.prototype.role
      * @defaultvalue "listitem"
      * @since 1.0.0-rc.9
      *
      */
    @JSName("role")
    var role_ListItem: String = js.native
    
    /**
      * Defines the visual indication and behavior of the list items.
      * Available options are <code>Active</code> (by default), <code>Inactive</code>, <code>Detail</code> and <code>Navigation</code>.
      * <br><br>
      * <b>Note:</b> When set to <code>Active</code> or <code>Navigation</code>, the item will provide visual response upon press and hover,
      * while with type <code>Inactive</code> and <code>Detail</code> - will not.
      *
      * @type {sap.ui.webc.main.types.ListItemType}
      * @name sap.ui.webc.main.ListItem.prototype.type
      * @defaultvalue "Active"
      * @public
      */
    var `type`: ListItemType = js.native
    
    def typeActive: Boolean = js.native
    
    /**
      * End
      */
    def typeDetail: Boolean = js.native
    
    def typeNavigation: Boolean = js.native
  }
  
  trait PressEventDetail extends StObject {
    
    var item: ListItem
    
    var key: String
    
    var selected: Boolean
  }
  object PressEventDetail {
    
    inline def apply(item: ListItem, key: String, selected: Boolean): PressEventDetail = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[PressEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PressEventDetail] (val x: Self) extends AnyVal {
      
      inline def setItem(value: ListItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
  
  trait SelectionRequestEventDetail extends StObject {
    
    var item: typings.ui5Webcomponents.distListItemBaseMod.default
    
    var key: js.UndefOr[String] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var selectionComponentPressed: Boolean
  }
  object SelectionRequestEventDetail {
    
    inline def apply(item: typings.ui5Webcomponents.distListItemBaseMod.default, selectionComponentPressed: Boolean): SelectionRequestEventDetail = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], selectionComponentPressed = selectionComponentPressed.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionRequestEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectionRequestEventDetail] (val x: Self) extends AnyVal {
      
      inline def setItem(value: typings.ui5Webcomponents.distListItemBaseMod.default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setSelectionComponentPressed(value: Boolean): Self = StObject.set(x, "selectionComponentPressed", value.asInstanceOf[js.Any])
    }
  }
}
