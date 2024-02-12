package typings.ui5WebcomponentsLocalization

import typings.ui5WebcomponentsBase.distTypesCalendarTypeMod.CalendarType
import typings.ui5WebcomponentsLocalization.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDatesConvertMonthNumbersToMonthNamesMod {
  
  @JSImport("@ui5/webcomponents-localization/dist/dates/convertMonthNumbersToMonthNames", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Convert month number to month name (text).
    * If the numbers of the two months are the same you will get the name of the month,
    * otherwise you will get the two names separated by a dash
    *
    * @param firstMonth CalendarDate Month
    * @param lastMonth CalendarDate Month
    * @param calendarType calendar type
    * @returns {String}
    */
  inline def default(firstMonth: Double, lastMonth: Double): Text = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(firstMonth.asInstanceOf[js.Any], lastMonth.asInstanceOf[js.Any])).asInstanceOf[Text]
  inline def default(firstMonth: Double, lastMonth: Double, calendarType: CalendarType): Text = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(firstMonth.asInstanceOf[js.Any], lastMonth.asInstanceOf[js.Any], calendarType.asInstanceOf[js.Any])).asInstanceOf[Text]
}
