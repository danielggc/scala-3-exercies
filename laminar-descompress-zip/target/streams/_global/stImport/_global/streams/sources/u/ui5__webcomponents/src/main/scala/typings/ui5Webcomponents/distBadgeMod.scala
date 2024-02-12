package typings.ui5Webcomponents

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBadgeMod {
  
  /**
    * @class
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-badge</code> is a small non-interactive component which contains text information and color chosen from a list of predefined color schemes.
    * It serves the purpose to attract the user attention to some piece of information (state, quantity, condition, etc.).
    *
    * <h3>Usage Guidelines</h3>
    * <ul>
    * <li>If the text is longer than the width of the component, it doesn’t wrap, it shows ellipsis.</li>
    * <li>When truncated, the full text is not visible, therefore, it’s recommended to make more space for longer texts to be fully displayed.</li>
    * <li>Colors are not semantic and have no visual representation in High Contrast Black (sap_belize_hcb) theme.</li>
    * </ul>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/Badge";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.Badge
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-badge
    * @since 0.12.0
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/Badge", JSImport.Default)
  @js.native
  open class default () extends Badge
  object default {
    
    @JSImport("@ui5/webcomponents/dist/Badge", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/Badge", "default.i18nBundle")
    @js.native
    def i18nBundle: typings.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: typings.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def onDefine(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("onDefine")().asInstanceOf[js.Promise[Unit]]
  }
  
  /**
    * @class
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-badge</code> is a small non-interactive component which contains text information and color chosen from a list of predefined color schemes.
    * It serves the purpose to attract the user attention to some piece of information (state, quantity, condition, etc.).
    *
    * <h3>Usage Guidelines</h3>
    * <ul>
    * <li>If the text is longer than the width of the component, it doesn’t wrap, it shows ellipsis.</li>
    * <li>When truncated, the full text is not visible, therefore, it’s recommended to make more space for longer texts to be fully displayed.</li>
    * <li>Colors are not semantic and have no visual representation in High Contrast Black (sap_belize_hcb) theme.</li>
    * </ul>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/Badge";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.Badge
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-badge
    * @since 0.12.0
    * @public
    */
  @js.native
  trait Badge
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    /**
      * Defines if the badge has an icon.
      * @private
      */
    var _hasIcon: Boolean = js.native
    
    /**
      * Defines if the badge has only an icon (and no text).
      * @private
      */
    var _iconOnly: Boolean = js.native
    
    def badgeDescription: String = js.native
    
    /**
      * Defines the color scheme of the component.
      * There are 10 predefined schemes. Each scheme applies different values for the <code>background-color</code> and <code>border-color</code>.
      * To use one you can set a number from <code>"1"</code> to <code>"10"</code>. The <code>colorScheme</code> <code>"1"</code> will be set by default.
      * <br><br>
      * <b>Note:</b> Color schemes have no visual representation in High Contrast Black (sap_belize_hcb) theme.
      * @type {string}
      * @name sap.ui.webc.main.Badge.prototype.colorScheme
      * @defaultvalue "1"
      * @public
      */
    var colorScheme: String = js.native
    
    def hasIcon: Boolean = js.native
    
    def hasText: Boolean = js.native
    
    /**
      * Defines the icon to be displayed in the component.
      *
      * @type {sap.ui.webc.main.IIcon}
      * @name sap.ui.webc.main.Badge.prototype.icon
      * @slot
      * @public
      */
    var icon: js.Array[HTMLElement] = js.native
    
    def iconOnly: Boolean = js.native
    
    /**
      * Defines the text of the component.
      * <br><b>Note:</b> Although this slot accepts HTML Elements, it is strongly recommended that you only use text in order to preserve the intended design.
      *
      * @type {Node[]}
      * @name sap.ui.webc.main.Badge.prototype.default
      * @slot
      * @public
      */
    var text: js.Array[Node] = js.native
  }
}
