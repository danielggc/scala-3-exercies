package typings.litHtml

import org.scalablytyped.runtime.Instantiable1
import typings.litHtml.developmentDirectiveMod.DirectiveResult
import typings.litHtml.developmentDirectiveMod.PartInfo
import typings.litHtml.developmentDirectivesClassMapMod.ClassInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object directivesClassMapDotjsMod {
  
  @JSImport("lit-html/directives/class-map.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lit-html/directives/class-map.js", "ClassMapDirective")
  @js.native
  open class ClassMapDirective protected ()
    extends typings.litHtml.developmentDirectivesClassMapMod.ClassMapDirective {
    def this(partInfo: PartInfo) = this()
  }
  
  inline def classMap(classInfo: ClassInfo): DirectiveResult[
    Instantiable1[
      /* partInfo */ PartInfo, 
      typings.litHtml.developmentDirectivesClassMapMod.ClassMapDirective
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("classMap")(classInfo.asInstanceOf[js.Any]).asInstanceOf[DirectiveResult[
    Instantiable1[
      /* partInfo */ PartInfo, 
      typings.litHtml.developmentDirectivesClassMapMod.ClassMapDirective
    ]
  ]]
}
