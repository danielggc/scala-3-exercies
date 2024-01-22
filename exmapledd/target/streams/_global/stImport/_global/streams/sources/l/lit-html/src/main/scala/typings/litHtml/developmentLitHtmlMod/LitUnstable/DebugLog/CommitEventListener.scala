package typings.litHtml.developmentLitHtmlMod.LitUnstable.DebugLog

import org.scalajs.dom.Element
import typings.litHtml.developmentLitHtmlMod.RenderOptions
import typings.litHtml.litHtmlStrings.`commit event listener`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitEventListener
  extends StObject
     with CommitPartEntry {
  
  var addListener: Boolean
  
  var element: Element
  
  var kind: `commit event listener`
  
  var name: String
  
  var oldListener: Any
  
  var options: js.UndefOr[RenderOptions] = js.undefined
  
  var removeListener: Boolean
  
  var value: Any
}
object CommitEventListener {
  
  inline def apply(
    addListener: Boolean,
    element: Element,
    name: String,
    oldListener: Any,
    removeListener: Boolean,
    value: Any
  ): CommitEventListener = {
    val __obj = js.Dynamic.literal(addListener = addListener.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], kind = "commit event listener", name = name.asInstanceOf[js.Any], oldListener = oldListener.asInstanceOf[js.Any], removeListener = removeListener.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitEventListener]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommitEventListener] (val x: Self) extends AnyVal {
    
    inline def setAddListener(value: Boolean): Self = StObject.set(x, "addListener", value.asInstanceOf[js.Any])
    
    inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setKind(value: `commit event listener`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOldListener(value: Any): Self = StObject.set(x, "oldListener", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: RenderOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setRemoveListener(value: Boolean): Self = StObject.set(x, "removeListener", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
