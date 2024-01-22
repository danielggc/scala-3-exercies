package typings.ui5WebcomponentsLocalization

import typings.ui5WebcomponentsBase.distTypesCalendarTypeMod.CalendarType
import typings.ui5WebcomponentsLocalization.distDatesCalendarDateMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FirstDate extends StObject {
    
    var firstDate: default
    
    var lastDate: default
  }
  object FirstDate {
    
    inline def apply(firstDate: default, lastDate: default): FirstDate = {
      val __obj = js.Dynamic.literal(firstDate = firstDate.asInstanceOf[js.Any], lastDate = lastDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirstDate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FirstDate] (val x: Self) extends AnyVal {
      
      inline def setFirstDate(value: default): Self = StObject.set(x, "firstDate", value.asInstanceOf[js.Any])
      
      inline def setLastDate(value: default): Self = StObject.set(x, "lastDate", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetCalendarType extends StObject {
    
    def getCalendarType(): CalendarType
    
    def getFormatSettings(): GetCustomLocaleData
    
    def getLanguage(): js.UndefOr[String]
    
    def getOriginInfo(): Unit
    
    def getSupportedLanguages(): js.Array[String] | Null
    
    def getTimezone(): String
  }
  object GetCalendarType {
    
    inline def apply(
      getCalendarType: () => CalendarType,
      getFormatSettings: () => GetCustomLocaleData,
      getLanguage: () => js.UndefOr[String],
      getOriginInfo: () => Unit,
      getSupportedLanguages: () => js.Array[String] | Null,
      getTimezone: () => String
    ): GetCalendarType = {
      val __obj = js.Dynamic.literal(getCalendarType = js.Any.fromFunction0(getCalendarType), getFormatSettings = js.Any.fromFunction0(getFormatSettings), getLanguage = js.Any.fromFunction0(getLanguage), getOriginInfo = js.Any.fromFunction0(getOriginInfo), getSupportedLanguages = js.Any.fromFunction0(getSupportedLanguages), getTimezone = js.Any.fromFunction0(getTimezone))
      __obj.asInstanceOf[GetCalendarType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetCalendarType] (val x: Self) extends AnyVal {
      
      inline def setGetCalendarType(value: () => CalendarType): Self = StObject.set(x, "getCalendarType", js.Any.fromFunction0(value))
      
      inline def setGetFormatSettings(value: () => GetCustomLocaleData): Self = StObject.set(x, "getFormatSettings", js.Any.fromFunction0(value))
      
      inline def setGetLanguage(value: () => js.UndefOr[String]): Self = StObject.set(x, "getLanguage", js.Any.fromFunction0(value))
      
      inline def setGetOriginInfo(value: () => Unit): Self = StObject.set(x, "getOriginInfo", js.Any.fromFunction0(value))
      
      inline def setGetSupportedLanguages(value: () => js.Array[String] | Null): Self = StObject.set(x, "getSupportedLanguages", js.Any.fromFunction0(value))
      
      inline def setGetTimezone(value: () => String): Self = StObject.set(x, "getTimezone", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait GetCustomLocaleData extends StObject {
    
    def getCustomLocaleData(): Unit = js.native
    
    def getFormatLocale(): typings.ui5WebcomponentsBase.distLocaleLocaleMod.default = js.native
    def getFormatLocale(lang: String): typings.ui5WebcomponentsBase.distLocaleLocaleMod.default = js.native
    
    def getLegacyDateCalendarCustomizing(): Unit = js.native
    
    def getLegacyDateFormat(): Unit = js.native
  }
  
  trait Text extends StObject {
    
    var text: Any
    
    var textInfo: Any
  }
  object Text {
    
    inline def apply(text: Any, textInfo: Any): Text = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], textInfo = textInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
      
      inline def setText(value: Any): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextInfo(value: Any): Self = StObject.set(x, "textInfo", value.asInstanceOf[js.Any])
    }
  }
}
