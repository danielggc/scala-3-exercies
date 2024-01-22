package typings.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesListItemTypeMod {
  
  @JSImport("@ui5/webcomponents/dist/types/ListItemType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ListItemType & String] = js.native
    
    /* "Active" */ val Active: typings.ui5Webcomponents.distTypesListItemTypeMod.ListItemType.Active & String = js.native
    
    /* "Detail" */ val Detail: typings.ui5Webcomponents.distTypesListItemTypeMod.ListItemType.Detail & String = js.native
    
    /* "Inactive" */ val Inactive: typings.ui5Webcomponents.distTypesListItemTypeMod.ListItemType.Inactive & String = js.native
    
    /* "Navigation" */ val Navigation: typings.ui5Webcomponents.distTypesListItemTypeMod.ListItemType.Navigation & String = js.native
  }
  
  @js.native
  sealed trait ListItemType extends StObject
  @JSImport("@ui5/webcomponents/dist/types/ListItemType", "ListItemType")
  @js.native
  object ListItemType extends StObject {
    
    /**
      * Indicates that the item is clickable via active feedback when item is pressed.
      * @public
      * @type {Active}
      */
    @js.native
    sealed trait Active
      extends StObject
         with ListItemType
    
    /**
      * Enables detail button of the list item that fires detail-click event.
      * @public
      * @type {Detail}
      */
    @js.native
    sealed trait Detail
      extends StObject
         with ListItemType
    
    /**
      * Indicates the list item does not have any active feedback when item is pressed.
      * @public
      * @type {Inactive}
      */
    @js.native
    sealed trait Inactive
      extends StObject
         with ListItemType
    
    /**
      * Enables the type of navigation, which is specified to add an arrow at the end of the items and fires navigate-click event.
      * @public
      * @type {Navigation}
      */
    @js.native
    sealed trait Navigation
      extends StObject
         with ListItemType
  }
}
