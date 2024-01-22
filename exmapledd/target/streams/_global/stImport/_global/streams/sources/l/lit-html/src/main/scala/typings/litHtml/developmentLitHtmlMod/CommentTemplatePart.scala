package typings.litHtml.developmentLitHtmlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentTemplatePart
  extends StObject
     with TemplatePart {
  
  val index: Double
  
  val `type`: /* 7 */ Double
}
object CommentTemplatePart {
  
  inline def apply(index: Double, `type`: /* 7 */ Double): CommentTemplatePart = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentTemplatePart]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommentTemplatePart] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* 7 */ Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
