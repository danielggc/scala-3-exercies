package typings.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMediaGalleryLayoutMod {
  
  @JSImport("@ui5/webcomponents-fiori/dist/types/MediaGalleryLayout", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MediaGalleryLayout & String] = js.native
    
    /* "Auto" */ val Auto: typings.ui5WebcomponentsFiori.distTypesMediaGalleryLayoutMod.MediaGalleryLayout.Auto & String = js.native
    
    /* "Horizontal" */ val Horizontal: typings.ui5WebcomponentsFiori.distTypesMediaGalleryLayoutMod.MediaGalleryLayout.Horizontal & String = js.native
    
    /* "Vertical" */ val Vertical: typings.ui5WebcomponentsFiori.distTypesMediaGalleryLayoutMod.MediaGalleryLayout.Vertical & String = js.native
  }
  
  @js.native
  sealed trait MediaGalleryLayout extends StObject
  @JSImport("@ui5/webcomponents-fiori/dist/types/MediaGalleryLayout", "MediaGalleryLayout")
  @js.native
  object MediaGalleryLayout extends StObject {
    
    /**
      * The layout is determined automatically.
      * @public
      * @type {Auto}
      */
    @js.native
    sealed trait Auto
      extends StObject
         with MediaGalleryLayout
    
    /**
      * Displays the layout as a horizontal split between the thumbnails list and the selected image.
      * @public
      * @type {Horizontal}
      */
    @js.native
    sealed trait Horizontal
      extends StObject
         with MediaGalleryLayout
    
    /**
      * Displays the layout as a vertical split between the thumbnails list and the selected image.
      * @public
      * @type {Vertical}
      */
    @js.native
    sealed trait Vertical
      extends StObject
         with MediaGalleryLayout
  }
}
