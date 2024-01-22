package typings.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  var Error: String
  
  var Success: String
  
  var Warning: String
}
object Error {
  
  inline def apply(Error: String, Success: String, Warning: String): Error = {
    val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any], Success = Success.asInstanceOf[js.Any], Warning = Warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
    
    inline def setError(value: String): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: String): Self = StObject.set(x, "Success", value.asInstanceOf[js.Any])
    
    inline def setWarning(value: String): Self = StObject.set(x, "Warning", value.asInstanceOf[js.Any])
  }
}
