package typings.std

import typings.std.stdStrings.contextlost
import typings.std.stdStrings.contextrestored
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OffscreenCanvas
  extends StObject
     with EventTarget
     with _CanvasImageSource
     with _TexImageSource
     with _Transferable {
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_contextlost(
    `type`: contextlost,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextlost(
    `type`: contextlost,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextlost(
    `type`: contextlost,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextrestored(
    `type`: contextrestored,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextrestored(
    `type`: contextrestored,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextrestored(
    `type`: contextrestored,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /**
    * Returns an object that exposes an API for drawing on the OffscreenCanvas object. contextId specifies the desired API: "2d", "bitmaprenderer", "webgl", or "webgl2". options is handled by that API.
    *
    * This specification defines the "2d" context below, which is similar but distinct from the "2d" context that is created from a canvas element. The WebGL specifications define the "webgl" and "webgl2" contexts. [WEBGL]
    *
    * Returns null if the canvas has already been initialized with another context type (e.g., trying to get a "2d" context after getting a "webgl" context).
    */
  /* standard dom */
  def getContext(contextId: OffscreenRenderingContextId): OffscreenRenderingContext | Null = js.native
  def getContext(contextId: OffscreenRenderingContextId, options: Any): OffscreenRenderingContext | Null = js.native
  
  /**
    * These attributes return the dimensions of the OffscreenCanvas object's bitmap.
    *
    * They can be set, to replace the bitmap with a new, transparent black bitmap of the specified dimensions (effectively resizing it).
    */
  /* standard dom */
  var height: Double = js.native
  
  /* standard dom */
  var oncontextlost: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard dom */
  var oncontextrestored: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_contextlost(
    `type`: contextlost,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextlost(
    `type`: contextlost,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextlost(
    `type`: contextlost,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextrestored(
    `type`: contextrestored,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextrestored(
    `type`: contextrestored,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextrestored(
    `type`: contextrestored,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /** Returns a newly created ImageBitmap object with the image in the OffscreenCanvas object. The image in the OffscreenCanvas object is replaced with a new blank image. */
  /* standard dom */
  def transferToImageBitmap(): ImageBitmap = js.native
  
  /**
    * These attributes return the dimensions of the OffscreenCanvas object's bitmap.
    *
    * They can be set, to replace the bitmap with a new, transparent black bitmap of the specified dimensions (effectively resizing it).
    */
  /* standard dom */
  var width: Double = js.native
}
