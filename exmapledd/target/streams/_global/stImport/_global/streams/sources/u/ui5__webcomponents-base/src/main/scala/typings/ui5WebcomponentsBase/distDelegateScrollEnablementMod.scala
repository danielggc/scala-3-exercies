package typings.ui5WebcomponentsBase

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.TouchEvent
import typings.ui5WebcomponentsBase.anon.DragX
import typings.ui5WebcomponentsBase.anon.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDelegateScrollEnablementMod {
  
  @JSImport("@ui5/webcomponents-base/dist/delegate/ScrollEnablement", JSImport.Default)
  @js.native
  open class default protected () extends ScrollEnablement {
    def this(containerComponent: typings.ui5WebcomponentsBase.distUi5elementMod.default) = this()
  }
  
  trait EventListenerParam extends StObject {
    
    var isLeft: Boolean
    
    var isRight: Boolean
  }
  object EventListenerParam {
    
    inline def apply(isLeft: Boolean, isRight: Boolean): EventListenerParam = {
      val __obj = js.Dynamic.literal(isLeft = isLeft.asInstanceOf[js.Any], isRight = isRight.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventListenerParam]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventListenerParam] (val x: Self) extends AnyVal {
      
      inline def setIsLeft(value: Boolean): Self = StObject.set(x, "isLeft", value.asInstanceOf[js.Any])
      
      inline def setIsRight(value: Boolean): Self = StObject.set(x, "isRight", value.asInstanceOf[js.Any])
    }
  }
  
  type EventListenerReturn = Unit
  
  @js.native
  trait ScrollEnablement
    extends typings.ui5WebcomponentsBase.distEventProviderMod.default[EventListenerParam, EventListenerReturn] {
    
    var _canScroll: js.UndefOr[Boolean] = js.native
    
    var _container: js.UndefOr[HTMLElement] = js.native
    
    def _isTouchInside(event: MouseEvent): Boolean = js.native
    def _isTouchInside(event: TouchEvent): Boolean = js.native
    
    var _prevDragX: js.UndefOr[Double] = js.native
    
    var _prevDragY: js.UndefOr[Double] = js.native
    
    var cachedValue: DragX = js.native
    
    var containerComponent: typings.ui5WebcomponentsBase.distUi5elementMod.default = js.native
    
    def getScrollLeft(): Double = js.native
    
    def getScrollTop(): Double = js.native
    
    def mouseMove(event: MouseEvent): Unit = js.native
    def mouseMove(event: TouchEvent): Unit = js.native
    
    def mouseUp(event: MouseEvent): Unit = js.native
    def mouseUp(event: TouchEvent): Unit = js.native
    
    def move(dx: Double, dy: Double, disableAnimation: Boolean): js.UndefOr[Promise] = js.native
    
    def ontouchend(event: MouseEvent): Unit = js.native
    def ontouchend(event: TouchEvent): Unit = js.native
    
    def ontouchmove(event: MouseEvent): Unit = js.native
    def ontouchmove(event: TouchEvent): Unit = js.native
    
    def ontouchstart(event: MouseEvent): Unit = js.native
    def ontouchstart(event: TouchEvent): Unit = js.native
    
    def scrollContainer: HTMLElement = js.native
    def scrollContainer_=(container: HTMLElement): Unit = js.native
    
    /**
      * Scrolls the container to the left/top position, retrying retryCount times, if the container is not yet painted
      *
      * @param left
      * @param top
      * @param retryCount
      * @param retryInterval
      * @returns {Promise<void>} resolved when scrolled successfully
      */
    def scrollTo(left: Double, top: Double): js.Promise[Unit] = js.native
    def scrollTo(left: Double, top: Double, retryCount: Double): js.Promise[Unit] = js.native
    def scrollTo(left: Double, top: Double, retryCount: Double, retryInterval: Double): js.Promise[Unit] = js.native
    def scrollTo(left: Double, top: Double, retryCount: Unit, retryInterval: Double): js.Promise[Unit] = js.native
    
    var startX: Double = js.native
    
    var startY: Double = js.native
    
    var supportsTouch: Boolean = js.native
    
    def touchStart(event: MouseEvent): Unit = js.native
    def touchStart(event: TouchEvent): Unit = js.native
  }
}
