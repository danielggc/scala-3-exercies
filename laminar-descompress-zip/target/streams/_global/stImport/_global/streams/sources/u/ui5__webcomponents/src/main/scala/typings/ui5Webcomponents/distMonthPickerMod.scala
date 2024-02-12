package typings.ui5Webcomponents

import org.scalajs.dom.Event
import org.scalajs.dom.EventListenerOptions
import org.scalajs.dom.KeyboardEvent
import typings.std.AddEventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.ui5Webcomponents.anon.Text
import typings.ui5Webcomponents.distCalendarMod.ICalendarPicker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMonthPickerMod {
  
  /**
    * Month picker component.
    *
    * @class
    *
    * Displays months which can be selected.
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.MonthPicker
    * @extends sap.ui.webc.main.CalendarPart
    * @tagname ui5-monthpicker
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/MonthPicker", JSImport.Default)
  @js.native
  open class default () extends MonthPicker {
    
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
    
    @JSImport("@ui5/webcomponents/dist/MonthPicker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/MonthPicker", "default.i18nBundle")
    @js.native
    def i18nBundle: typings.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: typings.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def onDefine(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("onDefine")().asInstanceOf[js.Promise[Unit]]
  }
  
  trait Month extends StObject {
    
    var _tabIndex: String
    
    var ariaSelected: String
    
    var classes: String
    
    var disabled: Boolean
    
    var focusRef: Boolean
    
    var name: String
    
    var nameInSecType: String
    
    var selected: Boolean
    
    var timestamp: String
  }
  object Month {
    
    inline def apply(
      _tabIndex: String,
      ariaSelected: String,
      classes: String,
      disabled: Boolean,
      focusRef: Boolean,
      name: String,
      nameInSecType: String,
      selected: Boolean,
      timestamp: String
    ): Month = {
      val __obj = js.Dynamic.literal(_tabIndex = _tabIndex.asInstanceOf[js.Any], ariaSelected = ariaSelected.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], focusRef = focusRef.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameInSecType = nameInSecType.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Month]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Month] (val x: Self) extends AnyVal {
      
      inline def setAriaSelected(value: String): Self = StObject.set(x, "ariaSelected", value.asInstanceOf[js.Any])
      
      inline def setClasses(value: String): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setFocusRef(value: Boolean): Self = StObject.set(x, "focusRef", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameInSecType(value: String): Self = StObject.set(x, "nameInSecType", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def set_tabIndex(value: String): Self = StObject.set(x, "_tabIndex", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Month picker component.
    *
    * @class
    *
    * Displays months which can be selected.
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.MonthPicker
    * @extends sap.ui.webc.main.CalendarPart
    * @tagname ui5-monthpicker
    * @public
    */
  @js.native
  trait MonthPicker
    extends typings.ui5Webcomponents.distCalendarPartMod.default
       with ICalendarPicker {
    
    def _buildMonths(): Unit = js.native
    
    def _getDisplayedSecondaryMonthText(timestamp: Double): Text = js.native
    
    var _hidden: Boolean = js.native
    
    def _isOutOfSelectableRange(
      date: typings.ui5WebcomponentsLocalization.distDatesCalendarDateMod.default,
      minDate: typings.ui5WebcomponentsLocalization.distDatesCalendarDateMod.default,
      maxDate: typings.ui5WebcomponentsLocalization.distDatesCalendarDateMod.default
    ): Boolean = js.native
    
    /**
      * Modifies timestamp by a given amount of months and,
      * if necessary, loads the prev/next page.
      * @param { number } amount
      * @private
      */
    def _modifyTimestampBy(amount: Double): Unit = js.native
    
    var _months: MothInterval = js.native
    
    def _onHomeOrEnd(homePressed: Boolean): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeyup(e: KeyboardEvent): Unit = js.native
    
    /**
      * Selects a month, when the user clicks or presses "Enter" or "Space".
      * @param { Event } e
      * @private
      */
    def _selectMonth(e: Event): Unit = js.native
    
    /**
      * Sets the timestamp to an absolute value.
      * @param { number } value
      * @private
      */
    def _setTimestamp(value: Double): Unit = js.native
    
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
      * @name sap.ui.webc.main.MonthPicker.prototype.selectedDates
      * @public
      */
    var selectedDates: js.Array[Double] = js.native
  }
  
  trait MonthPickerChangeEventDetail extends StObject {
    
    var timestamp: Double
  }
  object MonthPickerChangeEventDetail {
    
    inline def apply(timestamp: Double): MonthPickerChangeEventDetail = {
      val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[MonthPickerChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MonthPickerChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait MonthPickerNavigateEventDetail extends StObject {
    
    var timestamp: Double
  }
  object MonthPickerNavigateEventDetail {
    
    inline def apply(timestamp: Double): MonthPickerNavigateEventDetail = {
      val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[MonthPickerNavigateEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MonthPickerNavigateEventDetail] (val x: Self) extends AnyVal {
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  type MothInterval = js.Array[js.Array[Month]]
}
