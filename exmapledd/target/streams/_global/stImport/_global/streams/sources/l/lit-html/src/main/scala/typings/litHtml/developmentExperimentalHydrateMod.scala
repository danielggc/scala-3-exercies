package typings.litHtml

import org.scalajs.dom.DocumentFragment
import org.scalajs.dom.Element
import typings.litHtml.anon.PartialRenderOptions
import typings.litHtml.developmentLitHtmlMod.ResultType
import typings.litHtml.developmentLitHtmlMod.TemplateResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object developmentExperimentalHydrateMod {
  
  @JSImport("lit-html/development/experimental-hydrate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def digestForTemplateResult(templateResult: TemplateResult[ResultType]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("digestForTemplateResult")(templateResult.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hydrate(rootValue: Any, container: DocumentFragment): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")(rootValue.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hydrate(rootValue: Any, container: DocumentFragment, options: PartialRenderOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")(rootValue.asInstanceOf[js.Any], container.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hydrate(rootValue: Any, container: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")(rootValue.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hydrate(rootValue: Any, container: Element, options: PartialRenderOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")(rootValue.asInstanceOf[js.Any], container.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
