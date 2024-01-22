package typings.ui5WebcomponentsBase

import typings.ui5WebcomponentsBase.distUi5elementmetadataMod.PropertyValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesIntegerMod {
  
  /**
    * @class
    * Integer data type.
    *
    * @constructor
    * @extends sap.ui.webc.base.types.DataType
    * @author SAP SE
    * @alias sap.ui.webc.base.types.Integer
    * @public
    * @enum {number}
    */
  @JSImport("@ui5/webcomponents-base/dist/types/Integer", JSImport.Default)
  @js.native
  open class default ()
    extends typings.ui5WebcomponentsBase.distTypesDataTypeMod.default
  object default {
    
    @JSImport("@ui5/webcomponents-base/dist/types/Integer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def attributeToProperty(attributeValue: String): PropertyValue = ^.asInstanceOf[js.Dynamic].applyDynamic("attributeToProperty")(attributeValue.asInstanceOf[js.Any]).asInstanceOf[PropertyValue]
    
    /* static member */
    inline def isValid(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  /**
    * @class
    * Integer data type.
    *
    * @constructor
    * @extends sap.ui.webc.base.types.DataType
    * @author SAP SE
    * @alias sap.ui.webc.base.types.Integer
    * @public
    * @enum {number}
    */
  type Integer = typings.ui5WebcomponentsBase.distTypesDataTypeMod.default
}
