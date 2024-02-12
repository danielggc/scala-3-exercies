package typings.ui5WebcomponentsLocalization

import typings.ui5WebcomponentsBase.distTypesCalendarTypeMod.CalendarType
import typings.ui5WebcomponentsLocalization.distDatesCalendarDateMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDatesExtremeDatesMod {
  
  @JSImport("@ui5/webcomponents-localization/dist/dates/ExtremeDates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMaxCalendarDate(primaryCalendarType: CalendarType): default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaxCalendarDate")(primaryCalendarType.asInstanceOf[js.Any]).asInstanceOf[default]
  
  inline def getMinCalendarDate(primaryCalendarType: CalendarType): default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMinCalendarDate")(primaryCalendarType.asInstanceOf[js.Any]).asInstanceOf[default]
}
