package typings.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHasPopupMod {
  
  @JSImport("@ui5/webcomponents/dist/types/HasPopup", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[HasPopup & String] = js.native
    
    /* "Dialog" */ val Dialog: typings.ui5Webcomponents.distTypesHasPopupMod.HasPopup.Dialog & String = js.native
    
    /* "Grid" */ val Grid: typings.ui5Webcomponents.distTypesHasPopupMod.HasPopup.Grid & String = js.native
    
    /* "ListBox" */ val ListBox: typings.ui5Webcomponents.distTypesHasPopupMod.HasPopup.ListBox & String = js.native
    
    /* "Menu" */ val Menu: typings.ui5Webcomponents.distTypesHasPopupMod.HasPopup.Menu & String = js.native
    
    /* "Tree" */ val Tree: typings.ui5Webcomponents.distTypesHasPopupMod.HasPopup.Tree & String = js.native
  }
  
  @js.native
  sealed trait HasPopup extends StObject
  @JSImport("@ui5/webcomponents/dist/types/HasPopup", "HasPopup")
  @js.native
  object HasPopup extends StObject {
    
    /**
      * Dialog popup type.
      * @public
      * @type {Dialog}
      */
    @js.native
    sealed trait Dialog
      extends StObject
         with HasPopup
    
    /**
      * Grid popup type.
      * @public
      * @type {Grid}
      */
    @js.native
    sealed trait Grid
      extends StObject
         with HasPopup
    
    /**
      * ListBox popup type.
      * @public
      * @type {ListBox}
      */
    @js.native
    sealed trait ListBox
      extends StObject
         with HasPopup
    
    /**
      * Menu popup type.
      * @public
      * @type {Menu}
      */
    @js.native
    sealed trait Menu
      extends StObject
         with HasPopup
    
    /**
      * Tree popup type.
      * @public
      * @type {Tree}
      */
    @js.native
    sealed trait Tree
      extends StObject
         with HasPopup
  }
}
