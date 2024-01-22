package typings.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConfigFormatSettingsMod {
  
  @JSImport("@ui5/webcomponents-base/dist/config/FormatSettings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns the first day of the week from the configured format settings or based on the current locale.
    * @public
    * @returns {Number} 0 (Sunday) through 6 (Saturday)
    */
  inline def getFirstDayOfWeek(): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstDayOfWeek")().asInstanceOf[js.UndefOr[Double]]
  
  trait FormatSettings extends StObject {
    
    var firstDayOfWeek: js.UndefOr[Double] = js.undefined
  }
  object FormatSettings {
    
    inline def apply(): FormatSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormatSettings] (val x: Self) extends AnyVal {
      
      inline def setFirstDayOfWeek(value: Double): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
    }
  }
}
