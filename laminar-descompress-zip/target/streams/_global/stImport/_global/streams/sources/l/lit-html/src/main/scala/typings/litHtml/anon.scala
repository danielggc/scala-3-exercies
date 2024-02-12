package typings.litHtml

import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.Node
import typings.litHtml.developmentDirectiveMod.Directive_
import typings.litHtml.developmentDirectiveMod.PartInfo
import typings.litHtml.developmentDirectivesUnsafeHtmlMod.UnsafeHTMLDirective
import typings.litHtml.developmentLitHtmlMod.Disconnectable
import typings.litHtml.developmentLitHtmlMod.Part
import typings.std.ChildNode
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AttributeIndex extends StObject {
    
    @JSName("_$disconnectableChildren")
    var _$disconnectableChildren: js.UndefOr[Set[Disconnectable]] = js.native
    
    @JSName("_$initialize")
    def _$initialize(part: Part, parent: Disconnectable): Unit = js.native
    @JSName("_$initialize")
    def _$initialize(part: Part, parent: Disconnectable, attributeIndex: Double): Unit = js.native
    
    @JSName("_$isConnected")
    val _$isConnected: Boolean = js.native
    
    @JSName("_$notifyDirectiveConnectionChanged")
    var _$notifyDirectiveConnectionChanged: js.UndefOr[js.Function1[/* isConnected */ Boolean, Unit]] = js.native
    
    @JSName("_$parent")
    var _$parent: Disconnectable = js.native
    
    @JSName("_$resolve")
    def _$resolve(_part: Part, values: js.Array[Any]): Any = js.native
    
    var __attributeIndex: js.UndefOr[Double] = js.native
    
    var __directive: js.UndefOr[Directive_] = js.native
    
    var __part: Part = js.native
    
    def render(): Any = js.native
    def render(props: Any*): Any = js.native
    @JSName("render")
    var render_Original: (js.Function1[/* repeated */ Any, Any]) & js.Function0[Any] = js.native
    
    def update(_part: Part, props: js.Array[Any]): Any = js.native
  }
  
  @js.native
  trait Directive extends StObject {
    
    @JSName("_$disconnectableChildren")
    var _$disconnectableChildren: js.UndefOr[Set[typings.litHtml.mod.Disconnectable]] = js.native
    
    @JSName("_$initialize")
    def _$initialize(part: typings.litHtml.mod.Part, parent: typings.litHtml.mod.Disconnectable): Unit = js.native
    @JSName("_$initialize")
    def _$initialize(part: typings.litHtml.mod.Part, parent: typings.litHtml.mod.Disconnectable, attributeIndex: Double): Unit = js.native
    
    @JSName("_$isConnected")
    val _$isConnected: Boolean = js.native
    
    @JSName("_$notifyDirectiveConnectionChanged")
    var _$notifyDirectiveConnectionChanged: js.UndefOr[js.Function1[/* isConnected */ Boolean, Unit]] = js.native
    
    @JSName("_$parent")
    var _$parent: typings.litHtml.mod.Disconnectable = js.native
    
    @JSName("_$resolve")
    def _$resolve(_part: typings.litHtml.mod.Part, values: js.Array[Any]): Any = js.native
    
    var __attributeIndex: js.UndefOr[Double] = js.native
    
    var __directive: js.UndefOr[typings.litHtml.directiveMod.Directive_] = js.native
    
    var __part: typings.litHtml.mod.Part = js.native
    
    def render(): Any = js.native
    def render(props: Any*): Any = js.native
    @JSName("render")
    var render_Original: (js.Function1[/* repeated */ Any, Any]) & js.Function0[Any] = js.native
    
    def update(_part: typings.litHtml.mod.Part, props: js.Array[Any]): Any = js.native
  }
  
  /* Inlined lit-html.lit-html/development/directive.Directive & {render (): unknown} */
  @js.native
  trait Directiverenderunknown extends StObject {
    
    @JSName("_$disconnectableChildren")
    var _$disconnectableChildren: js.UndefOr[Set[Disconnectable]] = js.native
    
    @JSName("_$isConnected")
    def _$isConnected: Boolean = js.native
    @JSName("_$isConnected")
    var _$isConnected_FDirectiverenderunknown: Boolean = js.native
    
    @JSName("_$parent")
    var _$parent: js.UndefOr[Disconnectable] = js.native
    
    def render(): Any = js.native
    def render(props: Any*): Any = js.native
    
    def update(_part: Part, props: js.Array[Any]): Any = js.native
  }
  
  /* Inlined lit-html.lit-html/directive.Directive & {render (): unknown} */
  @js.native
  trait DirectiverenderunknownConstructor extends StObject {
    
    @JSName("_$disconnectableChildren")
    var _$disconnectableChildren: js.UndefOr[Set[typings.litHtml.mod.Disconnectable]] = js.native
    
    @JSName("_$isConnected")
    def _$isConnected: Boolean = js.native
    @JSName("_$isConnected")
    var _$isConnected_FDirectiverenderunknownConstructor: Boolean = js.native
    
    @JSName("_$parent")
    var _$parent: js.UndefOr[typings.litHtml.mod.Disconnectable] = js.native
    
    def render(): Any = js.native
    def render(props: Any*): Any = js.native
    
    def update(_part: typings.litHtml.mod.Part, props: js.Array[Any]): Any = js.native
  }
  
  @js.native
  trait ImportNode extends StObject {
    
    def importNode(node: Node): Node = js.native
    def importNode(node: Node, deep: Boolean): Node = js.native
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable1[/* part */ PartInfo, AttributeIndex]
  
  @js.native
  trait InstantiableDirective
    extends StObject
       with Instantiable1[/* part */ typings.litHtml.directiveMod.PartInfo, Directive]
  
  /* Inlined std.Partial<lit-html.lit-html.RenderOptions> */
  trait PartialRenderOptions extends StObject {
    
    var creationScope: js.UndefOr[ImportNode] = js.undefined
    
    var host: js.UndefOr[js.Object] = js.undefined
    
    var isConnected: js.UndefOr[Boolean] = js.undefined
    
    var renderBefore: js.UndefOr[ChildNode | Null] = js.undefined
  }
  object PartialRenderOptions {
    
    inline def apply(): PartialRenderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRenderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialRenderOptions] (val x: Self) extends AnyVal {
      
      inline def setCreationScope(value: ImportNode): Self = StObject.set(x, "creationScope", value.asInstanceOf[js.Any])
      
      inline def setCreationScopeUndefined: Self = StObject.set(x, "creationScope", js.undefined)
      
      inline def setHost(value: js.Object): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setIsConnected(value: Boolean): Self = StObject.set(x, "isConnected", value.asInstanceOf[js.Any])
      
      inline def setIsConnectedUndefined: Self = StObject.set(x, "isConnected", js.undefined)
      
      inline def setRenderBefore(value: ChildNode): Self = StObject.set(x, "renderBefore", value.asInstanceOf[js.Any])
      
      inline def setRenderBeforeNull: Self = StObject.set(x, "renderBefore", null)
      
      inline def setRenderBeforeUndefined: Self = StObject.set(x, "renderBefore", js.undefined)
    }
  }
  
  @js.native
  trait TypeofUnsafeHTMLDirective
    extends StObject
       with Instantiable1[/* partInfo */ PartInfo, UnsafeHTMLDirective] {
    
    var directiveName: String = js.native
    
    var resultType: Double = js.native
  }
  
  @js.native
  trait TypeofUnsafeHTMLDirectiveInstantiable
    extends StObject
       with Instantiable1[
          /* partInfo */ typings.litHtml.directiveMod.PartInfo, 
          typings.litHtml.directivesUnsafeHtmlMod.UnsafeHTMLDirective
        ] {
    
    var directiveName: String = js.native
    
    var resultType: Double = js.native
  }
  
  trait TypeofUnsafeSVGDirective extends StObject {
    
    /* static member */
    var directiveName: String
    
    /* static member */
    var resultType: Double
  }
  object TypeofUnsafeSVGDirective {
    
    inline def apply(directiveName: String, resultType: Double): TypeofUnsafeSVGDirective = {
      val __obj = js.Dynamic.literal(directiveName = directiveName.asInstanceOf[js.Any], resultType = resultType.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofUnsafeSVGDirective]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofUnsafeSVGDirective] (val x: Self) extends AnyVal {
      
      inline def setDirectiveName(value: String): Self = StObject.set(x, "directiveName", value.asInstanceOf[js.Any])
      
      inline def setResultType(value: Double): Self = StObject.set(x, "resultType", value.asInstanceOf[js.Any])
    }
  }
}
