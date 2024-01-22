package typings.litHtml.mod.LitUnstable.DebugLog

import org.scalajs.dom.DocumentFragment
import org.scalajs.dom.HTMLElement
import typings.litHtml.litHtmlStrings.`begin render`
import typings.litHtml.mod.ChildPart
import typings.litHtml.mod.RenderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeginRender
  extends StObject
     with Entry {
  
  var container: HTMLElement | DocumentFragment
  
  var id: Double
  
  var kind: `begin render`
  
  var options: js.UndefOr[RenderOptions] = js.undefined
  
  var part: js.UndefOr[ChildPart] = js.undefined
  
  var value: Any
}
object BeginRender {
  
  inline def apply(container: HTMLElement | DocumentFragment, id: Double, value: Any): BeginRender = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = "begin render", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeginRender]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BeginRender] (val x: Self) extends AnyVal {
    
    inline def setContainer(value: HTMLElement | DocumentFragment): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKind(value: `begin render`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: RenderOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPart(value: ChildPart): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
