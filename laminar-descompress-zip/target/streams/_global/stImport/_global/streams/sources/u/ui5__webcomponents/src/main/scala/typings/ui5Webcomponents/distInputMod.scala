package typings.ui5Webcomponents

import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.Node
import typings.std.InputEvent
import typings.ui5Webcomponents.anon.Information
import typings.ui5Webcomponents.anon.InnerInput
import typings.ui5Webcomponents.anon.Max
import typings.ui5Webcomponents.anon.TypeofFormSupportT
import typings.ui5Webcomponents.distFeaturesInputSuggestionsMod.InputSuggestionText
import typings.ui5Webcomponents.distFeaturesInputSuggestionsMod.SuggestionComponent
import typings.ui5Webcomponents.distTypesInputTypeMod.InputType
import typings.ui5Webcomponents.ui5WebcomponentsStrings.Left
import typings.ui5Webcomponents.ui5WebcomponentsStrings.Right
import typings.ui5Webcomponents.ui5WebcomponentsStrings.any
import typings.ui5WebcomponentsBase.distTypesValueStateMod.ValueState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInputMod {
  
  /**
    * @class
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-input</code> component allows the user to enter and edit text or numeric values in one line.
    * <br>
    * Additionally, you can provide <code>suggestionItems</code>,
    * that are displayed in a popover right under the input.
    * <br><br>
    * The text field can be editable or read-only (<code>readonly</code> property),
    * and it can be enabled or disabled (<code>disabled</code> property).
    * To visualize semantic states, such as "error" or "warning", the <code>valueState</code> property is provided.
    * When the user makes changes to the text, the change event is fired,
    * which enables you to react on any text change.
    * <br><br>
    * <b>Note:</b> If you are using the <code>ui5-input</code> as a single npm module,
    * don't forget to import the <code>InputSuggestions</code> module from
    * "@ui5/webcomponents/dist/features/InputSuggestions.js"
    * to enable the suggestions functionality.
    *
    * <h3>Keyboard Handling</h3>
    * The <code>ui5-input</code> provides the following keyboard shortcuts:
    * <br>
    *
    * <ul>
    * <li>[ESC] - Closes the suggestion list, if open. If closed or not enabled, cancels changes and reverts to the value which the Input field had when it got the focus.</li>
    * <li>[ENTER] or [RETURN] - If suggestion list is open takes over the current matching item and closes it. If value state or group header is focused, does nothing.</li>
    * <li>[DOWN] - Focuses the next matching item in the suggestion list.</li>
    * <li>[UP] - Focuses the previous matching item in the suggestion list.</li>
    * <li>[HOME] - If focus is in the text input, moves caret before the first character. If focus is in the list, highlights the first item and updates the input accordingly.</li>
    * <li>[END] - If focus is in the text input, moves caret after the last character. If focus is in the list, highlights the last item and updates the input accordingly.</li>
    * <li>[PAGEUP] - If focus is in the list, moves highlight up by page size (10 items by default). If focus is in the input, does nothing.</li>
    * <li>[PAGEDOWN] - If focus is in the list, moves highlight down by page size (10 items by default). If focus is in the input, does nothing.</li>
    * </ul>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/Input.js";</code>
    * <br>
    * <code>import "@ui5/webcomponents/dist/features/InputSuggestions.js";</code> (optional - for input suggestions support)
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.Input
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-input
    * @appenddocs SuggestionItem SuggestionGroupItem
    * @implements sap.ui.webc.main.IInput
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/Input", JSImport.Default)
  @js.native
  open class default () extends Input
  object default {
    
    @JSImport("@ui5/webcomponents/dist/Input", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/Input", "default.i18nBundle")
    @js.native
    def i18nBundle: typings.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: typings.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def onDefine(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("onDefine")().asInstanceOf[js.Promise[Unit]]
  }
  
  @js.native
  sealed trait INPUT_ACTIONS extends StObject
  @JSImport("@ui5/webcomponents/dist/Input", "INPUT_ACTIONS")
  @js.native
  object INPUT_ACTIONS extends StObject {
    
    @js.native
    sealed trait ACTION_ENTER
      extends StObject
         with INPUT_ACTIONS
    
    @js.native
    sealed trait ACTION_USER_INPUT
      extends StObject
         with INPUT_ACTIONS
  }
  
  trait AccInfo extends StObject {
    
    var ariaAutoComplete: js.UndefOr[String] = js.undefined
    
    var ariaControls: js.UndefOr[String] = js.undefined
    
    var ariaDescribedBy: js.UndefOr[String] = js.undefined
    
    var ariaDescription: js.UndefOr[String] = js.undefined
    
    var ariaExpanded: js.UndefOr[String] = js.undefined
    
    var ariaHasPopup: js.UndefOr[String] = js.undefined
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var ariaRoledescription: js.UndefOr[String] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
  }
  object AccInfo {
    
    inline def apply(): AccInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccInfo] (val x: Self) extends AnyVal {
      
      inline def setAriaAutoComplete(value: String): Self = StObject.set(x, "ariaAutoComplete", value.asInstanceOf[js.Any])
      
      inline def setAriaAutoCompleteUndefined: Self = StObject.set(x, "ariaAutoComplete", js.undefined)
      
      inline def setAriaControls(value: String): Self = StObject.set(x, "ariaControls", value.asInstanceOf[js.Any])
      
      inline def setAriaControlsUndefined: Self = StObject.set(x, "ariaControls", js.undefined)
      
      inline def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaDescription(value: String): Self = StObject.set(x, "ariaDescription", value.asInstanceOf[js.Any])
      
      inline def setAriaDescriptionUndefined: Self = StObject.set(x, "ariaDescription", js.undefined)
      
      inline def setAriaExpanded(value: String): Self = StObject.set(x, "ariaExpanded", value.asInstanceOf[js.Any])
      
      inline def setAriaExpandedUndefined: Self = StObject.set(x, "ariaExpanded", js.undefined)
      
      inline def setAriaHasPopup(value: String): Self = StObject.set(x, "ariaHasPopup", value.asInstanceOf[js.Any])
      
      inline def setAriaHasPopupUndefined: Self = StObject.set(x, "ariaHasPopup", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setAriaRoledescription(value: String): Self = StObject.set(x, "ariaRoledescription", value.asInstanceOf[js.Any])
      
      inline def setAriaRoledescriptionUndefined: Self = StObject.set(x, "ariaRoledescription", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    }
  }
  
  /**
    * @class
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-input</code> component allows the user to enter and edit text or numeric values in one line.
    * <br>
    * Additionally, you can provide <code>suggestionItems</code>,
    * that are displayed in a popover right under the input.
    * <br><br>
    * The text field can be editable or read-only (<code>readonly</code> property),
    * and it can be enabled or disabled (<code>disabled</code> property).
    * To visualize semantic states, such as "error" or "warning", the <code>valueState</code> property is provided.
    * When the user makes changes to the text, the change event is fired,
    * which enables you to react on any text change.
    * <br><br>
    * <b>Note:</b> If you are using the <code>ui5-input</code> as a single npm module,
    * don't forget to import the <code>InputSuggestions</code> module from
    * "@ui5/webcomponents/dist/features/InputSuggestions.js"
    * to enable the suggestions functionality.
    *
    * <h3>Keyboard Handling</h3>
    * The <code>ui5-input</code> provides the following keyboard shortcuts:
    * <br>
    *
    * <ul>
    * <li>[ESC] - Closes the suggestion list, if open. If closed or not enabled, cancels changes and reverts to the value which the Input field had when it got the focus.</li>
    * <li>[ENTER] or [RETURN] - If suggestion list is open takes over the current matching item and closes it. If value state or group header is focused, does nothing.</li>
    * <li>[DOWN] - Focuses the next matching item in the suggestion list.</li>
    * <li>[UP] - Focuses the previous matching item in the suggestion list.</li>
    * <li>[HOME] - If focus is in the text input, moves caret before the first character. If focus is in the list, highlights the first item and updates the input accordingly.</li>
    * <li>[END] - If focus is in the text input, moves caret after the last character. If focus is in the list, highlights the last item and updates the input accordingly.</li>
    * <li>[PAGEUP] - If focus is in the list, moves highlight up by page size (10 items by default). If focus is in the input, does nothing.</li>
    * <li>[PAGEDOWN] - If focus is in the list, moves highlight down by page size (10 items by default). If focus is in the input, does nothing.</li>
    * </ul>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/Input.js";</code>
    * <br>
    * <code>import "@ui5/webcomponents/dist/features/InputSuggestions.js";</code> (optional - for input suggestions support)
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.Input
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-input
    * @appenddocs SuggestionItem SuggestionGroupItem
    * @implements sap.ui.webc.main.IInput
    * @public
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.std.EventTarget because Already inherited
  - scala.Any because Already inherited
  - typings.std.Node because Already inherited
  - scala.AnyRef because Already inherited
  - scala.Any because Already inherited
  - typings.std.Slottable because Already inherited
  - typings.std.NonDocumentTypeChildNode because Already inherited
  - typings.std.InnerHTML because Already inherited
  - typings.std.ChildNode because Already inherited
  - typings.std.Animatable because Already inherited
  - typings.std.ARIAMixin because Already inherited
  - js.Any because Already inherited
  - scala.AnyRef because Already inherited
  - typings.std.HTMLOrSVGElement because Already inherited
  - typings.std.GlobalEventHandlers because Already inherited
  - typings.std.ElementContentEditable because Already inherited
  - typings.std.ElementCSSInlineStyle because Already inherited
  - typings.std.DocumentAndElementEventHandlers because Already inherited
  - typings.std.Element because Already inherited
  - js.Object because Already inherited
  - js.Any because Already inherited
  - typings.std.HTMLElement because Already inherited
  - js.Object because Already inherited
  - typings.ui5WebcomponentsBase.distUi5elementMod.UI5Element because Already inherited
  - typings.ui5WebcomponentsBase.distUi5elementMod.default because Already inherited
  - typings.ui5Webcomponents.distFeaturesInputElementsFormSupportMod.IFormElement because var conflicts: __id, _changedState, _childChangeListeners, _doNotSyncAttributes, _domRefReadyPromise, _eventProvider, _fullyConnected, _getRealDomRef, _inDOM, _onComponentStateFinalized, _slotChangeListeners, _state, _suppressInvalidation, accessKey, ariaAtomic, ariaAutoComplete, ariaBusy, ariaChecked, ariaColCount, ariaColIndex, ariaColIndexText, ariaColSpan, ariaCurrent, ariaDisabled, ariaExpanded, ariaHasPopup, ariaHidden, ariaInvalid, ariaKeyShortcuts, ariaLabel, ariaLevel, ariaLive, ariaModal, ariaMultiLine, ariaMultiSelectable, ariaOrientation, ariaPlaceholder, ariaPosInSet, ariaPressed, ariaReadOnly, ariaRequired, ariaRoleDescription, ariaRowCount, ariaRowIndex, ariaRowIndexText, ariaRowSpan, ariaSelected, ariaSetSize, ariaSort, ariaValueMax, ariaValueMin, ariaValueNow, ariaValueText, autocapitalize, autofocus, className, contentEditable, dir, draggable, enterKeyHint, hidden, id, inert, innerHTML, innerText, inputMode, lang, nodeValue, nonce, onabort, onanimationcancel, onanimationend, onanimationiteration, onanimationstart, onauxclick, onbeforeinput, onblur, oncancel, oncanplay, oncanplaythrough, onchange, onclick, onclose, oncontextmenu, oncopy, oncuechange, oncut, ondblclick, ondrag, ondragend, ondragenter, ondragleave, ondragover, ondragstart, ondrop, ondurationchange, onemptied, onended, onerror, onfocus, onformdata, onfullscreenchange, onfullscreenerror, ongotpointercapture, oninput, oninvalid, onkeydown, onkeypress, onkeyup, onload, onloadeddata, onloadedmetadata, onloadstart, onlostpointercapture, onmousedown, onmouseenter, onmouseleave, onmousemove, onmouseout, onmouseover, onmouseup, onpaste, onpause, onplay, onplaying, onpointercancel, onpointerdown, onpointerenter, onpointerleave, onpointermove, onpointerout, onpointerover, onpointerup, onprogress, onratechange, onreset, onresize, onscroll, onsecuritypolicyviolation, onseeked, onseeking, onselect, onselectionchange, onselectstart, onslotchange, onstalled, onsubmit, onsuspend, ontimeupdate, ontoggle, ontouchcancel, ontouchend, ontouchmove, ontouchstart, ontransitioncancel, ontransitionend, ontransitionrun, ontransitionstart, onvolumechange, onwaiting, onwebkitanimationend, onwebkitanimationiteration, onwebkitanimationstart, onwebkittransitionend, onwheel, outerHTML, outerText, role, scrollLeft, scrollTop, slot, spellcheck, staticAreaItem, tabIndex, textContent, title, translate, value. Inlined name, disabled, required, multiple, checked */ @js.native
  trait Input extends SuggestionComponent {
    
    var FormSupport: js.UndefOr[
        Instantiable0[typings.ui5Webcomponents.distFeaturesInputElementsFormSupportMod.default] & TypeofFormSupportT
      ] = js.native
    
    var Suggestions: js.UndefOr[typings.ui5Webcomponents.distFeaturesInputSuggestionsMod.default] = js.native
    
    def _afterClosePopover(): Unit = js.native
    
    def _afterOpenPopover(): js.Promise[Unit] = js.native
    
    def _clear(): Unit = js.native
    
    var _clearIconClicked: js.UndefOr[Boolean] = js.native
    
    def _clearPopoverFocusAndSelection(): Unit = js.native
    
    def _click(): Unit = js.native
    
    def _closeRespPopover(): Unit = js.native
    
    /**
      * Determines whether to manually show the suggestions popover
      * @private
      */
    var _forceOpen: Boolean = js.native
    
    def _getFirstMatchingItem(current: String): js.UndefOr[typings.ui5Webcomponents.distSuggestionItemMod.default] = js.native
    
    def _getPopover(): js.Promise[typings.ui5Webcomponents.distPopoverMod.default] = js.native
    
    def _handleChange(): Unit = js.native
    
    def _handleDown(e: KeyboardEvent): Unit = js.native
    
    def _handleEnd(e: KeyboardEvent): Unit = js.native
    
    def _handleEnter(e: KeyboardEvent): Unit = js.native
    
    def _handleEscape(): Unit = js.native
    
    def _handleHome(e: KeyboardEvent): Unit = js.native
    
    def _handleInput(e: CustomEvent): Unit = js.native
    def _handleInput(e: InputEvent): Unit = js.native
    
    def _handlePageDown(e: KeyboardEvent): Unit = js.native
    
    def _handlePageUp(e: KeyboardEvent): Unit = js.native
    
    def _handleResize(): Unit = js.native
    
    def _handleResizeBound(): Unit = js.native
    
    def _handleSpace(e: KeyboardEvent): Unit = js.native
    
    def _handleTab(): Unit = js.native
    
    def _handleTypeAhead(item: typings.ui5Webcomponents.distSuggestionItemMod.default, filterValue: String): Unit = js.native
    
    def _handleUp(e: KeyboardEvent): Unit = js.native
    
    def _headerTitleText: String = js.native
    
    def _iconMouseDown(): Unit = js.native
    
    /**
      * Defines the inner stored value of the component.
      * <br><br>
      * <b>Note:</b> The property is updated upon typing. In some special cases the old value is kept (e.g. deleting the value after the dot in a float)
      *
      * @type {string}
      * @defaultvalue ""
      * @private
      */
    var _innerValue: String = js.native
    
    var _inputAccInfo: AccInfo = js.native
    
    var _inputIconFocused: Boolean = js.native
    
    var _inputWidth: js.UndefOr[Double] = js.native
    
    var _isKeyNavigation: js.UndefOr[Boolean] = js.native
    
    def _isPhone: Boolean = js.native
    
    var _isPopoverOpen: Boolean = js.native
    
    def _isSuggestionsFocused: js.UndefOr[Boolean] = js.native
    
    var _keepInnerValue: Boolean = js.native
    
    var _keyDown: js.UndefOr[Boolean] = js.native
    
    var _listWidth: js.UndefOr[Double] = js.native
    
    var _nativeInputAttributes: NativeInputAttributes = js.native
    
    def _onfocusin(e: FocusEvent): js.Promise[Unit] = js.native
    
    def _onfocusout(e: FocusEvent): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeyup(e: KeyboardEvent): Unit = js.native
    
    /**
      * Returns the placeholder value.
      * @protected
      */
    def _placeholder: String = js.native
    
    var _previewItem: js.UndefOr[typings.ui5Webcomponents.distSuggestionListItemMod.default] = js.native
    
    def _readonly: Boolean = js.native
    
    def _scroll(e: CustomEvent): Unit = js.native
    
    var _selectedText: js.UndefOr[String] = js.native
    
    var _shouldAutocomplete: js.UndefOr[Boolean] = js.native
    
    def _startsWithMatchingItems(str: String): js.Array[typings.ui5Webcomponents.distSuggestionItemMod.default] = js.native
    
    /**
      * This method is relevant for sap_horizon theme only
      */
    def _valueStateInputIcon: String = js.native
    
    /**
      * This method is relevant for sap_horizon theme only
      */
    def _valueStateMessageInputIcon: String = js.native
    
    def _valueStatePopoverHorizontalAlign: Left | Right = js.native
    
    def accInfo: typings.ui5Webcomponents.anon.Input = js.native
    
    /**
      * Defines the accessible ARIA name of the component.
      *
      * @type {string}
      * @name sap.ui.webc.main.Input.prototype.accessibleName
      * @public
      * @since 1.0.0-rc.15
      */
    var accessibleName: String = js.native
    
    /**
      * Receives id(or many ids) of the elements that label the input.
      *
      * @type {string}
      * @name sap.ui.webc.main.Input.prototype.accessibleNameRef
      * @defaultvalue ""
      * @public
      * @since 1.0.0-rc.15
      */
    var accessibleNameRef: String = js.native
    
    def announceSelectedItem(): Unit = js.native
    
    def ariaValueStateHiddenText: js.UndefOr[String] = js.native
    
    def availableSuggestionsCount: js.UndefOr[String] = js.native
    
    var checked: js.UndefOr[Boolean] = js.native
    
    def closePopover(): js.Promise[Unit] = js.native
    
    /**
      * Defines whether the component is in disabled state.
      * <br><br>
      * <b>Note:</b> A disabled component is completely noninteractive.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.Input.prototype.disabled
      * @defaultvalue false
      * @public
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Defines whether the clear icon is visible.
      *
      * @type {boolean}
      * @defaultvalue false
      * @private
      * @since 1.2.0
      */
    var effectiveShowClearIcon: Boolean = js.native
    
    def enableSuggestions(): Unit = js.native
    
    def fireEventByAction(action: INPUT_ACTIONS, e: InputEvent): js.Promise[Unit] = js.native
    
    var firstRendering: Boolean = js.native
    
    /**
      * The slot is used for native <code>input</code> HTML element to enable form submit,
      * when <code>name</code> property is set.
      * @type {HTMLElement[]}
      * @private
      */
    var formSupport: js.Array[HTMLElement] = js.native
    
    /**
      * Returns the caret position inside the native input
      * @protected
      */
    def getCaretPosition(): Double | Null = js.native
    
    def getInputDOMRef(): js.Promise[HTMLInputElement | Input | Null] = js.native
    
    def getInputDOMRefSync(): HTMLInputElement | Null = js.native
    
    def getInputId(): String = js.native
    
    def getInputValue(): js.Promise[String] = js.native
    
    def getLabelableElementId(): String = js.native
    
    def getSuggestionByListItem(item: typings.ui5Webcomponents.distSuggestionListItemMod.default): typings.ui5Webcomponents.distSuggestionItemMod.default = js.native
    
    def hasValueState: Boolean = js.native
    
    @JSName("hasValueStateMessage")
    def hasValueStateMessage_MInput: Boolean = js.native
    
    /**
      * Defines if characters within the suggestions are to be highlighted
      * in case the input value matches parts of the suggestions text.
      * <br><br>
      * <b>Note:</b> takes effect when <code>showSuggestions</code> is set to <code>true</code>
      *
      * @type {boolean}
      * @defaultvalue false
      * @private
      * @sicne 1.0.0-rc.8
      */
    var highlight: Boolean = js.native
    
    /**
      * Defines the icon to be displayed in the component.
      *
      * @type {sap.ui.webc.main.IIcon[]}
      * @name sap.ui.webc.main.Input.prototype.icon
      * @slot
      * @public
      */
    var icon: js.Array[typings.ui5Webcomponents.distIconMod.default] = js.native
    
    def inputType: String = js.native
    
    /**
      * Returns if the suggestions popover is scrollable.
      * The method returns <code>Promise</code> that resolves to true,
      * if the popup is scrollable and false otherwise.
      * @returns {Promise}
      */
    def isSuggestionsScrollable(): js.Promise[Boolean] = js.native
    
    def isTypeNumber: Boolean = js.native
    
    var isTyping: Boolean = js.native
    
    /**
      * Checks if the value state popover is open.
      * @returns {boolean} true if the value state popover is open, false otherwise
      */
    def isValueStateOpened(): Boolean = js.native
    
    def itemSelectionAnnounce: String = js.native
    
    var lastConfirmedValue: String = js.native
    
    /**
      * Sets the maximum number of characters available in the input field.
      * <br><br>
      * <b>Note:</b> This property is not compatible with the ui5-input type InputType.Number. If the ui5-input type is set to Number, the maxlength value is ignored.
      * @type {sap.ui.webc.base.types.Integer}
      * @name sap.ui.webc.main.Input.prototype.maxlength
      * @since 1.0.0-rc.5
      * @public
      */
    var maxlength: js.UndefOr[Double] = js.native
    
    var multiple: js.UndefOr[Boolean] = js.native
    
    /**
      * Determines the name with which the component will be submitted in an HTML form.
      *
      * <br><br>
      * <b>Important:</b> For the <code>name</code> property to have effect, you must add the following import to your project:
      * <code>import "@ui5/webcomponents/dist/features/InputElementsFormSupport.js";</code>
      *
      * <br><br>
      * <b>Note:</b> When set, a native <code>input</code> HTML element
      * will be created inside the component so that it can be submitted as
      * part of an HTML form. Do not use this property unless you need to submit a form.
      *
      * @type {string}
      * @name sap.ui.webc.main.Input.prototype.name
      * @defaultvalue ""
      * @public
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * Returns a reference to the native input element
      * @protected
      */
    def nativeInput: HTMLInputElement | Null = js.native
    
    def nativeInputAttributes: Max = js.native
    
    def nativeInputWidth: Double = js.native
    
    /**
      * Defines whether the value will be autcompleted to match an item
      *
      * @type {boolean}
      * @name sap.ui.webc.main.Input.prototype.noTypeahead
      * @defaultvalue false
      * @public
      * @since 1.4.0
      */
    var noTypeahead: Boolean = js.native
    
    def onItemMouseDown(e: MouseEvent): Unit = js.native
    
    var openOnMobile: Boolean = js.native
    
    /**
      * Manually opens the suggestions popover, assuming suggestions are enabled. Items must be preloaded for it to open.
      * @public
      * @method
      * @name sap.ui.webc.main.Input#openPicker
      * @return {void}
      * @since 1.3.0
      */
    def openPicker(): Unit = js.native
    
    def openPopover(): js.Promise[Unit] = js.native
    
    /**
      * Defines a short hint intended to aid the user with data entry when the
      * component has no value.
      * @type {string}
      * @name sap.ui.webc.main.Input.prototype.placeholder
      * @defaultvalue ""
      * @public
      */
    var placeholder: String = js.native
    
    /**
      * The suggestion item on preview.
      * @type {sap.ui.webc.main.IInputSuggestionItem | null}
      * @name sap.ui.webc.main.Input.prototype.previewItem
      * @readonly
      * @public
      */
    def previewItem: typings.ui5Webcomponents.distSuggestionItemMod.default | Null = js.native
    
    def previewSuggestion(item: typings.ui5Webcomponents.distSuggestionListItemMod.default): Unit = js.native
    
    var previousValue: String = js.native
    
    /**
      * Defines whether the component is read-only.
      * <br><br>
      * <b>Note:</b> A read-only component is not editable,
      * but still provides visual feedback upon user interaction.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.Input.prototype.readonly
      * @defaultvalue false
      * @public
      */
    var readonly: Boolean = js.native
    
    /**
      * Removes the fractional part of floating-point number.
      * @param {string} value the numeric value of Input of type "Number"
      */
    def removeFractionalPart(value: String): String = js.native
    
    /**
      * Defines whether the component is required.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.Input.prototype.required
      * @defaultvalue false
      * @public
      * @since 1.0.0-rc.3
      */
    var required: js.UndefOr[Boolean] = js.native
    
    def selectSuggestion(item: typings.ui5Webcomponents.distSuggestionItemMod.default, keyboardUsed: Boolean): Unit = js.native
    
    /**
      * Sets the caret to a certain position inside the native input
      * @protected
      * @param pos
      */
    def setCaretPosition(): Unit = js.native
    def setCaretPosition(pos: Double): Unit = js.native
    
    def shouldDisplayDefaultValueStateMessage: Boolean = js.native
    
    def shouldDisplayOnlyValueStateMessage: Boolean = js.native
    
    /**
      * Defines whether the clear icon of the input will be shown.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.Input.prototype.showClearIcon
      * @defaultvalue false
      * @public
      * @since 1.2.0
      */
    var showClearIcon: Boolean = js.native
    
    /**
      * Defines whether the component should show suggestions, if such are present.
      * <br><br>
      * <b>Note:</b> You need to import the <code>InputSuggestions</code> module
      * from <code>"@ui5/webcomponents/dist/features/InputSuggestions.js"</code> to enable this functionality.
      * @type {boolean}
      * @name sap.ui.webc.main.Input.prototype.showSuggestions
      * @defaultvalue false
      * @public
      */
    var showSuggestions: Boolean = js.native
    
    def step: js.UndefOr[any] = js.native
    
    def styles: InnerInput = js.native
    
    var suggestionSelectionCanceled: Boolean = js.native
    
    def suggestionSeparators: String = js.native
    
    def suggestionsText: String = js.native
    
    def suggestionsTextId: String = js.native
    
    var suggestionsTexts: js.Array[InputSuggestionText] = js.native
    
    /**
      * Defines the HTML type of the component.
      * Available options are: <code>Text</code>, <code>Email</code>,
      * <code>Number</code>, <code>Password</code>, <code>Tel</code>, and <code>URL</code>.
      * <br><br>
      * <b>Notes:</b>
      * <ul>
      * <li>The particular effect of this property differs depending on the browser
      * and the current language settings, especially for type <code>Number</code>.</li>
      * <li>The property is mostly intended to be used with touch devices
      * that use different soft keyboard layouts depending on the given input type.</li>
      * </ul>
      *
      * @type {sap.ui.webc.main.types.InputType}
      * @name sap.ui.webc.main.Input.prototype.type
      * @defaultvalue "Text"
      * @public
      */
    var `type`: InputType = js.native
    
    /**
      * Updates the input value on item preview.
      * @param {Object} item The item that is on preview
      */
    def updateValueOnPreview(item: typings.ui5Webcomponents.distSuggestionListItemMod.default): Unit = js.native
    
    var valueBeforeItemPreview: String = js.native
    
    var valueBeforeItemSelection: String = js.native
    
    /**
      * Defines the value state of the component.
      * <br><br>
      * Available options are:
      * <ul>
      * <li><code>None</code></li>
      * <li><code>Error</code></li>
      * <li><code>Warning</code></li>
      * <li><code>Success</code></li>
      * <li><code>Information</code></li>
      * </ul>
      *
      * @type {sap.ui.webc.base.types.ValueState}
      * @name sap.ui.webc.main.Input.prototype.valueState
      * @defaultvalue "None"
      * @public
      */
    var valueState: ValueState = js.native
    
    /**
      * Defines the value state message that will be displayed as pop up under the component.
      * <br><br>
      *
      * <b>Note:</b> If not specified, a default text (in the respective language) will be displayed.
      * <br><br>
      * <b>Note:</b> The <code>valueStateMessage</code> would be displayed,
      * when the component is in <code>Information</code>, <code>Warning</code> or <code>Error</code> value state.
      * <br><br>
      * <b>Note:</b> If the component has <code>suggestionItems</code>,
      * the <code>valueStateMessage</code> would be displayed as part of the same popover, if used on desktop, or dialog - on phone.
      * @type {HTMLElement[]}
      * @name sap.ui.webc.main.Input.prototype.valueStateMessage
      * @since 1.0.0-rc.6
      * @slot
      * @public
      */
    var valueStateMessage: js.Array[HTMLElement] = js.native
    
    def valueStateMessageText: js.Array[Node] = js.native
    
    def valueStateText: js.UndefOr[String] = js.native
    
    def valueStateTextId: String = js.native
    
    def valueStateTextMappings(): Information = js.native
    
    def valueStateTypeMappings: Information = js.native
  }
  
  trait InputEventDetail extends StObject {
    
    var inputType: js.UndefOr[String] = js.undefined
  }
  object InputEventDetail {
    
    inline def apply(): InputEventDetail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputEventDetail] (val x: Self) extends AnyVal {
      
      inline def setInputType(value: String): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
      
      inline def setInputTypeUndefined: Self = StObject.set(x, "inputType", js.undefined)
    }
  }
  
  trait NativeInputAttributes extends StObject {
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
  }
  object NativeInputAttributes {
    
    inline def apply(): NativeInputAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NativeInputAttributes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NativeInputAttributes] (val x: Self) extends AnyVal {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
}
