package typings.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BubbleArrowPosition extends StObject {
  
  var bubbleArrowPosition: Ui5tlibubblearrow
  
  var indicator: Ui5tliindicator
}
object BubbleArrowPosition {
  
  inline def apply(bubbleArrowPosition: Ui5tlibubblearrow, indicator: Ui5tliindicator): BubbleArrowPosition = {
    val __obj = js.Dynamic.literal(bubbleArrowPosition = bubbleArrowPosition.asInstanceOf[js.Any], indicator = indicator.asInstanceOf[js.Any])
    __obj.asInstanceOf[BubbleArrowPosition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BubbleArrowPosition] (val x: Self) extends AnyVal {
    
    inline def setBubbleArrowPosition(value: Ui5tlibubblearrow): Self = StObject.set(x, "bubbleArrowPosition", value.asInstanceOf[js.Any])
    
    inline def setIndicator(value: Ui5tliindicator): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
  }
}
