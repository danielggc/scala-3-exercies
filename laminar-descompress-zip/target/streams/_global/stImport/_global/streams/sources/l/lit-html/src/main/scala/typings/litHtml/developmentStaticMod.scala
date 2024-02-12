package typings.litHtml

import typings.litHtml.developmentLitHtmlMod.ResultType
import typings.litHtml.developmentLitHtmlMod.TemplateResult
import typings.litHtml.litHtmlInts.`1`
import typings.litHtml.litHtmlInts.`2`
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object developmentStaticMod {
  
  @JSImport("lit-html/development/static", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def html(strings: TemplateStringsArray, values: Any*): TemplateResult[ResultType] = ^.asInstanceOf[js.Dynamic].applyDynamic("html")(scala.List(strings.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[TemplateResult[ResultType]]
  
  inline def literal(strings: TemplateStringsArray, values: Any*): StaticValue = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(scala.List(strings.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[StaticValue]
  
  inline def svg(strings: TemplateStringsArray, values: Any*): TemplateResult[ResultType] = ^.asInstanceOf[js.Dynamic].applyDynamic("svg")(scala.List(strings.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[TemplateResult[ResultType]]
  
  inline def unsafeStatic(value: String): StaticValue = ^.asInstanceOf[js.Dynamic].applyDynamic("unsafeStatic")(value.asInstanceOf[js.Any]).asInstanceOf[StaticValue]
  
  inline def withStatic_1(coreTag: js.Function2[/* strings */ TemplateStringsArray, /* repeated */ Any, TemplateResult[`1`]]): js.Function2[/* strings */ TemplateStringsArray, /* repeated */ Any, TemplateResult[ResultType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withStatic")(coreTag.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* strings */ TemplateStringsArray, /* repeated */ Any, TemplateResult[ResultType]]]
  
  inline def withStatic_2(coreTag: js.Function2[/* strings */ TemplateStringsArray, /* repeated */ Any, TemplateResult[`2`]]): js.Function2[/* strings */ TemplateStringsArray, /* repeated */ Any, TemplateResult[ResultType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withStatic")(coreTag.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* strings */ TemplateStringsArray, /* repeated */ Any, TemplateResult[ResultType]]]
  
  trait StaticValue extends StObject {
    
    /** The value to interpolate as-is into the template. */
    @JSName("_$litStatic$")
    var _DollarlitStaticDollar: String
    
    /**
      * A value that can't be decoded from ordinary JSON, make it harder for
      * a attacker-controlled data that goes through JSON.parse to produce a valid
      * StaticValue.
      */
    var r: js.Symbol
  }
  object StaticValue {
    
    inline def apply(_DollarlitStaticDollar: String, r: js.Symbol): StaticValue = {
      val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any])
      __obj.updateDynamic("_$litStatic$")(_DollarlitStaticDollar.asInstanceOf[js.Any])
      __obj.asInstanceOf[StaticValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StaticValue] (val x: Self) extends AnyVal {
      
      inline def setR(value: js.Symbol): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def set_DollarlitStaticDollar(value: String): Self = StObject.set(x, "_$litStatic$", value.asInstanceOf[js.Any])
    }
  }
}
