package typings.ui5WebcomponentsBase

import typings.ui5WebcomponentsBase.distAssetRegistriesI18nMod.I18nLoader
import typings.ui5WebcomponentsBase.distAssetRegistriesIconsMod.IconLoader
import typings.ui5WebcomponentsBase.distAssetRegistriesLocaleDataMod.LocaleDataLoader
import typings.ui5WebcomponentsBase.distAssetRegistriesThemesMod.ThemeLoader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAssetRegistryMod {
  
  @JSImport("@ui5/webcomponents-base/dist/AssetRegistry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Registers i18n loader function for given package and locale.
    *
    * @public
    * @param {string} packageName for which package this loader can fetch data
    * @param {string} localeId locale that this loader can handle
    * @param {function} loader async function that will be passed a localeId and should return a JSON object
    */
  inline def registerI18nLoader(packageName: String, localeId: String, loader: I18nLoader): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerI18nLoader")(packageName.asInstanceOf[js.Any], localeId.asInstanceOf[js.Any], loader.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerIconLoader(collectionName: String, loader: IconLoader): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerIconLoader")(collectionName.asInstanceOf[js.Any], loader.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerLocaleDataLoader(localeId: String, loader: LocaleDataLoader): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLocaleDataLoader")(localeId.asInstanceOf[js.Any], loader.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerThemePropertiesLoader(packageName: String, themeName: String, loader: ThemeLoader): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerThemePropertiesLoader")(packageName.asInstanceOf[js.Any], themeName.asInstanceOf[js.Any], loader.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
