package typings.ui5Webcomponents

import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import typings.ui5Webcomponents.anon.AriaLabelMonthButton
import typings.ui5WebcomponentsBase.distTypesCalendarTypeMod.CalendarType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCalendarHeaderMod {
  
  @JSImport("@ui5/webcomponents/dist/CalendarHeader", JSImport.Default)
  @js.native
  open class default () extends CalendarHeader
  object default {
    
    @JSImport("@ui5/webcomponents/dist/CalendarHeader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/CalendarHeader", "default.i18nBundle")
    @js.native
    def i18nBundle: typings.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: typings.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def onDefine(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("onDefine")().asInstanceOf[js.Promise[Unit]]
  }
  
  @js.native
  trait CalendarHeader
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    var _monthButtonText: String = js.native
    
    var _nextButtonText: js.UndefOr[String] = js.native
    
    var _prevButtonText: js.UndefOr[String] = js.native
    
    var _secondMonthButtonText: js.UndefOr[String] = js.native
    
    var _secondYearButtonText: js.UndefOr[String] = js.native
    
    var _yearButtonText: String = js.native
    
    var _yearButtonTextSecType: String = js.native
    
    def accInfo: AriaLabelMonthButton = js.native
    
    /**
      * Stores information for month button for secondary calendar type
      * @type {object}
      * @private
      */
    var buttonTextForSecondaryCalendarType: SecondaryCalendarButtonTexts = js.native
    
    def hasSecondaryCalendarType: Boolean = js.native
    
    var isMonthButtonHidden: Boolean = js.native
    
    var isNextButtonDisabled: Boolean = js.native
    
    var isPrevButtonDisabled: Boolean = js.native
    
    var isYearButtonHidden: Boolean = js.native
    
    def onMonthButtonClick(e: MouseEvent): Unit = js.native
    
    def onMonthButtonKeyDown(e: KeyboardEvent): Unit = js.native
    
    def onMonthButtonKeyUp(e: KeyboardEvent): Unit = js.native
    
    def onNextButtonClick(e: MouseEvent): Unit = js.native
    
    def onPrevButtonClick(e: MouseEvent): Unit = js.native
    
    def onYearButtonClick(e: MouseEvent): Unit = js.native
    
    def onYearButtonKeyDown(e: KeyboardEvent): Unit = js.native
    
    def onYearButtonKeyUp(e: KeyboardEvent): Unit = js.native
    
    /**
      * Defines component's primary calendar type.
      * <b>Note:</b> set by the Calendar component
      * @type {sap.ui.webc.base.types.CalendarType}
      * @name sap.ui.webc.main.CalendarHeader.prototype.primaryCalendarType
      * @public
      */
    var primaryCalendarType: js.UndefOr[CalendarType] = js.native
    
    /**
      * Defines component's secondary calendar type.
      * <b>Note:</b> set by the Calendar component
      * @sience 1.0.0-rc.16
      * @defaultvalue undefined
      * @type {sap.ui.webc.base.types.CalendarType}
      * @name sap.ui.webc.main.CalendarHeader.prototype.secondaryCalendarType
      * @public
      */
    var secondaryCalendarType: js.UndefOr[CalendarType] = js.native
    
    /**
      * Defines component's timestamp.
      * <b>Note:</b> set by the Calendar component
      * @type {sap.ui.webc.base.types.Integer}
      * @name sap.ui.webc.main.CalendarHeader.prototype.timestamp
      * @public
      */
    var timestamp: js.UndefOr[Double] = js.native
  }
  
  trait SecondaryCalendarButtonTexts extends StObject {
    
    var monthButtonInfo: String
    
    var monthButtonText: String
    
    var yearButtonText: String
  }
  object SecondaryCalendarButtonTexts {
    
    inline def apply(monthButtonInfo: String, monthButtonText: String, yearButtonText: String): SecondaryCalendarButtonTexts = {
      val __obj = js.Dynamic.literal(monthButtonInfo = monthButtonInfo.asInstanceOf[js.Any], monthButtonText = monthButtonText.asInstanceOf[js.Any], yearButtonText = yearButtonText.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecondaryCalendarButtonTexts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SecondaryCalendarButtonTexts] (val x: Self) extends AnyVal {
      
      inline def setMonthButtonInfo(value: String): Self = StObject.set(x, "monthButtonInfo", value.asInstanceOf[js.Any])
      
      inline def setMonthButtonText(value: String): Self = StObject.set(x, "monthButtonText", value.asInstanceOf[js.Any])
      
      inline def setYearButtonText(value: String): Self = StObject.set(x, "yearButtonText", value.asInstanceOf[js.Any])
    }
  }
}
