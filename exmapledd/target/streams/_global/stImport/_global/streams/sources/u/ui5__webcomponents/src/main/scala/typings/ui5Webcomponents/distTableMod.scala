package typings.ui5Webcomponents

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.Element
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import typings.std.IntersectionObserver
import typings.std.IntersectionObserverEntry
import typings.ui5Webcomponents.anon.Busy
import typings.ui5Webcomponents.distTypesTableColumnPopinDisplayMod.TableColumnPopinDisplay
import typings.ui5Webcomponents.distTypesTableGrowingModeMod.TableGrowingMode
import typings.ui5Webcomponents.distTypesTableModeMod.TableMode
import typings.ui5Webcomponents.ui5WebcomponentsBooleans.`false`
import typings.ui5WebcomponentsBase.distDelegateItemNavigationMod.ITabbable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTableMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-import type { table } from "./TableRow.js";/code> component provides a set of sophisticated and convenient functions for responsive table design.
    * It provides a comprehensive set of features for displaying and dealing with vast amounts of data.
    * <br><br>
    * To render the <code>Table</code> properly, the order of the <code>columns</code> should match with the
    * order of the item <code>cells</code> in the <code>rows</code>.
    * <br><br>
    * Desktop and tablet devices are supported.
    * On tablets, special consideration should be given to the number of visible columns
    * and rows due to the limited performance of some devices.
    *
    * <h3>Selection</h3>
    * To benefit from the selection mechanism of <code>ui5-table</code> component, you can use the available selection modes:
    * <code>SingleSelect</code> and <code>MultiSelect</code>.
    * <br>
    * In additition to the used mode, you can also specify the <code>ui5-table-row</code> type choosing between
    * <code>Active</code> or <code>Inactive</code>.
    * <br><br>
    * In <code>SingleSelect</code> mode, you can select both an <code>Active</code> and <code>Inactive</code> row via mouse or
    * by pressing the <code>Space</code> or <code>Enter</code> keys.
    * <br>
    * In <code>MultiSelect</code> mode, you can select both an <code>Active</code> and <code>Inactive</code> row by pressing the
    * <code>Space</code> key when a row is on focus or via mouse click over the selection checkbox of the row.
    * In order to select all the available rows at once, you can use the selection checkbox presented in the table's header.
    * <br><br>
    * <b>Note:</b> Currently, when a column is shown as a pop-in, the visual indication for selection is not presented over it.
    *
    * <h3>Keyboard Handling</h3>
    *
    * <h4>Fast Navigation</h4>
    * This component provides a build in fast navigation group which can be used via <code>F6 / Shift + F6</code> or <code> Ctrl + Alt(Option) + Down /  Ctrl + Alt(Option) + Up</code>.
    * In order to use this functionality, you need to import the following module:
    * <code>import "@ui5/webcomponents-base/dist/features/F6Navigation.js"</code>
    * <br><br>
    * Furthermore, you can interact with <code>ui5-table</code> via the following keys.
    * <br>
    *
    * <ul>
    * <li>[F7] - If focus is on an interactive control inside an item, moves focus to the corresponding item.</li>
    * <li>[CTRL]+[A] - Selects all items, if MultiSelect mode is enabled.</li>
    * <li>[HOME]/[END] - Focuses the first/last item.</li>
    * <li>[PAGEUP]/[PAGEDOWN] - Moves focus up/down by page size (20 items by default).</li>
    * <li>[ALT]+[DOWN]/[UP] - Switches focus between header, last focused item, and More button (if applies) in either direction.</li>
    * <li>[SHIFT]+[DOWN]/[UP] - Selects the next/previous item in a MultiSelect table, if the current item is selected (Range selection). Otherwise, deselects them (Range deselection).</li>
    * <li>[SHIFT]+[HOME]/[END] - Range selection to the first/last item of the List.</li>
    * <li>[CTRL]+[HOME]/[END] - Same behavior as HOME & END.</li>
    * </ul>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/Table.js";</code>
    * <br>
    * <code>import "@ui5/webcomponents/dist/TableColumn.js";</code> (for <code>ui5-table-column</code>)
    * <br>
    * <code>import "@ui5/webcomponents/dist/TableRow.js";</code> (for <code>ui5-table-row</code>)
    * <br>
    * <code>import "@ui5/webcomponents/dist/TableCell.js";</code> (for <code>ui5-table-cell</code>)
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.Table
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-table
    * @appenddocs TableColumn TableRow TableGroupRow TableCell
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/Table", JSImport.Default)
  @js.native
  open class default () extends Table
  object default {
    
    @JSImport("@ui5/webcomponents/dist/Table", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/Table", "default.i18nBundle")
    @js.native
    def i18nBundle: typings.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: typings.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def onDefine(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("onDefine")().asInstanceOf[js.Promise[Unit]]
  }
  
  @js.native
  sealed trait TableFocusTargetElement extends StObject
  @JSImport("@ui5/webcomponents/dist/Table", "TableFocusTargetElement")
  @js.native
  object TableFocusTargetElement extends StObject {
    
    @js.native
    sealed trait ColumnHeader
      extends StObject
         with TableFocusTargetElement
    
    @js.native
    sealed trait GroupRow
      extends StObject
         with TableFocusTargetElement
    
    @js.native
    sealed trait MoreButton
      extends StObject
         with TableFocusTargetElement
    
    @js.native
    sealed trait Row
      extends StObject
         with TableFocusTargetElement
  }
  
  @js.native
  trait ITableRow
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    var _ariaPosition: String = js.native
    
    var _busy: Boolean = js.native
    
    var _columnsInfo: js.Array[TableColumnInfo] = js.native
    
    var _columnsInfoString: String = js.native
    
    var _tabIndex: String = js.native
    
    var _tabbables: js.Array[HTMLElement] = js.native
    
    var mode: TableMode = js.native
    
    var selected: Boolean = js.native
  }
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-import type { table } from "./TableRow.js";/code> component provides a set of sophisticated and convenient functions for responsive table design.
    * It provides a comprehensive set of features for displaying and dealing with vast amounts of data.
    * <br><br>
    * To render the <code>Table</code> properly, the order of the <code>columns</code> should match with the
    * order of the item <code>cells</code> in the <code>rows</code>.
    * <br><br>
    * Desktop and tablet devices are supported.
    * On tablets, special consideration should be given to the number of visible columns
    * and rows due to the limited performance of some devices.
    *
    * <h3>Selection</h3>
    * To benefit from the selection mechanism of <code>ui5-table</code> component, you can use the available selection modes:
    * <code>SingleSelect</code> and <code>MultiSelect</code>.
    * <br>
    * In additition to the used mode, you can also specify the <code>ui5-table-row</code> type choosing between
    * <code>Active</code> or <code>Inactive</code>.
    * <br><br>
    * In <code>SingleSelect</code> mode, you can select both an <code>Active</code> and <code>Inactive</code> row via mouse or
    * by pressing the <code>Space</code> or <code>Enter</code> keys.
    * <br>
    * In <code>MultiSelect</code> mode, you can select both an <code>Active</code> and <code>Inactive</code> row by pressing the
    * <code>Space</code> key when a row is on focus or via mouse click over the selection checkbox of the row.
    * In order to select all the available rows at once, you can use the selection checkbox presented in the table's header.
    * <br><br>
    * <b>Note:</b> Currently, when a column is shown as a pop-in, the visual indication for selection is not presented over it.
    *
    * <h3>Keyboard Handling</h3>
    *
    * <h4>Fast Navigation</h4>
    * This component provides a build in fast navigation group which can be used via <code>F6 / Shift + F6</code> or <code> Ctrl + Alt(Option) + Down /  Ctrl + Alt(Option) + Up</code>.
    * In order to use this functionality, you need to import the following module:
    * <code>import "@ui5/webcomponents-base/dist/features/F6Navigation.js"</code>
    * <br><br>
    * Furthermore, you can interact with <code>ui5-table</code> via the following keys.
    * <br>
    *
    * <ul>
    * <li>[F7] - If focus is on an interactive control inside an item, moves focus to the corresponding item.</li>
    * <li>[CTRL]+[A] - Selects all items, if MultiSelect mode is enabled.</li>
    * <li>[HOME]/[END] - Focuses the first/last item.</li>
    * <li>[PAGEUP]/[PAGEDOWN] - Moves focus up/down by page size (20 items by default).</li>
    * <li>[ALT]+[DOWN]/[UP] - Switches focus between header, last focused item, and More button (if applies) in either direction.</li>
    * <li>[SHIFT]+[DOWN]/[UP] - Selects the next/previous item in a MultiSelect table, if the current item is selected (Range selection). Otherwise, deselects them (Range deselection).</li>
    * <li>[SHIFT]+[HOME]/[END] - Range selection to the first/last item of the List.</li>
    * <li>[CTRL]+[HOME]/[END] - Same behavior as HOME & END.</li>
    * </ul>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/Table.js";</code>
    * <br>
    * <code>import "@ui5/webcomponents/dist/TableColumn.js";</code> (for <code>ui5-table-column</code>)
    * <br>
    * <code>import "@ui5/webcomponents/dist/TableRow.js";</code> (for <code>ui5-table-row</code>)
    * <br>
    * <code>import "@ui5/webcomponents/dist/TableCell.js";</code> (for <code>ui5-table-cell</code>)
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.Table
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-table
    * @appenddocs TableColumn TableRow TableGroupRow TableCell
    * @public
    */
  @js.native
  trait Table
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    var _afterElement: js.UndefOr[HTMLElement] = js.native
    
    /**
      * Defines whether all rows are selected or not when table is in MultiSelect mode.
      * @type {boolean}
      * @defaultvalue false
      * @since 1.0.0-rc.15
      * @private
      */
    var _allRowsSelected: Boolean = js.native
    
    var _beforeElement: js.UndefOr[HTMLElement] = js.native
    
    /**
      * Used to represent the table column header for the purpose of the item navigation as it does not work with DOM objects directly
      * @private
      */
    var _columnHeader: TableColumnHeaderInfo = js.native
    
    def _focusForwardElement(isAfter: Boolean): Unit = js.native
    
    def _focusNextElement(): Unit = js.native
    
    var _forwardingFocus: Boolean = js.native
    
    def _getAfterForwardElement(): HTMLElement = js.native
    
    def _getBeforeForwardElement(): HTMLElement = js.native
    
    def _getForwardElement(isAfter: Boolean): HTMLElement | Null = js.native
    
    def _growingButtonText: String = js.native
    
    /**
      * Handles Alt + Up/Down.
      * Switches focus between column header, last focused item, and "More" button (if applicable).
      * @private
      * @param { KeyboardEvent } e
      */
    def _handleArrowAlt(e: KeyboardEvent): Unit | js.Promise[Unit] = js.native
    
    def _handleArrowNav(e: KeyboardEvent): Unit = js.native
    
    /**
      * Toggles focus between the table row's root and the last focused nested element.
      * @private
      * @param { CustomEvent } e "ui5-f7-pressed"
      */
    def _handleF7(e: CustomEvent): Unit = js.native
    
    def _handleHomeEndSelection(e: KeyboardEvent): Unit = js.native
    
    def _handleMultiSelect(e: CustomEvent): Unit = js.native
    
    def _handleResize(): Unit = js.native
    
    def _handleSelect(e: CustomEvent): Unit = js.native
    
    def _handleSingleSelect(e: CustomEvent): Unit = js.native
    
    def _handleTab(e: KeyboardEvent): `false` | Unit = js.native
    
    var _hiddenColumns: js.Array[TableColumnInfo] = js.native
    
    /**
      * Defines if the entire table is in view port.
      * @private
      */
    var _inViewport: Boolean = js.native
    
    def _isForwardElement(element: HTMLElement): Boolean = js.native
    
    var _itemNavigation: typings.ui5WebcomponentsBase.distDelegateItemNavigationMod.default = js.native
    
    /**
      * Defines the active state of the <code>More</code> button.
      * @private
      */
    var _loadMoreActive: Boolean = js.native
    
    var _noDataDisplayed: Boolean = js.native
    
    def _onColumnHeaderClick(e: KeyboardEvent): Unit = js.native
    def _onColumnHeaderClick(e: MouseEvent): Unit = js.native
    
    def _onColumnHeaderFocused(): Unit = js.native
    
    def _onColumnHeaderKeydown(e: KeyboardEvent): Unit = js.native
    
    def _onForwardAfter(e: CustomEvent): Unit = js.native
    
    def _onForwardBefore(e: CustomEvent): Unit = js.native
    
    def _onLoadMoreClick(): Unit = js.native
    
    def _onLoadMoreKeydown(e: KeyboardEvent): Unit = js.native
    
    def _onLoadMoreKeyup(e: KeyboardEvent): Unit = js.native
    
    def _onfocusin(e: FocusEvent): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    var _prevFocusedRow: js.UndefOr[ITableRow] = js.native
    
    var _prevNestedElementIndex: Double = js.native
    
    def _selectAll(): Unit = js.native
    
    /**
      * Defines the accessible ARIA name of the component.
      *
      * @type {string}
      * @name sap.ui.webc.main.Table.prototype.accessibleName
      * @defaultvalue: ""
      * @public
      * @since 1.3.0
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    /**
      * Receives id(or many ids) of the elements that label the component.
      *
      * @type {string}
      * @name sap.ui.webc.main.Table.prototype.accessibleNameRef
      * @defaultvalue ""
      * @public
      * @since 1.3.0
      */
    var accessibleNameRef: String = js.native
    
    def ariaLabelSelectAllText: String = js.native
    
    def ariaLabelText: String = js.native
    
    /**
      * Defines if the table is in busy state.
      * <b>
      *
      * In this state the component's opacity is reduced
      * and busy indicator is displayed at the bottom of the table.
      * @type {boolean}
      * @name sap.ui.webc.main.Table.prototype.busy
      * @defaultvalue false
      * @since 1.0.0-rc.12
      * @public
      */
    var busy: Boolean = js.native
    
    /**
      * Defines the delay in milliseconds, after which the busy indicator will show up for this component.
      *
      * @type {sap.ui.webc.base.types.Integer}
      * @name sap.ui.webc.main.Table.prototype.busyDelay
      * @defaultValue 1000
      * @public
      */
    var busyDelay: Double = js.native
    
    def busyIndPosition: String = js.native
    
    def checkTableInViewport(): Unit = js.native
    
    def columnHeader: HTMLElement | Null = js.native
    
    def columnHeaderLastElement: HTMLElement | Null = js.native
    
    def columnHeaderTabbables: js.Array[HTMLElement] = js.native
    
    /**
      * Defines the configuration for the columns of the component.
      * <br><br>
      * <b>Note:</b> Use <code>ui5-table-column</code> for the intended design.
      *
      * @type {sap.ui.webc.main.ITableColumn[]}
      * @name sap.ui.webc.main.Table.prototype.columns
      * @slot
      * @public
      */
    var columns: js.Array[typings.ui5Webcomponents.distTableColumnMod.default] = js.native
    
    def currentElement: js.UndefOr[HTMLElement] = js.native
    
    def currentItem: ITableRow = js.native
    
    def currentItemIdx: Double = js.native
    
    def fnHandleF7(e: CustomEvent): Unit = js.native
    
    def fnOnRowFocused(e: CustomEvent): Unit = js.native
    
    /**
      * Gets settings to be propagated from columns to rows.
      *
      * @returns { array }
      * @memberof Table
      */
    def getColumnPropagationSettings(): js.Array[TableColumnInfo] = js.native
    
    /**
      * Determines the type of the currently focused element.
      * @private
      * @param {object} element The DOM element
      * @returns {("columnHeader"|"tableRow"|"tableGroupRow"|"moreButton")} A string identifier
      */
    def getFocusedElementType(element: HTMLElement): js.UndefOr[TableFocusTargetElement] = js.native
    
    def getIntersectionObserver(): IntersectionObserver = js.native
    
    def getRowParent(child: HTMLElement): js.UndefOr[ITableRow] = js.native
    
    /**
      * Defines whether the table will have growing capability either by pressing a <code>More</code> button,
      * or via user scroll. In both cases <code>load-more</code> event is fired.
      * <br><br>
      *
      * Available options:
      * <br><br>
      * <code>Button</code> - Shows a <code>More</code> button at the bottom of the table, pressing of which triggers the <code>load-more</code> event.
      * <br>
      * <code>Scroll</code> - The <code>load-more</code> event is triggered when the user scrolls to the bottom of the table;
      * <br>
      * <code>None</code> (default) - The growing is off.
      * <br><br>
      *
      * <b>Restrictions:</b> <code>growing="Scroll"</code> is not supported for Internet Explorer,
      * and the component will fallback to <code>growing="Button"</code>.
      * @type {sap.ui.webc.main.types.TableGrowingMode}
      * @name sap.ui.webc.main.Table.prototype.growing
      * @defaultvalue "None"
      * @since 1.0.0-rc.12
      * @public
      */
    var growing: TableGrowingMode = js.native
    
    /**
      * Defines the subtext that will be displayed under the <code>growingButtonText</code>.
      *
      * <br><br>
      * <b>Note:</b> This property takes effect if <code>growing</code> is set to <code>Button</code>.
      *
      * @type {string}
      * @name sap.ui.webc.main.Table.prototype.growingButtonSubtext
      * @defaultvalue ""
      * @since 1.0.0-rc.15
      * @public
      */
    var growingButtonSubtext: String = js.native
    
    /**
      * Defines the text that will be displayed inside the growing button at the bottom of the table,
      * meant for loading more rows upon press.
      *
      * <br><br>
      * <b>Note:</b> If not specified a built-in text will be displayed.
      * <br>
      * <b>Note:</b> This property takes effect if <code>growing</code> is set to <code>Button</code>.
      *
      * @type {string}
      * @name sap.ui.webc.main.Table.prototype.growingButtonText
      * @defaultvalue ""
      * @since 1.0.0-rc.15
      * @public
      */
    var growingButtonText: String = js.native
    
    var growingIntersectionObserver: js.UndefOr[IntersectionObserver | Null] = js.native
    
    def growsOnScroll: Boolean = js.native
    
    def growsWithButton: Boolean = js.native
    
    def handleResize(): Unit = js.native
    
    /**
      * Defines if the value of <code>noDataText</code> will be diplayed when there is no rows present in the table.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.Table.prototype.hideNoData
      * @defaultvalue false
      * @public
      * @since 1.0.0-rc.15
      */
    var hideNoData: Boolean = js.native
    
    def isMultiSelect: Boolean = js.native
    
    def isSingleSelect: Boolean = js.native
    
    var lastFocusedElement: HTMLElement | Null = js.native
    
    def loadMore(): Unit = js.native
    
    def loadMoreAriaLabelledBy: String = js.native
    
    /**
      * Defines the mode of the component.
      * <br><br>
      * Available options are:
      * <ul>
      * <li><code>MultiSelect</code></li>
      * <li><code>SingleSelect</code></li>
      * <li><code>None</code></li>
      * <ul>
      * @type {sap.ui.webc.main.types.TableMode}
      * @name sap.ui.webc.main.Table.prototype.mode
      * @defaultvalue "None"
      * @since 1.0.0-rc.15
      * @public
      */
    var mode: TableMode = js.native
    
    var moreDataText: js.UndefOr[String] = js.native
    
    def morеBtn: HTMLElement | Null = js.native
    
    /**
      * Defines the text that will be displayed when there is no data and <code>hideNoData</code> is not present.
      *
      * @type {string}
      * @name sap.ui.webc.main.Table.prototype.noDataText
      * @defaultvalue ""
      * @public
      */
    var noDataText: String = js.native
    
    def observeTableEnd(): Unit = js.native
    
    def onInteresection(entries: js.Array[IntersectionObserverEntry]): Unit = js.native
    
    def onRowFocused(e: CustomEvent): Unit = js.native
    
    def popinContent(): Unit = js.native
    
    /**
      * Defines the component rows.
      * <br><br>
      * <b>Note:</b> Use <code>ui5-table-row</code> for the intended design.
      *
      * @type {sap.ui.webc.main.ITableRow[]}
      * @name sap.ui.webc.main.Table.prototype.default
      * @slot rows
      * @public
      */
    var rows: js.Array[ITableRow] = js.native
    
    def selectedRows: js.Array[ITableRow] = js.native
    
    /**
      * Determines whether the column headers remain fixed at the top of the page during
      * vertical scrolling as long as the Web Component is in the viewport.
      * <br><br>
      * <b>Restrictions:</b>
      * <ul>
      * <li>Browsers that do not support this feature:
      * <ul>
      * <li>Internet Explorer</li>
      * <li>Microsoft Edge lower than version 41 (EdgeHTML 16)</li>
      * <li>Mozilla Firefox lower than version 59</li>
      * </ul>
      * </li>
      * <li>Scrolling behavior:
      * <ul>
      * <li>If the Web Component is placed in layout containers that have the <code>overflow: hidden</code>
      * or <code>overflow: auto</code> style definition, this can
      * prevent the sticky elements of the Web Component from becoming fixed at the top of the viewport.</li>
      * </ul>
      * </li>
      * </ul>
      *
      * @type {boolean}
      * @name sap.ui.webc.main.Table.prototype.stickyColumnHeader
      * @defaultvalue false
      * @public
      */
    var stickyColumnHeader: Boolean = js.native
    
    def styles: Busy = js.native
    
    def tableAriaLabelText: js.UndefOr[String] = js.native
    
    def tableEndDOM: Element = js.native
    
    var tableEndObserved: Boolean = js.native
    
    var visibleColumns: js.UndefOr[js.Array[typings.ui5Webcomponents.distTableColumnMod.default]] = js.native
    
    var visibleColumnsCount: js.UndefOr[Double] = js.native
  }
  
  type TableColumnHeaderInfo = ITabbable
  
  trait TableColumnInfo extends StObject {
    
    var cell: js.UndefOr[typings.ui5Webcomponents.distTableCellMod.default] = js.undefined
    
    var classes: js.UndefOr[String] = js.undefined
    
    var demandPopin: js.UndefOr[Boolean] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var minWidth: js.UndefOr[Double] = js.undefined
    
    var popinDisplay: js.UndefOr[TableColumnPopinDisplay] = js.undefined
    
    var popinDisplayInline: js.UndefOr[Boolean] = js.undefined
    
    var popinText: js.UndefOr[String] = js.undefined
    
    var text: js.UndefOr[String | Null] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object TableColumnInfo {
    
    inline def apply(): TableColumnInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableColumnInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableColumnInfo] (val x: Self) extends AnyVal {
      
      inline def setCell(value: typings.ui5Webcomponents.distTableCellMod.default): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setClasses(value: String): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setDemandPopin(value: Boolean): Self = StObject.set(x, "demandPopin", value.asInstanceOf[js.Any])
      
      inline def setDemandPopinUndefined: Self = StObject.set(x, "demandPopin", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setPopinDisplay(value: TableColumnPopinDisplay): Self = StObject.set(x, "popinDisplay", value.asInstanceOf[js.Any])
      
      inline def setPopinDisplayInline(value: Boolean): Self = StObject.set(x, "popinDisplayInline", value.asInstanceOf[js.Any])
      
      inline def setPopinDisplayInlineUndefined: Self = StObject.set(x, "popinDisplayInline", js.undefined)
      
      inline def setPopinDisplayUndefined: Self = StObject.set(x, "popinDisplay", js.undefined)
      
      inline def setPopinText(value: String): Self = StObject.set(x, "popinText", value.asInstanceOf[js.Any])
      
      inline def setPopinTextUndefined: Self = StObject.set(x, "popinText", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextNull: Self = StObject.set(x, "text", null)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
