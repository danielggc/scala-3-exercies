package typings.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTimelineLayoutMod {
  
  @JSImport("@ui5/webcomponents-fiori/dist/types/TimelineLayout", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TimelineLayout & String] = js.native
    
    /* "Horizontal" */ val Horizontal: typings.ui5WebcomponentsFiori.distTypesTimelineLayoutMod.TimelineLayout.Horizontal & String = js.native
    
    /* "Vertical" */ val Vertical: typings.ui5WebcomponentsFiori.distTypesTimelineLayoutMod.TimelineLayout.Vertical & String = js.native
  }
  
  @js.native
  sealed trait TimelineLayout extends StObject
  @JSImport("@ui5/webcomponents-fiori/dist/types/TimelineLayout", "TimelineLayout")
  @js.native
  object TimelineLayout extends StObject {
    
    /**
      * Horizontal layout
      * @public
      * @type {Horizontal}
      */
    @js.native
    sealed trait Horizontal
      extends StObject
         with TimelineLayout
    
    /**
      * Vertical layout
      * Default type
      * @public
      * @type {Vertical}
      */
    @js.native
    sealed trait Vertical
      extends StObject
         with TimelineLayout
  }
}
