package typings.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBootMod {
  
  @JSImport("@ui5/webcomponents-base/dist/Boot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attachBoot(listener: js.Function0[Unit]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("attachBoot")(listener.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def boot(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("boot")().asInstanceOf[js.Promise[Unit]]
}
