package typings.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPageBackgroundDesignMod {
  
  @JSImport("@ui5/webcomponents-fiori/dist/types/PageBackgroundDesign", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PageBackgroundDesign & String] = js.native
    
    /* "List" */ val List: typings.ui5WebcomponentsFiori.distTypesPageBackgroundDesignMod.PageBackgroundDesign.List & String = js.native
    
    /* "Solid" */ val Solid: typings.ui5WebcomponentsFiori.distTypesPageBackgroundDesignMod.PageBackgroundDesign.Solid & String = js.native
    
    /* "Transparent" */ val Transparent: typings.ui5WebcomponentsFiori.distTypesPageBackgroundDesignMod.PageBackgroundDesign.Transparent & String = js.native
  }
  
  @js.native
  sealed trait PageBackgroundDesign extends StObject
  @JSImport("@ui5/webcomponents-fiori/dist/types/PageBackgroundDesign", "PageBackgroundDesign")
  @js.native
  object PageBackgroundDesign extends StObject {
    
    /**
      * Page background color when a List is set as the Page content.
      *
      * @type {List}
      * @public
      */
    @js.native
    sealed trait List
      extends StObject
         with PageBackgroundDesign
    
    /**
      * A solid background color dependent on the theme.
      *
      * @type {Solid}
      * @public
      */
    @js.native
    sealed trait Solid
      extends StObject
         with PageBackgroundDesign
    
    /**
      * Transparent background for the page.
      *
      * @type {Transparent}
      * @public
      */
    @js.native
    sealed trait Transparent
      extends StObject
         with PageBackgroundDesign
  }
}
