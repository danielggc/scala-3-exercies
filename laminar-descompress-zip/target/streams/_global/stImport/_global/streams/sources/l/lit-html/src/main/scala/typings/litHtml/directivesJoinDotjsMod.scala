package typings.litHtml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object directivesJoinDotjsMod {
  
  @JSImport("lit-html/directives/join.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def join[I, J](items: js.Iterable[I], joiner: J): js.Iterable[I | J] = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(items.asInstanceOf[js.Any], joiner.asInstanceOf[js.Any])).asInstanceOf[js.Iterable[I | J]]
  inline def join[I, J](items: js.Iterable[I], joiner: js.Function1[/* index */ Double, J]): js.Iterable[I | J] = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(items.asInstanceOf[js.Any], joiner.asInstanceOf[js.Any])).asInstanceOf[js.Iterable[I | J]]
  inline def join[I, J](items: Unit, joiner: J): js.Iterable[I | J] = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(items.asInstanceOf[js.Any], joiner.asInstanceOf[js.Any])).asInstanceOf[js.Iterable[I | J]]
  inline def join[I, J](items: Unit, joiner: js.Function1[/* index */ Double, J]): js.Iterable[I | J] = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(items.asInstanceOf[js.Any], joiner.asInstanceOf[js.Any])).asInstanceOf[js.Iterable[I | J]]
}
