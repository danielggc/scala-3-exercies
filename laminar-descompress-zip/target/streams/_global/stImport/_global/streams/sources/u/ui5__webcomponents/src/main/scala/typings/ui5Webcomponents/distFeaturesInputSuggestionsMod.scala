package typings.ui5Webcomponents

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import typings.ui5Webcomponents.anon.PreventFocusRestore
import typings.ui5Webcomponents.distTypesListItemTypeMod.ListItemType
import typings.ui5WebcomponentsBase.distTypesValueStateMod.ValueState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFeaturesInputSuggestionsMod {
  
  /**
    * A class to manage the <code>Input</code suggestion items.
    *
    * @class
    * @private
    * @author SAP SE
    */
  @JSImport("@ui5/webcomponents/dist/features/InputSuggestions", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Suggestions {
    def this(component: SuggestionComponent, slotName: String, highlight: Boolean, handleFocus: Boolean) = this()
  }
  object default {
    
    @JSImport("@ui5/webcomponents/dist/features/InputSuggestions", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/features/InputSuggestions", "default.SCROLL_STEP")
    @js.native
    def SCROLL_STEP: Double = js.native
    inline def SCROLL_STEP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCROLL_STEP")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/features/InputSuggestions", "default.i18nBundle")
    @js.native
    def i18nBundle: typings.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: typings.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def init(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[js.Promise[Unit]]
  }
  
  trait InputSuggestionText extends StObject {
    
    var additionalText: js.UndefOr[String] = js.undefined
    
    var additionalTextState: ValueState
    
    var description: String
    
    var groupItem: Boolean
    
    var icon: js.UndefOr[String] = js.undefined
    
    var image: js.UndefOr[String] = js.undefined
    
    var key: Double
    
    var text: String
    
    var `type`: ListItemType
  }
  object InputSuggestionText {
    
    inline def apply(
      additionalTextState: ValueState,
      description: String,
      groupItem: Boolean,
      key: Double,
      text: String,
      `type`: ListItemType
    ): InputSuggestionText = {
      val __obj = js.Dynamic.literal(additionalTextState = additionalTextState.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], groupItem = groupItem.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputSuggestionText]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputSuggestionText] (val x: Self) extends AnyVal {
      
      inline def setAdditionalText(value: String): Self = StObject.set(x, "additionalText", value.asInstanceOf[js.Any])
      
      inline def setAdditionalTextState(value: ValueState): Self = StObject.set(x, "additionalTextState", value.asInstanceOf[js.Any])
      
      inline def setAdditionalTextUndefined: Self = StObject.set(x, "additionalText", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setGroupItem(value: Boolean): Self = StObject.set(x, "groupItem", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setType(value: ListItemType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SuggestionComponent
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    var _isValueStateFocused: Boolean = js.native
    
    var focused: Boolean = js.native
    
    var hasSuggestionItemSelected: Boolean = js.native
    
    var hasValueStateMessage: Boolean = js.native
    
    def onItemMouseOut(e: MouseEvent): Unit = js.native
    
    def onItemMouseOver(e: MouseEvent): Unit = js.native
    
    def onItemPreviewed(item: typings.ui5Webcomponents.distSuggestionListItemMod.default): Unit = js.native
    
    def onItemSelected(pressedItem: typings.ui5Webcomponents.distSuggestionItemMod.default, keyboardUsed: Boolean): Unit = js.native
    
    var open: Boolean = js.native
    
    var suggestionItems: js.Array[typings.ui5Webcomponents.distSuggestionItemMod.default] = js.native
    
    var typedInValue: String = js.native
    
    var value: String = js.native
  }
  
  /**
    * A class to manage the <code>Input</code suggestion items.
    *
    * @class
    * @private
    * @author SAP SE
    */
  @js.native
  trait Suggestions extends StObject {
    
    def _applyFocus(): Unit = js.native
    
    def _attachItemsListeners(): js.Promise[Unit] = js.native
    
    def _attachPopupListeners(): Unit = js.native
    
    def _beforeOpen(): Unit = js.native
    
    def _clearItemFocus(): Unit = js.native
    
    def _clearValueStateFocus(): Unit = js.native
    
    def _deselectItems(): Unit = js.native
    
    def _focusValueState(): Unit = js.native
    
    def _getComponent(): SuggestionComponent = js.native
    
    def _getItems(): js.Array[typings.ui5Webcomponents.distSuggestionListItemMod.default] = js.native
    
    def _getList(): js.Promise[typings.ui5Webcomponents.distListMod.default] = js.native
    
    def _getListWidth(): js.Promise[Double] = js.native
    
    def _getRealItems(): js.Array[typings.ui5Webcomponents.distSuggestionItemMod.default] = js.native
    
    def _getScrollContainer(): js.Promise[HTMLElement] = js.native
    
    def _getSuggestionPopover(): js.Promise[typings.ui5Webcomponents.distResponsivePopoverMod.default] = js.native
    
    def _handleItemNavigation(forward: Boolean): Unit = js.native
    
    var _handledPress: js.UndefOr[Boolean] = js.native
    
    def _hasValueState: Boolean = js.native
    
    def _isGroupOrInactiveItem: Boolean = js.native
    
    def _isItemIntoView(item: typings.ui5Webcomponents.distSuggestionListItemMod.default): Boolean = js.native
    
    def _isItemOnTarget(): Boolean = js.native
    
    def _isScrollable(): js.Promise[Boolean] = js.native
    
    def _moveItemSelection(previousIdx: Double, nextIdx: Double): Unit = js.native
    
    def _onClose(): Unit = js.native
    
    def _onOpen(): Unit = js.native
    
    var _scrollContainer: js.UndefOr[HTMLElement] = js.native
    
    def _scrollItemIntoView(item: typings.ui5Webcomponents.distSuggestionListItemMod.default): js.Promise[Unit] = js.native
    
    def _selectNextItem(): Unit = js.native
    
    def _selectPreviousItem(): Unit = js.native
    
    var accInfo: js.UndefOr[SuggestionsAccInfo] = js.native
    
    var attachedAfterClose: js.UndefOr[Boolean] = js.native
    
    var attachedAfterOpened: js.UndefOr[Boolean] = js.native
    
    def close(): js.Promise[Unit] = js.native
    def close(preventFocusRestore: Boolean): js.Promise[Unit] = js.native
    
    var component: SuggestionComponent = js.native
    
    def defaultSlotProperties(hightlightValue: String): js.Array[InputSuggestionText] = js.native
    
    def fnOnSuggestionItemMouseOut(e: MouseEvent): Unit = js.native
    
    def fnOnSuggestionItemMouseOver(e: MouseEvent): Unit = js.native
    
    def fnOnSuggestionItemPress(e: CustomEvent): Unit = js.native
    
    def getHighlightedDesc(suggestion: typings.ui5Webcomponents.distSuggestionItemMod.default, input: String): String = js.native
    
    def getHighlightedText(suggestion: typings.ui5Webcomponents.distSuggestionItemMod.default, input: String): String = js.native
    
    def getRowDesc(suggestion: typings.ui5Webcomponents.distSuggestionItemMod.default): String = js.native
    
    def getRowText(suggestion: typings.ui5Webcomponents.distSuggestionItemMod.default): String = js.native
    
    var handleFocus: Boolean = js.native
    
    var highlight: Boolean = js.native
    
    def hightlightInput(text: String, input: String): String = js.native
    
    def isOpened(): Boolean = js.native
    
    def itemSelectionAnnounce: String = js.native
    
    def onDown(e: KeyboardEvent): Boolean = js.native
    
    def onEnd(e: KeyboardEvent): Boolean = js.native
    
    def onEnter(e: KeyboardEvent): Boolean = js.native
    
    def onHome(e: KeyboardEvent): Boolean = js.native
    
    def onItemMouseOut(e: MouseEvent): Unit = js.native
    
    def onItemMouseOver(e: MouseEvent): Unit = js.native
    
    def onItemPress(e: CustomEvent): Unit = js.native
    
    def onItemPreviewed(item: typings.ui5Webcomponents.distSuggestionListItemMod.default): Unit = js.native
    
    def onItemSelected(selectedItem: Null, keyboardUsed: Boolean): Unit = js.native
    def onItemSelected(selectedItem: typings.ui5Webcomponents.distSuggestionListItemMod.default, keyboardUsed: Boolean): Unit = js.native
    
    def onPageDown(e: KeyboardEvent): Boolean = js.native
    
    def onPageUp(e: KeyboardEvent): Boolean = js.native
    
    def onSpace(e: KeyboardEvent): Boolean = js.native
    
    def onTab(): Boolean = js.native
    
    def onUp(e: KeyboardEvent): Boolean = js.native
    
    def open(): Unit = js.native
    
    var responsivePopover: js.UndefOr[typings.ui5Webcomponents.distResponsivePopoverMod.default] = js.native
    
    def sanitizeText(text: String): String = js.native
    
    var selectedItemIndex: Double = js.native
    
    var slotName: String = js.native
    
    def toggle(bToggle: Boolean, options: PreventFocusRestore): Unit = js.native
    
    def updateSelectedItemPosition(pos: Double): Unit = js.native
  }
  
  trait SuggestionsAccInfo extends StObject {
    
    var currentPos: Double
    
    var itemText: String
    
    var listSize: Double
  }
  object SuggestionsAccInfo {
    
    inline def apply(currentPos: Double, itemText: String, listSize: Double): SuggestionsAccInfo = {
      val __obj = js.Dynamic.literal(currentPos = currentPos.asInstanceOf[js.Any], itemText = itemText.asInstanceOf[js.Any], listSize = listSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuggestionsAccInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SuggestionsAccInfo] (val x: Self) extends AnyVal {
      
      inline def setCurrentPos(value: Double): Self = StObject.set(x, "currentPos", value.asInstanceOf[js.Any])
      
      inline def setItemText(value: String): Self = StObject.set(x, "itemText", value.asInstanceOf[js.Any])
      
      inline def setListSize(value: Double): Self = StObject.set(x, "listSize", value.asInstanceOf[js.Any])
    }
  }
}
