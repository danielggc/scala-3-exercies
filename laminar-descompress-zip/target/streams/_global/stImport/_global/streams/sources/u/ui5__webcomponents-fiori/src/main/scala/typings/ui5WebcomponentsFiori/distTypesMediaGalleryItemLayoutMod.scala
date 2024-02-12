package typings.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMediaGalleryItemLayoutMod {
  
  @JSImport("@ui5/webcomponents-fiori/dist/types/MediaGalleryItemLayout", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MediaGalleryItemLayout & String] = js.native
    
    /* "Square" */ val Square: typings.ui5WebcomponentsFiori.distTypesMediaGalleryItemLayoutMod.MediaGalleryItemLayout.Square & String = js.native
    
    /* "Wide" */ val Wide: typings.ui5WebcomponentsFiori.distTypesMediaGalleryItemLayoutMod.MediaGalleryItemLayout.Wide & String = js.native
  }
  
  @js.native
  sealed trait MediaGalleryItemLayout extends StObject
  @JSImport("@ui5/webcomponents-fiori/dist/types/MediaGalleryItemLayout", "MediaGalleryItemLayout")
  @js.native
  object MediaGalleryItemLayout extends StObject {
    
    /**
      * Recommended to use when the item contains an image.<br>
      * When a thumbnail is selected, it makes the corresponding enlarged content appear in a square display area.
      * @public
      * @type {Square}
      */
    @js.native
    sealed trait Square
      extends StObject
         with MediaGalleryItemLayout
    
    /**
      * Recommended to use when the item contains video content.<br>
      * When a thumbnail is selected, it makes the corresponding enlarged content appear in a wide display area
      * (stretched to fill all of the available width) for optimal user experiance.
      * @public
      * @type {Wide}
      */
    @js.native
    sealed trait Wide
      extends StObject
         with MediaGalleryItemLayout
  }
}
