package typings.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Information extends StObject {
  
  var Error: String
  
  var Information: String
  
  var Success: String
  
  var Warning: String
}
object Information {
  
  inline def apply(Error: String, Information: String, Success: String, Warning: String): Information = {
    val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any], Information = Information.asInstanceOf[js.Any], Success = Success.asInstanceOf[js.Any], Warning = Warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Information]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Information] (val x: Self) extends AnyVal {
    
    inline def setError(value: String): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setInformation(value: String): Self = StObject.set(x, "Information", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: String): Self = StObject.set(x, "Success", value.asInstanceOf[js.Any])
    
    inline def setWarning(value: String): Self = StObject.set(x, "Warning", value.asInstanceOf[js.Any])
  }
}
