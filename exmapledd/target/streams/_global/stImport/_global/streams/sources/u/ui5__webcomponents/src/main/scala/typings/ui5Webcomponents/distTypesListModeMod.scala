package typings.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesListModeMod {
  
  @JSImport("@ui5/webcomponents/dist/types/ListMode", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ListMode & String] = js.native
    
    /* "Delete" */ val Delete: typings.ui5Webcomponents.distTypesListModeMod.ListMode.Delete & String = js.native
    
    /* "MultiSelect" */ val MultiSelect: typings.ui5Webcomponents.distTypesListModeMod.ListMode.MultiSelect & String = js.native
    
    /* "None" */ val None: typings.ui5Webcomponents.distTypesListModeMod.ListMode.None & String = js.native
    
    /* "SingleSelect" */ val SingleSelect: typings.ui5Webcomponents.distTypesListModeMod.ListMode.SingleSelect & String = js.native
    
    /* "SingleSelectAuto" */ val SingleSelectAuto: typings.ui5Webcomponents.distTypesListModeMod.ListMode.SingleSelectAuto & String = js.native
    
    /* "SingleSelectBegin" */ val SingleSelectBegin: typings.ui5Webcomponents.distTypesListModeMod.ListMode.SingleSelectBegin & String = js.native
    
    /* "SingleSelectEnd" */ val SingleSelectEnd: typings.ui5Webcomponents.distTypesListModeMod.ListMode.SingleSelectEnd & String = js.native
  }
  
  @js.native
  sealed trait ListMode extends StObject
  @JSImport("@ui5/webcomponents/dist/types/ListMode", "ListMode")
  @js.native
  object ListMode extends StObject {
    
    /**
      * Delete mode (only one list item can be deleted via provided delete button)
      * @public
      * @type {Delete}
      */
    @js.native
    sealed trait Delete
      extends StObject
         with ListMode
    
    /**
      * Multi selection mode (more than one list item can be selected).
      * @public
      * @type {MultiSelect}
      */
    @js.native
    sealed trait MultiSelect
      extends StObject
         with ListMode
    
    /**
      * Default mode (no selection).
      * @public
      * @type {None}
      */
    @js.native
    sealed trait None
      extends StObject
         with ListMode
    
    /**
      * Right-positioned single selection mode (only one list item can be selected).
      * @public
      * @type {SingleSelect}
      */
    @js.native
    sealed trait SingleSelect
      extends StObject
         with ListMode
    
    /**
      * Selected item is highlighted and selection is changed upon arrow navigation
      * (only one list item can be selected - this is always the focused item).
      * @public
      * @type {SingleSelectAuto}
      */
    @js.native
    sealed trait SingleSelectAuto
      extends StObject
         with ListMode
    
    /**
      * Left-positioned single selection mode (only one list item can be selected).
      * @public
      * @type {SingleSelectBegin}
      */
    @js.native
    sealed trait SingleSelectBegin
      extends StObject
         with ListMode
    
    /**
      * Selected item is highlighted but no selection element is visible
      * (only one list item can be selected).
      * @public
      * @type {SingleSelectEnd}
      */
    @js.native
    sealed trait SingleSelectEnd
      extends StObject
         with ListMode
  }
}
