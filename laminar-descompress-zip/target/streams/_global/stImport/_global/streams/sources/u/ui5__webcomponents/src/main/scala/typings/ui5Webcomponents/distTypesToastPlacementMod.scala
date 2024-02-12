package typings.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesToastPlacementMod {
  
  @JSImport("@ui5/webcomponents/dist/types/ToastPlacement", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ToastPlacement & String] = js.native
    
    /* "BottomCenter" */ val BottomCenter: typings.ui5Webcomponents.distTypesToastPlacementMod.ToastPlacement.BottomCenter & String = js.native
    
    /* "BottomEnd" */ val BottomEnd: typings.ui5Webcomponents.distTypesToastPlacementMod.ToastPlacement.BottomEnd & String = js.native
    
    /* "BottomStart" */ val BottomStart: typings.ui5Webcomponents.distTypesToastPlacementMod.ToastPlacement.BottomStart & String = js.native
    
    /* "MiddleCenter" */ val MiddleCenter: typings.ui5Webcomponents.distTypesToastPlacementMod.ToastPlacement.MiddleCenter & String = js.native
    
    /* "MiddleEnd" */ val MiddleEnd: typings.ui5Webcomponents.distTypesToastPlacementMod.ToastPlacement.MiddleEnd & String = js.native
    
    /* "MiddleStart" */ val MiddleStart: typings.ui5Webcomponents.distTypesToastPlacementMod.ToastPlacement.MiddleStart & String = js.native
    
    /* "TopCenter" */ val TopCenter: typings.ui5Webcomponents.distTypesToastPlacementMod.ToastPlacement.TopCenter & String = js.native
    
    /* "TopEnd" */ val TopEnd: typings.ui5Webcomponents.distTypesToastPlacementMod.ToastPlacement.TopEnd & String = js.native
    
    /* "TopStart" */ val TopStart: typings.ui5Webcomponents.distTypesToastPlacementMod.ToastPlacement.TopStart & String = js.native
  }
  
  @js.native
  sealed trait ToastPlacement extends StObject
  @JSImport("@ui5/webcomponents/dist/types/ToastPlacement", "ToastPlacement")
  @js.native
  object ToastPlacement extends StObject {
    
    /**
      * Toast is placed at the <code>BottomCenter</code> position of its container.
      * Default placement (no selection)
      * @public
      * @type {BottomCenter}
      */
    @js.native
    sealed trait BottomCenter
      extends StObject
         with ToastPlacement
    
    /**
      * Toast is placed at the <code>BottomEnd</code> position of its container.
      * @public
      * @type {BottomEnd}
      */
    @js.native
    sealed trait BottomEnd
      extends StObject
         with ToastPlacement
    
    /**
      * Toast is placed at the <code>BottomStart</code> position of its container.
      * @public
      * @type {BottomStart}
      */
    @js.native
    sealed trait BottomStart
      extends StObject
         with ToastPlacement
    
    /**
      * Toast is placed at the <code>MiddleCenter</code> position of its container.
      * @public
      * @type {MiddleCenter}
      */
    @js.native
    sealed trait MiddleCenter
      extends StObject
         with ToastPlacement
    
    /**
      * Toast is placed at the <code>MiddleEnd</code> position of its container.
      * @public
      * @type {MiddleEnd}
      */
    @js.native
    sealed trait MiddleEnd
      extends StObject
         with ToastPlacement
    
    /**
      * Toast is placed at the <code>MiddleStart</code> position of its container.
      * @public
      * @type {MiddleStart}
      */
    @js.native
    sealed trait MiddleStart
      extends StObject
         with ToastPlacement
    
    /**
      * Toast is placed at the <code>TopCenter</code> position of its container.
      * @public
      * @type {TopCenter}
      */
    @js.native
    sealed trait TopCenter
      extends StObject
         with ToastPlacement
    
    /**
      * Toast is placed at the <code>TopEnd</code> position of its container.
      * @public
      * @type {TopEnd}
      */
    @js.native
    sealed trait TopEnd
      extends StObject
         with ToastPlacement
    
    /**
      * Toast is placed at the <code>TopStart</code> position of its container.
      * @public
      * @type {TopStart}
      */
    @js.native
    sealed trait TopStart
      extends StObject
         with ToastPlacement
  }
}
