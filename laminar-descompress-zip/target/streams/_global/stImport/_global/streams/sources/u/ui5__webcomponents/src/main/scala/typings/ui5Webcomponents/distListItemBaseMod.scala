package typings.ui5Webcomponents

import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import typings.ui5Webcomponents.ui5WebcomponentsBooleans.`true`
import typings.ui5Webcomponents.ui5WebcomponentsInts.`-1`
import typings.ui5Webcomponents.ui5WebcomponentsInts.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distListItemBaseMod {
  
  /**
    * @class
    * A class to serve as a foundation
    * for the <code>ListItem</code> and <code>GroupHeaderListItem</code> classes.
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.ListItemBase
    * @extends sap.ui.webc.base.UI5Element
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/ListItemBase", JSImport.Default)
  @js.native
  open class default () extends ListItemBase
  
  /**
    * @class
    * A class to serve as a foundation
    * for the <code>ListItem</code> and <code>GroupHeaderListItem</code> classes.
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.ListItemBase
    * @extends sap.ui.webc.base.UI5Element
    * @public
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ui5WebcomponentsBase.distDelegateItemNavigationMod.ITabbable because var conflicts: id. Inlined _tabIndex */ @js.native
  trait ListItemBase
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _ariaDisabled: js.UndefOr[`true`] = js.native
    
    def _effectiveTabIndex: String | `0` | `-1` = js.native
    
    def _handleTabNext(e: KeyboardEvent): Unit = js.native
    
    def _handleTabPrevious(e: KeyboardEvent): Unit = js.native
    
    def _onfocusin(e: FocusEvent): Unit = js.native
    
    def _onfocusout(): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeyup(e: KeyboardEvent): Unit = js.native
    
    var _tabIndex: String = js.native
    
    /**
      * Defines whether <code>ui5-li</code> is in disabled state.
      * <br><br>
      * <b>Note:</b> A disabled <code>ui5-li</code> is noninteractive.
      * @type {boolean}
      * @name sap.ui.webc.main.ListItemBase.prototype.disabled
      * @defaultvalue false
      * @protected
      * @since 1.0.0-rc.12
      */
    var disabled: Boolean = js.native
    
    /**
      * Indicates if the element is on focus
      * @private
      */
    var focused: Boolean = js.native
    
    /**
      * Defines if the list item should display its bottom border.
      * @private
      */
    var hasBorder: Boolean = js.native
    
    def hasConfigurableMode: Boolean = js.native
    
    /**
      * Defines the selected state of the <code>ListItem</code>.
      * @type {boolean}
      * @name sap.ui.webc.main.ListItemBase.prototype.selected
      * @defaultvalue false
      * @public
      */
    var selected: Boolean = js.native
    
    def shouldForwardTabAfter(target: HTMLElement): Boolean = js.native
    def shouldForwardTabAfter(target: typings.ui5WebcomponentsBase.distUi5elementMod.default): Boolean = js.native
    
    def shouldForwardTabBefore(target: HTMLElement): Boolean = js.native
  }
}
