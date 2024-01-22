package typings.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAvatarShapeMod {
  
  @JSImport("@ui5/webcomponents/dist/types/AvatarShape", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AvatarShape & String] = js.native
    
    /* "Circle" */ val Circle: typings.ui5Webcomponents.distTypesAvatarShapeMod.AvatarShape.Circle & String = js.native
    
    /* "Square" */ val Square: typings.ui5Webcomponents.distTypesAvatarShapeMod.AvatarShape.Square & String = js.native
  }
  
  @js.native
  sealed trait AvatarShape extends StObject
  @JSImport("@ui5/webcomponents/dist/types/AvatarShape", "AvatarShape")
  @js.native
  object AvatarShape extends StObject {
    
    /**
      * Circular shape.
      * @public
      * @type {Circle}
      */
    @js.native
    sealed trait Circle
      extends StObject
         with AvatarShape
    
    /**
      * Square shape.
      * @public
      * @type {Square}
      */
    @js.native
    sealed trait Square
      extends StObject
         with AvatarShape
  }
}
