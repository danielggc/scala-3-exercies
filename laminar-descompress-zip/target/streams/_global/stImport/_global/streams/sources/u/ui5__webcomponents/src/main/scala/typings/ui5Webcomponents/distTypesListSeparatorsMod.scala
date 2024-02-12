package typings.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesListSeparatorsMod {
  
  @JSImport("@ui5/webcomponents/dist/types/ListSeparators", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ListSeparators & String] = js.native
    
    /* "All" */ val All: typings.ui5Webcomponents.distTypesListSeparatorsMod.ListSeparators.All & String = js.native
    
    /* "Inner" */ val Inner: typings.ui5Webcomponents.distTypesListSeparatorsMod.ListSeparators.Inner & String = js.native
    
    /* "None" */ val None: typings.ui5Webcomponents.distTypesListSeparatorsMod.ListSeparators.None & String = js.native
  }
  
  @js.native
  sealed trait ListSeparators extends StObject
  @JSImport("@ui5/webcomponents/dist/types/ListSeparators", "ListSeparators")
  @js.native
  object ListSeparators extends StObject {
    
    /**
      * Separators between the items including the last and the first one.
      * @public
      * @type {All}
      */
    @js.native
    sealed trait All
      extends StObject
         with ListSeparators
    
    /**
      * Separators between the items.
      * Note: This enumeration depends on the theme.
      * @public
      * @type {Inner}
      */
    @js.native
    sealed trait Inner
      extends StObject
         with ListSeparators
    
    /**
      * No item separators.
      * @public
      * @type {None}
      */
    @js.native
    sealed trait None
      extends StObject
         with ListSeparators
  }
}
