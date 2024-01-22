package typings.ui5WebcomponentsBase

import typings.std.Set
import typings.ui5WebcomponentsBase.distTypesMod.StyleData
import typings.ui5WebcomponentsBase.distTypesMod.StyleDataCSP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAssetRegistriesThemesMod {
  
  @JSImport("@ui5/webcomponents-base/dist/asset-registries/Themes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRegisteredPackages(): Set[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegisteredPackages")().asInstanceOf[Set[String]]
  
  inline def getThemeProperties(packageName: String, themeName: String): js.Promise[js.UndefOr[StyleData]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getThemeProperties")(packageName.asInstanceOf[js.Any], themeName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[StyleData]]]
  
  inline def isThemeRegistered(theme: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThemeRegistered")(theme.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def registerThemePropertiesLoader(packageName: String, themeName: String, loader: ThemeLoader): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerThemePropertiesLoader")(packageName.asInstanceOf[js.Any], themeName.asInstanceOf[js.Any], loader.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ui5WebcomponentsBase.anon._empty
    - typings.ui5WebcomponentsBase.distTypesMod.StyleDataCSP
    - java.lang.String
  */
  type ThemeData = _ThemeData | String
  
  type ThemeLoader = js.Function1[/* themeName */ String, js.Promise[ThemeData]]
  
  trait _ThemeData extends StObject
  object _ThemeData {
    
    inline def StyleDataCSP(content: String, fileName: String, packageName: String): typings.ui5WebcomponentsBase.distTypesMod.StyleDataCSP = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ui5WebcomponentsBase.distTypesMod.StyleDataCSP]
    }
    
    inline def _empty(_underscore: StyleDataCSP): typings.ui5WebcomponentsBase.anon._empty = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ui5WebcomponentsBase.anon._empty]
    }
  }
}
