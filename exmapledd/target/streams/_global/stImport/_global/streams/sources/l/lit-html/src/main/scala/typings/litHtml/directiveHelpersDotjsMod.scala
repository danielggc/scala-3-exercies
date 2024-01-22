package typings.litHtml

import typings.litHtml.developmentDirectiveHelpersMod.IsTemplateResult_
import typings.litHtml.developmentDirectiveMod.DirectiveClass
import typings.litHtml.developmentDirectiveMod.PartInfo
import typings.litHtml.developmentLitHtmlMod.ChildPart
import typings.litHtml.developmentLitHtmlMod.DirectiveParent
import typings.litHtml.developmentLitHtmlMod.Part
import typings.litHtml.litHtmlInts.`1`
import typings.litHtml.litHtmlInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object directiveHelpersDotjsMod {
  
  @JSImport("lit-html/directive-helpers.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object TemplateResultType {
    
    @JSImport("lit-html/directive-helpers.js", "TemplateResultType.HTML")
    @js.native
    val HTML: `1` = js.native
    
    @JSImport("lit-html/directive-helpers.js", "TemplateResultType.SVG")
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
  
  inline def isCompiledTemplateResult(value: Any): /* is lit-html.lit-html/development/lit-html.CompiledTemplateResult */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCompiledTemplateResult")(value.asInstanceOf[js.Any]).asInstanceOf[/* is lit-html.lit-html/development/lit-html.CompiledTemplateResult */ Boolean]
  
  inline def isDirectiveResult(value: Any): /* is lit-html.lit-html/development/directive.DirectiveResult<lit-html.lit-html/development/directive.DirectiveClass> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDirectiveResult")(value.asInstanceOf[js.Any]).asInstanceOf[/* is lit-html.lit-html/development/directive.DirectiveResult<lit-html.lit-html/development/directive.DirectiveClass> */ Boolean]
  
  inline def isPrimitive(value: Any): /* is lit-html.lit-html/development/directive-helpers.Primitive */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrimitive")(value.asInstanceOf[js.Any]).asInstanceOf[/* is lit-html.lit-html/development/directive-helpers.Primitive */ Boolean]
  
  inline def isSingleExpression(part: PartInfo): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSingleExpression")(part.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("lit-html/directive-helpers.js", "isTemplateResult")
  @js.native
  val isTemplateResult: IsTemplateResult_ = js.native
  
  inline def removePart(part: ChildPart): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removePart")(part.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setChildPartValue[T /* <: ChildPart */](part: T, value: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setChildPartValue")(part.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def setChildPartValue[T /* <: ChildPart */](part: T, value: Any, directiveParent: DirectiveParent): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setChildPartValue")(part.asInstanceOf[js.Any], value.asInstanceOf[js.Any], directiveParent.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def setCommittedValue(part: Part): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("setCommittedValue")(part.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def setCommittedValue(part: Part, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setCommittedValue")(part.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
}
