package typings.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCarouselArrowsPlacementMod {
  
  @JSImport("@ui5/webcomponents/dist/types/CarouselArrowsPlacement", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CarouselArrowsPlacement & String] = js.native
    
    /* "Content" */ val Content: typings.ui5Webcomponents.distTypesCarouselArrowsPlacementMod.CarouselArrowsPlacement.Content & String = js.native
    
    /* "Navigation" */ val Navigation: typings.ui5Webcomponents.distTypesCarouselArrowsPlacementMod.CarouselArrowsPlacement.Navigation & String = js.native
  }
  
  @js.native
  sealed trait CarouselArrowsPlacement extends StObject
  @JSImport("@ui5/webcomponents/dist/types/CarouselArrowsPlacement", "CarouselArrowsPlacement")
  @js.native
  object CarouselArrowsPlacement extends StObject {
    
    /**
      * Carousel arrows are placed on the sides of the current Carousel page.
      * @public
      * @type {Content}
      */
    @js.native
    sealed trait Content
      extends StObject
         with CarouselArrowsPlacement
    
    /**
      * Carousel arrows are placed on the sides of the page indicator of the Carousel.
      * @public
      * @type {Navigation}
      */
    @js.native
    sealed trait Navigation
      extends StObject
         with CarouselArrowsPlacement
  }
}
