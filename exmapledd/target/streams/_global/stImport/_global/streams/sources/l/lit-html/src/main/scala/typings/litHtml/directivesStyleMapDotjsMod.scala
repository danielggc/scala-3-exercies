package typings.litHtml

import org.scalablytyped.runtime.Instantiable1
import typings.litHtml.developmentDirectiveMod.DirectiveResult
import typings.litHtml.developmentDirectiveMod.PartInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object directivesStyleMapDotjsMod {
  
  @JSImport("lit-html/directives/style-map.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lit-html/directives/style-map.js", "StyleMapDirective")
  @js.native
  open class StyleMapDirective protected ()
    extends typings.litHtml.developmentDirectivesStyleMapMod.StyleMapDirective {
    def this(partInfo: PartInfo) = this()
  }
  
  inline def styleMap(styleInfo: js.Object): DirectiveResult[
    Instantiable1[
      /* partInfo */ PartInfo, 
      typings.litHtml.developmentDirectivesStyleMapMod.StyleMapDirective
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("styleMap")(styleInfo.asInstanceOf[js.Any]).asInstanceOf[DirectiveResult[
    Instantiable1[
      /* partInfo */ PartInfo, 
      typings.litHtml.developmentDirectivesStyleMapMod.StyleMapDirective
    ]
  ]]
}
