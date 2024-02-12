package typings.litHtml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object directivesRangeDotjsMod {
  
  @JSImport("lit-html/directives/range.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def range(end: Double): js.Iterable[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("range")(end.asInstanceOf[js.Any]).asInstanceOf[js.Iterable[Double]]
  inline def range(start: Double, end: Double): js.Iterable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Iterable[Double]]
  inline def range(start: Double, end: Double, step: Double): js.Iterable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Iterable[Double]]
}
