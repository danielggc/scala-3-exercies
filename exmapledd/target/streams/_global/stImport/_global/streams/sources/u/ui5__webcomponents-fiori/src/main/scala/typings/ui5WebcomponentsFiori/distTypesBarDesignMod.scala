package typings.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBarDesignMod {
  
  @JSImport("@ui5/webcomponents-fiori/dist/types/BarDesign", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[BarDesign & String] = js.native
    
    /* "FloatingFooter" */ val FloatingFooter: typings.ui5WebcomponentsFiori.distTypesBarDesignMod.BarDesign.FloatingFooter & String = js.native
    
    /* "Footer" */ val Footer: typings.ui5WebcomponentsFiori.distTypesBarDesignMod.BarDesign.Footer & String = js.native
    
    /* "Header" */ val Header: typings.ui5WebcomponentsFiori.distTypesBarDesignMod.BarDesign.Header & String = js.native
    
    /* "Subheader" */ val Subheader: typings.ui5WebcomponentsFiori.distTypesBarDesignMod.BarDesign.Subheader & String = js.native
  }
  
  @js.native
  sealed trait BarDesign extends StObject
  @JSImport("@ui5/webcomponents-fiori/dist/types/BarDesign", "BarDesign")
  @js.native
  object BarDesign extends StObject {
    
    /**
      * Floating Footer type - there is visible border on all sides
      * @public
      * @type {FloatingFooter}
      */
    @js.native
    sealed trait FloatingFooter
      extends StObject
         with BarDesign
    
    /**
      * Footer type
      * @public
      * @type {Footer}
      */
    @js.native
    sealed trait Footer
      extends StObject
         with BarDesign
    
    /**
      * Default type
      * @public
      * @type {Header}
      */
    @js.native
    sealed trait Header
      extends StObject
         with BarDesign
    
    /**
      * Subheader type
      * @public
      * @type {Subheader}
      */
    @js.native
    sealed trait Subheader
      extends StObject
         with BarDesign
  }
}
