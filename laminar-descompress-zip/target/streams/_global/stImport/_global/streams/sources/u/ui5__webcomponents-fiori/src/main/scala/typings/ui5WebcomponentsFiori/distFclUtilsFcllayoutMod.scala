package typings.ui5WebcomponentsFiori

import typings.ui5WebcomponentsFiori.anon.Desktop
import typings.ui5WebcomponentsFiori.anon.ThreeColumnsEndExpanded
import typings.ui5WebcomponentsFiori.anon.ThreeColumnsMidExpanded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFclUtilsFcllayoutMod {
  
  @JSImport("@ui5/webcomponents-fiori/dist/fcl-utils/FCLLayout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLayoutsByMedia(): Desktop = ^.asInstanceOf[js.Dynamic].applyDynamic("getLayoutsByMedia")().asInstanceOf[Desktop]
  
  inline def getNextLayoutByEndArrow(): ThreeColumnsMidExpanded = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextLayoutByEndArrow")().asInstanceOf[ThreeColumnsMidExpanded]
  
  inline def getNextLayoutByStartArrow(): ThreeColumnsEndExpanded = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextLayoutByStartArrow")().asInstanceOf[ThreeColumnsEndExpanded]
}
