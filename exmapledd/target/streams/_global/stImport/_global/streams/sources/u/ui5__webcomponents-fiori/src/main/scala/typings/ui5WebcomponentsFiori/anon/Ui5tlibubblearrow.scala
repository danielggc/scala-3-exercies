package typings.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ui5tlibubblearrow extends StObject {
  
  var `ui5-tli-bubble-arrow`: Boolean
  
  var `ui5-tli-bubble-arrow--left`: Boolean
  
  var `ui5-tli-bubble-arrow--top`: Boolean
}
object Ui5tlibubblearrow {
  
  inline def apply(
    `ui5-tli-bubble-arrow`: Boolean,
    `ui5-tli-bubble-arrow--left`: Boolean,
    `ui5-tli-bubble-arrow--top`: Boolean
  ): Ui5tlibubblearrow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ui5-tli-bubble-arrow")(`ui5-tli-bubble-arrow`.asInstanceOf[js.Any])
    __obj.updateDynamic("ui5-tli-bubble-arrow--left")(`ui5-tli-bubble-arrow--left`.asInstanceOf[js.Any])
    __obj.updateDynamic("ui5-tli-bubble-arrow--top")(`ui5-tli-bubble-arrow--top`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ui5tlibubblearrow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ui5tlibubblearrow] (val x: Self) extends AnyVal {
    
    inline def `setUi5-tli-bubble-arrow`(value: Boolean): Self = StObject.set(x, "ui5-tli-bubble-arrow", value.asInstanceOf[js.Any])
    
    inline def `setUi5-tli-bubble-arrow--left`(value: Boolean): Self = StObject.set(x, "ui5-tli-bubble-arrow--left", value.asInstanceOf[js.Any])
    
    inline def `setUi5-tli-bubble-arrow--top`(value: Boolean): Self = StObject.set(x, "ui5-tli-bubble-arrow--top", value.asInstanceOf[js.Any])
  }
}
