package typings.ui5Webcomponents.anon

import typings.ui5Webcomponents.distFeaturesInputElementsFormSupportMod.IFormElement
import typings.ui5Webcomponents.distFeaturesInputElementsFormSupportMod.NativeInputChangeCallback
import typings.ui5Webcomponents.distFeaturesInputElementsFormSupportMod.NativeInputUpdateCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofFormSupportT extends StObject {
  
  /**
    * Syncs the native file input element, rendered into the <code>ui5-file-uploader</code> component's light DOM,
    * with the <code>ui5-file-uploader</code> component's state.
    * @param { IFormFileElement} element - the component with form support
    * @param { NativeInputUpdateCallback } nativeInputUpdateCallback - callback to calculate the native input's "disabled" and "value" properties
    * @param { NativeInputChangeCallback } nativeInputChangeCallback - callback, added to native input's "change" event
    */
  /* static member */
  def syncNativeFileInput(
    element: IFormElement,
    nativeInputUpdateCallback: NativeInputUpdateCallback,
    nativeInputChangeCallback: NativeInputChangeCallback
  ): Unit = js.native
  
  /**
    * Syncs the native input element, rendered into the component's light DOM,
    * with the component's state.
    * @param { IFormElement} element - the component with form support
    * @param { NativeInputUpdateCallback } nativeInputUpdateCallback - callback to calculate the native input's "disabled" and "value" properties
    */
  /* static member */
  def syncNativeHiddenInput(element: IFormElement): Unit = js.native
  def syncNativeHiddenInput(element: IFormElement, nativeInputUpdateCallback: NativeInputUpdateCallback): Unit = js.native
  
  /* static member */
  def triggerFormSubmit(element: IFormElement): Unit = js.native
}
