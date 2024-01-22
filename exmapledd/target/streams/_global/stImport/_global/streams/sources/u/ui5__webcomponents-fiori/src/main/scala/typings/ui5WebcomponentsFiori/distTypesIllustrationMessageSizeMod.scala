package typings.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesIllustrationMessageSizeMod {
  
  @JSImport("@ui5/webcomponents-fiori/dist/types/IllustrationMessageSize", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[IllustrationMessageSize & String] = js.native
    
    /* "Auto" */ val Auto: typings.ui5WebcomponentsFiori.distTypesIllustrationMessageSizeMod.IllustrationMessageSize.Auto & String = js.native
    
    /* "Base" */ val Base: typings.ui5WebcomponentsFiori.distTypesIllustrationMessageSizeMod.IllustrationMessageSize.Base & String = js.native
    
    /* "Dialog" */ val Dialog: typings.ui5WebcomponentsFiori.distTypesIllustrationMessageSizeMod.IllustrationMessageSize.Dialog & String = js.native
    
    /* "Scene" */ val Scene: typings.ui5WebcomponentsFiori.distTypesIllustrationMessageSizeMod.IllustrationMessageSize.Scene & String = js.native
    
    /* "Spot" */ val Spot: typings.ui5WebcomponentsFiori.distTypesIllustrationMessageSizeMod.IllustrationMessageSize.Spot & String = js.native
  }
  
  @js.native
  sealed trait IllustrationMessageSize extends StObject
  @JSImport("@ui5/webcomponents-fiori/dist/types/IllustrationMessageSize", "IllustrationMessageSize")
  @js.native
  object IllustrationMessageSize extends StObject {
    
    /**
      * Automatically decides the <code>Illustration</code> size (<code>Base</code>, <code>Spot</code>,
      * <code>Dialog</code>, or <code>Scene</code>) depending on the <code>IllustratedMessage</code> container width.
      *
      * <b>Note:</b> <code>Auto</code> is the only option where the illustration size is changed according to
      * the available container width. If any other <code>IllustratedMessageSize</code> is chosen, it remains
      * until changed by the app developer.
      *
      * @public
      * @type {Auto}
      */
    @js.native
    sealed trait Auto
      extends StObject
         with IllustrationMessageSize
    
    /**
      * Base <code>Illustration</code> size (XS breakpoint). Suitable for cards (two columns).
      *
      * <b>Note:</b> When <code>Base</code> is in use, no illustration is displayed.
      *
      * @public
      * @type {Base}
      */
    @js.native
    sealed trait Base
      extends StObject
         with IllustrationMessageSize
    
    /**
      * Dialog <code>Illustration</code> size (M breakpoint). Suitable for dialogs.
      * @public
      * @type {Dialog}
      */
    @js.native
    sealed trait Dialog
      extends StObject
         with IllustrationMessageSize
    
    /**
      * Scene <code>Illustration</code> size (L breakpoint). Suitable for a <code>Page</code> or a table.
      * @public
      * @type {Scene}
      */
    @js.native
    sealed trait Scene
      extends StObject
         with IllustrationMessageSize
    
    /**
      * Spot <code>Illustration</code> size (S breakpoint). Suitable for cards (four columns).
      * @public
      * @type {Spot}
      */
    @js.native
    sealed trait Spot
      extends StObject
         with IllustrationMessageSize
  }
}
