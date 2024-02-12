package typings.ui5Webcomponents

import org.scalajs.dom.Event
import org.scalajs.dom.EventListenerOptions
import org.scalajs.dom.KeyboardEvent
import typings.std.AddEventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.ui5Webcomponents.distCalendarMod.ICalendarPicker
import typings.ui5Webcomponents.ui5WebcomponentsInts.`20`
import typings.ui5Webcomponents.ui5WebcomponentsInts.`2`
import typings.ui5Webcomponents.ui5WebcomponentsInts.`4`
import typings.ui5Webcomponents.ui5WebcomponentsInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distYearPickerMod {
  
  /**
    * @class
    *
    * Displays years which can be selected.
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.YearPicker
    * @extends sap.ui.webc.main.CalendarPart
    * @tagname ui5-yearpicker
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/YearPicker", JSImport.Default)
  @js.native
  open class default () extends YearPicker {
    
    /* CompleteClass */
    override def _hasNextPage(): Boolean = js.native
    
    /* CompleteClass */
    override def _hasPreviousPage(): Boolean = js.native
    
    /* CompleteClass */
    override def _showNextPage(): Unit = js.native
    
    /* CompleteClass */
    override def _showPreviousPage(): Unit = js.native
  }
  object default {
    
    @JSImport("@ui5/webcomponents/dist/YearPicker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/YearPicker", "default.i18nBundle")
    @js.native
    def i18nBundle: typings.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: typings.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def onDefine(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("onDefine")().asInstanceOf[js.Promise[Unit]]
  }
  
  trait Year extends StObject {
    
    var _tabIndex: String
    
    var ariaSelected: String
    
    var classes: String
    
    var disabled: Boolean
    
    var focusRef: Boolean
    
    var selected: Boolean
    
    var timestamp: String
    
    var year: String
    
    var yearInSecType: js.UndefOr[String] = js.undefined
  }
  object Year {
    
    inline def apply(
      _tabIndex: String,
      ariaSelected: String,
      classes: String,
      disabled: Boolean,
      focusRef: Boolean,
      selected: Boolean,
      timestamp: String,
      year: String
    ): Year = {
      val __obj = js.Dynamic.literal(_tabIndex = _tabIndex.asInstanceOf[js.Any], ariaSelected = ariaSelected.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], focusRef = focusRef.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[Year]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Year] (val x: Self) extends AnyVal {
      
      inline def setAriaSelected(value: String): Self = StObject.set(x, "ariaSelected", value.asInstanceOf[js.Any])
      
      inline def setClasses(value: String): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setFocusRef(value: Boolean): Self = StObject.set(x, "focusRef", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      inline def setYearInSecType(value: String): Self = StObject.set(x, "yearInSecType", value.asInstanceOf[js.Any])
      
      inline def setYearInSecTypeUndefined: Self = StObject.set(x, "yearInSecType", js.undefined)
      
      inline def set_tabIndex(value: String): Self = StObject.set(x, "_tabIndex", value.asInstanceOf[js.Any])
    }
  }
  
  type YearInterval = js.Array[js.Array[Year]]
  
  /**
    * @class
    *
    * Displays years which can be selected.
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.YearPicker
    * @extends sap.ui.webc.main.CalendarPart
    * @tagname ui5-yearpicker
    * @public
    */
  @js.native
  trait YearPicker
    extends typings.ui5Webcomponents.distCalendarPartMod.default
       with ICalendarPicker {
    
    def _buildYears(): Unit = js.native
    
    def _calculateFirstYear(): Unit = js.native
    
    def _getPageSize(): `8` | `20` = js.native
    
    def _getRowSize(): `2` | `4` = js.native
    
    var _hidden: Boolean = js.native
    
    /**
      * Modifies timestamp by a given amount of years and, if necessary, loads the prev/next page.
      * @param { number } amount
      * @private
      */
    def _modifyTimestampBy(amount: Double): Unit = js.native
    
    def _onHomeOrEnd(homePressed: Boolean): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeyup(e: KeyboardEvent): Unit = js.native
    
    /**
      * User clicked with the mouser or pressed Enter/Space
      * @param { Event } e
      * @private
      */
    def _selectYear(e: Event): Unit = js.native
    
    /**
      * Sets the timestamp to an absolute value.
      * @param { number } value
      * @private
      */
    def _setTimestamp(value: Double): Unit = js.native
    
    var _years: YearInterval = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    
    def roleDescription: String = js.native
    
    /**
      * An array of UTC timestamps representing the selected date
      * or dates depending on the capabilities of the picker component.
      * @type {array}
      * @name sap.ui.webc.main.YearPicker.prototype.selectedDates
      * @public
      */
    var selectedDates: js.Array[Double] = js.native
  }
  
  trait YearPickerChangeEventDetail extends StObject {
    
    var timestamp: Double
  }
  object YearPickerChangeEventDetail {
    
    inline def apply(timestamp: Double): YearPickerChangeEventDetail = {
      val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[YearPickerChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: YearPickerChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait YearPickerNavigateEventDetail extends StObject {
    
    var timestamp: Double
  }
  object YearPickerNavigateEventDetail {
    
    inline def apply(timestamp: Double): YearPickerNavigateEventDetail = {
      val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[YearPickerNavigateEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: YearPickerNavigateEventDetail] (val x: Self) extends AnyVal {
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
}
