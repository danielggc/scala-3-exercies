package typings.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTabContainerBackgroundDesignMod {
  
  @JSImport("@ui5/webcomponents/dist/types/TabContainerBackgroundDesign", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TabContainerBackgroundDesign & String] = js.native
    
    /* "Solid" */ val Solid: typings.ui5Webcomponents.distTypesTabContainerBackgroundDesignMod.TabContainerBackgroundDesign.Solid & String = js.native
    
    /* "Translucent" */ val Translucent: typings.ui5Webcomponents.distTypesTabContainerBackgroundDesignMod.TabContainerBackgroundDesign.Translucent & String = js.native
    
    /* "Transparent" */ val Transparent: typings.ui5Webcomponents.distTypesTabContainerBackgroundDesignMod.TabContainerBackgroundDesign.Transparent & String = js.native
  }
  
  @js.native
  sealed trait TabContainerBackgroundDesign extends StObject
  @JSImport("@ui5/webcomponents/dist/types/TabContainerBackgroundDesign", "TabContainerBackgroundDesign")
  @js.native
  object TabContainerBackgroundDesign extends StObject {
    
    /**
      * A Solid background color.
      * @public
      * @type {Solid}
      */
    @js.native
    sealed trait Solid
      extends StObject
         with TabContainerBackgroundDesign
    
    /**
      * A Translucent background color.
      * @public
      * @type {Translucent}
      */
    @js.native
    sealed trait Translucent
      extends StObject
         with TabContainerBackgroundDesign
    
    /**
      * A Transparent background color.
      * @public
      * @type {Transparent}
      */
    @js.native
    sealed trait Transparent
      extends StObject
         with TabContainerBackgroundDesign
  }
}
