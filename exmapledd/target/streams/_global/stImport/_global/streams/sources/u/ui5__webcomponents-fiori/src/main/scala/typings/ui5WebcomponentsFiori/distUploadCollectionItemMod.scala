package typings.ui5WebcomponentsFiori

import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import typings.ui5WebcomponentsBase.distTypesValueStateMod.ValueState
import typings.ui5WebcomponentsFiori.distTypesUploadStateMod.UploadState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUploadCollectionItemMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    * A component to be used within the <code>ui5-upload-collection</code>.
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents-fiori/dist/UploadCollectionItem.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.fiori.UploadCollectionItem
    * @extends sap.ui.webc.main.ListItem
    * @tagname ui5-upload-collection-item
    * @public
    * @implements sap.ui.webc.fiori.IUploadCollectionItem
    * @since 1.0.0-rc.7
    */
  @JSImport("@ui5/webcomponents-fiori/dist/UploadCollectionItem", JSImport.Default)
  @js.native
  open class default () extends UploadCollectionItem
  object default {
    
    @JSImport("@ui5/webcomponents-fiori/dist/UploadCollectionItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Hold the description of the <code>ui5-upload-collection-item</code>. Will be shown below the file name.
      *
      * @type {Node[]}
      * @slot
      * @name sap.ui.webc.fiori.UploadCollectionItem.prototype.default
      * @public
      */
    /* static member */
    @JSImport("@ui5/webcomponents-fiori/dist/UploadCollectionItem", "default.i18nFioriBundle")
    @js.native
    def i18nFioriBundle: typings.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nFioriBundle_=(x: typings.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nFioriBundle")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def onDefine(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("onDefine")().asInstanceOf[js.Promise[Unit]]
  }
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    * A component to be used within the <code>ui5-upload-collection</code>.
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents-fiori/dist/UploadCollectionItem.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.fiori.UploadCollectionItem
    * @extends sap.ui.webc.main.ListItem
    * @tagname ui5-upload-collection-item
    * @public
    * @implements sap.ui.webc.fiori.IUploadCollectionItem
    * @since 1.0.0-rc.7
    */
  @js.native
  trait UploadCollectionItem
    extends typings.ui5Webcomponents.distListItemMod.default {
    
    def _cancelRenameBtnText: String = js.native
    
    def _editButtonTooltip: String = js.native
    
    /**
      * Indicates if editing.
      *
      * @type {boolean}
      * @defaultvalue false
      * @private
      */
    var _editing: Boolean = js.native
    
    def _fileExtension: String = js.native
    
    def _fileNameWithoutExtension: String = js.native
    
    def _focus(): Unit = js.native
    
    def _initInputField(): js.Promise[Unit] = js.native
    
    def _onDetailKeyup(e: KeyboardEvent): Unit = js.native
    
    def _onFileNameClick(): Unit = js.native
    
    def _onInputFocusin(e: FocusEvent): Unit = js.native
    
    def _onInputKeyDown(e: KeyboardEvent): Unit = js.native
    
    def _onRename(): Unit = js.native
    
    def _onRenameCancel(e: KeyboardEvent): js.Promise[Unit] = js.native
    
    def _onRenameCancelKeyup(e: KeyboardEvent): Unit = js.native
    
    def _onRenameKeyup(e: KeyboardEvent): Unit = js.native
    
    def _onRetry(): Unit = js.native
    
    def _onRetryKeyup(e: KeyboardEvent): Unit = js.native
    
    def _onTerminate(): Unit = js.native
    
    def _onTerminateKeyup(e: KeyboardEvent): Unit = js.native
    
    def _progressText: String = js.native
    
    def _renameBtnText: String = js.native
    
    def _retryButtonTooltip: String = js.native
    
    def _showProgressIndicator: Boolean = js.native
    
    def _showRetry: Boolean = js.native
    
    def _showTerminate: Boolean = js.native
    
    def _terminateButtonTooltip: String = js.native
    
    /**
      * Holds an instance of <code>File</code> associated with this item.
      *
      * @type {File}
      * @name sap.ui.webc.fiori.UploadCollectionItem.prototype.file
      * @defaultvalue null
      * @public
      */
    var file: js.UndefOr[js.Object] = js.native
    
    /**
      * The name of the file.
      *
      * @type {string}
      * @name sap.ui.webc.fiori.UploadCollectionItem.prototype.fileName
      * @defaultvalue ""
      * @public
      */
    var fileName: String = js.native
    
    /**
      * If set to <code>true</code> the file name will be clickable and it will fire <code>file-name-click</code> event upon click.
      *
      * @type {boolean}
      * @name sap.ui.webc.fiori.UploadCollectionItem.prototype.fileNameClickable
      * @defaultvalue false
      * @public
      */
    var fileNameClickable: Boolean = js.native
    
    /**
      * By default, the Delete button will always be shown, regardless of the <code>ui5-upload-collection</code>'s property <code>mode</code>.
      * Setting this property to <code>true</code> will hide the delete button.
      *
      * @type {boolean}
      * @name sap.ui.webc.fiori.UploadCollectionItem.prototype.hideDeleteButton
      * @defaultvalue false
      */
    var hideDeleteButton: Boolean = js.native
    
    /**
      * Hides the retry button when <code>uploadState</code> property is <code>Error</code>.
      *
      * @type {boolean}
      * @name sap.ui.webc.fiori.UploadCollectionItem.prototype.hideRetryButton
      * @defaultvalue false
      * @public
      */
    var hideRetryButton: Boolean = js.native
    
    /**
      * Hides the terminate button when <code>uploadState</code> property is <code>Uploading</code>.
      *
      * @type {boolean}
      * @name sap.ui.webc.fiori.UploadCollectionItem.prototype.hideTerminateButton
      * @defaultvalue false
      * @public
      */
    var hideTerminateButton: Boolean = js.native
    
    /**
      * The upload progress in percentage.
      * <br><br>
      * <b>Note:</b> Expected values are in the interval [0, 100].
      *
      * @type {sap.ui.webc.base.types.Integer}
      * @name sap.ui.webc.fiori.UploadCollectionItem.prototype.progress
      * @defaultvalue 0
      * @public
      */
    var progress: Double = js.native
    
    def showEditButton: Boolean = js.native
    
    /**
      * A thumbnail, which will be shown in the beginning of the <code>ui5-upload-collection-item</code>.
      * <br><br>
      * <b>Note:</b> Use <code>ui5-icon</code> or <code>img</code> for the intended design.
      *
      * @type {HTMLElement}
      * @slot
      * @name sap.ui.webc.fiori.UploadCollectionItem.prototype.thumbnail
      * @public
      */
    var thumbnail: js.Array[HTMLElement] = js.native
    
    /**
      * If set to <code>Uploading</code> or <code>Error</code>, a progress indicator showing the <code>progress</code> is displayed.
      * Also if set to <code>Error</code>, a refresh button is shown. When this icon is pressed <code>retry</code> event is fired.
      * If set to <code>Uploading</code>, a terminate button is shown. When this icon is pressed <code>terminate</code> event is fired.
      *
      * @type {sap.ui.webc.fiori.types.UploadState}
      * @name sap.ui.webc.fiori.UploadCollectionItem.prototype.uploadState
      * @defaultvalue "Ready"
      * @public
      */
    var uploadState: UploadState = js.native
    
    def valueStateName: ValueState = js.native
  }
}
