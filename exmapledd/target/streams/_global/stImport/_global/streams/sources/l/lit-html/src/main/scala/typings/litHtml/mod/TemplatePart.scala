package typings.litHtml.mod

import org.scalablytyped.runtime.Instantiable5
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A TemplatePart represents a dynamic part in a template, before the template
  * is instantiated. When a template is instantiated Parts are created from
  * TemplateParts.
  */
/* Rewritten from type alias, can be one of: 
  - typings.litHtml.mod.ChildTemplatePart
  - typings.litHtml.mod.AttributeTemplatePart
  - typings.litHtml.mod.ElementTemplatePart
  - typings.litHtml.mod.CommentTemplatePart
*/
trait TemplatePart extends StObject
object TemplatePart {
  
  inline def AttributeTemplatePart(
    ctor: Instantiable5[
      /* element */ HTMLElement, 
      /* name */ String, 
      /* strings */ js.Array[String], 
      /* parent */ Disconnectable, 
      /* options */ js.UndefOr[RenderOptions], 
      AttributePart
    ],
    index: Double,
    name: String,
    strings: js.Array[String],
    `type`: /* 1 */ Double
  ): typings.litHtml.mod.AttributeTemplatePart = {
    val __obj = js.Dynamic.literal(ctor = ctor.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.litHtml.mod.AttributeTemplatePart]
  }
  
  inline def ChildTemplatePart(index: Double, `type`: /* 2 */ Double): typings.litHtml.mod.ChildTemplatePart = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.litHtml.mod.ChildTemplatePart]
  }
  
  inline def CommentTemplatePart(index: Double, `type`: /* 7 */ Double): typings.litHtml.mod.CommentTemplatePart = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.litHtml.mod.CommentTemplatePart]
  }
  
  inline def ElementTemplatePart(index: Double, `type`: /* 6 */ Double): typings.litHtml.mod.ElementTemplatePart = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.litHtml.mod.ElementTemplatePart]
  }
}
