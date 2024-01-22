package typings.ui5WebcomponentsBase

import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.DocumentFragment
import org.scalajs.dom.HTMLElement
import typings.litHtml.anon.TypeofUnsafeHTMLDirectiveInstantiable
import typings.litHtml.developmentDirectiveMod.DirectiveResult
import typings.litHtml.directiveMod.PartInfo
import typings.litHtml.directivesClassMapMod.ClassInfo
import typings.litHtml.directivesClassMapMod.ClassMapDirective
import typings.litHtml.directivesRepeatMod.RepeatDirectiveFn
import typings.litHtml.mod.RenderOptions
import typings.litHtml.mod.TemplateResult
import typings.std.NonNullable
import typings.std.TemplateStringsArray
import typings.ui5WebcomponentsBase.distRendererExecuteTemplateMod.TemplateFunctionResult
import typings.ui5WebcomponentsBase.ui5WebcomponentsBaseInts.`1`
import typings.ui5WebcomponentsBase.ui5WebcomponentsBaseInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRendererLitRendererMod {
  
  @JSImport("@ui5/webcomponents-base/dist/renderer/LitRenderer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    templateResult: TemplateFunctionResult,
    container: DocumentFragment,
    styleStrOrHrefsArr: String,
    forStaticArea: Boolean,
    options: RenderOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(templateResult.asInstanceOf[js.Any], container.asInstanceOf[js.Any], styleStrOrHrefsArr.asInstanceOf[js.Any], forStaticArea.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(
    templateResult: TemplateFunctionResult,
    container: DocumentFragment,
    styleStrOrHrefsArr: js.Array[String],
    forStaticArea: Boolean,
    options: RenderOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(templateResult.asInstanceOf[js.Any], container.asInstanceOf[js.Any], styleStrOrHrefsArr.asInstanceOf[js.Any], forStaticArea.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(
    templateResult: TemplateFunctionResult,
    container: DocumentFragment,
    styleStrOrHrefsArr: Unit,
    forStaticArea: Boolean,
    options: RenderOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(templateResult.asInstanceOf[js.Any], container.asInstanceOf[js.Any], styleStrOrHrefsArr.asInstanceOf[js.Any], forStaticArea.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(
    templateResult: TemplateFunctionResult,
    container: HTMLElement,
    styleStrOrHrefsArr: String,
    forStaticArea: Boolean,
    options: RenderOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(templateResult.asInstanceOf[js.Any], container.asInstanceOf[js.Any], styleStrOrHrefsArr.asInstanceOf[js.Any], forStaticArea.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(
    templateResult: TemplateFunctionResult,
    container: HTMLElement,
    styleStrOrHrefsArr: js.Array[String],
    forStaticArea: Boolean,
    options: RenderOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(templateResult.asInstanceOf[js.Any], container.asInstanceOf[js.Any], styleStrOrHrefsArr.asInstanceOf[js.Any], forStaticArea.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(
    templateResult: TemplateFunctionResult,
    container: HTMLElement,
    styleStrOrHrefsArr: Unit,
    forStaticArea: Boolean,
    options: RenderOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(templateResult.asInstanceOf[js.Any], container.asInstanceOf[js.Any], styleStrOrHrefsArr.asInstanceOf[js.Any], forStaticArea.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def classMap(classInfo: ClassInfo): DirectiveResult[Instantiable1[/* partInfo */ PartInfo, ClassMapDirective]] = ^.asInstanceOf[js.Dynamic].applyDynamic("classMap")(classInfo.asInstanceOf[js.Any]).asInstanceOf[DirectiveResult[Instantiable1[/* partInfo */ PartInfo, ClassMapDirective]]]
  
  inline def html(strings: TemplateStringsArray, values: Any*): TemplateResult[`1` | `2`] = ^.asInstanceOf[js.Dynamic].applyDynamic("html")(scala.List(strings.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[TemplateResult[`1` | `2`]]
  
  inline def ifDefined[T](value: T): js.Symbol | NonNullable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("ifDefined")(value.asInstanceOf[js.Any]).asInstanceOf[js.Symbol | NonNullable[T]]
  
  @JSImport("@ui5/webcomponents-base/dist/renderer/LitRenderer", "repeat")
  @js.native
  val repeat: RepeatDirectiveFn = js.native
  
  inline def scopeTag(tag: String, tags: js.Array[String], suffix: String): js.UndefOr[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("scopeTag")(tag.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Object]]
  
  inline def svg(strings: TemplateStringsArray, values: Any*): TemplateResult[`1` | `2`] = ^.asInstanceOf[js.Dynamic].applyDynamic("svg")(scala.List(strings.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[TemplateResult[`1` | `2`]]
  
  inline def unsafeHTML(): DirectiveResult[TypeofUnsafeHTMLDirectiveInstantiable] = ^.asInstanceOf[js.Dynamic].applyDynamic("unsafeHTML")().asInstanceOf[DirectiveResult[TypeofUnsafeHTMLDirectiveInstantiable]]
  inline def unsafeHTML(value: String): DirectiveResult[TypeofUnsafeHTMLDirectiveInstantiable] = ^.asInstanceOf[js.Dynamic].applyDynamic("unsafeHTML")(value.asInstanceOf[js.Any]).asInstanceOf[DirectiveResult[TypeofUnsafeHTMLDirectiveInstantiable]]
  inline def unsafeHTML(value: js.Symbol): DirectiveResult[TypeofUnsafeHTMLDirectiveInstantiable] = ^.asInstanceOf[js.Dynamic].applyDynamic("unsafeHTML")(value.asInstanceOf[js.Any]).asInstanceOf[DirectiveResult[TypeofUnsafeHTMLDirectiveInstantiable]]
}
