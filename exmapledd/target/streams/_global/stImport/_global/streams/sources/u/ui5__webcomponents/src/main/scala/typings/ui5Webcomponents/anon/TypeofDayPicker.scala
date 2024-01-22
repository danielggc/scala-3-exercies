package typings.ui5Webcomponents.anon

import typings.ui5WebcomponentsBase.distI18nBundleMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDayPicker extends StObject {
  
  /* static member */
  var i18nBundle: default
}
object TypeofDayPicker {
  
  inline def apply(i18nBundle: default): TypeofDayPicker = {
    val __obj = js.Dynamic.literal(i18nBundle = i18nBundle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDayPicker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofDayPicker] (val x: Self) extends AnyVal {
    
    inline def setI18nBundle(value: default): Self = StObject.set(x, "i18nBundle", value.asInstanceOf[js.Any])
  }
}
