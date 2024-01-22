package typings.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLocaleGetLocaleMod {
  
  @JSImport("@ui5/webcomponents-base/dist/locale/getLocale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns the locale based on the parameter or configured language Configuration#getLanguage
    * If no language has been configured - a new locale based on browser language is returned
    */
  inline def default(): typings.ui5WebcomponentsBase.distLocaleLocaleMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[typings.ui5WebcomponentsBase.distLocaleLocaleMod.default]
  inline def default(lang: String): typings.ui5WebcomponentsBase.distLocaleLocaleMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(lang.asInstanceOf[js.Any]).asInstanceOf[typings.ui5WebcomponentsBase.distLocaleLocaleMod.default]
}
