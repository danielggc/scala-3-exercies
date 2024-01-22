package typings.litHtml

import org.scalablytyped.runtime.Instantiable1
import typings.litHtml.developmentDirectiveMod.DirectiveResult
import typings.litHtml.developmentDirectiveMod.PartInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object directivesCacheDotjsMod {
  
  @JSImport("lit-html/directives/cache.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lit-html/directives/cache.js", "CacheDirective")
  @js.native
  open class CacheDirective protected ()
    extends typings.litHtml.developmentDirectivesCacheMod.CacheDirective {
    def this(partInfo: PartInfo) = this()
  }
  
  inline def cache(v: Any): DirectiveResult[
    Instantiable1[
      /* partInfo */ PartInfo, 
      typings.litHtml.developmentDirectivesCacheMod.CacheDirective
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("cache")(v.asInstanceOf[js.Any]).asInstanceOf[DirectiveResult[
    Instantiable1[
      /* partInfo */ PartInfo, 
      typings.litHtml.developmentDirectivesCacheMod.CacheDirective
    ]
  ]]
}
