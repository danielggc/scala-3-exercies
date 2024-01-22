package typings.litHtml

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typings.litHtml.anon.DirectiverenderunknownConstructor
import typings.litHtml.anon.InstantiableDirective
import typings.litHtml.developmentLitHtmlMod.DirectiveParent
import typings.litHtml.directiveMod.DirectiveClass
import typings.litHtml.directiveMod.DirectiveResult
import typings.litHtml.directiveMod.Directive_
import typings.litHtml.directiveMod.PartInfo
import typings.litHtml.litHtmlInts.`1`
import typings.litHtml.litHtmlInts.`2`
import typings.litHtml.mod.Disconnectable
import typings.litHtml.mod.RenderOptions
import typings.litHtml.mod.Template
import typings.std.ChildNode
import typings.std.TemplateStringsArray
import typings.trustedTypes.libMod.TrustedHTML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object privateSsrSupportMod {
  
  object LH {
    
    @JSImport("lit-html/private-ssr-support", "_$LH")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("lit-html/private-ssr-support", "_$LH.AttributePart")
    @js.native
    open class AttributePart protected ()
      extends typings.litHtml.mod.AttributePart {
      def this(element: HTMLElement, name: String, strings: js.Array[String], parent: Disconnectable) = this()
      def this(
        element: HTMLElement,
        name: String,
        strings: js.Array[String],
        parent: Disconnectable,
        options: RenderOptions
      ) = this()
    }
    @JSImport("lit-html/private-ssr-support", "_$LH.AttributePart")
    @js.native
    def AttributePart: Instantiable5[
        /* element */ HTMLElement, 
        /* name */ String, 
        /* strings */ js.Array[String], 
        /* parent */ Disconnectable, 
        /* options */ js.UndefOr[RenderOptions], 
        typings.litHtml.mod.AttributePart
      ] = js.native
    inline def AttributePart_=(
      x: Instantiable5[
          /* element */ HTMLElement, 
          /* name */ String, 
          /* strings */ js.Array[String], 
          /* parent */ Disconnectable, 
          /* options */ js.UndefOr[RenderOptions], 
          typings.litHtml.mod.AttributePart
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AttributePart")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("lit-html/private-ssr-support", "_$LH.BooleanAttributePart")
    @js.native
    open class BooleanAttributePart ()
      extends typings.litHtml.mod.BooleanAttributePart
    @JSImport("lit-html/private-ssr-support", "_$LH.BooleanAttributePart")
    @js.native
    def BooleanAttributePart: Instantiable0[typings.litHtml.mod.BooleanAttributePart] = js.native
    inline def BooleanAttributePart_=(x: Instantiable0[typings.litHtml.mod.BooleanAttributePart]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BooleanAttributePart")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("lit-html/private-ssr-support", "_$LH.ChildPart")
    @js.native
    open class ChildPart protected ()
      extends typings.litHtml.mod.ChildPart {
      def this(startNode: ChildNode) = this()
      def this(startNode: ChildNode, endNode: ChildNode) = this()
      def this(startNode: ChildNode, endNode: Null, parent: typings.litHtml.mod.ChildPart) = this()
      def this(startNode: ChildNode, endNode: Null, parent: typings.litHtml.mod.TemplateInstance) = this()
      def this(startNode: ChildNode, endNode: ChildNode, parent: typings.litHtml.mod.ChildPart) = this()
      def this(startNode: ChildNode, endNode: ChildNode, parent: typings.litHtml.mod.TemplateInstance) = this()
      def this(startNode: ChildNode, endNode: Null, parent: Unit, options: RenderOptions) = this()
      def this(startNode: ChildNode, endNode: Null, parent: typings.litHtml.mod.ChildPart, options: RenderOptions) = this()
      def this(
        startNode: ChildNode,
        endNode: Null,
        parent: typings.litHtml.mod.TemplateInstance,
        options: RenderOptions
      ) = this()
      def this(startNode: ChildNode, endNode: ChildNode, parent: Unit, options: RenderOptions) = this()
      def this(
        startNode: ChildNode,
        endNode: ChildNode,
        parent: typings.litHtml.mod.ChildPart,
        options: RenderOptions
      ) = this()
      def this(
        startNode: ChildNode,
        endNode: ChildNode,
        parent: typings.litHtml.mod.TemplateInstance,
        options: RenderOptions
      ) = this()
    }
    @JSImport("lit-html/private-ssr-support", "_$LH.ChildPart")
    @js.native
    def ChildPart: Instantiable4[
        /* startNode */ ChildNode, 
        /* endNode */ ChildNode | Null, 
        /* parent */ js.UndefOr[typings.litHtml.mod.TemplateInstance | typings.litHtml.mod.ChildPart], 
        /* options */ js.UndefOr[RenderOptions], 
        typings.litHtml.mod.ChildPart
      ] = js.native
    inline def ChildPart_=(
      x: Instantiable4[
          /* startNode */ ChildNode, 
          /* endNode */ ChildNode | Null, 
          /* parent */ js.UndefOr[typings.litHtml.mod.TemplateInstance | typings.litHtml.mod.ChildPart], 
          /* options */ js.UndefOr[RenderOptions], 
          typings.litHtml.mod.ChildPart
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ChildPart")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("lit-html/private-ssr-support", "_$LH.ElementPart")
    @js.native
    open class ElementPart protected ()
      extends typings.litHtml.mod.ElementPart {
      def this(element: Element, parent: Disconnectable) = this()
      def this(element: Element, parent: Disconnectable, options: RenderOptions) = this()
    }
    @JSImport("lit-html/private-ssr-support", "_$LH.ElementPart")
    @js.native
    def ElementPart: Instantiable3[
        /* element */ Element, 
        /* parent */ Disconnectable, 
        /* options */ js.UndefOr[RenderOptions], 
        typings.litHtml.mod.ElementPart
      ] = js.native
    inline def ElementPart_=(
      x: Instantiable3[
          /* element */ Element, 
          /* parent */ Disconnectable, 
          /* options */ js.UndefOr[RenderOptions], 
          typings.litHtml.mod.ElementPart
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ElementPart")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("lit-html/private-ssr-support", "_$LH.EventPart")
    @js.native
    open class EventPart protected ()
      extends typings.litHtml.mod.EventPart {
      def this(element: HTMLElement, name: String, strings: js.Array[String], parent: Disconnectable) = this()
      def this(
        element: HTMLElement,
        name: String,
        strings: js.Array[String],
        parent: Disconnectable,
        options: RenderOptions
      ) = this()
    }
    @JSImport("lit-html/private-ssr-support", "_$LH.EventPart")
    @js.native
    def EventPart: Instantiable5[
        /* element */ HTMLElement, 
        /* name */ String, 
        /* strings */ js.Array[String], 
        /* parent */ Disconnectable, 
        /* options */ js.UndefOr[RenderOptions], 
        typings.litHtml.mod.EventPart
      ] = js.native
    inline def EventPart_=(
      x: Instantiable5[
          /* element */ HTMLElement, 
          /* name */ String, 
          /* strings */ js.Array[String], 
          /* parent */ Disconnectable, 
          /* options */ js.UndefOr[RenderOptions], 
          typings.litHtml.mod.EventPart
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EventPart")(x.asInstanceOf[js.Any])
    
    @JSImport("lit-html/private-ssr-support", "_$LH.HTML_RESULT")
    @js.native
    def HTML_RESULT: Double = js.native
    inline def HTML_RESULT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTML_RESULT")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("lit-html/private-ssr-support", "_$LH.PropertyPart")
    @js.native
    open class PropertyPart ()
      extends typings.litHtml.mod.PropertyPart
    @JSImport("lit-html/private-ssr-support", "_$LH.PropertyPart")
    @js.native
    def PropertyPart: Instantiable0[typings.litHtml.mod.PropertyPart] = js.native
    inline def PropertyPart_=(x: Instantiable0[typings.litHtml.mod.PropertyPart]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PropertyPart")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("lit-html/private-ssr-support", "_$LH.TemplateInstance")
    @js.native
    open class TemplateInstance protected ()
      extends typings.litHtml.mod.TemplateInstance {
      def this(template: Template, parent: typings.litHtml.mod.ChildPart) = this()
    }
    @JSImport("lit-html/private-ssr-support", "_$LH.TemplateInstance")
    @js.native
    def TemplateInstance: Instantiable2[
        /* template */ Template, 
        /* parent */ typings.litHtml.mod.ChildPart, 
        typings.litHtml.mod.TemplateInstance
      ] = js.native
    inline def TemplateInstance_=(
      x: Instantiable2[
          /* template */ Template, 
          /* parent */ typings.litHtml.mod.ChildPart, 
          typings.litHtml.mod.TemplateInstance
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TemplateInstance")(x.asInstanceOf[js.Any])
    
    @JSImport("lit-html/private-ssr-support", "_$LH.boundAttributeSuffix")
    @js.native
    def boundAttributeSuffix: String = js.native
    inline def boundAttributeSuffix_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("boundAttributeSuffix")(x.asInstanceOf[js.Any])
    
    inline def connectedDisconnectable(): Disconnectable = ^.asInstanceOf[js.Dynamic].applyDynamic("connectedDisconnectable")().asInstanceOf[Disconnectable]
    inline def connectedDisconnectable(props: js.Object): Disconnectable = ^.asInstanceOf[js.Dynamic].applyDynamic("connectedDisconnectable")(props.asInstanceOf[js.Any]).asInstanceOf[Disconnectable]
    
    inline def getAttributePartCommittedValue(part: typings.litHtml.mod.AttributePart, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getAttributePartCommittedValue")(part.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getAttributePartCommittedValue(part: typings.litHtml.mod.AttributePart, value: Any, index: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getAttributePartCommittedValue")(part.asInstanceOf[js.Any], value.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getTemplateHtml(strings: TemplateStringsArray, `type`: `1` | `2`): js.Tuple2[TrustedHTML, js.Array[js.UndefOr[String]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplateHtml")(strings.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[TrustedHTML, js.Array[js.UndefOr[String]]]]
    
    inline def isIterable(value: Any): /* is std.Iterable<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIterable")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Iterable<unknown> */ Boolean]
    
    @JSImport("lit-html/private-ssr-support", "_$LH.marker")
    @js.native
    def marker: String = js.native
    
    @JSImport("lit-html/private-ssr-support", "_$LH.markerMatch")
    @js.native
    def markerMatch: String = js.native
    inline def markerMatch_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("markerMatch")(x.asInstanceOf[js.Any])
    
    inline def marker_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("marker")(x.asInstanceOf[js.Any])
    
    inline def overrideDirectiveResolve(
      directiveClass: Instantiable1[/* part */ PartInfo, DirectiverenderunknownConstructor],
      resolveOverrideFn: js.Function2[/* directive */ Directive_, /* values */ js.Array[Any], Any]
    ): InstantiableDirective = (^.asInstanceOf[js.Dynamic].applyDynamic("overrideDirectiveResolve")(directiveClass.asInstanceOf[js.Any], resolveOverrideFn.asInstanceOf[js.Any])).asInstanceOf[InstantiableDirective]
    
    inline def resolveDirective(part: typings.litHtml.mod.AttributePart, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDirective")(part.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def resolveDirective(part: typings.litHtml.mod.AttributePart, value: Any, parent: Unit, attributeIndex: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDirective")(part.asInstanceOf[js.Any], value.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], attributeIndex.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def resolveDirective(part: typings.litHtml.mod.AttributePart, value: Any, parent: DirectiveParent): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDirective")(part.asInstanceOf[js.Any], value.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def resolveDirective(
      part: typings.litHtml.mod.AttributePart,
      value: Any,
      parent: DirectiveParent,
      attributeIndex: Double
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDirective")(part.asInstanceOf[js.Any], value.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], attributeIndex.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def resolveDirective(part: typings.litHtml.mod.ChildPart, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDirective")(part.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def resolveDirective(part: typings.litHtml.mod.ChildPart, value: Any, parent: Unit, attributeIndex: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDirective")(part.asInstanceOf[js.Any], value.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], attributeIndex.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def resolveDirective(part: typings.litHtml.mod.ChildPart, value: Any, parent: DirectiveParent): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDirective")(part.asInstanceOf[js.Any], value.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def resolveDirective(part: typings.litHtml.mod.ChildPart, value: Any, parent: DirectiveParent, attributeIndex: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDirective")(part.asInstanceOf[js.Any], value.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], attributeIndex.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def resolveDirective(part: typings.litHtml.mod.ElementPart, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDirective")(part.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def resolveDirective(part: typings.litHtml.mod.ElementPart, value: Any, parent: Unit, attributeIndex: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDirective")(part.asInstanceOf[js.Any], value.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], attributeIndex.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def resolveDirective(part: typings.litHtml.mod.ElementPart, value: Any, parent: DirectiveParent): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDirective")(part.asInstanceOf[js.Any], value.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def resolveDirective(part: typings.litHtml.mod.ElementPart, value: Any, parent: DirectiveParent, attributeIndex: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDirective")(part.asInstanceOf[js.Any], value.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], attributeIndex.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def setDirectiveClass(value: DirectiveResult[DirectiveClass], directiveClass: DirectiveClass): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDirectiveClass")(value.asInstanceOf[js.Any], directiveClass.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
