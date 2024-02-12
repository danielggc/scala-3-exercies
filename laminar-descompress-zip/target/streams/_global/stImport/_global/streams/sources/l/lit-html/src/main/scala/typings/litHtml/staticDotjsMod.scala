package typings.litHtml

import typings.litHtml.developmentLitHtmlMod.ResultType
import typings.litHtml.developmentLitHtmlMod.TemplateResult
import typings.litHtml.developmentStaticMod.StaticValue
import typings.litHtml.litHtmlInts.`1`
import typings.litHtml.litHtmlInts.`2`
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object staticDotjsMod {
  
  @JSImport("lit-html/static.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def html(strings: TemplateStringsArray, values: Any*): TemplateResult[ResultType] = ^.asInstanceOf[js.Dynamic].applyDynamic("html")(scala.List(strings.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[TemplateResult[ResultType]]
  
  inline def literal(strings: TemplateStringsArray, values: Any*): StaticValue = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(scala.List(strings.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[StaticValue]
  
  inline def svg(strings: TemplateStringsArray, values: Any*): TemplateResult[ResultType] = ^.asInstanceOf[js.Dynamic].applyDynamic("svg")(scala.List(strings.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[TemplateResult[ResultType]]
  
  inline def unsafeStatic(value: String): StaticValue = ^.asInstanceOf[js.Dynamic].applyDynamic("unsafeStatic")(value.asInstanceOf[js.Any]).asInstanceOf[StaticValue]
  
  inline def withStatic_1(coreTag: js.Function2[/* strings */ TemplateStringsArray, /* repeated */ Any, TemplateResult[`1`]]): js.Function2[/* strings */ TemplateStringsArray, /* repeated */ Any, TemplateResult[ResultType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withStatic")(coreTag.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* strings */ TemplateStringsArray, /* repeated */ Any, TemplateResult[ResultType]]]
  
  inline def withStatic_2(coreTag: js.Function2[/* strings */ TemplateStringsArray, /* repeated */ Any, TemplateResult[`2`]]): js.Function2[/* strings */ TemplateStringsArray, /* repeated */ Any, TemplateResult[ResultType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withStatic")(coreTag.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* strings */ TemplateStringsArray, /* repeated */ Any, TemplateResult[ResultType]]]
}
