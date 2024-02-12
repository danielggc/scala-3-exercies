package typings.litHtml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object developmentDirectivesChooseMod {
  
  @JSImport("lit-html/development/directives/choose", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def choose[T, V](value: T, cases: js.Array[js.Tuple2[T, js.Function0[V]]]): js.UndefOr[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("choose")(value.asInstanceOf[js.Any], cases.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[V]]
  inline def choose[T, V](value: T, cases: js.Array[js.Tuple2[T, js.Function0[V]]], defaultCase: js.Function0[V]): js.UndefOr[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("choose")(value.asInstanceOf[js.Any], cases.asInstanceOf[js.Any], defaultCase.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[V]]
}
