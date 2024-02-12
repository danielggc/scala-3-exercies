package typings.ui5WebcomponentsLocalization

import typings.ui5WebcomponentsBase.distTypesCalendarTypeMod.CalendarType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDatesGetTodayUTCTimestampMod {
  
  @JSImport("@ui5/webcomponents-localization/dist/dates/getTodayUTCTimestamp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns a UTC timestamp representing today
    * @public
    */
  inline def default(primaryCalendarType: CalendarType): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(primaryCalendarType.asInstanceOf[js.Any]).asInstanceOf[Double]
}
