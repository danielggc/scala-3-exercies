package typings.ui5WebcomponentsLocalization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLocaleGetLocaleDataMod {
  
  @JSImport("@ui5/webcomponents-localization/dist/locale/getLocaleData", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Fetches and returns а LocaleData object for the required locale
    * For more information on this object's API, please see:
    * https://sdk.openui5.org/api/sap.ui.core.LocaleData
    *
    * @param { string } lang - if left empty, will use the configured/current locale
    * @returns { Promise<LocaleData> }
    */
  inline def default(lang: String): js.Promise[typings.ui5WebcomponentsLocalization.distLocaleDataMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(lang.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.ui5WebcomponentsLocalization.distLocaleDataMod.default]]
}
