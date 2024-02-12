package typings.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConfigThemeRootsMod {
  
  @JSImport("@ui5/webcomponents-base/dist/config/ThemeRoots", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attachCustomThemeStylesToHead(theme: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("attachCustomThemeStylesToHead")(theme.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def getThemeRoot(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getThemeRoot")().asInstanceOf[js.UndefOr[String]]
  
  inline def setThemeRoot(theme: String, newThemeRoot: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setThemeRoot")(theme.asInstanceOf[js.Any], newThemeRoot.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
