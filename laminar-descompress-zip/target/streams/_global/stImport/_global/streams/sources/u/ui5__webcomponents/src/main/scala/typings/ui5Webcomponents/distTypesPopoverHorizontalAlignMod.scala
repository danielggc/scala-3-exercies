package typings.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPopoverHorizontalAlignMod {
  
  @JSImport("@ui5/webcomponents/dist/types/PopoverHorizontalAlign", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PopoverHorizontalAlign & String] = js.native
    
    /* "Center" */ val Center: typings.ui5Webcomponents.distTypesPopoverHorizontalAlignMod.PopoverHorizontalAlign.Center & String = js.native
    
    /* "Left" */ val Left: typings.ui5Webcomponents.distTypesPopoverHorizontalAlignMod.PopoverHorizontalAlign.Left & String = js.native
    
    /* "Right" */ val Right: typings.ui5Webcomponents.distTypesPopoverHorizontalAlignMod.PopoverHorizontalAlign.Right & String = js.native
    
    /* "Stretch" */ val Stretch: typings.ui5Webcomponents.distTypesPopoverHorizontalAlignMod.PopoverHorizontalAlign.Stretch & String = js.native
  }
  
  @js.native
  sealed trait PopoverHorizontalAlign extends StObject
  @JSImport("@ui5/webcomponents/dist/types/PopoverHorizontalAlign", "PopoverHorizontalAlign")
  @js.native
  object PopoverHorizontalAlign extends StObject {
    
    /**
      * Popover is centered
      * @public
      * @type {Center}
      */
    @js.native
    sealed trait Center
      extends StObject
         with PopoverHorizontalAlign
    
    /**
      * Popover opens on the left side of the target
      * @public
      * @type {Left}
      */
    @js.native
    sealed trait Left
      extends StObject
         with PopoverHorizontalAlign
    
    /**
      * Popover opens on the right side of the target
      * @public
      * @type {Right}
      */
    @js.native
    sealed trait Right
      extends StObject
         with PopoverHorizontalAlign
    
    /**
      * Popover is stretched
      * @public
      * @type {Stretch}
      */
    @js.native
    sealed trait Stretch
      extends StObject
         with PopoverHorizontalAlign
  }
}
