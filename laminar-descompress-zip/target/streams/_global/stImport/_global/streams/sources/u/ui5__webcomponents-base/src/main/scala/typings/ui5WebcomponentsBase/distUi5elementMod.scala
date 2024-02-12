package typings.ui5WebcomponentsBase

import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.CSSStyleDeclaration
import org.scalajs.dom.DocumentFragment
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalajs.dom.EventListenerOptions
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import typings.std.AddEventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLSlotElement
import typings.std.Map
import typings.std.Set
import typings.std.ShadowRoot
import typings.ui5WebcomponentsBase.anon.Host
import typings.ui5WebcomponentsBase.anon.PromisevoiddeferredResolv
import typings.ui5WebcomponentsBase.anon.TypeofUI5Element
import typings.ui5WebcomponentsBase.distRendererExecuteTemplateMod.TemplateFunction
import typings.ui5WebcomponentsBase.distRendererExecuteTemplateMod.TemplateFunctionResult
import typings.ui5WebcomponentsBase.distTypesMod.ClassMap
import typings.ui5WebcomponentsBase.distUi5elementmetadataMod.Metadata
import typings.ui5WebcomponentsBase.distUi5elementmetadataMod.PropertyValue
import typings.ui5WebcomponentsBase.distUi5elementmetadataMod.Slot
import typings.ui5WebcomponentsBase.distUi5elementmetadataMod.State
import typings.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.property
import typings.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.slot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUi5elementMod {
  
  @JSImport("@ui5/webcomponents-base/dist/UI5Element", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Base class for all UI5 Web Components
    *
    * @class
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.base.UI5Element
    * @extends HTMLElement
    * @public
    */
  /* note: abstract class */ @JSImport("@ui5/webcomponents-base/dist/UI5Element", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with UI5Element {
    
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
    
    @JSImport("@ui5/webcomponents-base/dist/UI5Element", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents-base/dist/UI5Element", "default.decoratorMetadata")
    @js.native
    def decoratorMetadata: Metadata = js.native
    inline def decoratorMetadata_=(x: Metadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decoratorMetadata")(x.asInstanceOf[js.Any])
    
    /**
      * Registers a UI5 Web Component in the browser window object
      * @public
      * @returns {Promise<UI5Element>}
      */
    /* static member */
    inline def define(): js.Promise[TypeofUI5Element & Instantiable0[UI5Element]] = ^.asInstanceOf[js.Dynamic].applyDynamic("define")().asInstanceOf[js.Promise[TypeofUI5Element & Instantiable0[UI5Element]]]
    
    /**
      * @private
      */
    /* static member */
    inline def generateAccessors(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_generateAccessors")().asInstanceOf[Unit]
    
    /**
      * Returns an instance of UI5ElementMetadata.js representing this UI5 Web Component's full metadata (its and its parents')
      * Note: not to be confused with the "get metadata()" method, which returns an object for this class's metadata only
      * @public
      * @returns {UI5ElementMetadata}
      */
    /* static member */
    inline def getMetadata(): typings.ui5WebcomponentsBase.distUi5elementmetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.ui5WebcomponentsBase.distUi5elementmetadataMod.default]
    
    /**
      * Returns a list of the unique dependencies for this UI5 Web Component
      *
      * @public
      */
    /* static member */
    inline def getUniqueDependencies(): js.Array[TypeofUI5Element & Instantiable0[UI5Element]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUniqueDependencies")().asInstanceOf[js.Array[TypeofUI5Element & Instantiable0[UI5Element]]]
    
    /* static member */
    @JSImport("@ui5/webcomponents-base/dist/UI5Element", "default._metadata")
    @js.native
    def metadata: typings.ui5WebcomponentsBase.distUi5elementmetadataMod.default = js.native
    
    inline def metadata_=(x: typings.ui5WebcomponentsBase.distUi5elementmetadataMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_metadata")(x.asInstanceOf[js.Any])
    
    /**
      * @private
      */
    /* static member */
    inline def needsShadowDOM(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_needsShadowDOM")().asInstanceOf[Boolean]
    
    /**
      * @private
      */
    /* static member */
    inline def needsStaticArea(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_needsStaticArea")().asInstanceOf[Boolean]
    
    /**
      * Hook that will be called upon custom element definition
      *
      * @protected
      * @returns {Promise<void>}
      */
    /* static member */
    inline def onDefine(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("onDefine")().asInstanceOf[js.Promise[Unit]]
    
    /* static member */
    @JSImport("@ui5/webcomponents-base/dist/UI5Element", "default.render")
    @js.native
    def render: js.Function5[
        /* templateFunctionResult */ TemplateFunctionResult, 
        /* container */ HTMLElement | DocumentFragment, 
        /* styleStrOrHrefsArr */ js.UndefOr[String | js.Array[String]], 
        /* forStaticArea */ Boolean, 
        /* options */ Host, 
        Unit
      ] = js.native
    inline def render_=(
      x: js.Function5[
          /* templateFunctionResult */ TemplateFunctionResult, 
          /* container */ HTMLElement | DocumentFragment, 
          /* styleStrOrHrefsArr */ js.UndefOr[String | js.Array[String]], 
          /* forStaticArea */ Boolean, 
          /* options */ Host, 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("render")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@ui5/webcomponents-base/dist/UI5Element", "default.staticAreaTemplate")
    @js.native
    def staticAreaTemplate: js.UndefOr[TemplateFunction] = js.native
    inline def staticAreaTemplate_=(x: js.UndefOr[TemplateFunction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("staticAreaTemplate")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@ui5/webcomponents-base/dist/UI5Element", "default.template")
    @js.native
    def template: js.UndefOr[TemplateFunction] = js.native
    inline def template_=(x: js.UndefOr[TemplateFunction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("template")(x.asInstanceOf[js.Any])
    
    /**
      * Returns a promise that resolves whenever all dependencies for this UI5 Web Component have resolved
      *
      * @returns {Promise}
      */
    /* static member */
    inline def whenDependenciesDefined(): js.Promise[js.Array[TypeofUI5Element & Instantiable0[UI5Element]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("whenDependenciesDefined")().asInstanceOf[js.Promise[js.Array[TypeofUI5Element & Instantiable0[UI5Element]]]]
  }
  
  /**
    * Always use duck-typing to cover all runtimes on the page.
    * @returns {boolean}
    */
  inline def instanceOfUI5Element(`object`: Any): /* is @ui5/webcomponents-base.@ui5/webcomponents-base/dist/UI5Element.UI5Element */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("instanceOfUI5Element")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is @ui5/webcomponents-base.@ui5/webcomponents-base/dist/UI5Element.UI5Element */ Boolean]
  
  trait ChangeInfo extends StObject {
    
    var child: js.UndefOr[Node] = js.undefined
    
    var name: String
    
    var newValue: js.UndefOr[PropertyValue] = js.undefined
    
    var oldValue: js.UndefOr[PropertyValue] = js.undefined
    
    var reason: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[UI5Element] = js.undefined
    
    var `type`: property | slot
  }
  object ChangeInfo {
    
    inline def apply(name: String, `type`: property | slot): ChangeInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangeInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChangeInfo] (val x: Self) extends AnyVal {
      
      inline def setChild(value: Node): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      inline def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNewValue(value: PropertyValue): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setNewValueNull: Self = StObject.set(x, "newValue", null)
      
      inline def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
      
      inline def setOldValue(value: PropertyValue): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      inline def setOldValueNull: Self = StObject.set(x, "oldValue", null)
      
      inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setTarget(value: UI5Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: property | slot): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ChildChangeListener = js.Function1[/* param */ InvalidationInfo, Unit]
  
  trait InvalidationInfo
    extends StObject
       with ChangeInfo {
    
    @JSName("target")
    var target_InvalidationInfo: UI5Element
  }
  object InvalidationInfo {
    
    inline def apply(name: String, target: UI5Element, `type`: property | slot): InvalidationInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvalidationInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InvalidationInfo] (val x: Self) extends AnyVal {
      
      inline def setTarget(value: UI5Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  type SlotChangeListener = js.ThisFunction1[/* this */ HTMLSlotElement, /* ev */ Event, Unit]
  
  /**
    * Base class for all UI5 Web Components
    *
    * @class
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.base.UI5Element
    * @extends HTMLElement
    * @public
    */
  @js.native
  trait UI5Element
    extends StObject
       with typings.std.HTMLElement {
    
    var __id: js.UndefOr[String] = js.native
    
    /**
      * @private
      */
    def _assignIndividualSlotsToChildren(): Unit = js.native
    
    /**
      * @private
      */
    def _attachSlotChange(child: HTMLSlotElement, slotName: String): Unit = js.native
    
    var _changedState: js.Array[ChangeInfo] = js.native
    
    var _childChangeListeners: Map[String, ChildChangeListener] = js.native
    
    /**
      * Removes all children from the slot and detaches listeners, if any
      * @private
      */
    def _clearSlot(slotName: String, slotData: Slot): Unit = js.native
    
    /**
      * @private
      */
    def _detachSlotChange(child: HTMLSlotElement, slotName: String): Unit = js.native
    
    var _doNotSyncAttributes: Set[String] = js.native
    
    var _domRefReadyPromise: PromisevoiddeferredResolv = js.native
    
    var _eventProvider: typings.ui5WebcomponentsBase.distEventProviderMod.default[InvalidationInfo, Unit] = js.native
    
    def _fireEvent[T](name: String): Boolean = js.native
    def _fireEvent[T](name: String, data: T): Boolean = js.native
    def _fireEvent[T](name: String, data: T, cancelable: Boolean): Boolean = js.native
    def _fireEvent[T](name: String, data: T, cancelable: Boolean, bubbles: Boolean): Boolean = js.native
    def _fireEvent[T](name: String, data: T, cancelable: Unit, bubbles: Boolean): Boolean = js.native
    def _fireEvent[T](name: String, data: Unit, cancelable: Boolean): Boolean = js.native
    def _fireEvent[T](name: String, data: Unit, cancelable: Boolean, bubbles: Boolean): Boolean = js.native
    def _fireEvent[T](name: String, data: Unit, cancelable: Unit, bubbles: Boolean): Boolean = js.native
    
    var _fullyConnected: Boolean = js.native
    
    /**
      * Returns a singleton event listener for the "change" event of a child in a given slot
      *
      * @param slotName the name of the slot, where the child is
      * @returns {ChildChangeListener}
      * @private
      */
    def _getChildChangeListener(slotName: String): js.UndefOr[ChildChangeListener] = js.native
    
    var _getRealDomRef: js.UndefOr[js.Function0[HTMLElement]] = js.native
    
    /**
      * Returns a singleton slotchange event listener that invalidates the component due to changes in the given slot
      *
      * @param slotName the name of the slot, where the slot element (whose slotchange event we're listening to) is
      * @returns {SlotChangeListener}
      * @private
      */
    def _getSlotChangeListener(slotName: String): SlotChangeListener = js.native
    
    /**
      * Returns a unique ID for this UI5 Element
      *
      * @deprecated - This property is not guaranteed in future releases
      * @protected
      */
    def _id: String = js.native
    
    var _inDOM: Boolean = js.native
    
    /**
      * Callback that is executed whenever a monitored child changes its state
      *
      * @param {sting} slotName the slot in which a child was invalidated
      * @param { ChangeInfo } childChangeInfo the changeInfo object for the child in the given slot
      * @private
      */
    def _onChildChange(slotName: String, childChangeInfo: ChangeInfo): Unit = js.native
    
    var _onComponentStateFinalized: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Whenever a slot element is slotted inside a UI5 Web Component, its slotchange event invalidates the component
      *
      * @param slotName the name of the slot, where the slot element (whose slotchange event we're listening to) is
      * @private
      */
    def _onSlotChange(slotName: String): Unit = js.native
    
    /**
      * Note: this method is also manually called by "compatibility/patchNodeValue.js"
      * @private
      */
    def _processChildren(): js.Promise[Unit] = js.native
    
    /**
      * Do not call this method directly, only intended to be called by js
      * @protected
      */
    def _render(): Unit = js.native
    
    var _slotChangeListeners: Map[String, SlotChangeListener] = js.native
    
    /**
      * @private
      */
    def _startObservingDOMChildren(): Unit = js.native
    
    var _state: State = js.native
    
    /**
      * @private
      */
    def _stopObservingDOMChildren(): Unit = js.native
    
    var _suppressInvalidation: Boolean = js.native
    
    /**
      * @private
      */
    def _updateAttribute(name: String, newValue: PropertyValue): Unit = js.native
    
    /**
      * @private
      */
    def _updateSlots(): js.Promise[Unit] = js.native
    
    /**
      * @private
      */
    def _upgradeAllProperties(): Unit = js.native
    
    /**
      * @private
      */
    def _upgradeProperty(propertyName: String): Unit = js.native
    
    /**
      * @private
      */
    def _waitForDomRef(): PromisevoiddeferredResolv = js.native
    
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    /**
      * Attach a callback that will be executed whenever the component is invalidated
      *
      * @param {InvalidationInfo} callback
      * @public
      */
    def attachInvalidate(callback: js.Function1[/* param */ InvalidationInfo, Unit]): Unit = js.native
    
    /**
      * Do not override this method in derivatives of UI5Element
      * @private
      */
    def attributeChangedCallback(name: String): Unit = js.native
    def attributeChangedCallback(name: String, oldValue: String): Unit = js.native
    def attributeChangedCallback(name: String, oldValue: String, newValue: String): Unit = js.native
    def attributeChangedCallback(name: String, oldValue: Null, newValue: String): Unit = js.native
    
    def classes: ClassMap = js.native
    
    /**
      * Do not call this method from derivatives of UI5Element, use "onEnterDOM" only
      * @private
      */
    def connectedCallback(): js.Promise[Unit] = js.native
    
    /**
      * Detach the callback that is executed whenever the component is invalidated
      *
      * @param {InvalidationInfo} callback
      * @public
      */
    def detachInvalidate(callback: js.Function1[/* param */ InvalidationInfo, Unit]): Unit = js.native
    
    /**
      * Do not call this method from derivatives of UI5Element, use "onExitDOM" only
      * @private
      */
    def disconnectedCallback(): Unit = js.native
    
    /**
      * Determines whether the component should be rendered in RTL mode or not.
      * Returns: "rtl", "ltr" or undefined
      *
      * @public
      * @returns {String|undefined}
      */
    def effectiveDir: js.UndefOr[String] = js.native
    
    /**
      *
      * @public
      * @param name - name of the event
      * @param data - additional data for the event
      * @param cancelable - true, if the user can call preventDefault on the event object
      * @param bubbles - true, if the event bubbles
      * @returns {boolean} false, if the event was cancelled (preventDefault called), true otherwise
      */
    def fireEvent[T](name: String): Boolean = js.native
    def fireEvent[T](name: String, data: T): Boolean = js.native
    def fireEvent[T](name: String, data: T, cancelable: Boolean): Boolean = js.native
    def fireEvent[T](name: String, data: T, cancelable: Boolean, bubbles: Boolean): Boolean = js.native
    def fireEvent[T](name: String, data: T, cancelable: Unit, bubbles: Boolean): Boolean = js.native
    def fireEvent[T](name: String, data: Unit, cancelable: Boolean): Boolean = js.native
    def fireEvent[T](name: String, data: Unit, cancelable: Boolean, bubbles: Boolean): Boolean = js.native
    def fireEvent[T](name: String, data: Unit, cancelable: Unit, bubbles: Boolean): Boolean = js.native
    
    /**
      * Returns the DOM Element inside the Shadow Root that corresponds to the opening tag in the UI5 Web Component's template
      * *Note:* For logical (abstract) elements (items, options, etc...), returns the part of the parent's DOM that represents this option
      * Use this method instead of "this.shadowRoot" to read the Shadow DOM, if ever necessary
      *
      * @public
      */
    def getDomRef(): js.UndefOr[HTMLElement] = js.native
    
    /**
      * Returns the DOM Element marked with "data-sap-focus-ref" inside the template.
      * This is the element that will receive the focus by default.
      * @public
      */
    def getFocusDomRef(): js.UndefOr[HTMLElement] = js.native
    
    /**
      * Waits for dom ref and then returns the DOM Element marked with "data-sap-focus-ref" inside the template.
      * This is the element that will receive the focus by default.
      * @public
      */
    def getFocusDomRefAsync(): js.Promise[js.UndefOr[HTMLElement]] = js.native
    
    /**
      * Returns the actual children, associated with a slot.
      * Useful when there are transitive slots in nested component scenarios and you don't want to get a list of the slots, but rather of their content.
      * @public
      */
    def getSlottedNodes(slotName: String): js.Array[Node] = js.native
    
    /**
      * @public
      */
    def getStaticAreaItemDomRef(): js.Promise[ShadowRoot | Null] = js.native
    
    /**
      * Used to duck-type UI5 elements without using instanceof
      * @returns {boolean}
      * @public
      */
    def isUI5Element: Boolean = js.native
    
    /**
      * Called every time after the component renders.
      * @public
      */
    def onAfterRendering(): Unit = js.native
    
    /**
      * Called every time before the component renders.
      * @public
      */
    def onBeforeRendering(): Unit = js.native
    
    /**
      * Called on connectedCallback - added to the DOM.
      * @public
      */
    def onEnterDOM(): Unit = js.native
    
    /**
      * Called on disconnectedCallback - removed from the DOM.
      * @public
      */
    def onExitDOM(): Unit = js.native
    
    /**
      * A callback that is executed each time an already rendered component is invalidated (scheduled for re-rendering)
      *
      * @param  changeInfo An object with information about the change that caused invalidation.
      * The object can have the following properties:
      *  - type: (property|slot) tells what caused the invalidation
      *   1) property: a property value was changed either directly or as a result of changing the corresponding attribute
      *   2) slot: a slotted node(nodes) changed in one of several ways (see "reason")
      *
      *  - name: the name of the property or slot that caused the invalidation
      *
      *  - reason: (children|textcontent|childchange|slotchange) relevant only for type="slot" only and tells exactly what changed in the slot
      *   1) children: immediate children (HTML elements or text nodes) were added, removed or reordered in the slot
      *   2) textcontent: text nodes in the slot changed value (or nested text nodes were added or changed value). Can only trigger for slots of "type: Node"
      *   3) slotchange: a slot element, slotted inside that slot had its "slotchange" event listener called. This practically means that transitively slotted children changed.
      *      Can only trigger if the child of a slot is a slot element itself.
      *   4) childchange: indicates that a UI5Element child in that slot was invalidated and in turn invalidated the component.
      *      Can only trigger for slots with "invalidateOnChildChange" metadata descriptor
      *
      *  - newValue: the new value of the property (for type="property" only)
      *
      *  - oldValue: the old value of the property (for type="property" only)
      *
      *  - child the child that was changed (for type="slot" and reason="childchange" only)
      *
      * @public
      */
    def onInvalidation(changeInfo: ChangeInfo): Unit = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    
    var staticAreaItem: js.UndefOr[typings.ui5WebcomponentsBase.distStaticAreaItemMod.default] = js.native
  }
}
