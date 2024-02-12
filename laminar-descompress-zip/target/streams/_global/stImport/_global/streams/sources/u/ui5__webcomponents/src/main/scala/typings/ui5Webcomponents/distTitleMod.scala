package typings.ui5Webcomponents

import typings.ui5Webcomponents.distTypesTitleLevelMod.TitleLevel
import typings.ui5Webcomponents.distTypesWrappingTypeMod.WrappingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTitleMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-title</code> component is used to display titles inside a page.
    * It is a simple, large-sized text with explicit header/title semantics.
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/Title";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.Title
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-title
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/Title", JSImport.Default)
  @js.native
  open class default () extends Title
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-title</code> component is used to display titles inside a page.
    * It is a simple, large-sized text with explicit header/title semantics.
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/Title";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.Title
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-title
    * @public
    */
  @js.native
  trait Title
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def h1: Boolean = js.native
    
    def h2: Boolean = js.native
    
    def h3: Boolean = js.native
    
    def h4: Boolean = js.native
    
    def h5: Boolean = js.native
    
    def h6: Boolean = js.native
    
    /**
      * Defines the component level.
      * Available options are: <code>"H6"</code> to <code>"H1"</code>.
      *
      * @name sap.ui.webc.main.Title.prototype.level
      * @type {sap.ui.webc.main.types.TitleLevel}
      * @defaultvalue "H2"
      * @public
      */
    var level: TitleLevel = js.native
    
    def normalizedLevel: String = js.native
    
    /**
      * Defines how the text of a component will be displayed when there is not enough space.
      * Available options are:
      * <ul>
      * <li><code>None</code> - The text will be truncated with an ellipsis.</li>
      * <li><code>Normal</code> - The text will wrap. The words will not be broken based on hyphenation.</li>
      * </ul>
      *
      * @name sap.ui.webc.main.Title.prototype.wrappingType
      * @type {sap.ui.webc.main.types.WrappingType}
      * @defaultvalue "None"
      * @public
      */
    var wrappingType: WrappingType = js.native
  }
}
