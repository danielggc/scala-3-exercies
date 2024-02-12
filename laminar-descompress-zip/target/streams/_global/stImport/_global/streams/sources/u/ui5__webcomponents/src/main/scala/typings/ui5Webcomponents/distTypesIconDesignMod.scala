package typings.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesIconDesignMod {
  
  @JSImport("@ui5/webcomponents/dist/types/IconDesign", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[IconDesign & String] = js.native
    
    /* "Contrast" */ val Contrast: typings.ui5Webcomponents.distTypesIconDesignMod.IconDesign.Contrast & String = js.native
    
    /* "Critical" */ val Critical: typings.ui5Webcomponents.distTypesIconDesignMod.IconDesign.Critical & String = js.native
    
    /* "Default" */ val Default: typings.ui5Webcomponents.distTypesIconDesignMod.IconDesign.Default & String = js.native
    
    /* "Information" */ val Information: typings.ui5Webcomponents.distTypesIconDesignMod.IconDesign.Information & String = js.native
    
    /* "Negative" */ val Negative: typings.ui5Webcomponents.distTypesIconDesignMod.IconDesign.Negative & String = js.native
    
    /* "Neutral" */ val Neutral: typings.ui5Webcomponents.distTypesIconDesignMod.IconDesign.Neutral & String = js.native
    
    /* "NonInteractive" */ val NonInteractive: typings.ui5Webcomponents.distTypesIconDesignMod.IconDesign.NonInteractive & String = js.native
    
    /* "Positive" */ val Positive: typings.ui5Webcomponents.distTypesIconDesignMod.IconDesign.Positive & String = js.native
  }
  
  @js.native
  sealed trait IconDesign extends StObject
  @JSImport("@ui5/webcomponents/dist/types/IconDesign", "IconDesign")
  @js.native
  object IconDesign extends StObject {
    
    /**
      * Contrast design
      * @public
      * @type {Contrast}
      */
    @js.native
    sealed trait Contrast
      extends StObject
         with IconDesign
    
    /**
      * Critical design
      * @public
      * @type {Critical}
      */
    @js.native
    sealed trait Critical
      extends StObject
         with IconDesign
    
    /**
      * Default design (brand design)
      * @public
      * @type {Default}
      */
    @js.native
    sealed trait Default
      extends StObject
         with IconDesign
    
    /**
      * info type
      * @public
      * @type {Information}
      */
    @js.native
    sealed trait Information
      extends StObject
         with IconDesign
    
    /**
      * Negative design
      * @public
      * @type {Negative}
      */
    @js.native
    sealed trait Negative
      extends StObject
         with IconDesign
    
    /**
      * Neutral design
      * @public
      * @type {Neutral}
      */
    @js.native
    sealed trait Neutral
      extends StObject
         with IconDesign
    
    /**
      * Design that indicates an icon which isn't interactive
      * @public
      * @type {NonInteractive}
      */
    @js.native
    sealed trait NonInteractive
      extends StObject
         with IconDesign
    
    /**
      * Positive design
      * @public
      * @type {Positive}
      */
    @js.native
    sealed trait Positive
      extends StObject
         with IconDesign
  }
}
