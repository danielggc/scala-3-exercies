package typings.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Desktop extends StObject {
  
  var desktop: EndColumnFullScreen
  
  var phone: OneColumn
  
  var tablet: MidColumnFullScreen
}
object Desktop {
  
  inline def apply(desktop: EndColumnFullScreen, phone: OneColumn, tablet: MidColumnFullScreen): Desktop = {
    val __obj = js.Dynamic.literal(desktop = desktop.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], tablet = tablet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Desktop]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Desktop] (val x: Self) extends AnyVal {
    
    inline def setDesktop(value: EndColumnFullScreen): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
    
    inline def setPhone(value: OneColumn): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setTablet(value: MidColumnFullScreen): Self = StObject.set(x, "tablet", value.asInstanceOf[js.Any])
  }
}
