package typings.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAnimationModeMod {
  
  @JSImport("@ui5/webcomponents-base/dist/types/AnimationMode", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AnimationMode & String] = js.native
    
    /* "basic" */ val Basic: typings.ui5WebcomponentsBase.distTypesAnimationModeMod.AnimationMode.Basic & String = js.native
    
    /* "full" */ val Full: typings.ui5WebcomponentsBase.distTypesAnimationModeMod.AnimationMode.Full & String = js.native
    
    /* "minimal" */ val Minimal: typings.ui5WebcomponentsBase.distTypesAnimationModeMod.AnimationMode.Minimal & String = js.native
    
    /* "none" */ val None: typings.ui5WebcomponentsBase.distTypesAnimationModeMod.AnimationMode.None & String = js.native
  }
  
  @js.native
  sealed trait AnimationMode extends StObject
  @JSImport("@ui5/webcomponents-base/dist/types/AnimationMode", "AnimationMode")
  @js.native
  object AnimationMode extends StObject {
    
    /**
      * @public
      * @type {Basic}
      */
    @js.native
    sealed trait Basic
      extends StObject
         with AnimationMode
    
    /**
      * @public
      * @type {Full}
      */
    @js.native
    sealed trait Full
      extends StObject
         with AnimationMode
    
    /**
      * @public
      * @type {Minimal}
      */
    @js.native
    sealed trait Minimal
      extends StObject
         with AnimationMode
    
    /**
      * @public
      * @type {None}
      */
    @js.native
    sealed trait None
      extends StObject
         with AnimationMode
  }
}
