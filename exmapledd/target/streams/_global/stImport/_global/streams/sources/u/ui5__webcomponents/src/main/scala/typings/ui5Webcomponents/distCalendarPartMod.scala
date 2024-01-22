package typings.ui5Webcomponents

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCalendarPartMod {
  
  /**
    * @class
    *
    * Abstract base class for Calendar, DayPicker, MonthPicker and YearPicker that adds support for:
    *  - common properties (timestamp, selectedDates): declarations and methods that operate on them
    *  - other common code
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.CalendarPart
    * @extends sap.ui.webc.main.DateComponentBase
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/CalendarPart", JSImport.Default)
  @js.native
  open class default () extends CalendarPart
  
  /**
    * @class
    *
    * Abstract base class for Calendar, DayPicker, MonthPicker and YearPicker that adds support for:
    *  - common properties (timestamp, selectedDates): declarations and methods that operate on them
    *  - other common code
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.CalendarPart
    * @extends sap.ui.webc.main.DateComponentBase
    * @public
    */
  @js.native
  trait CalendarPart
    extends typings.ui5Webcomponents.distDateComponentBaseMod.default {
    
    /**
      * Returns a CalendarDate instance, representing the _timestamp getter - this date is central to all components' rendering logic
      * @protected
      */
    def _calendarDate: typings.ui5WebcomponentsLocalization.distDatesCalendarDateMod.default = js.native
    
    def _getTimestampFromDom(domNode: HTMLElement): Double = js.native
    
    def _localDate: js.Date = js.native
    
    def _maxTimestamp: Double = js.native
    
    def _minTimestamp: Double = js.native
    
    /**
      * Modify a timestamp by a certain amount of days/months/years and enforce limits
      * @param amount
      * @param unit
      * @protected
      */
    def _safelyModifyTimestampBy(amount: Double, unit: String): Unit = js.native
    
    /**
      * Change a timestamp and enforce limits
      *
      * @param timestamp
      * @protected
      */
    def _safelySetTimestamp(timestamp: Double): Unit = js.native
    
    /**
      * Returns the effective timestamp to be used by the respective calendar part
      * @protected
      */
    def _timestamp: Double = js.native
    
    /**
      * The timestamp of the currently focused date. Set this property to move the component's focus to a certain date.
      * <b>Node:</b> Timestamp is 10-digit Integer representing the seconds (not milliseconds) since the Unix Epoch.
      * @type {sap.ui.webc.base.types.Integer}
      * @protected
      */
    var timestamp: js.UndefOr[Double] = js.native
  }
}
