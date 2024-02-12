package typings.ui5Webcomponents

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import typings.ui5Webcomponents.distTypesAvatarColorSchemeMod.AvatarColorScheme
import typings.ui5Webcomponents.distTypesAvatarShapeMod.AvatarShape
import typings.ui5Webcomponents.distTypesAvatarSizeMod.AvatarSize
import typings.ui5Webcomponents.ui5WebcomponentsStrings.button
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAvatarMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * An image-like component that has different display options for representing images and icons
    * in different shapes and sizes, depending on the use case.
    *
    * The shape can be circular or square. There are several predefined sizes, as well as an option to
    * set a custom size.
    *
    * <br><br>
    * <h3>Keyboard Handling</h3>
    *
    * <ul>
    * <li>[SPACE, ENTER, RETURN] - Fires the <code>click</code> event if the <code>interactive</code> property is set to true.</li>
    * <li>[SHIFT] - If [SPACE] is pressed, pressing [SHIFT] releases the component without triggering the click event.</li>
    * </ul>
    * <br><br>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/Avatar.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.Avatar
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-avatar
    * @since 1.0.0-rc.6
    * @implements sap.ui.webc.main.IAvatar
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/Avatar", JSImport.Default)
  @js.native
  open class default () extends Avatar
  object default {
    
    @JSImport("@ui5/webcomponents/dist/Avatar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/Avatar", "default.i18nBundle")
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
    * An image-like component that has different display options for representing images and icons
    * in different shapes and sizes, depending on the use case.
    *
    * The shape can be circular or square. There are several predefined sizes, as well as an option to
    * set a custom size.
    *
    * <br><br>
    * <h3>Keyboard Handling</h3>
    *
    * <ul>
    * <li>[SPACE, ENTER, RETURN] - Fires the <code>click</code> event if the <code>interactive</code> property is set to true.</li>
    * <li>[SHIFT] - If [SPACE] is pressed, pressing [SHIFT] releases the component without triggering the click event.</li>
    * </ul>
    * <br><br>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/Avatar.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.Avatar
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-avatar
    * @since 1.0.0-rc.6
    * @implements sap.ui.webc.main.IAvatar
    * @public
    */
  @js.native
  trait Avatar
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _ariaHasPopup: js.UndefOr[String] = js.native
    
    def _checkInitials(): String = js.native
    
    /**
      * @private
      */
    var _colorScheme: AvatarColorScheme = js.native
    
    /**
      * Returns the effective background color.
      * @readonly
      * @type {string}
      * @defaultValue "Accent6"
      * @private
      */
    def _effectiveBackgroundColor: String = js.native
    
    /**
      * Returns the effective avatar size.
      * @readonly
      * @type {string}
      * @defaultValue "S"
      * @private
      */
    def _effectiveSize: String = js.native
    
    def _getAriaHasPopup(): js.UndefOr[String] = js.native
    
    var _hasImage: Boolean = js.native
    
    def _onClickHandler(e: MouseEvent): Unit = js.native
    
    var _onclick: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.native
    
    def _onfocusin(): Unit = js.native
    
    def _onfocusout(): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeyup(e: KeyboardEvent): Unit = js.native
    
    def _role: js.UndefOr[button] = js.native
    
    def _setFallbackIcon(): String = js.native
    
    /**
      * @private
      */
    var _size: AvatarSize = js.native
    
    var _tabIndex: String = js.native
    
    /**
      * Defines the text alternative of the component.
      * If not provided a default text alternative will be set, if present.
      *
      * @type {string}
      * @name sap.ui.webc.main.Avatar.prototype.accessibleName
      * @defaultvalue ""
      * @public
      * @since 1.0.0-rc.7
      */
    var accessibleName: String = js.native
    
    def accessibleNameText: js.UndefOr[String] = js.native
    
    /**
      * Defines the aria-haspopup value of the component when <code>interactive</code> property is <code>true</code>.
      * <br><br>
      * @type String
      * @since 1.0.0-rc.15
      * @protected
      */
    var ariaHaspopup: String = js.native
    
    /**
      * Defines the optional badge that will be used for visual affordance.
      * <b>Note:</b> While the slot allows for custom badges, to achieve
      * the Fiori design, please use <code>ui5-badge</code> with <code>ui5-icon</code>
      * in the corresponding <code>icon</code> slot, without text nodes.
      * <br><br>
      * Example:
      * <br><br>
      * &lt;ui5-avatar><br>
      * &nbsp;&nbsp;&nbsp;&nbsp;&lt;ui5-badge slot="badge"><br>
      * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&lt;ui5-icon slot="icon" name="employee">&lt;/ui5-icon><br>
      * &nbsp;&nbsp;&nbsp;&nbsp;&lt;/ui5-badge><br>
      * &lt;/ui5-avatar>
      * <br><br>
      * <ui5-avatar initials="AB" color-scheme="Accent1">
      * <ui5-badge slot="badge">
      * <ui5-icon slot="icon" name="accelerated"></ui5-icon>
      * </ui5-badge>
      * </ui5-avatar>
      *
      * @type {HTMLElement}
      * @name sap.ui.webc.main.Avatar.prototype.badge
      * @slot badge
      * @public
      * @since 1.7.0
      */
    var badge: js.Array[HTMLElement] = js.native
    
    /**
      * Defines the background color of the desired image.
      * <br><br>
      * Available options are:
      * <ul>
      * <li><code>Accent1</code></li>
      * <li><code>Accent2</code></li>
      * <li><code>Accent3</code></li>
      * <li><code>Accent4</code></li>
      * <li><code>Accent5</code></li>
      * <li><code>Accent6</code></li>
      * <li><code>Accent7</code></li>
      * <li><code>Accent8</code></li>
      * <li><code>Accent9</code></li>
      * <li><code>Accent10</code></li>
      * <li><code>Placeholder</code></li>
      * </ul>
      * @type {sap.ui.webc.main.types.AvatarColorScheme}
      * @name sap.ui.webc.main.Avatar.prototype.colorScheme
      * @defaultvalue "Accent6"
      * @public
      */
    var colorScheme: AvatarColorScheme = js.native
    
    /**
      * Indicates if the elements is on focus
      * @private
      */
    var focused: Boolean = js.native
    
    def hasImage: Boolean = js.native
    
    /**
      * Defines the name of the UI5 Icon, that will be displayed.
      * <br>
      * <b>Note:</b> If <code>image</code> slot is provided, the property will be ignored.
      * <br>
      * <b>Note:</b> You should import the desired icon first, then use its name as "icon".
      * <br><br>
      * import "@ui5/webcomponents-icons/dist/{icon_name}.js"
      * <br>
      * <pre>&lt;ui5-avatar icon="employee"></pre>
      *
      * See all the available icons in the <ui5-link target="_blank" href="https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html" class="api-table-content-cell-link">Icon Explorer</ui5-link>.
      * @type {string}
      * @name sap.ui.webc.main.Avatar.prototype.icon
      * @defaultvalue ""
      * @public
      */
    var icon: String = js.native
    
    /**
      * Receives the desired <code>&lt;img&gt;</code> tag
      *
      * <b>Note:</b> If you experience flickering of the provided image, you can hide the component until it is being defined with the following CSS:
      * <br /> <br />
      * <code>
      *		ui5-avatar:not(:defined) { <br />
      *			&nbsp;visibility: hidden; <br />
      *		} <br />
      * </code>
      * @type {HTMLElement}
      * @name sap.ui.webc.main.Avatar.prototype.default
      * @slot image
      * @public
      * @since 1.0.0-rc.15
      */
    var image: js.Array[HTMLElement] = js.native
    
    /**
      * Defines the displayed initials.
      * <br>
      * Up to three Latin letters can be displayed as initials.
      *
      * @type {string}
      * @name sap.ui.webc.main.Avatar.prototype.initials
      * @defaultvalue ""
      * @public
      */
    var initials: String = js.native
    
    /**
      * Defines if the avatar is interactive (focusable and pressable).
      * @type {boolean}
      * @name sap.ui.webc.main.Avatar.prototype.interactive
      * @defaultValue false
      * @public
      */
    var interactive: Boolean = js.native
    
    /**
      * Defines the shape of the component.
      * <br><br>
      * Available options are:
      * <ul>
      * <li><code>Circle</code></li>
      * <li><code>Square</code></li>
      * </ul>
      * @type {sap.ui.webc.main.types.AvatarShape}
      * @name sap.ui.webc.main.Avatar.prototype.shape
      * @defaultvalue "Circle"
      * @public
      */
    var shape: AvatarShape = js.native
    
    /**
      * Defines predefined size of the component.
      * <br><br>
      * Available options are:
      * <ul>
      * <li><code>XS</code></li>
      * <li><code>S</code></li>
      * <li><code>M</code></li>
      * <li><code>L</code></li>
      * <li><code>XL</code></li>
      * </ul>
      * @type {sap.ui.webc.main.types.AvatarSize}
      * @name sap.ui.webc.main.Avatar.prototype.size
      * @defaultvalue "S"
      * @public
      */
    var size: AvatarSize = js.native
    
    def tabindex: String = js.native
    
    def validInitials: String | Null = js.native
  }
}
