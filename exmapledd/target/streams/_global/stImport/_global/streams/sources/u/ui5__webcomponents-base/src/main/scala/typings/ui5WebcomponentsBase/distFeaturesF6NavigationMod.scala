package typings.ui5WebcomponentsBase

import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import typings.std.DocumentOrShadowRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFeaturesF6NavigationMod {
  
  @JSImport("@ui5/webcomponents-base/dist/features/F6Navigation", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with F6Navigation
  object default {
    
    @JSImport("@ui5/webcomponents-base/dist/features/F6Navigation", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def init(): F6Navigation = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[F6Navigation]
    
    /* static member */
    @JSImport("@ui5/webcomponents-base/dist/features/F6Navigation", "default._instance")
    @js.native
    def instance: F6Navigation = js.native
    
    inline def instance_=(x: F6Navigation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instance")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait F6Navigation extends StObject {
    
    def _keydownHandler(event: KeyboardEvent): js.Promise[Unit] = js.native
    
    def attachEventListeners(): Unit = js.native
    
    def deepActive(root: DocumentOrShadowRoot): Element | Null = js.native
    
    def destroy(): Unit = js.native
    
    var groups: js.Array[HTMLElement] = js.native
    
    def keydownHandler(event: KeyboardEvent): Unit = js.native
    
    def removeEventListeners(): Unit = js.native
    
    var selectedGroup: HTMLElement | Null = js.native
    
    def setSelectedGroup(): Unit = js.native
    def setSelectedGroup(root: DocumentOrShadowRoot): Unit = js.native
    
    def updateGroups(): Unit = js.native
  }
}
