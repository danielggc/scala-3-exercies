package typings.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTableColumnPopinDisplayMod {
  
  @JSImport("@ui5/webcomponents/dist/types/TableColumnPopinDisplay", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TableColumnPopinDisplay & String] = js.native
    
    /* "Block" */ val Block: typings.ui5Webcomponents.distTypesTableColumnPopinDisplayMod.TableColumnPopinDisplay.Block & String = js.native
    
    /* "Inline" */ val Inline: typings.ui5Webcomponents.distTypesTableColumnPopinDisplayMod.TableColumnPopinDisplay.Inline & String = js.native
  }
  
  @js.native
  sealed trait TableColumnPopinDisplay extends StObject
  @JSImport("@ui5/webcomponents/dist/types/TableColumnPopinDisplay", "TableColumnPopinDisplay")
  @js.native
  object TableColumnPopinDisplay extends StObject {
    
    /**
      * default type
      * @public
      * @type {Block}
      */
    @js.native
    sealed trait Block
      extends StObject
         with TableColumnPopinDisplay
    
    /**
      * inline type (the title and value are displayed on the same line)
      * @public
      * @type {Inline}
      */
    @js.native
    sealed trait Inline
      extends StObject
         with TableColumnPopinDisplay
  }
}
