package typings.ui5Webcomponents

import typings.ui5Webcomponents.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTimepickerUtilsTimeSliderMod {
  
  @JSImport("@ui5/webcomponents/dist/timepicker-utils/TimeSlider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getHours(config: HoursConfiguration): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHours")(config.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def getHours(config: HoursConfiguration, max: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHours")(config.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def getHoursConfigByFormat(`type`: HourType): HoursConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("getHoursConfigByFormat")(`type`.asInstanceOf[js.Any]).asInstanceOf[HoursConfiguration]
  
  inline def getMinutes(max: Double, step: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMinutes")(max.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def getMinutes(max: Unit, step: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMinutes")(max.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def getSeconds(max: Double, step: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSeconds")(max.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def getSeconds(max: Unit, step: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSeconds")(max.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def getTimeControlsByFormat(formatArray: js.Array[Type], hoursConfig: HoursConfiguration): js.Array[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeControlsByFormat")(formatArray.asInstanceOf[js.Any], hoursConfig.asInstanceOf[js.Any])).asInstanceOf[js.Array[Boolean]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ui5Webcomponents.ui5WebcomponentsStrings.hour0_23
    - typings.ui5Webcomponents.ui5WebcomponentsStrings.hour1_24
    - typings.ui5Webcomponents.ui5WebcomponentsStrings.hour0_11
    - typings.ui5Webcomponents.ui5WebcomponentsStrings.hour1_12
  */
  trait HourType extends StObject
  object HourType {
    
    inline def hour0_11: typings.ui5Webcomponents.ui5WebcomponentsStrings.hour0_11 = "hour0_11".asInstanceOf[typings.ui5Webcomponents.ui5WebcomponentsStrings.hour0_11]
    
    inline def hour0_23: typings.ui5Webcomponents.ui5WebcomponentsStrings.hour0_23 = "hour0_23".asInstanceOf[typings.ui5Webcomponents.ui5WebcomponentsStrings.hour0_23]
    
    inline def hour1_12: typings.ui5Webcomponents.ui5WebcomponentsStrings.hour1_12 = "hour1_12".asInstanceOf[typings.ui5Webcomponents.ui5WebcomponentsStrings.hour1_12]
    
    inline def hour1_24: typings.ui5Webcomponents.ui5WebcomponentsStrings.hour1_24 = "hour1_24".asInstanceOf[typings.ui5Webcomponents.ui5WebcomponentsStrings.hour1_24]
  }
  
  trait HoursConfiguration extends StObject {
    
    var isTwelveHoursFormat: Boolean
    
    var maxHour: Double
    
    var minHour: Double
  }
  object HoursConfiguration {
    
    inline def apply(isTwelveHoursFormat: Boolean, maxHour: Double, minHour: Double): HoursConfiguration = {
      val __obj = js.Dynamic.literal(isTwelveHoursFormat = isTwelveHoursFormat.asInstanceOf[js.Any], maxHour = maxHour.asInstanceOf[js.Any], minHour = minHour.asInstanceOf[js.Any])
      __obj.asInstanceOf[HoursConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HoursConfiguration] (val x: Self) extends AnyVal {
      
      inline def setIsTwelveHoursFormat(value: Boolean): Self = StObject.set(x, "isTwelveHoursFormat", value.asInstanceOf[js.Any])
      
      inline def setMaxHour(value: Double): Self = StObject.set(x, "maxHour", value.asInstanceOf[js.Any])
      
      inline def setMinHour(value: Double): Self = StObject.set(x, "minHour", value.asInstanceOf[js.Any])
    }
  }
}
