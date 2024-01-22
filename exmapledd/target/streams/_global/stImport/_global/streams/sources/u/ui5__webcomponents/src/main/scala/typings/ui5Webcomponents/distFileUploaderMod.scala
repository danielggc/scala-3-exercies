package typings.ui5Webcomponents

import org.scalajs.dom.Event
import org.scalajs.dom.FileList
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.Node
import typings.std.ElementInternals
import typings.std.Record
import typings.ui5Webcomponents.anon.PopoverHeader
import typings.ui5Webcomponents.distFeaturesInputElementsFormSupportMod.IFormElement
import typings.ui5WebcomponentsBase.distTypesValueStateMod.ValueState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFileUploaderMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-file-uploader</code> opens a file explorer dialog and enables users to upload files.
    * The component consists of input field, but you can provide an HTML element by your choice
    * to trigger the file upload, by using the default slot.
    * Furthermore, you can set the property "hideInput" to "true" to hide the input field.
    * <br>
    * To get all selected files, you can simply use the read-only "files" property.
    * To restrict the types of files the user can select, you can use the "accept" property.
    * <br>
    * And, similar to all input based components, the FileUploader supports "valueState", "placeholder", "name", and "disabled" properties.
    *
    * For the <code>ui5-file-uploader</code>
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/FileUploader.js";</code>
    *
    * @constructor
    * @since 1.0.0-rc.6
    * @author SAP SE
    * @alias sap.ui.webc.main.FileUploader
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-file-uploader
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/FileUploader", JSImport.Default)
  @js.native
  open class default () extends FileUploader
  object default {
    
    @JSImport("@ui5/webcomponents/dist/FileUploader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/FileUploader", "default.emptyInput")
    @js.native
    def emptyInput: HTMLInputElement = js.native
    inline def emptyInput_=(x: HTMLInputElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyInput")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/FileUploader", "default.i18nBundle")
    @js.native
    def i18nBundle: typings.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: typings.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def onDefine(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("onDefine")().asInstanceOf[js.Promise[Unit]]
  }
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-file-uploader</code> opens a file explorer dialog and enables users to upload files.
    * The component consists of input field, but you can provide an HTML element by your choice
    * to trigger the file upload, by using the default slot.
    * Furthermore, you can set the property "hideInput" to "true" to hide the input field.
    * <br>
    * To get all selected files, you can simply use the read-only "files" property.
    * To restrict the types of files the user can select, you can use the "accept" property.
    * <br>
    * And, similar to all input based components, the FileUploader supports "valueState", "placeholder", "name", and "disabled" properties.
    *
    * For the <code>ui5-file-uploader</code>
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/FileUploader.js";</code>
    *
    * @constructor
    * @since 1.0.0-rc.6
    * @author SAP SE
    * @alias sap.ui.webc.main.FileUploader
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-file-uploader
    * @public
    */
  @js.native
  trait FileUploader extends IFormElement {
    
    def _canUseNativeFormSupport: Boolean = js.native
    
    def _enableFormSupport(): Unit = js.native
    
    def _getPopover(): js.Promise[typings.ui5Webcomponents.distPopoverMod.default] = js.native
    
    def _input: HTMLInputElement = js.native
    
    var _internals: ElementInternals = js.native
    
    def _keepInputInShadowDOM: Boolean = js.native
    
    def _onChange(e: Event): Unit = js.native
    
    def _onclick(e: MouseEvent): Unit = js.native
    
    def _onfocusin(): Unit = js.native
    
    def _onfocusout(): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeyup(e: KeyboardEvent): Unit = js.native
    
    def _onmouseout(): Unit = js.native
    
    def _onmouseover(): Unit = js.native
    
    def _setFormValue(): Unit = js.native
    
    def _updateValue(): Unit = js.native
    def _updateValue(files: FileList): Unit = js.native
    
    /**
      * This method is relevant for sap_horizon theme only
      */
    def _valueStateMessageInputIcon: String = js.native
    
    /**
      * Comma-separated list of file types that the component should accept.
      * <br><br>
      * <b>Note:</b> Please make sure you are adding the <code>.</code> in front on the file type, e.g. <code>.png</code> in case you want to accept png's only.
      * @type {string}
      * @name sap.ui.webc.main.FileUploader.prototype.accept
      * @defaultvalue ""
      * @public
      */
    var accept: String = js.native
    
    def browseText: String = js.native
    
    def closeValueStatePopover(): js.Promise[Unit] = js.native
    
    /**
      * By default the component contains a single input field. With this slot you can pass any content that you wish to add. See the samples for more information.
      *
      * @type {HTMLElement[]}
      * @name sap.ui.webc.main.FileUploader.prototype.default
      * @slot content
      * @public
      */
    var content: js.Array[HTMLElement] = js.native
    
    /**
      * Defines whether the component is in disabled state.
      * <br><br>
      * <b>Note:</b> A disabled component is completely noninteractive.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.FileUploader.prototype.disabled
      * @defaultvalue false
      * @public
      */
    @JSName("disabled")
    var disabled_FileUploader: Boolean = js.native
    
    /**
      * FileList of all selected files.
      * @readonly
      * @type {FileList}
      * @public
      * @name sap.ui.webc.main.FileUploader.prototype.files
      */
    def files: FileList | Null = js.native
    
    /**
      * @private
      */
    var focused: Boolean = js.native
    
    /**
      * The slot is used to render native <code>input</code> HTML element within Light DOM to enable form submit,
      * when <code>name</code> property is set.
      * @type {HTMLElement[]}
      * @slot
      * @private
      */
    var formSupport: js.Array[HTMLElement] = js.native
    
    def hasValueState: Boolean = js.native
    
    def hasValueStateText: Boolean = js.native
    
    /**
      * If set to "true", the input field of component will not be rendered. Only the default slot that is passed will be rendered.
      * @type {boolean}
      * @name sap.ui.webc.main.FileUploader.prototype.hideInput
      * @defaultvalue false
      * @public
      */
    var hideInput: Boolean = js.native
    
    /**
      * Allows multiple files to be chosen.
      * @type {boolean}
      * @name sap.ui.webc.main.FileUploader.prototype.multiple
      * @defaultvalue false
      * @public
      */
    @JSName("multiple")
    var multiple_FileUploader: Boolean = js.native
    
    /**
      * Determines the name with which the component will be submitted in an HTML form.
      *
      * <br><br>
      * <b>Important:</b> For the <code>name</code> property to have effect, you must add the following import to your project:
      * <code>import "@ui5/webcomponents/dist/features/InputElementsFormSupport.js";</code>
      *
      * <br><br>
      * <b>Note:</b> When set, a native <code>input</code> HTML element
      * will be created inside the component so that it can be submitted as
      * part of an HTML form. Do not use this property unless you need to submit a form.
      *
      * @type {string}
      * @name sap.ui.webc.main.FileUploader.prototype.name
      * @defaultvalue ""
      * @public
      */
    @JSName("name")
    var name_FileUploader: String = js.native
    
    def openValueStatePopover(): js.Promise[Unit] = js.native
    
    /**
      * Defines a short hint intended to aid the user with data entry when the component has no value.
      * @type {string}
      * @name sap.ui.webc.main.FileUploader.prototype.placeholder
      * @defaultvalue ""
      * @public
      */
    var placeholder: String = js.native
    
    def shouldDisplayDefaultValueStateMessage: Boolean = js.native
    
    def shouldOpenValueStateMessagePopover: Boolean = js.native
    
    def styles: PopoverHeader = js.native
    
    def titleText: String = js.native
    
    def toggleValueStatePopover(open: Boolean): Unit = js.native
    
    def ui5Input: typings.ui5Webcomponents.distInputMod.default | Null = js.native
    
    /**
      * Defines the value state of the component.
      * <br><br>
      * Available options are:
      * <ul>
      * <li><code>None</code></li>
      * <li><code>Error</code></li>
      * <li><code>Warning</code></li>
      * <li><code>Success</code></li>
      * <li><code>Information</code></li>
      * </ul>
      *
      * @type {sap.ui.webc.base.types.ValueState}
      * @name sap.ui.webc.main.FileUploader.prototype.valueState
      * @defaultvalue "None"
      * @public
      */
    var valueState: ValueState = js.native
    
    /**
      * Defines the value state message that will be displayed as pop up under the component.
      * <br><br>
      *
      * <b>Note:</b> If not specified, a default text (in the respective language) will be displayed.
      * <br>
      * <b>Note:</b> The <code>valueStateMessage</code> would be displayed,
      * when the component is in <code>Information</code>, <code>Warning</code> or <code>Error</code> value state.
      * @type {HTMLElement[]}
      * @name sap.ui.webc.main.FileUploader.prototype.valueStateMessage
      * @since 1.0.0-rc.9
      * @slot
      * @public
      */
    var valueStateMessage: js.Array[HTMLElement] = js.native
    
    def valueStateMessageText: js.Array[Node] = js.native
    
    def valueStateText: String = js.native
    
    def valueStateTextMappings: Record[String, String] = js.native
    
    /**
      * Defines the name/names of the file/files to upload.
      * @type {string}
      * @name sap.ui.webc.main.FileUploader.prototype.value
      * @defaultvalue ""
      * @formEvents change
      * @formProperty
      * @public
      */
    @JSName("value")
    var value_FileUploader: String = js.native
  }
}
