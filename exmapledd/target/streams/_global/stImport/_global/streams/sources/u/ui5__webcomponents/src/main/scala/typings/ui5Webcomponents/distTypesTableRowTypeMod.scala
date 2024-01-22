package typings.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTableRowTypeMod {
  
  @JSImport("@ui5/webcomponents/dist/types/TableRowType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TableRowType & String] = js.native
    
    /* "Active" */ val Active: typings.ui5Webcomponents.distTypesTableRowTypeMod.TableRowType.Active & String = js.native
    
    /* "Inactive" */ val Inactive: typings.ui5Webcomponents.distTypesTableRowTypeMod.TableRowType.Inactive & String = js.native
  }
  
  @js.native
  sealed trait TableRowType extends StObject
  @JSImport("@ui5/webcomponents/dist/types/TableRowType", "TableRowType")
  @js.native
  object TableRowType extends StObject {
    
    /**
      * Indicates that the table row is clickable via active feedback when item is pressed.
      * @public
      * @type {Active}
      */
    @js.native
    sealed trait Active
      extends StObject
         with TableRowType
    
    /**
      * Indicates that the table row does not have any active feedback when item is pressed.
      * @public
      * @type {Inactive}
      */
    @js.native
    sealed trait Inactive
      extends StObject
         with TableRowType
  }
}
