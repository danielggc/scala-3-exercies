package typings.litHtml

import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
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

object directiveMod {
  
  @JSImport("lit-html/directive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lit-html/directive", "AttributePart")
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
  
  @JSImport("lit-html/directive", "BooleanAttributePart")
  @js.native
  open class BooleanAttributePart protected ()
    extends typings.litHtml.mod.BooleanAttributePart {
    def this(element: HTMLElement, name: String, strings: js.Array[String], parent: Disconnectable) = this()
    def this(
      element: HTMLElement,
      name: String,
      strings: js.Array[String],
      parent: Disconnectable,
      options: RenderOptions
    ) = this()
  }
  
  @JSImport("lit-html/directive", "ChildPart")
  @js.native
  open class ChildPart protected ()
    extends typings.litHtml.mod.ChildPart {
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
  
  /* note: abstract class */ @JSImport("lit-html/directive", "Directive")
  @js.native
  open class Directive_ protected ()
    extends StObject
       with Disconnectable {
    def this(_partInfo: PartInfo) = this()
    
    /* CompleteClass */
    @JSName("_$isConnected")
    var _$isConnected: Boolean = js.native
    @JSName("_$isConnected")
    def _$isConnected_MDirective_ : Boolean = js.native
    
    def render(props: Any*): Any = js.native
    
    def update(_part: Part, props: js.Array[Any]): Any = js.native
  }
  
  @JSImport("lit-html/directive", "ElementPart")
  @js.native
  open class ElementPart protected ()
    extends typings.litHtml.mod.ElementPart {
    def this(element: Element, parent: Disconnectable) = this()
    def this(element: Element, parent: Disconnectable, options: RenderOptions) = this()
  }
  
  @JSImport("lit-html/directive", "EventPart")
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
  
  /* Inlined { readonly ATTRIBUTE :1,  readonly CHILD :2,  readonly PROPERTY :3,  readonly BOOLEAN_ATTRIBUTE :4,  readonly EVENT :5,  readonly ELEMENT :6}[keyof { readonly ATTRIBUTE :1,  readonly CHILD :2,  readonly PROPERTY :3,  readonly BOOLEAN_ATTRIBUTE :4,  readonly EVENT :5,  readonly ELEMENT :6}] */
  /* Rewritten from type alias, can be one of: 
    - typings.litHtml.litHtmlInts.`3`
    - typings.litHtml.litHtmlInts.`2`
    - typings.litHtml.litHtmlInts.`4`
    - typings.litHtml.litHtmlInts.`5`
    - typings.litHtml.litHtmlInts.`6`
    - typings.litHtml.litHtmlInts.`1`
  */
  trait PartType extends StObject
  object PartType {
    
    @JSImport("lit-html/directive", "PartType.ATTRIBUTE")
    @js.native
    val ATTRIBUTE: `1` = js.native
    
    @JSImport("lit-html/directive", "PartType.BOOLEAN_ATTRIBUTE")
    @js.native
    val BOOLEAN_ATTRIBUTE: `4` = js.native
    
    @JSImport("lit-html/directive", "PartType.CHILD")
    @js.native
    val CHILD: `2` = js.native
    
    @JSImport("lit-html/directive", "PartType.ELEMENT")
    @js.native
    val ELEMENT: `6` = js.native
    
    @JSImport("lit-html/directive", "PartType.EVENT")
    @js.native
    val EVENT: `5` = js.native
    
    @JSImport("lit-html/directive", "PartType.PROPERTY")
    @js.native
    val PROPERTY: `3` = js.native
  }
  
  @JSImport("lit-html/directive", "PropertyPart")
  @js.native
  open class PropertyPart protected ()
    extends typings.litHtml.mod.PropertyPart {
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
  
  trait AttributePartInfo
    extends StObject
       with PartInfo {
    
    val name: String
    
    val strings: js.UndefOr[js.Array[String]] = js.undefined
    
    val tagName: String
    
    val `type`: `1` | `3` | `4` | `5`
  }
  object AttributePartInfo {
    
    inline def apply(name: String, tagName: String, `type`: `1` | `3` | `4` | `5`): AttributePartInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributePartInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AttributePartInfo] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStrings(value: js.Array[String]): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
      
      inline def setStringsUndefined: Self = StObject.set(x, "strings", js.undefined)
      
      inline def setStringsVarargs(value: String*): Self = StObject.set(x, "strings", js.Array(value*))
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setType(value: `1` | `3` | `4` | `5`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChildPartInfo
    extends StObject
       with PartInfo {
    
    val `type`: `2`
  }
  object ChildPartInfo {
    
    inline def apply(): ChildPartInfo = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(2)
      __obj.asInstanceOf[ChildPartInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChildPartInfo] (val x: Self) extends AnyVal {
      
      inline def setType(value: `2`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DirectiveClass
    extends StObject
       with Instantiable1[/* part */ PartInfo, Directive_]
  
  type DirectiveParameters[C /* <: Directive_ */] = Parameters[
    /* import warning: importer.ImportType#apply Failed type conversion: C['render'] */ js.Any
  ]
  
  trait DirectiveResult[C /* <: DirectiveClass */] extends StObject
  
  trait ElementPartInfo
    extends StObject
       with PartInfo {
    
    val `type`: `6`
  }
  object ElementPartInfo {
    
    inline def apply(): ElementPartInfo = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(6)
      __obj.asInstanceOf[ElementPartInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ElementPartInfo] (val x: Self) extends AnyVal {
      
      inline def setType(value: `6`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.litHtml.directiveMod.ChildPartInfo
    - typings.litHtml.directiveMod.AttributePartInfo
    - typings.litHtml.directiveMod.ElementPartInfo
  */
  trait PartInfo extends StObject
  object PartInfo {
    
    inline def AttributePartInfo(name: String, tagName: String, `type`: `1` | `3` | `4` | `5`): typings.litHtml.directiveMod.AttributePartInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.litHtml.directiveMod.AttributePartInfo]
    }
    
    inline def ChildPartInfo(): typings.litHtml.directiveMod.ChildPartInfo = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(2)
      __obj.asInstanceOf[typings.litHtml.directiveMod.ChildPartInfo]
    }
    
    inline def ElementPartInfo(): typings.litHtml.directiveMod.ElementPartInfo = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(6)
      __obj.asInstanceOf[typings.litHtml.directiveMod.ElementPartInfo]
    }
  }
}
