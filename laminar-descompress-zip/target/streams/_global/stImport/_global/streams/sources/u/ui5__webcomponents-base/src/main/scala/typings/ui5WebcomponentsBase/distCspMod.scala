package typings.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCspMod {
  
  @JSImport("@ui5/webcomponents-base/dist/CSP", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getUrl(packageName: String, path: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(packageName.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def setPackageCSSRoot(packageName: String, root: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPackageCSSRoot")(packageName.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Call this function to enable or disable the preloading of <link> tags.
    * Note: only taken into account when <link> tags are being used.
    * Note: links are being preloaded by default, so call "setPreloadLinks(false)" to opt out of this.
    *
    * @public
    * @param preload
    */
  inline def setPreloadLinks(preload: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPreloadLinks")(preload.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Call this function to enable or disable the usage of <link> tags instead of <style> tags to achieve CSP compliance
    * Example: "setUseLinks(true)" will unconditionally use <link> tags for all browsers;
    * Example: "setUseLinks(!document.adoptedStyleSheets) will only enable the usage of <link> tags for browsers that do not support constructable stylesheets.
    *
    * @public
    * @param use whether links will be used
    */
  inline def setUseLinks(use: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUseLinks")(use.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def shouldPreloadLinks(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldPreloadLinks")().asInstanceOf[Boolean]
  
  inline def shouldUseLinks(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldUseLinks")().asInstanceOf[Boolean]
}
