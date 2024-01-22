package typings.ui5Webcomponents

import org.scalajs.dom.Event
import org.scalajs.dom.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFeaturesInputElementsFormSupportMod {
  
  @JSImport("@ui5/webcomponents/dist/features/InputElementsFormSupport", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with FormSupport
  object default {
    
    @JSImport("@ui5/webcomponents/dist/features/InputElementsFormSupport", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Syncs the native file input element, rendered into the <code>ui5-file-uploader</code> component's light DOM,
      * with the <code>ui5-file-uploader</code> component's state.
      * @param { IFormFileElement} element - the component with form support
      * @param { NativeInputUpdateCallback } nativeInputUpdateCallback - callback to calculate the native input's "disabled" and "value" properties
      * @param { NativeInputChangeCallback } nativeInputChangeCallback - callback, added to native input's "change" event
      */
    /* static member */
    inline def syncNativeFileInput(
      element: IFormElement,
      nativeInputUpdateCallback: NativeInputUpdateCallback,
      nativeInputChangeCallback: NativeInputChangeCallback
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncNativeFileInput")(element.asInstanceOf[js.Any], nativeInputUpdateCallback.asInstanceOf[js.Any], nativeInputChangeCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Syncs the native input element, rendered into the component's light DOM,
      * with the component's state.
      * @param { IFormElement} element - the component with form support
      * @param { NativeInputUpdateCallback } nativeInputUpdateCallback - callback to calculate the native input's "disabled" and "value" properties
      */
    /* static member */
    inline def syncNativeHiddenInput(element: IFormElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("syncNativeHiddenInput")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def syncNativeHiddenInput(element: IFormElement, nativeInputUpdateCallback: NativeInputUpdateCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncNativeHiddenInput")(element.asInstanceOf[js.Any], nativeInputUpdateCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def triggerFormSubmit(element: IFormElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("triggerFormSubmit")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  trait FormSupport extends StObject
  
  @js.native
  trait IFormElement
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    var checked: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var multiple: js.UndefOr[Boolean] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var required: js.UndefOr[Boolean] = js.native
    
    var value: js.UndefOr[String | Double] = js.native
  }
  
  type NativeInputChangeCallback = js.Function1[/* e */ Event, Unit]
  
  type NativeInputUpdateCallback = js.Function2[/* element */ IFormElement, /* nativeInput */ HTMLInputElement, Unit]
}
