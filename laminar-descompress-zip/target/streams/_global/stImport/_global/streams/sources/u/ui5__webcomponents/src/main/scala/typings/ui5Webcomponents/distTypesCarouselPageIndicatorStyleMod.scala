package typings.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCarouselPageIndicatorStyleMod {
  
  @JSImport("@ui5/webcomponents/dist/types/CarouselPageIndicatorStyle", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CarouselPageIndicatorStyle & String] = js.native
    
    /* "Default" */ val Default: typings.ui5Webcomponents.distTypesCarouselPageIndicatorStyleMod.CarouselPageIndicatorStyle.Default & String = js.native
    
    /* "Numeric" */ val Numeric: typings.ui5Webcomponents.distTypesCarouselPageIndicatorStyleMod.CarouselPageIndicatorStyle.Numeric & String = js.native
  }
  
  @js.native
  sealed trait CarouselPageIndicatorStyle extends StObject
  @JSImport("@ui5/webcomponents/dist/types/CarouselPageIndicatorStyle", "CarouselPageIndicatorStyle")
  @js.native
  object CarouselPageIndicatorStyle extends StObject {
    
    /**
      * The page indicator will be visualized as dots if there are fewer than 9 pages.
      * If there are more pages, the page indicator will switch to displaying the current page and the total number of pages. (e.g. X of Y)
      * @public
      * @type {Default}
      */
    @js.native
    sealed trait Default
      extends StObject
         with CarouselPageIndicatorStyle
    
    /**
      * The page indicator will display the current page and the total number of pages. (e.g. X of Y)
      * @public
      * @type {Numeric}
      */
    @js.native
    sealed trait Numeric
      extends StObject
         with CarouselPageIndicatorStyle
  }
}
