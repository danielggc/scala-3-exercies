package typings.litHtml

import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directivesMapMod {
  
  @JSImport("lit-html/directives/map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def map[T](items: js.Iterable[T], f: js.Function2[/* value */ T, /* index */ Double, Any]): Generator[Any, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(items.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Generator[Any, Unit, Any]]
  inline def map[T](items: Unit, f: js.Function2[/* value */ T, /* index */ Double, Any]): Generator[Any, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(items.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Generator[Any, Unit, Any]]
}
