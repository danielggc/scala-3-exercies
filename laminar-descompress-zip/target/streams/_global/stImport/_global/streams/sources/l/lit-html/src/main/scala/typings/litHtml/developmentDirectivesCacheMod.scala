package typings.litHtml

import org.scalablytyped.runtime.Instantiable1
import typings.litHtml.developmentDirectiveMod.DirectiveParameters
import typings.litHtml.developmentDirectiveMod.DirectiveResult
import typings.litHtml.developmentDirectiveMod.Directive_
import typings.litHtml.developmentDirectiveMod.PartInfo
import typings.litHtml.developmentLitHtmlMod.ChildPart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object developmentDirectivesCacheMod {
  
  @JSImport("lit-html/development/directives/cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lit-html/development/directives/cache", "CacheDirective")
  @js.native
  open class CacheDirective protected () extends Directive_ {
    def this(partInfo: PartInfo) = this()
    
    /* private */ var _templateCache: Any = js.native
    
    /* private */ var _value: Any = js.native
    
    def render(v: Any): js.Array[Any] = js.native
    
    def update(containerPart: ChildPart, param1: DirectiveParameters[this.type]): js.Array[Any] = js.native
  }
  
  inline def cache(v: Any): DirectiveResult[Instantiable1[/* partInfo */ PartInfo, CacheDirective]] = ^.asInstanceOf[js.Dynamic].applyDynamic("cache")(v.asInstanceOf[js.Any]).asInstanceOf[DirectiveResult[Instantiable1[/* partInfo */ PartInfo, CacheDirective]]]
}
