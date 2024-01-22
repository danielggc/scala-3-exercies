package typings.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTableGrowingModeMod {
  
  @JSImport("@ui5/webcomponents/dist/types/TableGrowingMode", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TableGrowingMode & String] = js.native
    
    /* "Button" */ val Button: typings.ui5Webcomponents.distTypesTableGrowingModeMod.TableGrowingMode.Button & String = js.native
    
    /* "None" */ val None: typings.ui5Webcomponents.distTypesTableGrowingModeMod.TableGrowingMode.None & String = js.native
    
    /* "Scroll" */ val Scroll: typings.ui5Webcomponents.distTypesTableGrowingModeMod.TableGrowingMode.Scroll & String = js.native
  }
  
  @js.native
  sealed trait TableGrowingMode extends StObject
  @JSImport("@ui5/webcomponents/dist/types/TableGrowingMode", "TableGrowingMode")
  @js.native
  object TableGrowingMode extends StObject {
    
    /**
      * Component <code>load-more</code> is fired
      * upon pressing a "More" button at the bottom.
      * @public
      * @type {Button}
      */
    @js.native
    sealed trait Button
      extends StObject
         with TableGrowingMode
    
    /**
      * Component growing is not enabled.
      * @public
      * @type {None}
      */
    @js.native
    sealed trait None
      extends StObject
         with TableGrowingMode
    
    /**
      * Component <code>load-more</code> is fired upon scroll.
      * @public
      * @type {Scroll}
      */
    @js.native
    sealed trait Scroll
      extends StObject
         with TableGrowingMode
  }
}
