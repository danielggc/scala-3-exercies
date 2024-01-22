package typings.litHtml.mod.LitUnstable.DebugLog

import typings.litHtml.litHtmlStrings.`set part`
import typings.litHtml.mod.Part
import typings.litHtml.mod.TemplateInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetPartValue
  extends StObject
     with Entry {
  
  var kind: `set part`
  
  var part: Part
  
  var templateInstance: TemplateInstance
  
  var value: Any
  
  var valueIndex: Double
  
  var values: js.Array[Any]
}
object SetPartValue {
  
  inline def apply(
    part: Part,
    templateInstance: TemplateInstance,
    value: Any,
    valueIndex: Double,
    values: js.Array[Any]
  ): SetPartValue = {
    val __obj = js.Dynamic.literal(kind = "set part", part = part.asInstanceOf[js.Any], templateInstance = templateInstance.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueIndex = valueIndex.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetPartValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetPartValue] (val x: Self) extends AnyVal {
    
    inline def setKind(value: `set part`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setPart(value: Part): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setTemplateInstance(value: TemplateInstance): Self = StObject.set(x, "templateInstance", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueIndex(value: Double): Self = StObject.set(x, "valueIndex", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
