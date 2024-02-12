package typings.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBusyIndicatorSizeMod {
  
  @JSImport("@ui5/webcomponents/dist/types/BusyIndicatorSize", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[BusyIndicatorSize & String] = js.native
    
    /* "Large" */ val Large: typings.ui5Webcomponents.distTypesBusyIndicatorSizeMod.BusyIndicatorSize.Large & String = js.native
    
    /* "Medium" */ val Medium: typings.ui5Webcomponents.distTypesBusyIndicatorSizeMod.BusyIndicatorSize.Medium & String = js.native
    
    /* "Small" */ val Small: typings.ui5Webcomponents.distTypesBusyIndicatorSizeMod.BusyIndicatorSize.Small & String = js.native
  }
  
  @js.native
  sealed trait BusyIndicatorSize extends StObject
  @JSImport("@ui5/webcomponents/dist/types/BusyIndicatorSize", "BusyIndicatorSize")
  @js.native
  object BusyIndicatorSize extends StObject {
    
    /**
      * large size
      * @public
      * @type {Large}
      */
    @js.native
    sealed trait Large
      extends StObject
         with BusyIndicatorSize
    
    /**
      * medium size
      * @public
      * @type {Medium}
      */
    @js.native
    sealed trait Medium
      extends StObject
         with BusyIndicatorSize
    
    /**
      * small size
      * @public
      * @type {Small}
      */
    @js.native
    sealed trait Small
      extends StObject
         with BusyIndicatorSize
  }
}
