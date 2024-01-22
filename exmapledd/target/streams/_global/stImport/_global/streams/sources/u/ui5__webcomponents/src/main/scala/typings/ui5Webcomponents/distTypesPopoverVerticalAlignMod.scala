package typings.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPopoverVerticalAlignMod {
  
  @JSImport("@ui5/webcomponents/dist/types/PopoverVerticalAlign", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PopoverVerticalAlign & String] = js.native
    
    /* "Bottom" */ val Bottom: typings.ui5Webcomponents.distTypesPopoverVerticalAlignMod.PopoverVerticalAlign.Bottom & String = js.native
    
    /* "Center" */ val Center: typings.ui5Webcomponents.distTypesPopoverVerticalAlignMod.PopoverVerticalAlign.Center & String = js.native
    
    /* "Stretch" */ val Stretch: typings.ui5Webcomponents.distTypesPopoverVerticalAlignMod.PopoverVerticalAlign.Stretch & String = js.native
    
    /* "Top" */ val Top: typings.ui5Webcomponents.distTypesPopoverVerticalAlignMod.PopoverVerticalAlign.Top & String = js.native
  }
  
  @js.native
  sealed trait PopoverVerticalAlign extends StObject
  @JSImport("@ui5/webcomponents/dist/types/PopoverVerticalAlign", "PopoverVerticalAlign")
  @js.native
  object PopoverVerticalAlign extends StObject {
    
    /**
      * Popover will be placed at the bottom of the reference control.
      * @public
      * @type {Bottom}
      */
    @js.native
    sealed trait Bottom
      extends StObject
         with PopoverVerticalAlign
    
    /**
      *
      * @public
      * @type {Center}
      */
    @js.native
    sealed trait Center
      extends StObject
         with PopoverVerticalAlign
    
    /**
      * Popover will be streched
      * @public
      * @type {Stretch}
      */
    @js.native
    sealed trait Stretch
      extends StObject
         with PopoverVerticalAlign
    
    /**
      * Popover will be placed at the top of the reference control.
      * @public
      * @type {Top}
      */
    @js.native
    sealed trait Top
      extends StObject
         with PopoverVerticalAlign
  }
}
