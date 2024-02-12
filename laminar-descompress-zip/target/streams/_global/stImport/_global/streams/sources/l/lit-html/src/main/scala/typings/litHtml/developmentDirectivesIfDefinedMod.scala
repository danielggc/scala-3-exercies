package typings.litHtml

import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object developmentDirectivesIfDefinedMod {
  
  @JSImport("lit-html/development/directives/if-defined", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ifDefined[T](value: T): js.Symbol | NonNullable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("ifDefined")(value.asInstanceOf[js.Any]).asInstanceOf[js.Symbol | NonNullable[T]]
}
