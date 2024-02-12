package typings.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesListGrowingModeMod {
  
  @JSImport("@ui5/webcomponents/dist/types/ListGrowingMode", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ListGrowingMode & String] = js.native
    
    /* "Button" */ val Button: typings.ui5Webcomponents.distTypesListGrowingModeMod.ListGrowingMode.Button & String = js.native
    
    /* "None" */ val None: typings.ui5Webcomponents.distTypesListGrowingModeMod.ListGrowingMode.None & String = js.native
    
    /* "Scroll" */ val Scroll: typings.ui5Webcomponents.distTypesListGrowingModeMod.ListGrowingMode.Scroll & String = js.native
  }
  
  @js.native
  sealed trait ListGrowingMode extends StObject
  @JSImport("@ui5/webcomponents/dist/types/ListGrowingMode", "ListGrowingMode")
  @js.native
  object ListGrowingMode extends StObject {
    
    /**
      * Component's "load-more" is fired upon pressing a "More" button.
      * at the bottom.
      * @public
      * @type {Button}
      */
    @js.native
    sealed trait Button
      extends StObject
         with ListGrowingMode
    
    /**
      * Component's growing is not enabled.
      * @public
      * @type {None}
      */
    @js.native
    sealed trait None
      extends StObject
         with ListGrowingMode
    
    /**
      * Component's "load-more" is fired upon scroll.
      * @public
      * @type {Scroll}
      */
    @js.native
    sealed trait Scroll
      extends StObject
         with ListGrowingMode
  }
}
