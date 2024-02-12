package typings.litHtml

import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typings.litHtml.directiveMod.DirectiveClass
import typings.litHtml.directiveMod.DirectiveResult
import typings.litHtml.directiveMod.PartInfo
import typings.litHtml.litHtmlInts.`1`
import typings.litHtml.litHtmlInts.`2`
import typings.litHtml.litHtmlInts.`3`
import typings.litHtml.litHtmlInts.`4`
import typings.litHtml.litHtmlInts.`5`
import typings.litHtml.litHtmlInts.`6`
import typings.litHtml.mod.Disconnectable
import typings.litHtml.mod.Part
import typings.litHtml.mod.RenderOptions
import typings.litHtml.mod.TemplateInstance
import typings.std.ChildNode
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncDirectiveMod {
  
  @JSImport("lit-html/async-directive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("lit-html/async-directive", "AsyncDirective")
  @js.native
  open class AsyncDirective protected ()
    extends typings.litHtml.directiveMod.Directive_ {
    def this(_partInfo: PartInfo) = this()
    
    /**
      * Initialize the part with internal fields
      * @param part
      * @param parent
      * @param attributeIndex
      */
    @JSName("_$initialize")
    def _$initialize(part: Part, parent: Disconnectable): Unit = js.native
    @JSName("_$initialize")
    def _$initialize(part: Part, parent: Disconnectable, attributeIndex: Double): Unit = js.native
    
    /**
      * User callbacks for implementing logic to release any resources/subscriptions
      * that may have been retained by this directive. Since directives may also be
      * re-connected, `reconnected` should also be implemented to restore the
      * working state of the directive prior to the next render.
      */
    /* protected */ def disconnected(): Unit = js.native
    
    /**
      * The connection state for this Directive.
      */
    var isConnected: Boolean = js.native
    
    /* protected */ def reconnected(): Unit = js.native
    
    /**
      * Sets the value of the directive's Part outside the normal `update`/`render`
      * lifecycle of a directive.
      *
      * This method should not be called synchronously from a directive's `update`
      * or `render`.
      *
      * @param directive The directive to update
      * @param value The value to set
      */
    def setValue(value: Any): Unit = js.native
  }
  
  @JSImport("lit-html/async-directive", "AttributePart")
  @js.native
  open class AttributePart protected ()
    extends typings.litHtml.directiveMod.AttributePart {
    def this(element: HTMLElement, name: String, strings: js.Array[String], parent: Disconnectable) = this()
    def this(
      element: HTMLElement,
      name: String,
      strings: js.Array[String],
      parent: Disconnectable,
      options: RenderOptions
    ) = this()
  }
  
  @JSImport("lit-html/async-directive", "BooleanAttributePart")
  @js.native
  open class BooleanAttributePart protected ()
    extends typings.litHtml.directiveMod.BooleanAttributePart {
    def this(element: HTMLElement, name: String, strings: js.Array[String], parent: Disconnectable) = this()
    def this(
      element: HTMLElement,
      name: String,
      strings: js.Array[String],
      parent: Disconnectable,
      options: RenderOptions
    ) = this()
  }
  
  @JSImport("lit-html/async-directive", "ChildPart")
  @js.native
  open class ChildPart protected ()
    extends typings.litHtml.directiveMod.ChildPart {
    def this(startNode: ChildNode) = this()
    def this(startNode: ChildNode, endNode: ChildNode) = this()
    def this(startNode: ChildNode, endNode: Null, parent: typings.litHtml.mod.ChildPart) = this()
    def this(startNode: ChildNode, endNode: Null, parent: TemplateInstance) = this()
    def this(startNode: ChildNode, endNode: ChildNode, parent: typings.litHtml.mod.ChildPart) = this()
    def this(startNode: ChildNode, endNode: ChildNode, parent: TemplateInstance) = this()
    def this(startNode: ChildNode, endNode: Null, parent: Unit, options: RenderOptions) = this()
    def this(startNode: ChildNode, endNode: Null, parent: typings.litHtml.mod.ChildPart, options: RenderOptions) = this()
    def this(startNode: ChildNode, endNode: Null, parent: TemplateInstance, options: RenderOptions) = this()
    def this(startNode: ChildNode, endNode: ChildNode, parent: Unit, options: RenderOptions) = this()
    def this(
      startNode: ChildNode,
      endNode: ChildNode,
      parent: typings.litHtml.mod.ChildPart,
      options: RenderOptions
    ) = this()
    def this(startNode: ChildNode, endNode: ChildNode, parent: TemplateInstance, options: RenderOptions) = this()
  }
  
  /* note: abstract class */ @JSImport("lit-html/async-directive", "Directive")
  @js.native
  open class Directive_ protected ()
    extends typings.litHtml.directiveMod.Directive_ {
    def this(_partInfo: PartInfo) = this()
  }
  
  @JSImport("lit-html/async-directive", "ElementPart")
  @js.native
  open class ElementPart protected ()
    extends typings.litHtml.directiveMod.ElementPart {
    def this(element: Element, parent: Disconnectable) = this()
    def this(element: Element, parent: Disconnectable, options: RenderOptions) = this()
  }
  
  @JSImport("lit-html/async-directive", "EventPart")
  @js.native
  open class EventPart protected ()
    extends typings.litHtml.directiveMod.EventPart {
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
    
    @JSImport("lit-html/async-directive", "PartType.ATTRIBUTE")
    @js.native
    val ATTRIBUTE: `1` = js.native
    
    @JSImport("lit-html/async-directive", "PartType.BOOLEAN_ATTRIBUTE")
    @js.native
    val BOOLEAN_ATTRIBUTE: `4` = js.native
    
    @JSImport("lit-html/async-directive", "PartType.CHILD")
    @js.native
    val CHILD: `2` = js.native
    
    @JSImport("lit-html/async-directive", "PartType.ELEMENT")
    @js.native
    val ELEMENT: `6` = js.native
    
    @JSImport("lit-html/async-directive", "PartType.EVENT")
    @js.native
    val EVENT: `5` = js.native
    
    @JSImport("lit-html/async-directive", "PartType.PROPERTY")
    @js.native
    val PROPERTY: `3` = js.native
  }
  
  @JSImport("lit-html/async-directive", "PropertyPart")
  @js.native
  open class PropertyPart protected ()
    extends typings.litHtml.directiveMod.PropertyPart {
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
