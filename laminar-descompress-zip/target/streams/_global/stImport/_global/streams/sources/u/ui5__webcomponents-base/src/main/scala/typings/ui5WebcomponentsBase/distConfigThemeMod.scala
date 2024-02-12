package typings.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConfigThemeMod {
  
  @JSImport("@ui5/webcomponents-base/dist/config/Theme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTheme(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTheme")().asInstanceOf[String]
  
  /**
    * Returns if the given theme name is the one currently applied.
    * @private
    * @param {string} theme
    * @returns {boolean}
    */
  inline def isTheme(theme: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTheme")(theme.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Returns if the current theme is part of given theme family.
    * @private
    * @param {string} theme the theme family
    * @returns {boolean}
    */
  inline def isThemeFamily(theme: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThemeFamily")(theme.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Applies a new theme after fetching its assets from the network.
    * @public
    * @param {string} theme the name of the new theme
    * @returns {Promise<void>} a promise that is resolved when the new theme assets have been fetched and applied to the DOM
    */
  inline def setTheme(theme: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setTheme")(theme.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
