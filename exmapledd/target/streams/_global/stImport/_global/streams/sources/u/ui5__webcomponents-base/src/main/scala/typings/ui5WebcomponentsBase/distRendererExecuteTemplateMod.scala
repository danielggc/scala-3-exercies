package typings.ui5WebcomponentsBase

import typings.ui5WebcomponentsBase.distUi5elementMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRendererExecuteTemplateMod {
  
  @JSImport("@ui5/webcomponents-base/dist/renderer/executeTemplate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Runs a component's template with the component's current state, while also scoping HTML
    *
    * @param template - the template to execute
    * @param component - the component
    * @public
    */
  inline def default(template: TemplateFunction, component: typings.ui5WebcomponentsBase.distUi5elementMod.default): TemplateFunctionResult = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(template.asInstanceOf[js.Any], component.asInstanceOf[js.Any])).asInstanceOf[TemplateFunctionResult]
  
  type TemplateFunction = js.Function3[
    /* component */ default, 
    /* tagsToScope */ js.Array[String], 
    /* scope */ js.UndefOr[String], 
    TemplateFunctionResult
  ]
  
  type TemplateFunctionResult = js.Object
}
