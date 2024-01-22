package typings.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTableModeMod {
  
  @JSImport("@ui5/webcomponents/dist/types/TableMode", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TableMode & String] = js.native
    
    /* "MultiSelect" */ val MultiSelect: typings.ui5Webcomponents.distTypesTableModeMod.TableMode.MultiSelect & String = js.native
    
    /* "None" */ val None: typings.ui5Webcomponents.distTypesTableModeMod.TableMode.None & String = js.native
    
    /* "SingleSelect" */ val SingleSelect: typings.ui5Webcomponents.distTypesTableModeMod.TableMode.SingleSelect & String = js.native
  }
  
  @js.native
  sealed trait TableMode extends StObject
  @JSImport("@ui5/webcomponents/dist/types/TableMode", "TableMode")
  @js.native
  object TableMode extends StObject {
    
    /**
      * Multi selection mode (more than one table row can be selected).
      * @public
      * @type {MultiSelect}
      */
    @js.native
    sealed trait MultiSelect
      extends StObject
         with TableMode
    
    /**
      * Default mode (no selection).
      * @public
      * @type {None}
      */
    @js.native
    sealed trait None
      extends StObject
         with TableMode
    
    /**
      * Single selection mode (only one table row can be selected).
      * @public
      * @type {SingleSelect}
      */
    @js.native
    sealed trait SingleSelect
      extends StObject
         with TableMode
  }
}
