package typings.litHtml

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.litHtml.developmentDirectiveMod.DirectiveResult
import typings.litHtml.directiveMod.DirectiveParameters
import typings.litHtml.directiveMod.Directive_
import typings.litHtml.directiveMod.PartInfo
import typings.litHtml.mod.AttributePart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directivesClassMapMod {
  
  @JSImport("lit-html/directives/class-map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lit-html/directives/class-map", "ClassMapDirective")
  @js.native
  open class ClassMapDirective protected () extends Directive_ {
    def this(partInfo: PartInfo) = this()
    
    /**
      * Stores the ClassInfo object applied to a given AttributePart.
      * Used to unset existing values when a new ClassInfo object is applied.
      */
    /* private */ var _previousClasses: Any = js.native
    
    /* private */ var _staticClasses: Any = js.native
    
    def render(classInfo: ClassInfo): String = js.native
    
    def update(part: AttributePart, param1: DirectiveParameters[this.type]): String | js.Symbol = js.native
  }
  
  inline def classMap(classInfo: ClassInfo): DirectiveResult[Instantiable1[/* partInfo */ PartInfo, ClassMapDirective]] = ^.asInstanceOf[js.Dynamic].applyDynamic("classMap")(classInfo.asInstanceOf[js.Any]).asInstanceOf[DirectiveResult[Instantiable1[/* partInfo */ PartInfo, ClassMapDirective]]]
  
  type ClassInfo = StringDictionary[String | Boolean | Double]
}
