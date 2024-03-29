package typings.ui5Webcomponents

import typings.ui5Webcomponents.distTypesWrappingTypeMod.WrappingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLabelMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-label</code> is a component used to represent a label,
    * providing valuable information to the user.
    * Usually it is placed next to a value holder, such as a text field.
    * It informs the user about what data is displayed or expected in the value holder.
    * <br><br>
    * The <code>ui5-label</code> appearance can be influenced by properties,
    * such as <code>required</code> and <code>wrappingType</code>.
    * The appearance of the Label can be configured in a limited way by using the design property.
    * For a broader choice of designs, you can use custom styles.
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/Label";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.Label
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-label
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/Label", JSImport.Default)
  @js.native
  open class default () extends Label
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-label</code> is a component used to represent a label,
    * providing valuable information to the user.
    * Usually it is placed next to a value holder, such as a text field.
    * It informs the user about what data is displayed or expected in the value holder.
    * <br><br>
    * The <code>ui5-label</code> appearance can be influenced by properties,
    * such as <code>required</code> and <code>wrappingType</code>.
    * The appearance of the Label can be configured in a limited way by using the design property.
    * For a broader choice of designs, you can use custom styles.
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/Label";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.Label
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-label
    * @public
    */
  @js.native
  trait Label
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _onclick(): Unit = js.native
    
    /**
      * Defines the labeled input by providing its ID.
      * <br><br>
      * <b>Note:</b> Can be used with both <code>ui5-input</code> and native input.
      *
      * @type {string}
      * @name sap.ui.webc.main.Label.prototype.for
      * @defaultvalue ""
      * @public
      */
    var `for`: String = js.native
    
    /**
      * Defines whether an asterisk character is added to the component text.
      * <br><br>
      * <b>Note:</b> Usually indicates that user input (bound with the <code>for</code> property) is required.
      * In that case the <code>required</> property of
      * the corresponding input should also be set.
      *
      * @name sap.ui.webc.main.Label.prototype.required
      * @type {boolean}
      * @defaultvalue false
      * @public
      */
    var required: Boolean = js.native
    
    /**
      * Defines whether colon is added to the component text.
      * <br><br>
      * <b>Note:</b> Usually used in forms.
      * @name sap.ui.webc.main.Label.prototype.showColon
      * @type {boolean}
      * @defaultvalue false
      * @public
      */
    var showColon: Boolean = js.native
    
    /**
      * Defines how the text of a component will be displayed when there is not enough space.
      * Available options are:
      * <ul>
      * <li><code>None</code> - The text will be truncated with an ellipsis.</li>
      * <li><code>Normal</code> - The text will wrap. The words will not be broken based on hyphenation.</li>
      * </ul>
      *
      * @name sap.ui.webc.main.Label.prototype.wrappingType
      * @type {sap.ui.webc.main.types.WrappingType}
      * @defaultvalue "None"
      * @public
      */
    var wrappingType: WrappingType = js.native
  }
}
