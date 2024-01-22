package typings.litHtml

import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typings.litHtml.developmentDirectiveMod.DirectiveClass
import typings.litHtml.developmentDirectiveMod.DirectiveResult
import typings.litHtml.developmentDirectiveMod.PartInfo
import typings.litHtml.developmentLitHtmlMod.Disconnectable
import typings.litHtml.developmentLitHtmlMod.RenderOptions
import typings.litHtml.developmentLitHtmlMod.TemplateInstance
import typings.litHtml.litHtmlInts.`1`
import typings.litHtml.litHtmlInts.`2`
import typings.litHtml.litHtmlInts.`3`
import typings.litHtml.litHtmlInts.`4`
import typings.litHtml.litHtmlInts.`5`
import typings.litHtml.litHtmlInts.`6`
import typings.std.ChildNode
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object directiveDotjsMod {
  
  @JSImport("lit-html/directive.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lit-html/directive.js", "AttributePart")
  @js.native
  open class AttributePart protected ()
    extends typings.litHtml.developmentDirectiveMod.AttributePart {
    def this(element: HTMLElement, name: String, strings: js.Array[String], parent: Disconnectable) = this()
    def this(
      element: HTMLElement,
      name: String,
      strings: js.Array[String],
      parent: Disconnectable,
      options: RenderOptions
    ) = this()
  }
  
  @JSImport("lit-html/directive.js", "BooleanAttributePart")
  @js.native
  open class BooleanAttributePart protected ()
    extends typings.litHtml.developmentDirectiveMod.BooleanAttributePart {
    def this(element: HTMLElement, name: String, strings: js.Array[String], parent: Disconnectable) = this()
    def this(
      element: HTMLElement,
      name: String,
      strings: js.Array[String],
      parent: Disconnectable,
      options: RenderOptions
    ) = this()
  }
  
  @JSImport("lit-html/directive.js", "ChildPart")
  @js.native
  open class ChildPart protected ()
    extends typings.litHtml.developmentDirectiveMod.ChildPart {
    def this(startNode: ChildNode) = this()
    def this(startNode: ChildNode, endNode: ChildNode) = this()
    def this(startNode: ChildNode, endNode: Null, parent: typings.litHtml.developmentLitHtmlMod.ChildPart) = this()
    def this(startNode: ChildNode, endNode: Null, parent: TemplateInstance) = this()
    def this(startNode: ChildNode, endNode: ChildNode, parent: typings.litHtml.developmentLitHtmlMod.ChildPart) = this()
    def this(startNode: ChildNode, endNode: ChildNode, parent: TemplateInstance) = this()
    def this(startNode: ChildNode, endNode: Null, parent: Unit, options: RenderOptions) = this()
    def this(
      startNode: ChildNode,
      endNode: Null,
      parent: typings.litHtml.developmentLitHtmlMod.ChildPart,
      options: RenderOptions
    ) = this()
    def this(startNode: ChildNode, endNode: Null, parent: TemplateInstance, options: RenderOptions) = this()
    def this(startNode: ChildNode, endNode: ChildNode, parent: Unit, options: RenderOptions) = this()
    def this(
      startNode: ChildNode,
      endNode: ChildNode,
      parent: typings.litHtml.developmentLitHtmlMod.ChildPart,
      options: RenderOptions
    ) = this()
    def this(startNode: ChildNode, endNode: ChildNode, parent: TemplateInstance, options: RenderOptions) = this()
  }
  
  /* note: abstract class */ @JSImport("lit-html/directive.js", "Directive")
  @js.native
  open class Directive_ protected ()
    extends typings.litHtml.developmentDirectiveMod.Directive_ {
    def this(_partInfo: PartInfo) = this()
  }
  
  @JSImport("lit-html/directive.js", "ElementPart")
  @js.native
  open class ElementPart protected ()
    extends typings.litHtml.developmentDirectiveMod.ElementPart {
    def this(element: Element, parent: Disconnectable) = this()
    def this(element: Element, parent: Disconnectable, options: RenderOptions) = this()
  }
  
  @JSImport("lit-html/directive.js", "EventPart")
  @js.native
  open class EventPart protected ()
    extends typings.litHtml.developmentDirectiveMod.EventPart {
    def this(element: HTMLElement, name: String, strings: js.Array[String], parent: Disconnectable) = this()
    def this(
      element: HTMLElement,
      name: String,
      strings: js.Array[String],
      parent: Disconnectable,
      options: RenderOptions
    ) = this()
  }
  
  object PartType {
    
    @JSImport("lit-html/directive.js", "PartType.ATTRIBUTE")
    @js.native
    val ATTRIBUTE: `1` = js.native
    
    @JSImport("lit-html/directive.js", "PartType.BOOLEAN_ATTRIBUTE")
    @js.native
    val BOOLEAN_ATTRIBUTE: `4` = js.native
    
    @JSImport("lit-html/directive.js", "PartType.CHILD")
    @js.native
    val CHILD: `2` = js.native
    
    @JSImport("lit-html/directive.js", "PartType.ELEMENT")
    @js.native
    val ELEMENT: `6` = js.native
    
    @JSImport("lit-html/directive.js", "PartType.EVENT")
    @js.native
    val EVENT: `5` = js.native
    
    @JSImport("lit-html/directive.js", "PartType.PROPERTY")
    @js.native
    val PROPERTY: `3` = js.native
  }
  
  @JSImport("lit-html/directive.js", "PropertyPart")
  @js.native
  open class PropertyPart protected ()
    extends typings.litHtml.developmentDirectiveMod.PropertyPart {
    def this(element: HTMLElement, name: String, strings: js.Array[String], parent: Disconnectable) = this()
    def this(
      element: HTMLElement,
      name: String,
      strings: js.Array[String],
      parent: Disconnectable,
      options: RenderOptions
    ) = this()
  }
  
  inline def directive[C /* <: DirectiveClass */](c: C): js.Function1[
    /* values */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: std.InstanceType<C>['render'] */ js.Any
    ], 
    DirectiveResult[C]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("directive")(c.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* values */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: std.InstanceType<C>['render'] */ js.Any
    ], 
    DirectiveResult[C]
  ]]
}
