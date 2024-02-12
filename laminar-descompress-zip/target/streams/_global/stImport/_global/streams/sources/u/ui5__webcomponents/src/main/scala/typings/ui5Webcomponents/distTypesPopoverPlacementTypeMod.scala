package typings.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPopoverPlacementTypeMod {
  
  @JSImport("@ui5/webcomponents/dist/types/PopoverPlacementType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PopoverPlacementType & String] = js.native
    
    /* "Bottom" */ val Bottom: typings.ui5Webcomponents.distTypesPopoverPlacementTypeMod.PopoverPlacementType.Bottom & String = js.native
    
    /* "Left" */ val Left: typings.ui5Webcomponents.distTypesPopoverPlacementTypeMod.PopoverPlacementType.Left & String = js.native
    
    /* "Right" */ val Right: typings.ui5Webcomponents.distTypesPopoverPlacementTypeMod.PopoverPlacementType.Right & String = js.native
    
    /* "Top" */ val Top: typings.ui5Webcomponents.distTypesPopoverPlacementTypeMod.PopoverPlacementType.Top & String = js.native
  }
  
  @js.native
  sealed trait PopoverPlacementType extends StObject
  @JSImport("@ui5/webcomponents/dist/types/PopoverPlacementType", "PopoverPlacementType")
  @js.native
  object PopoverPlacementType extends StObject {
    
    /**
      * Popover will be placed at the bottom of the reference element.
      * @public
      * @type {Bottom}
      */
    @js.native
    sealed trait Bottom
      extends StObject
         with PopoverPlacementType
    
    /**
      * Popover will be placed at the left side of the reference element.
      * @public
      * @type {Left}
      */
    @js.native
    sealed trait Left
      extends StObject
         with PopoverPlacementType
    
    /**
      * Popover will be placed at the right side of the reference element.
      * @public
      * @type {Right}
      */
    @js.native
    sealed trait Right
      extends StObject
         with PopoverPlacementType
    
    /**
      * Popover will be placed at the top of the reference element.
      * @public
      * @type {Top}
      */
    @js.native
    sealed trait Top
      extends StObject
         with PopoverPlacementType
  }
}
