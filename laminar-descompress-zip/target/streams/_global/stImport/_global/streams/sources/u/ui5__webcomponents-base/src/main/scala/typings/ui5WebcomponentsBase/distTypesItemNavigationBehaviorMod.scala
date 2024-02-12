package typings.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesItemNavigationBehaviorMod {
  
  @JSImport("@ui5/webcomponents-base/dist/types/ItemNavigationBehavior", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ItemNavigationBehavior & String] = js.native
    
    /* "Cyclic" */ val Cyclic: typings.ui5WebcomponentsBase.distTypesItemNavigationBehaviorMod.ItemNavigationBehavior.Cyclic & String = js.native
    
    /* "Static" */ val Static: typings.ui5WebcomponentsBase.distTypesItemNavigationBehaviorMod.ItemNavigationBehavior.Static & String = js.native
  }
  
  @js.native
  sealed trait ItemNavigationBehavior extends StObject
  @JSImport("@ui5/webcomponents-base/dist/types/ItemNavigationBehavior", "ItemNavigationBehavior")
  @js.native
  object ItemNavigationBehavior extends StObject {
    
    /**
      * Cycling behavior: navigating past the last item continues with the first and vice versa.
      * @public
      * @type {Cyclic}
      */
    @js.native
    sealed trait Cyclic
      extends StObject
         with ItemNavigationBehavior
    
    /**
      * Static behavior: navigations stops at the first or last item.
      * @public
      * @type {Static}
      */
    @js.native
    sealed trait Static
      extends StObject
         with ItemNavigationBehavior
  }
}
