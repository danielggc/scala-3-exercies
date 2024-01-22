package typings.ui5WebcomponentsBase

import org.scalablytyped.runtime.Instantiable0
import typings.litHtml.mod.ResultType
import typings.litHtml.mod.TemplateResult
import typings.std.TemplateStringsArray
import typings.ui5WebcomponentsBase.anon.TypeofUI5Element
import typings.ui5WebcomponentsBase.distTypesMod.StyleData
import typings.ui5WebcomponentsBase.ui5WebcomponentsBaseInts.`1`
import typings.ui5WebcomponentsBase.ui5WebcomponentsBaseInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFeaturesOpenUI5EnablementMod {
  
  @JSImport("@ui5/webcomponents-base/dist/features/OpenUI5Enablement", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with OpenUI5Enablement
  object default {
    
    @JSImport("@ui5/webcomponents-base/dist/features/OpenUI5Enablement", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def enrichBusyIndicatorMetadata(klass: Instantiable0[typings.ui5WebcomponentsBase.distUi5elementMod.default] & TypeofUI5Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enrichBusyIndicatorMetadata")(klass.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    inline def enrichBusyIndicatorMethods(
      UI5ElementPrototype: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OpenUI5Element.prototype */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enrichBusyIndicatorMethods")(UI5ElementPrototype.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    inline def enrichBusyIndicatorSettings(klass: Instantiable0[typings.ui5WebcomponentsBase.distUi5elementMod.default] & TypeofUI5Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enrichBusyIndicatorSettings")(klass.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    inline def getBusyIndicatorStyles(): StyleData = ^.asInstanceOf[js.Dynamic].applyDynamic("getBusyIndicatorStyles")().asInstanceOf[StyleData]
    
    /* static member */
    inline def wrapTemplateResultInBusyMarkup(
      html: js.Function2[/* strings */ TemplateStringsArray, /* repeated */ Any, TemplateResult[ResultType]],
      host: typings.ui5WebcomponentsBase.distFeaturesOpenUI5ElementMod.default,
      templateResult: TemplateResult[ResultType]
    ): TemplateResult[`1` | `2`] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapTemplateResultInBusyMarkup")(html.asInstanceOf[js.Any], host.asInstanceOf[js.Any], templateResult.asInstanceOf[js.Any])).asInstanceOf[TemplateResult[`1` | `2`]]
  }
  
  trait OpenUI5Enablement extends StObject
}
