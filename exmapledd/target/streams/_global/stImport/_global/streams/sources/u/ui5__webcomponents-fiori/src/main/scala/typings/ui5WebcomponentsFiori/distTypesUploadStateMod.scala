package typings.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUploadStateMod {
  
  @JSImport("@ui5/webcomponents-fiori/dist/types/UploadState", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[UploadState & String] = js.native
    
    /* "Complete" */ val Complete: typings.ui5WebcomponentsFiori.distTypesUploadStateMod.UploadState.Complete & String = js.native
    
    /* "Error" */ val Error: typings.ui5WebcomponentsFiori.distTypesUploadStateMod.UploadState.Error & String = js.native
    
    /* "Ready" */ val Ready: typings.ui5WebcomponentsFiori.distTypesUploadStateMod.UploadState.Ready & String = js.native
    
    /* "Uploading" */ val Uploading: typings.ui5WebcomponentsFiori.distTypesUploadStateMod.UploadState.Uploading & String = js.native
  }
  
  @js.native
  sealed trait UploadState extends StObject
  @JSImport("@ui5/webcomponents-fiori/dist/types/UploadState", "UploadState")
  @js.native
  object UploadState extends StObject {
    
    /**
      * The file has been uploaded successfully.
      * @public
      * @type {Complete}
      */
    @js.native
    sealed trait Complete
      extends StObject
         with UploadState
    
    /**
      * The file cannot be uploaded due to an error.
      * @public
      * @type {Error}
      */
    @js.native
    sealed trait Error
      extends StObject
         with UploadState
    
    /**
      * The file is awaiting an explicit command to start being uploaded.
      * @public
      * @type {Ready}
      */
    @js.native
    sealed trait Ready
      extends StObject
         with UploadState
    
    /**
      * The file is currently being uploaded.
      * @public
      * @type {Uploading}
      */
    @js.native
    sealed trait Uploading
      extends StObject
         with UploadState
  }
}
