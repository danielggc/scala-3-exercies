package typings.ui5Webcomponents

import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import typings.ui5Webcomponents.distTableMod.ITableRow
import typings.ui5Webcomponents.distTableMod.TableColumnInfo
import typings.ui5Webcomponents.distTypesTableRowTypeMod.TableRowType
import typings.ui5Webcomponents.ui5WebcomponentsBooleans.`true`
import typings.ui5WebcomponentsBase.distTypesMod.PassiveEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTableRowMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-table-row</code> component represents a row in the <code>ui5-table</code>.
    *
    * <h3>CSS Shadow Parts</h3>
    *
    * <ui5-link target="_blank" href="https://developer.mozilla.org/en-US/docs/Web/CSS/::part">CSS Shadow Parts</ui5-link> allow developers to style elements inside the Shadow DOM.
    * <br>
    * The <code>ui5-table-row</code> exposes the following CSS Shadow Parts:
    * <ul>
    * <li>row - Used to style the native <code>tr</code> element</li>
    * <li>popin-row - Used to style the <code>tr</code> element when a row pops in</li>
    * </ul>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.TableRow
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-table-row
    * @implements sap.ui.webc.main.ITableRow
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/TableRow", JSImport.Default)
  @js.native
  open class default () extends TableRow
  object default {
    
    @JSImport("@ui5/webcomponents/dist/TableRow", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/TableRow", "default.i18nBundle")
    @js.native
    def i18nBundle: typings.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: typings.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def onDefine(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("onDefine")().asInstanceOf[js.Promise[Unit]]
  }
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-table-row</code> component represents a row in the <code>ui5-table</code>.
    *
    * <h3>CSS Shadow Parts</h3>
    *
    * <ui5-link target="_blank" href="https://developer.mozilla.org/en-US/docs/Web/CSS/::part">CSS Shadow Parts</ui5-link> allow developers to style elements inside the Shadow DOM.
    * <br>
    * The <code>ui5-table-row</code> exposes the following CSS Shadow Parts:
    * <ul>
    * <li>row - Used to style the native <code>tr</code> element</li>
    * <li>popin-row - Used to style the <code>tr</code> element when a row pops in</li>
    * </ul>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.TableRow
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-table-row
    * @implements sap.ui.webc.main.ITableRow
    * @public
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ui5WebcomponentsBase.distDelegateItemNavigationMod.ITabbable because var conflicts: _tabIndex, id. Inlined  */ @js.native
  trait TableRow extends ITableRow {
    
    def _activeElementHasAttribute(attr: String): Boolean = js.native
    
    def _ariaCurrent: js.UndefOr[`true`] = js.native
    
    def _handleSelection(): Unit = js.native
    
    def _onfocusin(e: FocusEvent): Unit = js.native
    def _onfocusin(e: FocusEvent, forceSelfFocus: Boolean): Unit = js.native
    
    def _onfocusout(): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeyup(e: KeyboardEvent): Unit = js.native
    
    def _onmouseup(): Unit = js.native
    
    def _onrowclick(e: MouseEvent): Unit = js.native
    
    def _ontouchend(): Unit = js.native
    
    var _ontouchstart: PassiveEventListenerObject = js.native
    
    def activate(): Unit = js.native
    
    /**
      * Indicates if the table row is active.
      *
      * @type {boolean}
      * @defaultvalue false
      * @since 1.0.0-rc.15
      * @private
      */
    var active: Boolean = js.native
    
    def allColumnsPoppedIn: Boolean = js.native
    
    def ariaLabelRowSelection: String = js.native
    
    def ariaLabelText: String = js.native
    
    /**
      * Defines the cells of the component.
      * <br><br>
      * <b>Note:</b> Use <code>ui5-table-cell</code> for the intended design.
      *
      * @type {sap.ui.webc.main.ITableCell[]}
      * @name sap.ui.webc.main.TableRow.prototype.default
      * @slot cells
      * @public
      */
    var cells: js.Array[typings.ui5Webcomponents.distTableCellMod.default] = js.native
    
    def deactivate(): Unit = js.native
    
    def getCellText(cell: typings.ui5Webcomponents.distTableCellMod.default): String = js.native
    
    def getColumnTextByIdx(index: Double): String = js.native
    
    def getNormilzedTextContent(textContent: String): String = js.native
    
    def isMultiSelect: Boolean = js.native
    
    def isSingleSelect: Boolean = js.native
    
    /**
      * Indicates if the table row is navigated.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.TableRow.prototype.navigated
      * @defaultvalue false
      * @since 1.9.0
      * @public
      */
    var navigated: Boolean = js.native
    
    var popinCells: js.Array[TableColumnInfo] = js.native
    
    def root: HTMLElement = js.native
    
    def shouldPopin: Double = js.native
    
    /**
      * Defines the visual indication and behavior of the component.
      * <br><br>
      * Available options are:
      * <ul>
      * <li><code>Active</code></li>
      * <li><code>Inactive</code></li>
      * </ul>
      * <br><br>
      * <b>Note:</b> When set to <code>Active</code>, the item will provide visual response upon press,
      * while with type <code>Inactive</code> - will not.
      *
      * @type {sap.ui.webc.main.types.TableRowType}
      * @name sap.ui.webc.main.TableRow.prototype.type
      * @defaultvalue "Inactive"
      * @since 1.0.0-rc.15
      * @public
      */
    var `type`: TableRowType = js.native
    
    var visibleCells: js.Array[typings.ui5Webcomponents.distTableCellMod.default] = js.native
    
    def visibleCellsCount: Double = js.native
  }
  
  trait TableRowClickEventDetail extends StObject {
    
    var row: TableRow
  }
  object TableRowClickEventDetail {
    
    inline def apply(row: TableRow): TableRowClickEventDetail = {
      val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableRowClickEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableRowClickEventDetail] (val x: Self) extends AnyVal {
      
      inline def setRow(value: TableRow): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    }
  }
  
  trait TableRowF7PressEventDetail extends StObject {
    
    var row: TableRow
  }
  object TableRowF7PressEventDetail {
    
    inline def apply(row: TableRow): TableRowF7PressEventDetail = {
      val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableRowF7PressEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableRowF7PressEventDetail] (val x: Self) extends AnyVal {
      
      inline def setRow(value: TableRow): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    }
  }
  
  trait TableRowForwardAfterEventDetail extends StObject {
    
    var target: HTMLElement
  }
  object TableRowForwardAfterEventDetail {
    
    inline def apply(target: HTMLElement): TableRowForwardAfterEventDetail = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableRowForwardAfterEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableRowForwardAfterEventDetail] (val x: Self) extends AnyVal {
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait TableRowForwardBeforeEventDetail extends StObject {
    
    var target: HTMLElement
  }
  object TableRowForwardBeforeEventDetail {
    
    inline def apply(target: HTMLElement): TableRowForwardBeforeEventDetail = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableRowForwardBeforeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableRowForwardBeforeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait TableRowSelectionRequestedEventDetail extends StObject {
    
    var row: TableRow
  }
  object TableRowSelectionRequestedEventDetail {
    
    inline def apply(row: TableRow): TableRowSelectionRequestedEventDetail = {
      val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableRowSelectionRequestedEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableRowSelectionRequestedEventDetail] (val x: Self) extends AnyVal {
      
      inline def setRow(value: TableRow): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    }
  }
}
