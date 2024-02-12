package typings.ui5WebcomponentsFiori

import org.scalajs.dom.CustomEvent
import typings.std.Record
import typings.ui5WebcomponentsFiori.anon.Filters
import typings.ui5WebcomponentsFiori.anon.Index
import typings.ui5WebcomponentsFiori.anon.Selected
import typings.ui5WebcomponentsFiori.anon.VSDItemfilterOptionsArray
import typings.ui5WebcomponentsFiori.anon.VSDItemindexnumber
import typings.ui5WebcomponentsFiori.distTypesViewSettingsDialogModeMod.ViewSettingsDialogMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distViewSettingsDialogMod {
  
  /**
    * @class
    * <h3 class="comment-api-title">Overview</h3>
    * The <code>ui5-view-settings-dialog</code> component helps the user to sort data within a list or a table.
    * It consists of several lists like <code>Sort order</code> which is built-in and <code>Sort By</code> and <code>Filter By</code> lists,
    * for which you must be provide items(<code>ui5-sort-item</code> & <code>ui5-filter-item</code> respectively)
    * These options can be used to create sorters for a table.
    *
    * The <code>ui5-view-settings-dialog</code> interrupts the current application processing as it is the only focused UI element and
    * the main screen is dimmed/blocked.
    * The <code>ui5-view-settings-dialog</code> is modal, which means that user action is required before returning to the parent window is possible.
    *
    * <h3>Structure</h3>
    * A <code>ui5-view-settings-dialog</code> consists of a header, content, and a footer for action buttons.
    * The <code>ui5-view-settings-dialog</code> is usually displayed at the center of the screen.
    *
    * <h3>Responsive Behavior</h3>
    * <code>ui5-view-settings-dialog</code> stretches on full screen on phones.
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents-fiori/dist/ViewSettingsDialog";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.fiori.ViewSettingsDialog
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-view-settings-dialog
    * @appenddocs SortItem FilterItem FilterItemOption
    * @since 1.0.0-rc.16
    * @public
    */
  @JSImport("@ui5/webcomponents-fiori/dist/ViewSettingsDialog", JSImport.Default)
  @js.native
  open class default () extends ViewSettingsDialog
  object default {
    
    @JSImport("@ui5/webcomponents-fiori/dist/ViewSettingsDialog", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents-fiori/dist/ViewSettingsDialog", "default.i18nBundle")
    @js.native
    def i18nBundle: typings.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: typings.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def onDefine(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("onDefine")().asInstanceOf[js.Promise[Unit]]
  }
  
  trait VSDEventDetail
    extends StObject
       with VSDSettings {
    
    var sortByItem: typings.ui5WebcomponentsFiori.distSortItemMod.default
    
    var sortDescending: Boolean
  }
  object VSDEventDetail {
    
    inline def apply(
      filters: VSDFilters,
      sortBy: String,
      sortByItem: typings.ui5WebcomponentsFiori.distSortItemMod.default,
      sortDescending: Boolean,
      sortOrder: String
    ): VSDEventDetail = {
      val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], sortBy = sortBy.asInstanceOf[js.Any], sortByItem = sortByItem.asInstanceOf[js.Any], sortDescending = sortDescending.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
      __obj.asInstanceOf[VSDEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VSDEventDetail] (val x: Self) extends AnyVal {
      
      inline def setSortByItem(value: typings.ui5WebcomponentsFiori.distSortItemMod.default): Self = StObject.set(x, "sortByItem", value.asInstanceOf[js.Any])
      
      inline def setSortDescending(value: Boolean): Self = StObject.set(x, "sortDescending", value.asInstanceOf[js.Any])
    }
  }
  
  type VSDFilter = Record[String, js.Array[String]]
  
  type VSDFilters = js.Array[VSDFilter]
  
  trait VSDInternalSettings extends StObject {
    
    var filters: js.Array[VSDItemfilterOptionsArray]
    
    var sortBy: js.Array[VSDItemindexnumber]
    
    var sortOrder: js.Array[VSDItem]
  }
  object VSDInternalSettings {
    
    inline def apply(
      filters: js.Array[VSDItemfilterOptionsArray],
      sortBy: js.Array[VSDItemindexnumber],
      sortOrder: js.Array[VSDItem]
    ): VSDInternalSettings = {
      val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], sortBy = sortBy.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
      __obj.asInstanceOf[VSDInternalSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VSDInternalSettings] (val x: Self) extends AnyVal {
      
      inline def setFilters(value: js.Array[VSDItemfilterOptionsArray]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersVarargs(value: VSDItemfilterOptionsArray*): Self = StObject.set(x, "filters", js.Array(value*))
      
      inline def setSortBy(value: js.Array[VSDItemindexnumber]): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
      
      inline def setSortByVarargs(value: VSDItemindexnumber*): Self = StObject.set(x, "sortBy", js.Array(value*))
      
      inline def setSortOrder(value: js.Array[VSDItem]): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      inline def setSortOrderVarargs(value: VSDItem*): Self = StObject.set(x, "sortOrder", js.Array(value*))
    }
  }
  
  trait VSDItem extends StObject {
    
    var selected: Boolean
    
    var text: String
  }
  object VSDItem {
    
    inline def apply(selected: Boolean, text: String): VSDItem = {
      val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[VSDItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VSDItem] (val x: Self) extends AnyVal {
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait VSDSettings extends StObject {
    
    var filters: VSDFilters
    
    var sortBy: String
    
    var sortOrder: String
  }
  object VSDSettings {
    
    inline def apply(filters: VSDFilters, sortBy: String, sortOrder: String): VSDSettings = {
      val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], sortBy = sortBy.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
      __obj.asInstanceOf[VSDSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VSDSettings] (val x: Self) extends AnyVal {
      
      inline def setFilters(value: VSDFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersVarargs(value: VSDFilter*): Self = StObject.set(x, "filters", js.Array(value*))
      
      inline def setSortBy(value: String): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
      
      inline def setSortOrder(value: String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @class
    * <h3 class="comment-api-title">Overview</h3>
    * The <code>ui5-view-settings-dialog</code> component helps the user to sort data within a list or a table.
    * It consists of several lists like <code>Sort order</code> which is built-in and <code>Sort By</code> and <code>Filter By</code> lists,
    * for which you must be provide items(<code>ui5-sort-item</code> & <code>ui5-filter-item</code> respectively)
    * These options can be used to create sorters for a table.
    *
    * The <code>ui5-view-settings-dialog</code> interrupts the current application processing as it is the only focused UI element and
    * the main screen is dimmed/blocked.
    * The <code>ui5-view-settings-dialog</code> is modal, which means that user action is required before returning to the parent window is possible.
    *
    * <h3>Structure</h3>
    * A <code>ui5-view-settings-dialog</code> consists of a header, content, and a footer for action buttons.
    * The <code>ui5-view-settings-dialog</code> is usually displayed at the center of the screen.
    *
    * <h3>Responsive Behavior</h3>
    * <code>ui5-view-settings-dialog</code> stretches on full screen on phones.
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents-fiori/dist/ViewSettingsDialog";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.fiori.ViewSettingsDialog
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-view-settings-dialog
    * @appenddocs SortItem FilterItem FilterItemOption
    * @since 1.0.0-rc.16
    * @public
    */
  @js.native
  trait ViewSettingsDialog
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _ascendingLabel: String = js.native
    
    def _cancelButtonLabel: String = js.native
    
    /**
      * Sets current settings to recently confirmed ones and fires <code>cancel</code> event.
      */
    def _cancelSettings(): Unit = js.native
    
    def _changeCurrentFilter(e: CustomEvent): Unit = js.native
    
    /**
      * Stores current settings as confirmed and fires <code>confirm</code> event.
      */
    def _confirmSettings(): Unit = js.native
    
    /**
      * Stores settings of the dialog after confirmation.
      *
      * @type {object}
      * @private
      */
    var _confirmedSettings: VSDInternalSettings = js.native
    
    /**
      * Defnies the current mode of the component.
      *
      * @since 1.0.0-rc.16
      * @private
      */
    var _currentMode: ViewSettingsDialogMode = js.native
    
    /**
      * Stores current settings of the dialog.
      *
      * @type {object}
      * @private
      */
    var _currentSettings: VSDInternalSettings = js.native
    
    def _descendingLabel: String = js.native
    
    var _dialog: js.UndefOr[typings.ui5Webcomponents.distDialogMod.default] = js.native
    
    def _dialogDomRef: typings.ui5Webcomponents.distDialogMod.default = js.native
    
    def _dialogTitle: String = js.native
    
    /**
      * Determines disabled state of the <code>Reset</code> button.
      */
    def _disableResetButton: js.UndefOr[Boolean] = js.native
    
    def _filterByLabel: String = js.native
    
    def _filterByTitle: String = js.native
    
    /**
      * When in Filter By mode, defines whether we need to show the list of keys, or the list with values.
      *
      * @since 1.0.0-rc.16
      * @private
      */
    var _filterStepTwo: Boolean = js.native
    
    def _filteresAreInitial: Boolean = js.native
    
    /**
      * Sets focus on recently used control within the dialog.
      */
    def _focusRecentlyUsedControl(): Unit = js.native
    
    def _handleFilterValueItemClick(e: CustomEvent): Unit = js.native
    
    def _handleModeChange(e: CustomEvent): Unit = js.native
    
    /**
      * Stores settings of the dialog before the initial open.
      *
      * @type {object}
      * @private
      */
    var _initialSettings: VSDInternalSettings = js.native
    
    def _isPhone: Boolean = js.native
    
    def _navigateToFilters(): Unit = js.native
    
    def _okButtonLabel: String = js.native
    
    /**
      * Stores <code>Sort By</code> list as recently used control and its selected item in current state.
      */
    def _onSortByChange(e: CustomEvent): Unit = js.native
    
    /**
      * Stores <code>Sort Order</code> list as recently used control and its selected item in current state.
      */
    def _onSortOrderChange(e: CustomEvent): Unit = js.native
    
    /**
      * Keeps recently focused list in order to focus it on next dialog open.
      *
      * @type {object}
      * @private
      */
    var _recentlyFocused: typings.ui5Webcomponents.distListMod.default = js.native
    
    def _resetButtonLabel: String = js.native
    
    /**
      * Resets the control settings to their initial state.
      */
    def _resetSettings(): Unit = js.native
    
    /**
      * If the dialog is closed by [ESC] key, do the same as if the <code>Cancel</code> button is pressed.
      *
      * @param {event} evt
      */
    def _restoreConfirmedOnEscape(evt: CustomEvent): Unit = js.native
    
    /**
      * Sets current settings to ones passed as <code>settings</code> argument.
      *
      * @param {Object} settings
      */
    def _restoreSettings(settings: VSDInternalSettings): Unit = js.native
    
    def _selectedFilter: js.UndefOr[VSDItemfilterOptionsArray] = js.native
    
    def _setAdditionalTexts(): Unit = js.native
    
    /**
      * Returns the current settings (current state of all lists).
      */
    def _settings: VSDInternalSettings = js.native
    
    def _sortAscending: Boolean = js.native
    
    var _sortBy: js.UndefOr[typings.ui5Webcomponents.distListMod.default] = js.native
    
    def _sortByLabel: String = js.native
    
    def _sortByList: typings.ui5Webcomponents.distListMod.default = js.native
    
    var _sortOrder: js.UndefOr[typings.ui5Webcomponents.distListMod.default] = js.native
    
    def _sortOrderLabel: String = js.native
    
    def _sortOrderListDomRef: typings.ui5Webcomponents.distListMod.default = js.native
    
    def _sortSetttingsAreInitial: Boolean = js.native
    
    def _title: String = js.native
    
    /**
      * Closes the dialog.
      */
    def close(): Unit = js.native
    
    def eventsParams: Filters = js.native
    
    def expandContent: Boolean = js.native
    
    /**
      * Defines the <code>filterItems</code> list.
      * <b>Note:</b> If you want to use this slot, you need to import used item: <code>import "@ui5/webcomponents-fiori/dist/FilterItem";</code>
      *
      * @type {sap.ui.webc.fiori.IFilterItem[]}
      * @name sap.ui.webc.fiori.ViewSettingsDialog.prototype.filterItems
      * @slot filterItems
      * @public
      */
    var filterItems: js.Array[typings.ui5WebcomponentsFiori.distFilterItemMod.default] = js.native
    
    def hasPagination: Boolean = js.native
    
    def initSortByItems: js.Array[Index] = js.native
    
    def initSortOrderItems: js.Array[Selected] = js.native
    
    def isModeFilter: Boolean = js.native
    
    def isModeSort: Boolean = js.native
    
    def selectedFilters: VSDFilters = js.native
    
    /**
      * Sets a JavaScript object, as settings to the <code>ui5-view-settings-dialog</code>.
      * This method can be used after the dialog is initially open, as the dialog need to set its initial settings.
      * The <code>ui5-view-settings-dialog</code> throws an event called "before-open", this can be used as trigger point.
      * The object should have the following format:
      * <code>
      *  {sortOrder: "Ascending", sortBy: "Name", filters: [{"Filter 1": ["Some filter 1", "Some filter 2"]}, {"Filter 2": ["Some filter 4"]}]}
      * </code>
      * @param {Object} settings - predefined settings.
      * @param {string} settings.sortOrder - sort order
      * @param {string} settings.sortBy - sort by
      * @param {Array.<Object>} settings.filters - filters
      * @public
      * @method
      * @name sap.ui.webc.fiori.ViewSettingsDialog#setConfirmedSettings
      */
    def setConfirmedSettings(settings: VSDSettings): Unit = js.native
    
    def shouldBuildFilter: Boolean = js.native
    
    def shouldBuildSort: Boolean = js.native
    
    /**
      * Shows the dialog.
      * @public
      * @method
      * @name sap.ui.webc.fiori.ViewSettingsDialog#show
      */
    def show(): Unit = js.native
    
    def showBackButton: Boolean = js.native
    
    /**
      * Defines the initial sort order.
      *
      * @name sap.ui.webc.fiori.ViewSettingsDialog.prototype.sortDescending
      * @type {boolean}
      * @defaultvalue false
      * @public
      */
    var sortDescending: Boolean = js.native
    
    /**
      * Defines the list of items against which the user could sort data.
      * <b>Note:</b> If you want to use this slot, you need to import used item: <code>import "@ui5/webcomponents-fiori/dist/SortItem";</code>
      *
      * @name sap.ui.webc.fiori.ViewSettingsDialog.prototype.sortItems
      * @type {sap.ui.webc.fiori.ISortItem[]}
      * @slot sortItems
      * @public
      */
    var sortItems: js.Array[typings.ui5WebcomponentsFiori.distSortItemMod.default] = js.native
  }
}
