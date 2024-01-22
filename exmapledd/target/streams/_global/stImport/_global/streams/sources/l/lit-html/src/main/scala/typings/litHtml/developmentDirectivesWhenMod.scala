package typings.litHtml

import typings.litHtml.litHtmlBooleans.`false`
import typings.litHtml.litHtmlBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object developmentDirectivesWhenMod {
  
  @JSImport("lit-html/development/directives/when", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def when[T, F](condition: Any, trueCase: js.Function0[T]): T | F = (^.asInstanceOf[js.Dynamic].applyDynamic("when")(condition.asInstanceOf[js.Any], trueCase.asInstanceOf[js.Any])).asInstanceOf[T | F]
  inline def when[T, F](condition: Any, trueCase: js.Function0[T], falseCase: js.Function0[F]): T | F = (^.asInstanceOf[js.Dynamic].applyDynamic("when")(condition.asInstanceOf[js.Any], trueCase.asInstanceOf[js.Any], falseCase.asInstanceOf[js.Any])).asInstanceOf[T | F]
  
  inline def when_false[T, F](condition: `false`, trueCase: js.Function0[T]): F = (^.asInstanceOf[js.Dynamic].applyDynamic("when")(condition.asInstanceOf[js.Any], trueCase.asInstanceOf[js.Any])).asInstanceOf[F]
  inline def when_false[T, F](condition: `false`, trueCase: js.Function0[T], falseCase: js.Function0[F]): F = (^.asInstanceOf[js.Dynamic].applyDynamic("when")(condition.asInstanceOf[js.Any], trueCase.asInstanceOf[js.Any], falseCase.asInstanceOf[js.Any])).asInstanceOf[F]
  
  inline def when_true[T, F](condition: `true`, trueCase: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("when")(condition.asInstanceOf[js.Any], trueCase.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def when_true[T, F](condition: `true`, trueCase: js.Function0[T], falseCase: js.Function0[F]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("when")(condition.asInstanceOf[js.Any], trueCase.asInstanceOf[js.Any], falseCase.asInstanceOf[js.Any])).asInstanceOf[T]
}
