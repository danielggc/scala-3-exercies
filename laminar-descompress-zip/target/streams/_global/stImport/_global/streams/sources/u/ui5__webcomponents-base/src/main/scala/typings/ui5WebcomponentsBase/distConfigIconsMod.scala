package typings.ui5WebcomponentsBase

import typings.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.horizon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConfigIconsMod {
  
  @JSImport("@ui5/webcomponents-base/dist/config/Icons", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait IconCollection extends StObject
  @JSImport("@ui5/webcomponents-base/dist/config/Icons", "IconCollection")
  @js.native
  object IconCollection extends StObject {
    
    @js.native
    sealed trait v4
      extends StObject
         with IconCollection
    
    @js.native
    sealed trait v5
      extends StObject
         with IconCollection
  }
  
  /**
    * Returns the default icon collection (v4 or v5) for given theme,
    * that is configured.
    *
    * @param {string} theme
    * @public
    * @returns {string | undefined}
    */
  inline def getDefaultIconCollection(theme: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultIconCollection")(theme.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  /**
    * Returns the effective icon collection that will be applied for icon web components
    * whenever namespace is not specified.
    * @returns {string}
    */
  inline def getEffectiveDefaultIconCollection(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getEffectiveDefaultIconCollection")().asInstanceOf[String]
  
  /**
    * Sets the default icon collection (SAP-icons font v4 or SAP-icons font v5) per theme,
    * which will be applied in case icon collection is not specified.
    *
    * Note: by default SAP-icons-v5 is used in all SAP Horizon variants and SAP-icons-v4 for all the rest.
    * @public
    * @param {string} theme
    * @param {IconCollection} collectionName
    */
  inline def setDefaultIconCollection(theme: String, collectionName: IconCollection): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultIconCollection")(theme.asInstanceOf[js.Any], collectionName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setDefaultIconCollection_horizon(theme: String, collectionName: horizon): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultIconCollection")(theme.asInstanceOf[js.Any], collectionName.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
