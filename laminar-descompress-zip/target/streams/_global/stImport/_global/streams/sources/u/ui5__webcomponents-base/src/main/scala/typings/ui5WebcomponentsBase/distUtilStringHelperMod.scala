package typings.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilStringHelperMod {
  
  @JSImport("@ui5/webcomponents-base/dist/util/StringHelper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def camelToKebabCase(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelToKebabCase")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def kebabToCamelCase(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("kebabToCamelCase")(string.asInstanceOf[js.Any]).asInstanceOf[String]
}
