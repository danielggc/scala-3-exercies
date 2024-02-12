package typings.ui5WebcomponentsLocalization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDatesModifyDateByMod {
  
  @JSImport("@ui5/webcomponents-localization/dist/dates/modifyDateBy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Adds or subtracts a given amount of days/months/years from a date.
    * If minDate or maxDate are given, the result will be enforced within these limits
    *
    * @param date CalendarDate instance
    * @param amount how many days/months/years to add (can be a negative number)
    * @param unit what to modify: "day", "month" or "year"
    * @param minDate minimum date to enforce
    * @param maxDate maximum date to enforce
    */
  inline def default(
    date: typings.ui5WebcomponentsLocalization.distDatesCalendarDateMod.default,
    amount: Double,
    unit: String
  ): typings.ui5WebcomponentsLocalization.distDatesCalendarDateMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[typings.ui5WebcomponentsLocalization.distDatesCalendarDateMod.default]
  inline def default(
    date: typings.ui5WebcomponentsLocalization.distDatesCalendarDateMod.default,
    amount: Double,
    unit: String,
    minDate: Unit,
    maxDate: typings.ui5WebcomponentsLocalization.distDatesCalendarDateMod.default
  ): typings.ui5WebcomponentsLocalization.distDatesCalendarDateMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], minDate.asInstanceOf[js.Any], maxDate.asInstanceOf[js.Any])).asInstanceOf[typings.ui5WebcomponentsLocalization.distDatesCalendarDateMod.default]
  inline def default(
    date: typings.ui5WebcomponentsLocalization.distDatesCalendarDateMod.default,
    amount: Double,
    unit: String,
    minDate: typings.ui5WebcomponentsLocalization.distDatesCalendarDateMod.default
  ): typings.ui5WebcomponentsLocalization.distDatesCalendarDateMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], minDate.asInstanceOf[js.Any])).asInstanceOf[typings.ui5WebcomponentsLocalization.distDatesCalendarDateMod.default]
  inline def default(
    date: typings.ui5WebcomponentsLocalization.distDatesCalendarDateMod.default,
    amount: Double,
    unit: String,
    minDate: typings.ui5WebcomponentsLocalization.distDatesCalendarDateMod.default,
    maxDate: typings.ui5WebcomponentsLocalization.distDatesCalendarDateMod.default
  ): typings.ui5WebcomponentsLocalization.distDatesCalendarDateMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], minDate.asInstanceOf[js.Any], maxDate.asInstanceOf[js.Any])).asInstanceOf[typings.ui5WebcomponentsLocalization.distDatesCalendarDateMod.default]
}
