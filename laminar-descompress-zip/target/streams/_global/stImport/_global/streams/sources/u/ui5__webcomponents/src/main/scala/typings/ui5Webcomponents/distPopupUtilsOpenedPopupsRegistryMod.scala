package typings.ui5Webcomponents

import typings.ui5Webcomponents.distPopupMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPopupUtilsOpenedPopupsRegistryMod {
  
  @JSImport("@ui5/webcomponents/dist/popup-utils/OpenedPopupsRegistry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addOpenedPopup(instance: default): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addOpenedPopup")(instance.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addOpenedPopup(instance: default, parentPopovers: js.Array[default]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addOpenedPopup")(instance.asInstanceOf[js.Any], parentPopovers.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getOpenedPopups(): js.Array[RegisteredPopupT] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOpenedPopups")().asInstanceOf[js.Array[RegisteredPopupT]]
  
  inline def removeOpenedPopup(instance: default): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeOpenedPopup")(instance.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait RegisteredPopupT extends StObject {
    
    var instance: default
    
    var parentPopovers: js.Array[default]
  }
  object RegisteredPopupT {
    
    inline def apply(instance: default, parentPopovers: js.Array[default]): RegisteredPopupT = {
      val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], parentPopovers = parentPopovers.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegisteredPopupT]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RegisteredPopupT] (val x: Self) extends AnyVal {
      
      inline def setInstance(value: default): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setParentPopovers(value: js.Array[default]): Self = StObject.set(x, "parentPopovers", value.asInstanceOf[js.Any])
      
      inline def setParentPopoversVarargs(value: default*): Self = StObject.set(x, "parentPopovers", js.Array(value*))
    }
  }
}
