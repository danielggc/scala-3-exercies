package typings.ui5WebcomponentsBase

import org.scalajs.dom.CSSStyleDeclaration
import org.scalajs.dom.Element
import org.scalajs.dom.EventListenerOptions
import typings.std.AddEventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import typings.std.HTMLSlotElement
import typings.std.ShadowRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distStaticAreaItemMod {
  
  /**
    *
    * @class
    * @author SAP SE
    * @private
    */
  @JSImport("@ui5/webcomponents-base/dist/StaticAreaItem", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with StaticAreaItem {
    
    /* standard dom */
    /* CompleteClass */
    var ariaAtomic: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaAutoComplete: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaBusy: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaChecked: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaColCount: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaColIndex: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaColIndexText: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaColSpan: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaCurrent: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaDisabled: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaExpanded: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaHasPopup: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaHidden: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaInvalid: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaKeyShortcuts: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaLabel: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaLevel: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaLive: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaModal: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaMultiLine: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaMultiSelectable: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaOrientation: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaPlaceholder: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaPosInSet: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaPressed: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaReadOnly: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaRequired: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaRoleDescription: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaRowCount: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaRowIndex: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaRowIndexText: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaRowSpan: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaSelected: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaSetSize: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaSort: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaValueMax: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaValueMin: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaValueNow: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaValueText: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val assignedSlot: HTMLSlotElement | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var contentEditable: String = js.native
    
    /* standard dom */
    /* CompleteClass */
    var enterKeyHint: String = js.native
    
    /* standard dom */
    /* CompleteClass */
    var innerHTML: String = js.native
    
    /* standard dom */
    /* CompleteClass */
    var inputMode: String = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val isContentEditable: Boolean = js.native
    
    /** Returns the first following sibling that is an element, and null otherwise. */
    /* standard dom */
    /* CompleteClass */
    override val nextElementSibling: Element | Null = js.native
    
    /** Returns the first preceding sibling that is an element, and null otherwise. */
    /* standard dom */
    /* CompleteClass */
    override val previousElementSibling: Element | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var role: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val style: CSSStyleDeclaration = js.native
  }
  object default {
    
    @JSImport("@ui5/webcomponents-base/dist/StaticAreaItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def createInstance(): StaticAreaItem = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")().asInstanceOf[StaticAreaItem]
    
    /* static member */
    inline def getTag(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTag")().asInstanceOf[String]
  }
  
  /**
    *
    * @class
    * @author SAP SE
    * @private
    */
  @js.native
  trait StaticAreaItem
    extends StObject
       with HTMLElement {
    
    var _rendered: Boolean = js.native
    
    def _updateAdditionalAttrs(): Unit = js.native
    
    /**
      * Sets the correct content density based on the owner element's state
      * @private
      */
    def _updateContentDensity(): Unit = js.native
    
    def _updateDirection(): Unit = js.native
    
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    /**
      * @protected
      * Returns reference to the DOM element where the current fragment is added.
      */
    def getDomRef(): js.Promise[ShadowRoot | Null] = js.native
    
    var ownerElement: js.UndefOr[typings.ui5WebcomponentsBase.distUi5elementMod.default] = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    
    /**
      * @param {UI5Element} ownerElement the UI5Element instance that owns this static area item
      */
    def setOwnerElement(ownerElement: typings.ui5WebcomponentsBase.distUi5elementMod.default): Unit = js.native
    
    /**
      * Updates the shadow root of the static area item with the latest state, if rendered
      */
    def update(): Unit = js.native
  }
}
