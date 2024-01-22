package typings.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTabsOverflowModeMod {
  
  @JSImport("@ui5/webcomponents/dist/types/TabsOverflowMode", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TabsOverflowMode & String] = js.native
    
    /* "End" */ val End: typings.ui5Webcomponents.distTypesTabsOverflowModeMod.TabsOverflowMode.End & String = js.native
    
    /* "StartAndEnd" */ val StartAndEnd: typings.ui5Webcomponents.distTypesTabsOverflowModeMod.TabsOverflowMode.StartAndEnd & String = js.native
  }
  
  @js.native
  sealed trait TabsOverflowMode extends StObject
  @JSImport("@ui5/webcomponents/dist/types/TabsOverflowMode", "TabsOverflowMode")
  @js.native
  object TabsOverflowMode extends StObject {
    
    /**
      * End type is used if there should be only one overflow with hidden the tabs at the end of the tab container.
      * @public
      * @type {End}
      */
    @js.native
    sealed trait End
      extends StObject
         with TabsOverflowMode
    
    /**
      * StartAndEnd type is used if there should be two overflows on both ends of the tab container.
      * @public
      * @type {StartAndEnd}
      */
    @js.native
    sealed trait StartAndEnd
      extends StObject
         with TabsOverflowMode
  }
}
