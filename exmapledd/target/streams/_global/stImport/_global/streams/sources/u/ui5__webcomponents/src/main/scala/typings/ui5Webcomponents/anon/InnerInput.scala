package typings.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InnerInput extends StObject {
  
  var innerInput: Padding
  
  var popoverHeader: Maxwidth
  
  var suggestionPopoverHeader: DisplayWidth
  
  var suggestionsPopover: Minwidth
}
object InnerInput {
  
  inline def apply(
    innerInput: Padding,
    popoverHeader: Maxwidth,
    suggestionPopoverHeader: DisplayWidth,
    suggestionsPopover: Minwidth
  ): InnerInput = {
    val __obj = js.Dynamic.literal(innerInput = innerInput.asInstanceOf[js.Any], popoverHeader = popoverHeader.asInstanceOf[js.Any], suggestionPopoverHeader = suggestionPopoverHeader.asInstanceOf[js.Any], suggestionsPopover = suggestionsPopover.asInstanceOf[js.Any])
    __obj.asInstanceOf[InnerInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InnerInput] (val x: Self) extends AnyVal {
    
    inline def setInnerInput(value: Padding): Self = StObject.set(x, "innerInput", value.asInstanceOf[js.Any])
    
    inline def setPopoverHeader(value: Maxwidth): Self = StObject.set(x, "popoverHeader", value.asInstanceOf[js.Any])
    
    inline def setSuggestionPopoverHeader(value: DisplayWidth): Self = StObject.set(x, "suggestionPopoverHeader", value.asInstanceOf[js.Any])
    
    inline def setSuggestionsPopover(value: Minwidth): Self = StObject.set(x, "suggestionsPopover", value.asInstanceOf[js.Any])
  }
}
