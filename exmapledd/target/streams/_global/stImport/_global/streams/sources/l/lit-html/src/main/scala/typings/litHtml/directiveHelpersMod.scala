package typings.litHtml

import typings.litHtml.developmentLitHtmlMod.ChildPart
import typings.litHtml.directiveMod.DirectiveClass
import typings.litHtml.directiveMod.PartInfo
import typings.litHtml.litHtmlInts.`1`
import typings.litHtml.litHtmlInts.`2`
import typings.litHtml.mod.DirectiveParent
import typings.litHtml.mod.Part
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directiveHelpersMod {
  
  @JSImport("lit-html/directive-helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined { readonly HTML :1,  readonly SVG :2}[keyof { readonly HTML :1,  readonly SVG :2}] */
  /* Rewritten from type alias, can be one of: 
    - typings.litHtml.litHtmlInts.`1`
    - typings.litHtml.litHtmlInts.`2`
  */
  trait TemplateResultType extends StObject
  object TemplateResultType {
    
    @JSImport("lit-html/directive-helpers", "TemplateResultType.HTML")
    @js.native
    val HTML: `1` = js.native
    
    @JSImport("lit-html/directive-helpers", "TemplateResultType.SVG")
    @js.native
    val SVG: `2` = js.native
  }
  
  inline def clearPart(part: ChildPart): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearPart")(part.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getCommittedValue(part: ChildPart): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getCommittedValue")(part.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getDirectiveClass(value: Any): js.UndefOr[DirectiveClass] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDirectiveClass")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[DirectiveClass]]
  
  inline def insertPart(containerPart: ChildPart): ChildPart = ^.asInstanceOf[js.Dynamic].applyDynamic("insertPart")(containerPart.asInstanceOf[js.Any]).asInstanceOf[ChildPart]
  inline def insertPart(containerPart: ChildPart, refPart: Unit, part: ChildPart): ChildPart = (^.asInstanceOf[js.Dynamic].applyDynamic("insertPart")(containerPart.asInstanceOf[js.Any], refPart.asInstanceOf[js.Any], part.asInstanceOf[js.Any])).asInstanceOf[ChildPart]
  inline def insertPart(containerPart: ChildPart, refPart: ChildPart): ChildPart = (^.asInstanceOf[js.Dynamic].applyDynamic("insertPart")(containerPart.asInstanceOf[js.Any], refPart.asInstanceOf[js.Any])).asInstanceOf[ChildPart]
  inline def insertPart(containerPart: ChildPart, refPart: ChildPart, part: ChildPart): ChildPart = (^.asInstanceOf[js.Dynamic].applyDynamic("insertPart")(containerPart.asInstanceOf[js.Any], refPart.asInstanceOf[js.Any], part.asInstanceOf[js.Any])).asInstanceOf[ChildPart]
  
  inline def isCompiledTemplateResult(value: Any): /* is lit-html.lit-html.CompiledTemplateResult */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCompiledTemplateResult")(value.asInstanceOf[js.Any]).asInstanceOf[/* is lit-html.lit-html.CompiledTemplateResult */ Boolean]
  
  inline def isDirectiveResult(value: Any): /* is lit-html.lit-html/directive.DirectiveResult<lit-html.lit-html/directive.DirectiveClass> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDirectiveResult")(value.asInstanceOf[js.Any]).asInstanceOf[/* is lit-html.lit-html/directive.DirectiveResult<lit-html.lit-html/directive.DirectiveClass> */ Boolean]
  
  inline def isPrimitive(value: Any): /* is lit-html.lit-html/directive-helpers.Primitive */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrimitive")(value.asInstanceOf[js.Any]).asInstanceOf[/* is lit-html.lit-html/directive-helpers.Primitive */ Boolean]
  
  inline def isSingleExpression(part: PartInfo): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSingleExpression")(part.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("lit-html/directive-helpers", "isTemplateResult")
  @js.native
  val isTemplateResult: IsTemplateResult_ = js.native
  
  inline def removePart(part: ChildPart): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removePart")(part.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setChildPartValue[T /* <: ChildPart */](part: T, value: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setChildPartValue")(part.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def setChildPartValue[T /* <: ChildPart */](part: T, value: Any, directiveParent: DirectiveParent): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setChildPartValue")(part.asInstanceOf[js.Any], value.asInstanceOf[js.Any], directiveParent.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def setCommittedValue(part: Part): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("setCommittedValue")(part.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def setCommittedValue(part: Part, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setCommittedValue")(part.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @js.native
  trait IsTemplateResult_ extends StObject {
    
    def apply(`val`: Any): Boolean = js.native
    def apply[T /* <: TemplateResultType */](`val`: Any, `type`: T): /* is lit-html.lit-html.TemplateResult<T> */ Boolean = js.native
  }
  
  type Primitive = js.UndefOr[Null | Boolean | Double | String | js.Symbol | js.BigInt]
}
