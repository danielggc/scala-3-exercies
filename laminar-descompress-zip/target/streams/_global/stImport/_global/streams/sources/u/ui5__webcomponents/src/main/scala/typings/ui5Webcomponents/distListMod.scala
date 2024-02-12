package typings.ui5Webcomponents

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.Element
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import typings.std.IntersectionObserver
import typings.std.IntersectionObserverEntry
import typings.ui5Webcomponents.anon.BusyInd
import typings.ui5Webcomponents.distTypesListGrowingModeMod.ListGrowingMode
import typings.ui5Webcomponents.distTypesListModeMod.ListMode
import typings.ui5Webcomponents.distTypesListSeparatorsMod.ListSeparators
import typings.ui5Webcomponents.ui5WebcomponentsBooleans.`false`
import typings.ui5Webcomponents.ui5WebcomponentsStrings.absolute
import typings.ui5Webcomponents.ui5WebcomponentsStrings.sticky
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distListMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-list</code> component allows displaying a list of items, advanced keyboard
    * handling support for navigating between items, and predefined modes to improve the development efficiency.
    * <br><br>
    * The <code>ui5-list</code> is a container for the available list items:
    * <ul>
    * <li><code>ui5-li</code></li>
    * <li><code>ui5-li-custom</code></li>
    * <li><code>ui5-li-groupheader</code></li>
    * </ul>
    * <br><br>
    * To benefit from the built-in selection mechanism, you can use the available
    * selection modes, such as
    * <code>SingleSelect</code>, <code>MultiSelect</code> and <code>Delete</code>.
    * <br><br>
    * Additionally, the <code>ui5-list</code> provides header, footer, and customization for the list item separators.
    *
    * <br><br>
    * <h3>Keyboard Handling</h3>
    *
    * <h4>Basic Navigation</h4>
    * The <code>ui5-list</code> provides advanced keyboard handling.
    * When a list is focused the user can use the following keyboard
    * shortcuts in order to perform a navigation:
    * <br>
    *
    * <ul>
    * <li>[UP/DOWN] - Navigates up and down the items</li>
    * <li>[HOME] - Navigates to first item</li>
    * <li>[END] - Navigates to the last item</li>
    * </ul>
    *
    * The user can use the following keyboard shortcuts to perform actions (such as select, delete),
    * when the <code>mode</code> property is in use:
    * <ul>
    * <li>[SPACE] - Select an item (if <code>type</code> is 'Active') when <code>mode</code> is selection</li>
    * <li>[DELETE] - Delete an item if <code>mode</code> property is <code>Delete</code></li>
    * </ul>
    *
    * <h4>Fast Navigation</h4>
    * This component provides a build in fast navigation group which can be used via <code>F6 / Shift + F6</code> or <code> Ctrl + Alt(Option) + Down /  Ctrl + Alt(Option) + Up</code>.
    * In order to use this functionality, you need to import the following module:
    * <code>import "@ui5/webcomponents-base/dist/features/F6Navigation.js"</code>
    * <br><br>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/List.js";</code>
    * <br>
    * <code>import "@ui5/webcomponents/dist/StandardListItem.js";</code> (for <code>ui5-li</code>)
    * <br>
    * <code>import "@ui5/webcomponents/dist/CustomListItem.js";</code> (for <code>ui5-li-custom</code>)
    * <br>
    * <code>import "@ui5/webcomponents/dist/GroupHeaderListItem.js";</code> (for <code>ui5-li-groupheader</code>)
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.List
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-list
    * @appenddocs StandardListItem CustomListItem GroupHeaderListItem
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/List", JSImport.Default)
  @js.native
  open class default ()
    extends typings.ui5Webcomponents.distListMod.List
  object default {
    
    @JSImport("@ui5/webcomponents/dist/List", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/List", "default.i18nBundle")
    @js.native
    def i18nBundle: typings.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: typings.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def onDefine(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("onDefine")().asInstanceOf[js.Promise[Unit]]
  }
  
  type ClickEventDetail = CloseEventDetail
  
  trait CloseEventDetail extends StObject {
    
    var item: typings.ui5Webcomponents.distListItemBaseMod.default
  }
  object CloseEventDetail {
    
    inline def apply(item: typings.ui5Webcomponents.distListItemBaseMod.default): CloseEventDetail = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloseEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloseEventDetail] (val x: Self) extends AnyVal {
      
      inline def setItem(value: typings.ui5Webcomponents.distListItemBaseMod.default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  type DeleteEventDetail = FocusEventDetail
  
  trait FocusEventDetail extends StObject {
    
    var item: typings.ui5Webcomponents.distListItemBaseMod.default
  }
  object FocusEventDetail {
    
    inline def apply(item: typings.ui5Webcomponents.distListItemBaseMod.default): FocusEventDetail = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[FocusEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FocusEventDetail] (val x: Self) extends AnyVal {
      
      inline def setItem(value: typings.ui5Webcomponents.distListItemBaseMod.default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-list</code> component allows displaying a list of items, advanced keyboard
    * handling support for navigating between items, and predefined modes to improve the development efficiency.
    * <br><br>
    * The <code>ui5-list</code> is a container for the available list items:
    * <ul>
    * <li><code>ui5-li</code></li>
    * <li><code>ui5-li-custom</code></li>
    * <li><code>ui5-li-groupheader</code></li>
    * </ul>
    * <br><br>
    * To benefit from the built-in selection mechanism, you can use the available
    * selection modes, such as
    * <code>SingleSelect</code>, <code>MultiSelect</code> and <code>Delete</code>.
    * <br><br>
    * Additionally, the <code>ui5-list</code> provides header, footer, and customization for the list item separators.
    *
    * <br><br>
    * <h3>Keyboard Handling</h3>
    *
    * <h4>Basic Navigation</h4>
    * The <code>ui5-list</code> provides advanced keyboard handling.
    * When a list is focused the user can use the following keyboard
    * shortcuts in order to perform a navigation:
    * <br>
    *
    * <ul>
    * <li>[UP/DOWN] - Navigates up and down the items</li>
    * <li>[HOME] - Navigates to first item</li>
    * <li>[END] - Navigates to the last item</li>
    * </ul>
    *
    * The user can use the following keyboard shortcuts to perform actions (such as select, delete),
    * when the <code>mode</code> property is in use:
    * <ul>
    * <li>[SPACE] - Select an item (if <code>type</code> is 'Active') when <code>mode</code> is selection</li>
    * <li>[DELETE] - Delete an item if <code>mode</code> property is <code>Delete</code></li>
    * </ul>
    *
    * <h4>Fast Navigation</h4>
    * This component provides a build in fast navigation group which can be used via <code>F6 / Shift + F6</code> or <code> Ctrl + Alt(Option) + Down /  Ctrl + Alt(Option) + Up</code>.
    * In order to use this functionality, you need to import the following module:
    * <code>import "@ui5/webcomponents-base/dist/features/F6Navigation.js"</code>
    * <br><br>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/List.js";</code>
    * <br>
    * <code>import "@ui5/webcomponents/dist/StandardListItem.js";</code> (for <code>ui5-li</code>)
    * <br>
    * <code>import "@ui5/webcomponents/dist/CustomListItem.js";</code> (for <code>ui5-li-custom</code>)
    * <br>
    * <code>import "@ui5/webcomponents/dist/GroupHeaderListItem.js";</code> (for <code>ui5-li-groupheader</code>)
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.List
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-list
    * @appenddocs StandardListItem CustomListItem GroupHeaderListItem
    * @public
    */
  @js.native
  trait List
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    var _afterElement: js.UndefOr[HTMLElement | Null] = js.native
    
    var _beforeElement: js.UndefOr[HTMLElement | Null] = js.native
    
    var _forwardingFocus: Boolean = js.native
    
    def _growingButtonText: String = js.native
    
    def _handleResize(): Unit = js.native
    
    def _handleTabNext(e: KeyboardEvent): Unit = js.native
    
    /**
      * Defines if the entire list is in view port.
      * @private
      */
    var _inViewport: Boolean = js.native
    
    var _itemNavigation: typings.ui5WebcomponentsBase.distDelegateItemNavigationMod.default = js.native
    
    /**
      * Defines the active state of the <code>More</code> button.
      * @private
      */
    var _loadMoreActive: Boolean = js.native
    
    def _onLoadMoreClick(): Unit = js.native
    
    def _onLoadMoreKeydown(e: KeyboardEvent): Unit = js.native
    
    def _onLoadMoreKeyup(e: KeyboardEvent): Unit = js.native
    
    def _onLoadMoreMousedown(): Unit = js.native
    
    def _onLoadMoreMouseup(): Unit = js.native
    
    def _onfocusin(e: FocusEvent): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    var _previouslyFocusedItem: typings.ui5Webcomponents.distListItemBaseMod.default | Null = js.native
    
    var _selectionRequested: js.UndefOr[Boolean] = js.native
    
    /**
      * Defines the accessible name of the component.
      *
      * @type {string}
      * @name sap.ui.webc.main.List.prototype.accessibleName
      * @defaultvalue ""
      * @public
      * @since 1.0.0-rc.15
      */
    var accessibleName: String = js.native
    
    /**
      * Defines the IDs of the elements that label the input.
      *
      * @type {string}
      * @name sap.ui.webc.main.List.prototype.accessibleNameRef
      * @defaultvalue ""
      * @public
      * @since 1.0.0-rc.15
      */
    var accessibleNameRef: String = js.native
    
    /**
      * Defines the accessible role of the component.
      * <br><br>
      * @public
      * @type {string}
      * @name sap.ui.webc.main.List.prototype.accessibleRole
      * @defaultvalue "list"
      * @since 1.0.0-rc.15
      */
    var accessibleRole: String = js.native
    
    /**
      * Defines the description for the accessible role of the component.
      * @protected
      * @type {string}
      * @name sap.ui.webc.main.List.prototype.accessibleRoleDescription
      * @defaultvalue undefined
      * @since 1.10.0
      */
    var accessibleRoleDescription: js.UndefOr[String] = js.native
    
    def ariaLabelModeText: String = js.native
    
    def ariaLabelTxt: js.UndefOr[String] = js.native
    
    def ariaLabelledBy: js.UndefOr[String] = js.native
    
    def attachForResize(): Unit = js.native
    
    /**
      * Defines if the component would display a loading indicator over the list.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.List.prototype.busy
      * @defaultvalue false
      * @public
      * @since 1.0.0-rc.6
      */
    var busy: Boolean = js.native
    
    /**
      * Defines the delay in milliseconds, after which the busy indicator will show up for this component.
      *
      * @type {sap.ui.webc.base.types.Integer}
      * @name sap.ui.webc.main.List.prototype.busyDelay
      * @defaultValue 1000
      * @public
      */
    var busyDelay: Double = js.native
    
    def busyIndPosition: absolute | sticky = js.native
    
    def checkListInViewport(): Unit = js.native
    
    def deselectSelectedItems(): Unit = js.native
    
    def focusAfterElement(): Unit = js.native
    
    def focusBeforeElement(): Unit = js.native
    
    /**
      * Focuses the first list item and sets its tabindex to "0" via the ItemNavigation
      * @protected
      */
    def focusFirstItem(): Unit = js.native
    
    def focusFirstSelectedItem(): Unit = js.native
    
    def focusGrowingButton(): Unit = js.native
    
    /**
      * Focuses a list item and sets its tabindex to "0" via the ItemNavigation
      * @protected
      * @param item
      */
    def focusItem(item: typings.ui5Webcomponents.distListItemBaseMod.default): Unit = js.native
    
    def focusPreviouslyFocusedItem(): Unit = js.native
    
    /**
      * Defines the footer text.
      *
      * @type {string}
      * @name sap.ui.webc.main.List.prototype.footerText
      * @defaultvalue ""
      * @public
      */
    var footerText: String = js.native
    
    def getAfterElement(): HTMLElement = js.native
    
    def getBeforeElement(): HTMLElement = js.native
    
    def getEnabledItems(): js.Array[typings.ui5Webcomponents.distListItemBaseMod.default] = js.native
    
    def getFirstItem(filter: js.Function1[/* item */ typings.ui5Webcomponents.distListItemBaseMod.default, Boolean]): typings.ui5Webcomponents.distListItemBaseMod.default | Null = js.native
    
    def getForwardingFocus(): Boolean = js.native
    
    def getGrowingButton(): HTMLElement = js.native
    
    def getIntersectionObserver(): IntersectionObserver = js.native
    
    def getItems(): js.Array[typings.ui5Webcomponents.distListItemBaseMod.default] = js.native
    
    def getItemsForProcessing(): js.Array[typings.ui5Webcomponents.distListItemBaseMod.default] = js.native
    
    def getPreviouslyFocusedItem(): typings.ui5Webcomponents.distListItemBaseMod.default | Null = js.native
    
    def getSelectedItems(): js.Array[typings.ui5Webcomponents.distListItemBaseMod.default] = js.native
    
    /**
      * Defines whether the component will have growing capability either by pressing a <code>More</code> button,
      * or via user scroll. In both cases <code>load-more</code> event is fired.
      * <br><br>
      *
      * Available options:
      * <br><br>
      * <code>Button</code> - Shows a <code>More</code> button at the bottom of the list,
      * pressing of which triggers the <code>load-more</code> event.
      * <br>
      * <code>Scroll</code> - The <code>load-more</code> event is triggered when the user scrolls to the bottom of the list;
      * <br>
      * <code>None</code> (default) - The growing is off.
      * <br><br>
      *
      * <b>Restrictions:</b> <code>growing="Scroll"</code> is not supported for Internet Explorer,
      * on IE the component will fallback to <code>growing="Button"</code>.
      * @type {sap.ui.webc.main.types.ListGrowingMode}
      * @name sap.ui.webc.main.List.prototype.growing
      * @defaultvalue "None"
      * @since 1.0.0-rc.13
      * @public
      */
    var growing: ListGrowingMode = js.native
    
    var growingIntersectionObserver: js.UndefOr[IntersectionObserver | Null] = js.native
    
    def grows: Boolean = js.native
    
    def growsOnScroll: Boolean = js.native
    
    def growsWithButton: Boolean = js.native
    
    def handleDelete(item: typings.ui5Webcomponents.distListItemBaseMod.default): Boolean = js.native
    
    def handleMultiSelect(item: typings.ui5Webcomponents.distListItemBaseMod.default, selected: Boolean): Boolean = js.native
    
    def handleSingleSelect(item: typings.ui5Webcomponents.distListItemBaseMod.default): Boolean = js.native
    
    def handleSingleSelectAuto(item: typings.ui5Webcomponents.distListItemBaseMod.default): Boolean = js.native
    
    def handleSingleSelectBegin(item: typings.ui5Webcomponents.distListItemBaseMod.default): Boolean = js.native
    
    def handleSingleSelectEnd(item: typings.ui5Webcomponents.distListItemBaseMod.default): Boolean = js.native
    
    def hasData: Boolean = js.native
    
    /**
      * Defines the component header.
      * <br><br>
      * <b>Note:</b> When <code>header</code> is set, the
      * <code>headerText</code> property is ignored.
      *
      * @type {HTMLElement[]}
      * @name sap.ui.webc.main.List.prototype.header
      * @slot
      * @public
      */
    var header: js.Array[HTMLElement] = js.native
    
    def headerID: String = js.native
    
    /**
      * Defines the component header text.
      * <br><br>
      * <b>Note:</b> If <code>header</code> is set this property is ignored.
      *
      * @type {string}
      * @name sap.ui.webc.main.List.prototype.headerText
      * @defaultvalue ""
      * @public
      */
    var headerText: String = js.native
    
    /**
      * Determines whether the component is indented.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.List.prototype.indent
      * @defaultvalue false
      * @public
      */
    var indent: Boolean = js.native
    
    var initialIntersection: Boolean = js.native
    
    def isDelete: Boolean = js.native
    
    def isForwardAfterElement(element: HTMLElement): Boolean = js.native
    
    def isForwardElement(element: HTMLElement): Boolean = js.native
    
    def isMultiSelect: Boolean = js.native
    
    def isSingleSelect: Boolean = js.native
    
    /**
      * Defines the items of the component.
      * <br><br>
      * <b>Note:</b> Use <code>ui5-li</code>, <code>ui5-li-custom</code>, and <code>ui5-li-groupheader</code> for the intended design.
      *
      * @type {sap.ui.webc.main.IListItem[]}
      * @name sap.ui.webc.main.List.prototype.default
      * @slot items
      * @public
      */
    var items: js.Array[typings.ui5Webcomponents.distListItemBaseMod.default] = js.native
    
    def listEndDOM: Element | Null = js.native
    
    var listEndObserved: Boolean = js.native
    
    def loadMore(): Unit = js.native
    
    /**
      * Defines the mode of the component.
      * <br><br>
      * <b>Note:</b> Available options are <code>None</code>, <code>SingleSelect</code>, <code>SingleSelectBegin</code>,
      * <code>SingleSelectEnd</code>, <code>MultiSelect</code>, and <code>Delete</code>.
      *
      * @type {sap.ui.webc.main.types.ListMode}
      * @name sap.ui.webc.main.List.prototype.mode
      * @defaultvalue "None"
      * @public
      */
    var mode: ListMode = js.native
    
    def modeLabelID: String = js.native
    
    /**
      * Defines the text that is displayed when the component contains no items.
      *
      * @type {string}
      * @name sap.ui.webc.main.List.prototype.noDataText
      * @defaultvalue ""
      * @public
      */
    var noDataText: String = js.native
    
    def observeListEnd(): js.Promise[Unit] = js.native
    
    def onFocusRequested(e: CustomEvent): Unit = js.native
    
    def onForwardAfter(e: CustomEvent): Unit = js.native
    
    def onForwardBefore(e: CustomEvent): Unit = js.native
    
    def onInteresection(entries: js.Array[IntersectionObserverEntry]): Unit = js.native
    
    def onItemClose(e: CustomEvent): Unit = js.native
    
    def onItemFocused(e: CustomEvent): Unit = js.native
    
    def onItemPress(e: CustomEvent): Unit = js.native
    
    def onItemToggle(e: CustomEvent): Unit = js.native
    
    def onSelectionRequested(e: CustomEvent): Unit = js.native
    
    def prepareListItems(): Unit = js.native
    
    var resizeListenerAttached: Boolean = js.native
    
    /**
      * Defines the item separator style that is used.
      * <br><br>
      * <b>Notes:</b>
      * <ul>
      * <li>Avalaible options are <code>All</code>, <code>Inner</code>, and <code>None</code>.</li>
      * <li>When set to <code>None</code>, none of the items are separated by horizontal lines.</li>
      * <li>When set to <code>Inner</code>, the first item doesn't have a top separator and the last
      * item doesn't have a bottom separator.</li>
      * </ul>
      *
      * @type {sap.ui.webc.main.types.ListSeparators}
      * @name sap.ui.webc.main.List.prototype.separators
      * @defaultvalue "All"
      * @public
      */
    var separators: ListSeparators = js.native
    
    def setForwardingFocus(forwardingFocus: Boolean): Unit = js.native
    
    def setPreviouslyFocusedItem(item: typings.ui5Webcomponents.distListItemBaseMod.default): Unit = js.native
    
    def shouldRenderH1: String | `false` = js.native
    
    def showNoDataText: String | `false` = js.native
    
    def styles: BusyInd = js.native
    
    def unobserveListEnd(): Unit = js.native
  }
  
  trait SelectionChangeEventDetail extends StObject {
    
    var key: js.UndefOr[String] = js.undefined
    
    var previouslySelectedItems: js.Array[typings.ui5Webcomponents.distListItemBaseMod.default]
    
    var selectedItems: js.Array[typings.ui5Webcomponents.distListItemBaseMod.default]
    
    var selectionComponentPressed: Boolean
    
    var targetItem: typings.ui5Webcomponents.distListItemBaseMod.default
  }
  object SelectionChangeEventDetail {
    
    inline def apply(
      previouslySelectedItems: js.Array[typings.ui5Webcomponents.distListItemBaseMod.default],
      selectedItems: js.Array[typings.ui5Webcomponents.distListItemBaseMod.default],
      selectionComponentPressed: Boolean,
      targetItem: typings.ui5Webcomponents.distListItemBaseMod.default
    ): SelectionChangeEventDetail = {
      val __obj = js.Dynamic.literal(previouslySelectedItems = previouslySelectedItems.asInstanceOf[js.Any], selectedItems = selectedItems.asInstanceOf[js.Any], selectionComponentPressed = selectionComponentPressed.asInstanceOf[js.Any], targetItem = targetItem.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectionChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setPreviouslySelectedItems(value: js.Array[typings.ui5Webcomponents.distListItemBaseMod.default]): Self = StObject.set(x, "previouslySelectedItems", value.asInstanceOf[js.Any])
      
      inline def setPreviouslySelectedItemsVarargs(value: typings.ui5Webcomponents.distListItemBaseMod.default*): Self = StObject.set(x, "previouslySelectedItems", js.Array(value*))
      
      inline def setSelectedItems(value: js.Array[typings.ui5Webcomponents.distListItemBaseMod.default]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemsVarargs(value: typings.ui5Webcomponents.distListItemBaseMod.default*): Self = StObject.set(x, "selectedItems", js.Array(value*))
      
      inline def setSelectionComponentPressed(value: Boolean): Self = StObject.set(x, "selectionComponentPressed", value.asInstanceOf[js.Any])
      
      inline def setTargetItem(value: typings.ui5Webcomponents.distListItemBaseMod.default): Self = StObject.set(x, "targetItem", value.asInstanceOf[js.Any])
    }
  }
  
  type ToggleEventDetail = CloseEventDetail
}
