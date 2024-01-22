package typings.litHtml.mod.LitUnstable.DebugLog

import org.scalajs.dom.DocumentFragment
import org.scalajs.dom.HTMLElement
import typings.litHtml.litHtmlStrings.`end render`
import typings.litHtml.mod.ChildPart
import typings.litHtml.mod.RenderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndRender
  extends StObject
     with Entry {
  
  var container: HTMLElement | DocumentFragment
  
  var id: Double
  
  var kind: `end render`
  
  var options: js.UndefOr[RenderOptions] = js.undefined
  
  var part: ChildPart
  
  var value: Any
}
object EndRender {
  
  inline def apply(container: HTMLElement | DocumentFragment, id: Double, part: ChildPart, value: Any): EndRender = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = "end render", part = part.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndRender]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndRender] (val x: Self) extends AnyVal {
    
    inline def setContainer(value: HTMLElement | DocumentFragment): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKind(value: `end render`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: RenderOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPart(value: ChildPart): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
