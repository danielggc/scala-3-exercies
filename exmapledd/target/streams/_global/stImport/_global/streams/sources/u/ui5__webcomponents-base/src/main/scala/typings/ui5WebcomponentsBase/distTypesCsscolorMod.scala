package typings.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCsscolorMod {
  
  /**
    * @class
    * CSSColor data type.
    *
    * @extends sap.ui.webc.base.types.DataType
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.base.types.CSSColor
    * @public
    * @enum {string}
    */
  @JSImport("@ui5/webcomponents-base/dist/types/CSSColor", JSImport.Default)
  @js.native
  open class default ()
    extends typings.ui5WebcomponentsBase.distTypesDataTypeMod.default
  object default {
    
    @JSImport("@ui5/webcomponents-base/dist/types/CSSColor", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def isValid(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  /**
    * @class
    * CSSColor data type.
    *
    * @extends sap.ui.webc.base.types.DataType
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.base.types.CSSColor
    * @public
    * @enum {string}
    */
  type CSSColor = typings.ui5WebcomponentsBase.distTypesDataTypeMod.default
}
