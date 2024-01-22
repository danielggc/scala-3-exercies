package typings.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSideContentVisibilityMod {
  
  @JSImport("@ui5/webcomponents-fiori/dist/types/SideContentVisibility", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SideContentVisibility & String] = js.native
    
    /* "AlwaysShow" */ val AlwaysShow: typings.ui5WebcomponentsFiori.distTypesSideContentVisibilityMod.SideContentVisibility.AlwaysShow & String = js.native
    
    /* "NeverShow" */ val NeverShow: typings.ui5WebcomponentsFiori.distTypesSideContentVisibilityMod.SideContentVisibility.NeverShow & String = js.native
    
    /* "ShowAboveL" */ val ShowAboveL: typings.ui5WebcomponentsFiori.distTypesSideContentVisibilityMod.SideContentVisibility.ShowAboveL & String = js.native
    
    /* "ShowAboveM" */ val ShowAboveM: typings.ui5WebcomponentsFiori.distTypesSideContentVisibilityMod.SideContentVisibility.ShowAboveM & String = js.native
    
    /* "ShowAboveS" */ val ShowAboveS: typings.ui5WebcomponentsFiori.distTypesSideContentVisibilityMod.SideContentVisibility.ShowAboveS & String = js.native
  }
  
  @js.native
  sealed trait SideContentVisibility extends StObject
  @JSImport("@ui5/webcomponents-fiori/dist/types/SideContentVisibility", "SideContentVisibility")
  @js.native
  object SideContentVisibility extends StObject {
    
    /**
      * Show the side content on any breakpoint
      * @public
      * @type {AlwaysShow}
      */
    @js.native
    sealed trait AlwaysShow
      extends StObject
         with SideContentVisibility
    
    /**
      * Don't show the side content on any breakpoints
      * @public
      * @type {NeverShow}
      */
    @js.native
    sealed trait NeverShow
      extends StObject
         with SideContentVisibility
    
    /**
      * Show the side content on XL breakpoint
      * @public
      * @type {ShowAboveL}
      */
    @js.native
    sealed trait ShowAboveL
      extends StObject
         with SideContentVisibility
    
    /**
      * Show the side content on L and XL breakpoints
      * @public
      * @type {ShowAboveM}
      */
    @js.native
    sealed trait ShowAboveM
      extends StObject
         with SideContentVisibility
    
    /**
      * Show the side content on M, L and XL breakpoints
      * @public
      * @type {ShowAboveS}
      */
    @js.native
    sealed trait ShowAboveS
      extends StObject
         with SideContentVisibility
  }
}
