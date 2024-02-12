package typings.ui5WebcomponentsBase

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDomreferenceMod {
  
  /**
    * @class
    * DOM Element reference or ID.
    * <b>Note:</b> If an ID is passed, it is expected to be part of the same <code>document</code> element as the consuming component.
    *
    * @constructor
    * @extends sap.ui.webc.base.types.DataType
    * @author SAP SE
    * @alias sap.ui.webc.base.types.DOMReference
    * @public
    */
  @JSImport("@ui5/webcomponents-base/dist/types/DOMReference", JSImport.Default)
  @js.native
  open class default ()
    extends typings.ui5WebcomponentsBase.distTypesDataTypeMod.default
  object default {
    
    @JSImport("@ui5/webcomponents-base/dist/types/DOMReference", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def isValid(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isValid(value: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def propertyToAttribute(propertyValue: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("propertyToAttribute")(propertyValue.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    inline def propertyToAttribute(propertyValue: HTMLElement): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("propertyToAttribute")(propertyValue.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /**
    * @class
    * DOM Element reference or ID.
    * <b>Note:</b> If an ID is passed, it is expected to be part of the same <code>document</code> element as the consuming component.
    *
    * @constructor
    * @extends sap.ui.webc.base.types.DataType
    * @author SAP SE
    * @alias sap.ui.webc.base.types.DOMReference
    * @public
    */
  type DOMReference = typings.ui5WebcomponentsBase.distTypesDataTypeMod.default
}
