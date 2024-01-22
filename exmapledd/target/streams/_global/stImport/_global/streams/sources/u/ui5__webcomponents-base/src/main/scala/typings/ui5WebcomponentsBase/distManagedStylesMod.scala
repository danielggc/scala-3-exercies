package typings.ui5WebcomponentsBase

import typings.ui5WebcomponentsBase.distTypesMod.StyleData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distManagedStylesMod {
  
  @JSImport("@ui5/webcomponents-base/dist/ManagedStyles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createOrUpdateStyle(data: StyleData, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createOrUpdateStyle")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createOrUpdateStyle(data: StyleData, name: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createOrUpdateStyle")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createStyle(data: StyleData, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createStyle")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createStyle(data: StyleData, name: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createStyle")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def hasStyle(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasStyle")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def hasStyle(name: String, value: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasStyle")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def removeStyle(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeStyle")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def removeStyle(name: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeStyle")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updateStyle(data: StyleData, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateStyle")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateStyle(data: StyleData, name: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateStyle")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
