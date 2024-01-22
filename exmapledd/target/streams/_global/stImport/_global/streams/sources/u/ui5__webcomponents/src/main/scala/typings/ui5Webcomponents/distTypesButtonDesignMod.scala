package typings.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesButtonDesignMod {
  
  @JSImport("@ui5/webcomponents/dist/types/ButtonDesign", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ButtonDesign & String] = js.native
    
    /* "Attention" */ val Attention: typings.ui5Webcomponents.distTypesButtonDesignMod.ButtonDesign.Attention & String = js.native
    
    /* "Default" */ val Default: typings.ui5Webcomponents.distTypesButtonDesignMod.ButtonDesign.Default & String = js.native
    
    /* "Emphasized" */ val Emphasized: typings.ui5Webcomponents.distTypesButtonDesignMod.ButtonDesign.Emphasized & String = js.native
    
    /* "Negative" */ val Negative: typings.ui5Webcomponents.distTypesButtonDesignMod.ButtonDesign.Negative & String = js.native
    
    /* "Positive" */ val Positive: typings.ui5Webcomponents.distTypesButtonDesignMod.ButtonDesign.Positive & String = js.native
    
    /* "Transparent" */ val Transparent: typings.ui5Webcomponents.distTypesButtonDesignMod.ButtonDesign.Transparent & String = js.native
  }
  
  @js.native
  sealed trait ButtonDesign extends StObject
  @JSImport("@ui5/webcomponents/dist/types/ButtonDesign", "ButtonDesign")
  @js.native
  object ButtonDesign extends StObject {
    
    /**
      * attention type
      * @public
      * @type {Attention}
      */
    @js.native
    sealed trait Attention
      extends StObject
         with ButtonDesign
    
    /**
      * default type (no special styling)
      * @public
      * @type {Default}
      */
    @js.native
    sealed trait Default
      extends StObject
         with ButtonDesign
    
    /**
      * emphasized type
      * @public
      * @type {Emphasized}
      */
    @js.native
    sealed trait Emphasized
      extends StObject
         with ButtonDesign
    
    /**
      * reject style (red button)
      * @public
      * @type {Negative}
      */
    @js.native
    sealed trait Negative
      extends StObject
         with ButtonDesign
    
    /**
      * accept type (green button)
      * @public
      * @type {Positive}
      */
    @js.native
    sealed trait Positive
      extends StObject
         with ButtonDesign
    
    /**
      * transparent type
      * @public
      * @type {Transparent}
      */
    @js.native
    sealed trait Transparent
      extends StObject
         with ButtonDesign
  }
}
