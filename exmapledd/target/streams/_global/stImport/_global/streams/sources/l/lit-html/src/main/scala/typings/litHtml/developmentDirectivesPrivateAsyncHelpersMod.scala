package typings.litHtml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object developmentDirectivesPrivateAsyncHelpersMod {
  
  @JSImport("lit-html/development/directives/private-async-helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lit-html/development/directives/private-async-helpers", "Pauser")
  @js.native
  open class Pauser () extends StObject {
    
    /* private */ var _promise: Any = js.native
    
    /* private */ var _resolve: Any = js.native
    
    /**
      * When paused, returns a promise to be awaited; when unpaused, returns
      * undefined. Note that in the microtask between the pauser being resumed
      * an an await of this promise resolving, the pauser could be paused again,
      * hence callers should check the promise in a loop when awaiting.
      * @returns A promise to be awaited when paused or undefined
      */
    def get(): js.UndefOr[js.Promise[Unit]] = js.native
    
    /**
      * Creates a promise to be awaited
      */
    def pause(): Unit = js.native
    
    /**
      * Resolves the promise which may be awaited
      */
    def resume(): Unit = js.native
  }
  
  @JSImport("lit-html/development/directives/private-async-helpers", "PseudoWeakRef")
  @js.native
  open class PseudoWeakRef[T] protected () extends StObject {
    def this(ref: T) = this()
    
    /* private */ var _ref: Any = js.native
    
    /**
      * Retrieves the backing instance (will be undefined when disconnected)
      */
    def deref(): js.UndefOr[T] = js.native
    
    /**
      * Disassociates the ref with the backing instance.
      */
    def disconnect(): Unit = js.native
    
    /**
      * Reassociates the ref with the backing instance.
      */
    def reconnect(ref: T): Unit = js.native
  }
  
  inline def forAwaitOf[T](
    iterable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AsyncIterable<T> */ Any,
    callback: js.Function1[/* value */ T, js.Promise[Boolean]]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("forAwaitOf")(iterable.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
