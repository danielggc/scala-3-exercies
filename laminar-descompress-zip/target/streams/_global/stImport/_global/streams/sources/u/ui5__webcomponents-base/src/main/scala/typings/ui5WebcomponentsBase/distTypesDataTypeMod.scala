package typings.ui5WebcomponentsBase

import typings.std.Record
import typings.ui5WebcomponentsBase.distUi5elementmetadataMod.PropertyValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDataTypeMod {
  
  /**
    * Base class for all data types.
    *
    * @class
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.base.types.DataType
    * @public
    */
  @JSImport("@ui5/webcomponents-base/dist/types/DataType", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with DataType
  object default {
    
    @JSImport("@ui5/webcomponents-base/dist/types/DataType", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def attributeToProperty(): PropertyValue = ^.asInstanceOf[js.Dynamic].applyDynamic("attributeToProperty")().asInstanceOf[PropertyValue]
    inline def attributeToProperty(attributeValue: String): PropertyValue = ^.asInstanceOf[js.Dynamic].applyDynamic("attributeToProperty")(attributeValue.asInstanceOf[js.Any]).asInstanceOf[PropertyValue]
    
    /* static member */
    inline def generateTypeAccessors(types: Record[String, String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("generateTypeAccessors")(types.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Checks if the value is valid for its data type.
      * @public
      * @abstract
      * @returns {Boolean}
      */
    /* static member */
    inline def isValid(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def propertyToAttribute(propertyValue: PropertyValue): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("propertyToAttribute")(propertyValue.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    
    /* static member */
    inline def valuesAreEqual(value1: Any, value2: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("valuesAreEqual")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  /**
    * Base class for all data types.
    *
    * @class
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.base.types.DataType
    * @public
    */
  trait DataType extends StObject
}
