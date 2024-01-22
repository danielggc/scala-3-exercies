package typings.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesViewSettingsDialogModeMod {
  
  @JSImport("@ui5/webcomponents-fiori/dist/types/ViewSettingsDialogMode", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ViewSettingsDialogMode & String] = js.native
    
    /* "Filter" */ val Filter: typings.ui5WebcomponentsFiori.distTypesViewSettingsDialogModeMod.ViewSettingsDialogMode.Filter & String = js.native
    
    /* "Sort" */ val Sort: typings.ui5WebcomponentsFiori.distTypesViewSettingsDialogModeMod.ViewSettingsDialogMode.Sort & String = js.native
  }
  
  @js.native
  sealed trait ViewSettingsDialogMode extends StObject
  @JSImport("@ui5/webcomponents-fiori/dist/types/ViewSettingsDialogMode", "ViewSettingsDialogMode")
  @js.native
  object ViewSettingsDialogMode extends StObject {
    
    /**
      * Filter type
      * @since 1.0.0-rc.16
      * @public
      * @type {Filter}
      */
    @js.native
    sealed trait Filter
      extends StObject
         with ViewSettingsDialogMode
    
    /**
      * Default type
      * @since 1.0.0-rc.16
      * @public
      * @type {Sort}
      */
    @js.native
    sealed trait Sort
      extends StObject
         with ViewSettingsDialogMode
  }
}
