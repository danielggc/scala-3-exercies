package typings.ui5WebcomponentsBase

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRenderQueueMod {
  
  @JSImport("@ui5/webcomponents-base/dist/RenderQueue", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with RenderQueue {
    
    /* CompleteClass */
    override def add(webComponent: typings.ui5WebcomponentsBase.distUi5elementMod.default): Unit = js.native
    
    /* CompleteClass */
    override def isAdded(webComponent: typings.ui5WebcomponentsBase.distUi5elementMod.default): Boolean = js.native
    
    /* CompleteClass */
    override def isEmpty(): Boolean = js.native
    
    /* CompleteClass */
    var list: js.Array[typings.ui5WebcomponentsBase.distUi5elementMod.default] = js.native
    
    /* CompleteClass */
    var lookup: Set[typings.ui5WebcomponentsBase.distUi5elementMod.default] = js.native
    
    /**
      * Processes the whole queue by executing the callback on each component,
      * while also imposing restrictions on how many times a component may be processed.
      *
      * @param callback - function with one argument (the web component to be processed)
      */
    /* CompleteClass */
    override def process(callback: js.Function1[/* el */ typings.ui5WebcomponentsBase.distUi5elementMod.default, Unit]): Unit = js.native
    
    /* CompleteClass */
    override def remove(webComponent: typings.ui5WebcomponentsBase.distUi5elementMod.default): Unit = js.native
    
    /* CompleteClass */
    override def shift(): js.UndefOr[typings.ui5WebcomponentsBase.distUi5elementMod.default] = js.native
  }
  
  trait RenderQueue extends StObject {
    
    def add(webComponent: typings.ui5WebcomponentsBase.distUi5elementMod.default): Unit
    
    def isAdded(webComponent: typings.ui5WebcomponentsBase.distUi5elementMod.default): Boolean
    
    def isEmpty(): Boolean
    
    var list: js.Array[typings.ui5WebcomponentsBase.distUi5elementMod.default]
    
    var lookup: Set[typings.ui5WebcomponentsBase.distUi5elementMod.default]
    
    /**
      * Processes the whole queue by executing the callback on each component,
      * while also imposing restrictions on how many times a component may be processed.
      *
      * @param callback - function with one argument (the web component to be processed)
      */
    def process(callback: js.Function1[/* el */ typings.ui5WebcomponentsBase.distUi5elementMod.default, Unit]): Unit
    
    def remove(webComponent: typings.ui5WebcomponentsBase.distUi5elementMod.default): Unit
    
    def shift(): js.UndefOr[typings.ui5WebcomponentsBase.distUi5elementMod.default]
  }
  object RenderQueue {
    
    inline def apply(
      add: typings.ui5WebcomponentsBase.distUi5elementMod.default => Unit,
      isAdded: typings.ui5WebcomponentsBase.distUi5elementMod.default => Boolean,
      isEmpty: () => Boolean,
      list: js.Array[typings.ui5WebcomponentsBase.distUi5elementMod.default],
      lookup: Set[typings.ui5WebcomponentsBase.distUi5elementMod.default],
      process: js.Function1[/* el */ typings.ui5WebcomponentsBase.distUi5elementMod.default, Unit] => Unit,
      remove: typings.ui5WebcomponentsBase.distUi5elementMod.default => Unit,
      shift: () => js.UndefOr[typings.ui5WebcomponentsBase.distUi5elementMod.default]
    ): RenderQueue = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), isAdded = js.Any.fromFunction1(isAdded), isEmpty = js.Any.fromFunction0(isEmpty), list = list.asInstanceOf[js.Any], lookup = lookup.asInstanceOf[js.Any], process = js.Any.fromFunction1(process), remove = js.Any.fromFunction1(remove), shift = js.Any.fromFunction0(shift))
      __obj.asInstanceOf[RenderQueue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RenderQueue] (val x: Self) extends AnyVal {
      
      inline def setAdd(value: typings.ui5WebcomponentsBase.distUi5elementMod.default => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setIsAdded(value: typings.ui5WebcomponentsBase.distUi5elementMod.default => Boolean): Self = StObject.set(x, "isAdded", js.Any.fromFunction1(value))
      
      inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
      
      inline def setList(value: js.Array[typings.ui5WebcomponentsBase.distUi5elementMod.default]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListVarargs(value: typings.ui5WebcomponentsBase.distUi5elementMod.default*): Self = StObject.set(x, "list", js.Array(value*))
      
      inline def setLookup(value: Set[typings.ui5WebcomponentsBase.distUi5elementMod.default]): Self = StObject.set(x, "lookup", value.asInstanceOf[js.Any])
      
      inline def setProcess(value: js.Function1[/* el */ typings.ui5WebcomponentsBase.distUi5elementMod.default, Unit] => Unit): Self = StObject.set(x, "process", js.Any.fromFunction1(value))
      
      inline def setRemove(value: typings.ui5WebcomponentsBase.distUi5elementMod.default => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setShift(value: () => js.UndefOr[typings.ui5WebcomponentsBase.distUi5elementMod.default]): Self = StObject.set(x, "shift", js.Any.fromFunction0(value))
    }
  }
}
