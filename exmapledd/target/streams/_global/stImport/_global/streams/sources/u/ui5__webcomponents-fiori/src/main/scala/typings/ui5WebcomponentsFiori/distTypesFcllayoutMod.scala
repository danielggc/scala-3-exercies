package typings.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFcllayoutMod {
  
  @JSImport("@ui5/webcomponents-fiori/dist/types/FCLLayout", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FCLLayout & String] = js.native
    
    /* "EndColumnFullScreen" */ val EndColumnFullScreen: typings.ui5WebcomponentsFiori.distTypesFcllayoutMod.FCLLayout.EndColumnFullScreen & String = js.native
    
    /* "MidColumnFullScreen" */ val MidColumnFullScreen: typings.ui5WebcomponentsFiori.distTypesFcllayoutMod.FCLLayout.MidColumnFullScreen & String = js.native
    
    /* "OneColumn" */ val OneColumn: typings.ui5WebcomponentsFiori.distTypesFcllayoutMod.FCLLayout.OneColumn & String = js.native
    
    /* "ThreeColumnsEndExpanded" */ val ThreeColumnsEndExpanded: typings.ui5WebcomponentsFiori.distTypesFcllayoutMod.FCLLayout.ThreeColumnsEndExpanded & String = js.native
    
    /* "ThreeColumnsMidExpanded" */ val ThreeColumnsMidExpanded: typings.ui5WebcomponentsFiori.distTypesFcllayoutMod.FCLLayout.ThreeColumnsMidExpanded & String = js.native
    
    /* "ThreeColumnsMidExpandedEndHidden" */ val ThreeColumnsMidExpandedEndHidden: typings.ui5WebcomponentsFiori.distTypesFcllayoutMod.FCLLayout.ThreeColumnsMidExpandedEndHidden & String = js.native
    
    /* "ThreeColumnsStartExpandedEndHidden" */ val ThreeColumnsStartExpandedEndHidden: typings.ui5WebcomponentsFiori.distTypesFcllayoutMod.FCLLayout.ThreeColumnsStartExpandedEndHidden & String = js.native
    
    /* "TwoColumnsMidExpanded" */ val TwoColumnsMidExpanded: typings.ui5WebcomponentsFiori.distTypesFcllayoutMod.FCLLayout.TwoColumnsMidExpanded & String = js.native
    
    /* "TwoColumnsStartExpanded" */ val TwoColumnsStartExpanded: typings.ui5WebcomponentsFiori.distTypesFcllayoutMod.FCLLayout.TwoColumnsStartExpanded & String = js.native
  }
  
  @js.native
  sealed trait FCLLayout extends StObject
  @JSImport("@ui5/webcomponents-fiori/dist/types/FCLLayout", "FCLLayout")
  @js.native
  object FCLLayout extends StObject {
    
    /**
      * Desktop: -- -- 100  only the End column is displayed
      * Tablet:  -- -- 100  only the End column is displayed
      * Phone:   -- -- 100  only the End column is displayed
      *
      * Use to display a detail-detail page only, when the user should focus entirely on it.
      *
      * @public
      * @type EndColumnFullScreen
      */
    @js.native
    sealed trait EndColumnFullScreen
      extends StObject
         with FCLLayout
    
    /**
      * Desktop: -- 100 --  only the Mid column is displayed
      * Tablet:  -- 100 --  only the Mid column is displayed
      * Phone:   -- 100 --  only the Mid column is displayed
      *
      * Use to display a detail page only, when the user should focus entirely on it.
      *
      * @public
      * @type MidColumnFullScreen
      */
    @js.native
    sealed trait MidColumnFullScreen
      extends StObject
         with FCLLayout
    
    /**
      * The layout will display 1 column.
      * @public
      * @type {OneColumn}
      */
    @js.native
    sealed trait OneColumn
      extends StObject
         with FCLLayout
    
    /**
      * Desktop: 25 - 25 - 50 Start, Mid and End (expanded) columns are displayed
      * Tablet:  0 - 33 - 67  Mid and End (expanded) columns are displayed, Start is accessible by layout arrows
      * Phone:   -- -- 100  (only the End column is displayed)
      *
      * Use to display all three pages (list, detail, detail-detail) when the user should focus on the detail-detail.
      *
      * @public
      * @type ThreeColumnsEndExpanded
      */
    @js.native
    sealed trait ThreeColumnsEndExpanded
      extends StObject
         with FCLLayout
    
    /**
      * Desktop: 25 - 50 - 25 Start, Mid (expanded) and End columns are displayed
      * Tablet:  0 - 67 - 33  Mid (expanded) and End columns are displayed, Start is accessible by a layout arrow
      * Phone:   -- -- 100  only the End column is displayed
      *
      * Use to display all three pages (list, detail, detail-detail) when the user should focus on the detail.
      *
      * @type {ThreeColumnsMidExpanded}
      * @public
      */
    @js.native
    sealed trait ThreeColumnsMidExpanded
      extends StObject
         with FCLLayout
    
    /**
      * Desktop: 33 - 67 - 0  Start and Mid (expanded) columns are displayed, End is accessible by a layout arrow
      * Tablet:  33 - 67 - 0  Start and Mid (expanded) columns are displayed, End is accessible by a layout arrow
      * Phone:   -- -- 100  only the End column is displayed
      *
      * Use to display the list and detail pages when the user should focus on the detail.
      * The detail-detail is still loaded and easily accessible with a layout arrow.
      *
      * @public
      * @type ThreeColumnsMidExpandedEndHidden
      */
    @js.native
    sealed trait ThreeColumnsMidExpandedEndHidden
      extends StObject
         with FCLLayout
    
    /**
      * Desktop: 67 - 33 - 0  Start (expanded) and Mid columns are displayed, End is accessible by layout arrows
      * Tablet:  67 - 33 - 0  Start (expanded) and Mid columns are displayed, End is accessible by layout arrows
      * Phone:   -- -- 100  only the End column is displayed
      *
      * Use to display the list and detail pages when the user should focus on the list.
      * The detail-detail is still loaded and easily accessible with layout arrows.
      *
      * @public
      * @type ThreeColumnsStartExpandedEndHidden
      */
    @js.native
    sealed trait ThreeColumnsStartExpandedEndHidden
      extends StObject
         with FCLLayout
    
    /**
      * Desktop: 33 - 67 - --  Start and Mid (expanded) columns are displayed
      * Tablet:  33 - 67 - --  Start and Mid (expanded) columns are displayed
      * Phone:   -- 100 --   only the Mid column is displayed
      *
      * Use to display both a list and a detail page when the user should focus on the detail page.
      *
      * @type {TwoColumnsMidExpanded}
      * @public
      */
    @js.native
    sealed trait TwoColumnsMidExpanded
      extends StObject
         with FCLLayout
    
    /**
      *
      * Desktop: 67 - 33 - -- Start (expanded) and Mid columns are displayed
      * Tablet:  67 - 33 - -- Start (expanded) and Mid columns are displayed
      * Phone:   -- 100 --  only the Mid column is displayed
      *
      * Use to display both a list and a detail page when the user should focus on the list page.
      *
      * @type {TwoColumnsStartExpanded}
      * @public
      */
    @js.native
    sealed trait TwoColumnsStartExpanded
      extends StObject
         with FCLLayout
  }
}
