package typings.litHtml

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.litHtml.developmentDirectiveMod.DirectiveParameters
import typings.litHtml.developmentDirectiveMod.DirectiveResult
import typings.litHtml.developmentDirectiveMod.Directive_
import typings.litHtml.developmentDirectiveMod.PartInfo
import typings.litHtml.developmentLitHtmlMod.AttributePart
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object developmentDirectivesStyleMapMod {
  
  @JSImport("lit-html/development/directives/style-map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lit-html/development/directives/style-map", "StyleMapDirective")
  @js.native
  open class StyleMapDirective protected () extends Directive_ {
    def this(partInfo: PartInfo) = this()
    
    var _previousStyleProperties: js.UndefOr[Set[String]] = js.native
    
    def render(styleInfo: js.Object): String = js.native
    
    def update(part: AttributePart, param1: DirectiveParameters[this.type]): String | js.Symbol = js.native
  }
  
  inline def styleMap(styleInfo: js.Object): DirectiveResult[Instantiable1[/* partInfo */ PartInfo, StyleMapDirective]] = ^.asInstanceOf[js.Dynamic].applyDynamic("styleMap")(styleInfo.asInstanceOf[js.Any]).asInstanceOf[DirectiveResult[Instantiable1[/* partInfo */ PartInfo, StyleMapDirective]]]
  
  type StyleInfo = StringDictionary[js.UndefOr[String | Double | Null]]
}
