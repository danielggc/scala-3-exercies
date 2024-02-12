package typings.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTabContainerTabsPlacementMod {
  
  @JSImport("@ui5/webcomponents/dist/types/TabContainerTabsPlacement", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TabContainerTabsPlacement & String] = js.native
    
    /* "Bottom" */ val Bottom: typings.ui5Webcomponents.distTypesTabContainerTabsPlacementMod.TabContainerTabsPlacement.Bottom & String = js.native
    
    /* "Top" */ val Top: typings.ui5Webcomponents.distTypesTabContainerTabsPlacementMod.TabContainerTabsPlacement.Top & String = js.native
  }
  
  @js.native
  sealed trait TabContainerTabsPlacement extends StObject
  @JSImport("@ui5/webcomponents/dist/types/TabContainerTabsPlacement", "TabContainerTabsPlacement")
  @js.native
  object TabContainerTabsPlacement extends StObject {
    
    /**
      * The tab strip is displayed below the tab content
      * @private
      * @type {Bottom}
      */
    @js.native
    sealed trait Bottom
      extends StObject
         with TabContainerTabsPlacement
    
    /**
      * The tab strip is displayed above the tab content (Default)
      * @private
      * @type {Top}
      */
    @js.native
    sealed trait Top
      extends StObject
         with TabContainerTabsPlacement
  }
}
