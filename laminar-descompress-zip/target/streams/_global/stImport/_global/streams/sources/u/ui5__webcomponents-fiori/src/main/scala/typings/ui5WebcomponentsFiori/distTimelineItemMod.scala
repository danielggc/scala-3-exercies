package typings.ui5WebcomponentsFiori

import typings.ui5WebcomponentsFiori.distTypesTimelineLayoutMod.TimelineLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTimelineItemMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * An entry posted on the timeline.
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.fiori.TimelineItem
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-timeline-item
    * @implements sap.ui.webc.fiori.ITimelineItem
    * @public
    */
  @JSImport("@ui5/webcomponents-fiori/dist/TimelineItem", JSImport.Default)
  @js.native
  open class default () extends TimelineItem
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * An entry posted on the timeline.
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.fiori.TimelineItem
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-timeline-item
    * @implements sap.ui.webc.fiori.ITimelineItem
    * @public
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ui5WebcomponentsBase.distDelegateItemNavigationMod.ITabbable because var conflicts: id. Inlined _tabIndex */ @js.native
  trait TimelineItem
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    /**
      * Defines the indicator line width.
      *
      * @type {string}
      * @private
      */
    var _lineWidth: String = js.native
    
    var _tabIndex: String = js.native
    
    /**
      * Focus the internal link.
      * @protected
      */
    def focusLink(): Unit = js.native
    
    /**
      * Defines the icon to be displayed as graphical element within the <code>ui5-timeline-item</code>.
      * SAP-icons font provides numerous options.
      * <br><br>
      *
      * See all the available icons in the <ui5-link target="_blank" href="https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html" class="api-table-content-cell-link">Icon Explorer</ui5-link>.
      *
      * @type {string}
      * @name sap.ui.webc.fiori.TimelineItem.prototype.icon
      * @defaultvalue ""
      * @public
      */
    var icon: String = js.native
    
    /**
      * Defines the items orientation.
      *
      * @type {sap.ui.webc.fiori.types.TimelineLayout}
      * @defaultvalue "Vertical"
      * @private
      */
    var layout: TimelineLayout = js.native
    
    /**
      * Defines the name of the item, displayed before the <code>title-text</code>.
      *
      * @type {string}
      * @name sap.ui.webc.fiori.TimelineItem.prototype.name
      * @defaultvalue ""
      * @public
      */
    var name: String = js.native
    
    /**
      * Defines if the <code>name</code> is clickable.
      *
      * @type {boolean}
      * @name sap.ui.webc.fiori.TimelineItem.prototype.nameClickable
      * @defaultvalue false
      * @public
      */
    var nameClickable: Boolean = js.native
    
    def onNamePress(): Unit = js.native
    
    /**
      * Defines the subtitle text of the component.
      * @type {string}
      * @name sap.ui.webc.fiori.TimelineItem.prototype.subtitleText
      * @defaultvalue ""
      * @public
      */
    var subtitleText: String = js.native
    
    /**
      * Defines the title text of the component.
      *
      * @type {string}
      * @name sap.ui.webc.fiori.TimelineItem.prototype.titleText
      * @defaultvalue ""
      * @public
      */
    var titleText: String = js.native
  }
}
