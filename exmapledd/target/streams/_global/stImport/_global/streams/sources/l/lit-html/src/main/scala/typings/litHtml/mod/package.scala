package typings.litHtml.mod

import org.scalajs.dom.Node
import typings.litHtml.litHtmlInts.`1`
import typings.litHtml.litHtmlInts.`2`
import typings.litHtml.litHtmlStrings.attribute
import typings.litHtml.litHtmlStrings.property
import typings.litHtml.mod.^
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def html(strings: TemplateStringsArray, values: Any*): TemplateResult[`1`] = ^.asInstanceOf[js.Dynamic].applyDynamic("html")(scala.List(strings.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[TemplateResult[`1`]]

inline def noChange: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("noChange").asInstanceOf[js.Symbol]

inline def nothing: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("nothing").asInstanceOf[js.Symbol]

inline def svg(strings: TemplateStringsArray, values: Any*): TemplateResult[`2`] = ^.asInstanceOf[js.Dynamic].applyDynamic("svg")(scala.List(strings.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[TemplateResult[`2`]]

type HTMLTemplateResult = TemplateResult[/* 1 */ Double]

type ResultType = /* 1 */ Double

type SVGTemplateResult = TemplateResult[/* 2 */ Double]

type SanitizerFactory = js.Function3[/* node */ Node, /* name */ String, /* type */ property | attribute, ValueSanitizer]

type ValueSanitizer = js.Function1[/* value */ Any, Any]
