package typings.ui5WebcomponentsBase

import typings.ui5WebcomponentsBase.distTypesCalendarTypeMod.CalendarType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConfigCalendarTypeMod {
  
  @JSImport("@ui5/webcomponents-base/dist/config/CalendarType", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns the configured or default calendar type.
    * @public
    * @returns { CalendarType } the effective calendar type
    */
  inline def getCalendarType(): CalendarType = ^.asInstanceOf[js.Dynamic].applyDynamic("getCalendarType")().asInstanceOf[CalendarType]
}
