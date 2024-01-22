package typings.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCalendarDateMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-date</code> component defines a calendar date to be used inside <code>ui5-calendar</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.CalendarDate
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-date
    * @implements sap.ui.webc.main.ICalendarDate
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/CalendarDate", JSImport.Default)
  @js.native
  open class default () extends CalendarDate
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-date</code> component defines a calendar date to be used inside <code>ui5-calendar</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.CalendarDate
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-date
    * @implements sap.ui.webc.main.ICalendarDate
    * @public
    */
  @js.native
  trait CalendarDate
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    /**
      * The date formatted according to the <code>formatPattern</code> property
      * of the <code>ui5-calendar</code> that hosts the component.
      *
      * @type {string}
      * @name sap.ui.webc.main.CalendarDate.prototype.value
      * @public
      */
    var value: String = js.native
  }
}
