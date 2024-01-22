package typings.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesNavigationModeMod {
  
  @JSImport("@ui5/webcomponents-base/dist/types/NavigationMode", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[NavigationMode & String] = js.native
    
    /* "Auto" */ val Auto: typings.ui5WebcomponentsBase.distTypesNavigationModeMod.NavigationMode.Auto & String = js.native
    
    /* "Horizontal" */ val Horizontal: typings.ui5WebcomponentsBase.distTypesNavigationModeMod.NavigationMode.Horizontal & String = js.native
    
    /* "Paging" */ val Paging: typings.ui5WebcomponentsBase.distTypesNavigationModeMod.NavigationMode.Paging & String = js.native
    
    /* "Vertical" */ val Vertical: typings.ui5WebcomponentsBase.distTypesNavigationModeMod.NavigationMode.Vertical & String = js.native
  }
  
  @js.native
  sealed trait NavigationMode extends StObject
  @JSImport("@ui5/webcomponents-base/dist/types/NavigationMode", "NavigationMode")
  @js.native
  object NavigationMode extends StObject {
    
    /**
      * @public
      * @type {Auto}
      */
    @js.native
    sealed trait Auto
      extends StObject
         with NavigationMode
    
    /**
      * @public
      * @type {Horizontal}
      */
    @js.native
    sealed trait Horizontal
      extends StObject
         with NavigationMode
    
    /**
      * @public
      * @type {Paging}
      */
    @js.native
    sealed trait Paging
      extends StObject
         with NavigationMode
    
    /**
      * @public
      * @type {Vertical}
      */
    @js.native
    sealed trait Vertical
      extends StObject
         with NavigationMode
  }
}
