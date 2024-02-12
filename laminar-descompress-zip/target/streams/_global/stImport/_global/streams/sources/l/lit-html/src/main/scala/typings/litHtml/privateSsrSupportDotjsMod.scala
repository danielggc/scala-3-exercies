package typings.litHtml

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typings.litHtml.anon.Directiverenderunknown
import typings.litHtml.anon.Instantiable
import typings.litHtml.developmentDirectiveMod.DirectiveClass
import typings.litHtml.developmentDirectiveMod.DirectiveResult
import typings.litHtml.developmentDirectiveMod.Directive_
import typings.litHtml.developmentDirectiveMod.PartInfo
import typings.litHtml.developmentLitHtmlMod.DirectiveParent
import typings.litHtml.developmentLitHtmlMod.Disconnectable
import typings.litHtml.developmentLitHtmlMod.RenderOptions
import typings.litHtml.developmentLitHtmlMod.Template
import typings.litHtml.litHtmlInts.`1`
import typings.litHtml.litHtmlInts.`2`
import typings.std.ChildNode
import typings.std.TemplateStringsArray
import typings.trustedTypes.libMod.TrustedHTML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object privateSsrSupportDotjsMod {
  
  object LH {
    
    @JSImport("lit-html/private-ssr-support.js", "_$LH")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("lit-html/private-ssr-support.js", "_$LH.AttributePart")
    @js.native
    open class AttributePart protected ()
      extends typings.litHtml.developmentLitHtmlMod.AttributePart {
      def this(element: HTMLElement, name: String, strings: js.Array[String], parent: Disconnectable) = this()
      def this(
        element: HTMLElement,
        name: String,
        strings: js.Array[String],
        parent: Disconnectable,
        options: RenderOptions
      ) = this()
    }
    @JSImport("lit-html/private-ssr-support.js", "_$LH.AttributePart")
    @js.native
    def AttributePart: Instantiable5[
        /* element */ HTMLElement, 
        /* name */ String, 
        /* strings */ js.Array[String], 
        /* parent */ Disconnectable, 
        /* options */ js.UndefOr[RenderOptions], 
        typings.litHtml.developmentLitHtmlMod.AttributePart
      ] = js.native
    inline def AttributePart_=(
      x: Instantiable5[
          /* element */ HTMLElement, 
          /* name */ String, 
          /* strings */ js.Array[String], 
          /* parent */ Disconnectable, 
          /* options */ js.UndefOr[RenderOptions], 
          typings.litHtml.developmentLitHtmlMod.AttributePart
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AttributePart")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("lit-html/private-ssr-support.js", "_$LH.BooleanAttributePart")
    @js.native
    open class BooleanAttributePart ()
      extends typings.litHtml.developmentLitHtmlMod.BooleanAttributePart
    @JSImport("lit-html/private-ssr-support.js", "_$LH.BooleanAttributePart")
    @js.native
    def BooleanAttributePart: Instantiable0[typings.litHtml.developmentLitHtmlMod.BooleanAttributePart] = js.native
    inline def BooleanAttributePart_=(x: Instantiable0[typings.litHtml.developmentLitHtmlMod.BooleanAttributePart]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BooleanAttributePart")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("lit-html/private-ssr-support.js", "_$LH.ChildPart")
    @js.native
    open class ChildPart protected ()
      extends typings.litHtml.developmentLitHtmlMod.ChildPart {
      def this(startNode: ChildNode) = this()
      def this(startNode: ChildNode, endNode: ChildNode) = this()
      def this(startNode: ChildNode, endNode: Null, parent: typings.litHtml.developmentLitHtmlMod.ChildPart) = this()
      def this(
        startNode: ChildNode,
        endNode: Null,
        parent: typings.litHtml.developmentLitHtmlMod.TemplateInstance
      ) = this()
      def this(startNode: ChildNode, endNode: ChildNode, parent: typings.litHtml.developmentLitHtmlMod.ChildPart) = this()
      def this(
        startNode: ChildNode,
        endNode: ChildNode,
        parent: typings.litHtml.developmentLitHtmlMod.TemplateInstance
      ) = this()
      def this(startNode: ChildNode, endNode: Null, parent: Unit, options: RenderOptions) = this()
      def this(
        startNode: ChildNode,
        endNode: Null,
        parent: typings.litHtml.developmentLitHtmlMod.ChildPart,
        options: RenderOptions
      ) = this()
      def this(
        startNode: ChildNode,
        endNode: Null,
        parent: typings.litHtml.developmentLitHtmlMod.TemplateInstance,
        options: RenderOptions
      ) = this()
      def this(startNode: ChildNode, endNode: ChildNode, parent: Unit, options: RenderOptions) = this()
      def this(
        startNode: ChildNode,
        endNode: ChildNode,
        parent: typings.litHtml.developmentLitHtmlMod.ChildPart,
        options: RenderOptions
      ) = this()
      def this(
        startNode: ChildNode,
        endNode: ChildNode,
        parent: typings.litHtml.developmentLitHtmlMod.TemplateInstance,
        options: RenderOptions
      ) = this()
    }
    @JSImport("lit-html/private-ssr-support.js", "_$LH.ChildPart")
    @js.native
    def ChildPart: Instantiable4[
        /* startNode */ ChildNode, 
        /* endNode */ ChildNode | Null, 
        /* parent */ js.UndefOr[
          typings.litHtml.developmentLitHtmlMod.TemplateInstance | typings.litHtml.developmentLitHtmlMod.ChildPart
        ], 
        /* options */ js.UndefOr[RenderOptions], 
        typings.litHtml.developmentLitHtmlMod.ChildPart
      ] = js.native
    inline def ChildPart_=(
      x: Instantiable4[
          /* startNode */ ChildNode, 
          /* endNode */ ChildNode | Null, 
          /* parent */ js.UndefOr[
            typings.litHtml.developmentLitHtmlMod.TemplateInstance | typings.litHtml.developmentLitHtmlMod.ChildPart
          ], 
          /* options */ js.UndefOr[RenderOptions], 
          typings.litHtml.developmentLitHtmlMod.ChildPart
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ChildPart")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("lit-html/private-ssr-support.js", "_$LH.ElementPart")
    @js.native
    open class ElementPart protected ()
      extends typings.litHtml.developmentLitHtmlMod.ElementPart {
      def this(element: Element, parent: Disconnectable) = this()
      def this(element: Element, parent: Disconnectable, options: RenderOptions) = this()
    }
    @JSImport("lit-html/private-ssr-support.js", "_$LH.ElementPart")
    @js.native
    def ElementPart: Instantiable3[
        /* element */ Element, 
        /* parent */ Disconnectable, 
        /* options */ js.UndefOr[RenderOptions], 
        typings.litHtml.developmentLitHtmlMod.ElementPart
      ] = js.native
    inline def ElementPart_=(
      x: Instantiable3[
          /* element */ Element, 
          /* parent */ Disconnectable, 
          /* options */ js.UndefOr[RenderOptions], 
          typings.litHtml.developmentLitHtmlMod.ElementPart
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ElementPart")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("lit-html/private-ssr-support.js", "_$LH.EventPart")
    @js.native
    open class EventPart protected ()
      extends typings.litHtml.developmentLitHtmlMod.EventPart {
      def this(element: HTMLElement, name: String, strings: js.Array[String], parent: Disconnectable) = this()
      def this(
        element: HTMLElement,
        name: String,
        strings: js.Array[String],
        parent: Disconnectable,
        options: RenderOptions
      ) = this()
    }
    @JSImport("lit-html/private-ssr-support.js", "_$LH.EventPart")
    @js.native
    def EventPart: Instantiable5[
        /* element */ HTMLElement, 
        /* name */ String, 
        /* strings */ js.Array[String], 
        /* parent */ Disconnectable, 
        /* options */ js.UndefOr[RenderOptions], 
        typings.litHtml.developmentLitHtmlMod.EventPart
      ] = js.native
    inline def EventPart_=(
      x: Instantiable5[
          /* element */ HTMLElement, 
          /* name */ String, 
          /* strings */ js.Array[String], 
          /* parent */ Disconnectable, 
          /* options */ js.UndefOr[RenderOptions], 
          typings.litHtml.developmentLitHtmlMod.EventPart
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EventPart")(x.asInstanceOf[js.Any])
    
    @JSImport("lit-html/private-ssr-support.js", "_$LH.HTML_RESULT")
    @js.native
    def HTML_RESULT: Double = js.native
    inline def HTML_RESULT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTML_RESULT")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("lit-html/private-ssr-support.js", "_$LH.PropertyPart")
    @js.native
    open class PropertyPart ()
      extends typings.litHtml.developmentLitHtmlMod.PropertyPart
    @JSImport("lit-html/private-ssr-support.js", "_$LH.PropertyPart")
    @js.native
    def PropertyPart: Instantiable0[typings.litHtml.developmentLitHtmlMod.PropertyPart] = js.native
    inline def PropertyPart_=(x: Instantiable0[typings.litHtml.developmentLitHtmlMod.PropertyPart]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PropertyPart")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("lit-html/private-ssr-support.js", "_$LH.TemplateInstance")
    @js.native
    open class TemplateInstance protected ()
      extends typings.litHtml.developmentLitHtmlMod.TemplateInstance {
      def this(template: Template, parent: typings.litHtml.developmentLitHtmlMod.ChildPart) = this()
    }
    @JSImport("lit-html/private-ssr-support.js", "_$LH.TemplateInstance")
    @js.native
    def TemplateInstance: Instantiable2[
        /* template */ Template, 
        /* parent */ typings.litHtml.developmentLitHtmlMod.ChildPart, 
        typings.litHtml.developmentLitHtmlMod.TemplateInstance
      ] = js.native
    inline def TemplateInstance_=(
      x: Instantiable2[
          /* template */ Template, 
          /* parent */ typings.litHtml.developmentLitHtmlMod.ChildPart, 
          typings.litHtml.developmentLitHtmlMod.TemplateInstance
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TemplateInstance")(x.asInstanceOf[js.Any])
    
    @JSImport("lit-html/private-ssr-support.js", "_$LH.boundAttributeSuffix")
    @js.native
    def boundAttributeSuffix: String = js.native
    inline def boundAttributeSuffix_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("boundAttributeSuffix")(x.asInstanceOf[js.Any])
    
    inline def connectedDisconnectable(): Disconnectable = ^.asInstanceOf[js.Dynamic].applyDynamic("connectedDisconnectable")().asInstanceOf[Disconnectable]
    inline def connectedDisconnectable(props: js.Object): Disconnectable = ^.asInstanceOf[js.Dynamic].applyDynamic("connectedDisconnectable")(props.asInstanceOf[js.Any]).asInstanceOf[Disconnectable]
    
    inline def getAttributePartCommittedValue(part: typings.litHtml.developmentLitHtmlMod.AttributePart, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getAttributePartCommittedValue")(part.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getAttributePartCommittedValue(part: typings.litHtml.developmentLitHtmlMod.AttributePart, value: Any, index: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getAttributePartCommittedValue")(part.asInstanceOf[js.Any], value.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getTemplateHtml(strings: TemplateStringsArray, `type`: `1` | `2`): js.Tuple2[TrustedHTML, js.Array[js.UndefOr[String]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplateHtml")(strings.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[TrustedHTML, js.Array[js.UndefOr[String]]]]
    
    inline def isIterable(value: Any): /* is std.Iterable<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIterable")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Iterable<unknown> */ Boolean]
    
    @JSImport("lit-html/private-ssr-support.js", "_$LH.marker")
    @js.native
    def marker: String = js.native
    
    @JSImport("lit-html/private-ssr-support.js", "_$LH.markerMatch")
    @js.native
    def markerMatch: String = js.native
    inline def markerMatch_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("markerMatch")(x.asInstanceOf[js.Any])
    
    inline def marker_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("marker")(x.asInstanceOf[js.Any])
    
    inline def overrideDirectiveResolve(
      directiveClass: Instantiable1[/* part */ PartInfo, Directiverenderunknown],
      resolveOverrideFn: js.Function2[/* directive */ Directive_, /* values */ js.Array[Any], Any]
    ): Instantiable = (^.asInstanceOf[js.Dynamic].applyDynamic("overrideDirectiveResolve")(directiveClass.asInstanceOf[js.Any], resolveOverrideFn.asInstanceOf[js.Any])).asInstanceOf[Instantiable]
    
    inline def resolveDirective(part: typings.litHtml.developmentLitHtmlMod.AttributePart, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDirective")(part.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def resolveDirective(
      part: typings.litHtml.developmentLitHtmlMod.AttributePart,
      value: Any,
      parent: Unit,
      attributeIndex: Double
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDirective")(part.asInstanceOf[js.Any], value.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], attributeIndex.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def resolveDirective(part: typings.litHtml.developmentLitHtmlMod.AttributePart, value: Any, parent: DirectiveParent): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDirective")(part.asInstanceOf[js.Any], value.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def resolveDirective(
      part: typings.litHtml.developmentLitHtmlMod.AttributePart,
      value: Any,
      parent: DirectiveParent,
      attributeIndex: Double
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDirective")(part.asInstanceOf[js.Any], value.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], attributeIndex.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def resolveDirective(part: typings.litHtml.developmentLitHtmlMod.ChildPart, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDirective")(part.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def resolveDirective(
      part: typings.litHtml.developmentLitHtmlMod.ChildPart,
      value: Any,
      parent: Unit,
      attributeIndex: Double
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDirective")(part.asInstanceOf[js.Any], value.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], attributeIndex.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def resolveDirective(part: typings.litHtml.developmentLitHtmlMod.ChildPart, value: Any, parent: DirectiveParent): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDirective")(part.asInstanceOf[js.Any], value.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def resolveDirective(
      part: typings.litHtml.developmentLitHtmlMod.ChildPart,
      value: Any,
      parent: DirectiveParent,
      attributeIndex: Double
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDirective")(part.asInstanceOf[js.Any], value.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], attributeIndex.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def resolveDirective(part: typings.litHtml.developmentLitHtmlMod.ElementPart, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDirective")(part.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def resolveDirective(
      part: typings.litHtml.developmentLitHtmlMod.ElementPart,
      value: Any,
      parent: Unit,
      attributeIndex: Double
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDirective")(part.asInstanceOf[js.Any], value.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], attributeIndex.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def resolveDirective(part: typings.litHtml.developmentLitHtmlMod.ElementPart, value: Any, parent: DirectiveParent): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDirective")(part.asInstanceOf[js.Any], value.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def resolveDirective(
      part: typings.litHtml.developmentLitHtmlMod.ElementPart,
      value: Any,
      parent: DirectiveParent,
      attributeIndex: Double
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDirective")(part.asInstanceOf[js.Any], value.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], attributeIndex.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def setDirectiveClass(value: DirectiveResult[DirectiveClass], directiveClass: DirectiveClass): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDirectiveClass")(value.asInstanceOf[js.Any], directiveClass.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
