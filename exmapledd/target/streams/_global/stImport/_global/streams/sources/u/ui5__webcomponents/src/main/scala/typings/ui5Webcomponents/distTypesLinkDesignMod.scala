package typings.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLinkDesignMod {
  
  @JSImport("@ui5/webcomponents/dist/types/LinkDesign", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LinkDesign & String] = js.native
    
    /* "Default" */ val Default: typings.ui5Webcomponents.distTypesLinkDesignMod.LinkDesign.Default & String = js.native
    
    /* "Emphasized" */ val Emphasized: typings.ui5Webcomponents.distTypesLinkDesignMod.LinkDesign.Emphasized & String = js.native
    
    /* "Subtle" */ val Subtle: typings.ui5Webcomponents.distTypesLinkDesignMod.LinkDesign.Subtle & String = js.native
  }
  
  @js.native
  sealed trait LinkDesign extends StObject
  @JSImport("@ui5/webcomponents/dist/types/LinkDesign", "LinkDesign")
  @js.native
  object LinkDesign extends StObject {
    
    /**
      * default type (no special styling)
      * @public
      * @type {Default}
      */
    @js.native
    sealed trait Default
      extends StObject
         with LinkDesign
    
    /**
      * emphasized type
      * @public
      * @type {Emphasized}
      */
    @js.native
    sealed trait Emphasized
      extends StObject
         with LinkDesign
    
    /**
      * subtle type (appears as regular text, rather than a link)
      * @public
      * @type {Subtle}
      */
    @js.native
    sealed trait Subtle
      extends StObject
         with LinkDesign
  }
}
