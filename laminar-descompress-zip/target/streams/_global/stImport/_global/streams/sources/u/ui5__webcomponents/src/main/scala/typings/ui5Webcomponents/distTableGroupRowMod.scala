package typings.ui5Webcomponents

import org.scalajs.dom.FocusEvent
import typings.ui5Webcomponents.distTableMod.ITableRow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTableGroupRowMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-table-group-row</code> component represents a group row in the <code>ui5-table</code>.
    *
    * <h3>CSS Shadow Parts</h3>
    *
    * <ui5-link target="_blank" href="https://developer.mozilla.org/en-US/docs/Web/CSS/::part">CSS Shadow Parts</ui5-link> allow developers to style elements inside the Shadow DOM.
    * <br>
    * The <code>ui5-table-group-row</code> exposes the following CSS Shadow Parts:
    * <ul>
    * <li>group-row - Used to style the native <code>tr</code> element.</li>
    * </ul>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.TableGroupRow
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-table-group-row
    * @since 1.0.0-rc.15
    * @implements sap.ui.webc.main.ITableRow
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/TableGroupRow", JSImport.Default)
  @js.native
  open class default () extends TableGroupRow
  object default {
    
    @JSImport("@ui5/webcomponents/dist/TableGroupRow", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/TableGroupRow", "default.i18nBundle")
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
    * The <code>ui5-table-group-row</code> component represents a group row in the <code>ui5-table</code>.
    *
    * <h3>CSS Shadow Parts</h3>
    *
    * <ui5-link target="_blank" href="https://developer.mozilla.org/en-US/docs/Web/CSS/::part">CSS Shadow Parts</ui5-link> allow developers to style elements inside the Shadow DOM.
    * <br>
    * The <code>ui5-table-group-row</code> exposes the following CSS Shadow Parts:
    * <ul>
    * <li>group-row - Used to style the native <code>tr</code> element.</li>
    * </ul>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.TableGroupRow
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-table-group-row
    * @since 1.0.0-rc.15
    * @implements sap.ui.webc.main.ITableRow
    * @public
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ui5WebcomponentsBase.distDelegateItemNavigationMod.ITabbable because var conflicts: _tabIndex, id. Inlined  */ @js.native
  trait TableGroupRow extends ITableRow {
    
    var _colSpan: js.UndefOr[Double] = js.native
    
    def _onfocusin(e: FocusEvent): Unit = js.native
    
    def ariaLabelText: String = js.native
    
    def colSpan: js.UndefOr[Double] = js.native
    
    def visibleColCount(): Double = js.native
  }
}
