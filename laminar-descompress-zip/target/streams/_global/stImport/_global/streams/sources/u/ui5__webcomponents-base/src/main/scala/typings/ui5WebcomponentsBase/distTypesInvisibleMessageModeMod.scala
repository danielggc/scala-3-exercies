package typings.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInvisibleMessageModeMod {
  
  @JSImport("@ui5/webcomponents-base/dist/types/InvisibleMessageMode", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[InvisibleMessageMode & String] = js.native
    
    /* "Assertive" */ val Assertive: typings.ui5WebcomponentsBase.distTypesInvisibleMessageModeMod.InvisibleMessageMode.Assertive & String = js.native
    
    /* "Polite" */ val Polite: typings.ui5WebcomponentsBase.distTypesInvisibleMessageModeMod.InvisibleMessageMode.Polite & String = js.native
  }
  
  @js.native
  sealed trait InvisibleMessageMode extends StObject
  @JSImport("@ui5/webcomponents-base/dist/types/InvisibleMessageMode", "InvisibleMessageMode")
  @js.native
  object InvisibleMessageMode extends StObject {
    
    /**
      * Indicates that updates to the region have the highest priority and should be presented to the user immediately.
      * @public
      * @type {Assertive}
      */
    @js.native
    sealed trait Assertive
      extends StObject
         with InvisibleMessageMode
    
    /**
      * Indicates that updates to the region should be presented at the next graceful opportunity,
      * such as at the end of reading the current sentence, or when the user pauses typing.
      * @public
      * @type {Polite}
      */
    @js.native
    sealed trait Polite
      extends StObject
         with InvisibleMessageMode
  }
}
