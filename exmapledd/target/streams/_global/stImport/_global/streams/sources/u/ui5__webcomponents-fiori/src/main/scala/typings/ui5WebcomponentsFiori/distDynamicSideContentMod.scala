package typings.ui5WebcomponentsFiori

import org.scalajs.dom.HTMLElement
import typings.ui5WebcomponentsFiori.anon.LabelString
import typings.ui5WebcomponentsFiori.anon.Main
import typings.ui5WebcomponentsFiori.distTypesSideContentFallDownMod.SideContentFallDown
import typings.ui5WebcomponentsFiori.distTypesSideContentPositionMod.SideContentPosition
import typings.ui5WebcomponentsFiori.distTypesSideContentVisibilityMod.SideContentVisibility
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDynamicSideContentMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The DynamicSideContent (<code>ui5-dynamic-side-content</code>) is a layout component that allows additional content
    * to be displayed in a way that flexibly adapts to different screen sizes. The side
    * content appears in a container next to or directly below the main content
    * (it doesn't overlay). When the side content is triggered, the main content becomes
    * narrower (if appearing side-by-side). The side content contains a separate scrollbar
    * when appearing next to the main content.
    *
    *
    * <h3>Usage</h3>
    *
    * <i>When to use?</i>
    *
    * Use this component if you want to display relevant information that is not critical
    * for users to complete a task. Users should have access to all the key functions and
    * critical information in the app even if they do not see the side content. This is
    * important because on smaller screen sizes it may be difficult to display the side
    * content in a way that is easily accessible for the user.
    *
    * <i>When not to use?</i>
    *
    * Don't use it if you want to display navigation or critical information that prevents
    * users from completing a task when they have no access to the side content.
    *
    *
    * <h3>Responsive Behavior</h3>
    *
    * Screen width > 1440px
    *
    * <ul><li>Main vs. side content ratio is 75 vs. 25 percent (with a minimum of 320px
    * each).</li>
    * <li>If the application defines a trigger, the side content can be hidden.</li></ul>
    *
    * Screen width <= 1440px and > 1024px
    *
    * <ul><li>Main vs. side content ratio is 66.666 vs. 33.333 percent (with a minimum of
    * 320px each). If the side content width falls below 320 px, it automatically slides
    * under the main content, unless the app development team specifies that it should
    * disappear.</li></ul>
    *
    * Screen width <= 1024px and > 720px
    *
    * <ul><li>The side content ratio is fixed to 340px, and the main content takes the rest
    * of the width. Only if the <code>sideContentFallDown</code> is set to <code>OnMinimumWidth</code>
    * and screen width is <= 960px and > 720px the side content falls below the main content.</li></ul>
    *
    * Screen width <= 720px (for example on a mobile device)
    *
    * <ul><li>In this case, the side content automatically disappears from the screen (unless
    * specified to stay under the content by setting of <code>sideContentVisibility</code>
    * property to <code>AlwaysShow</code>) and can be triggered from a pre-set trigger
    * (specified within the app). When the side content is triggered, it replaces the main
    * content. We recommend that you always place the trigger for the side content in the
    * same location, such as in the app footer.</li></ul>
    *
    * A special case allows switching the comparison mode between the main and side content.
    * In this case, the screen is split into 50:50 percent for main vs. side content. The
    * responsive behavior of the equal split is the same as in the standard view - the
    * side content disappears on screen widths of less than 720 px and can only be
    * viewed by triggering it.
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents-fiori/dist/DynamicSideContent";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.fiori.DynamicSideContent
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-dynamic-side-content
    * @public
    * @since 1.1.0
    */
  @JSImport("@ui5/webcomponents-fiori/dist/DynamicSideContent", JSImport.Default)
  @js.native
  open class default () extends DynamicSideContent
  object default {
    
    @JSImport("@ui5/webcomponents-fiori/dist/DynamicSideContent", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents-fiori/dist/DynamicSideContent", "default.i18nBundle")
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
    * The DynamicSideContent (<code>ui5-dynamic-side-content</code>) is a layout component that allows additional content
    * to be displayed in a way that flexibly adapts to different screen sizes. The side
    * content appears in a container next to or directly below the main content
    * (it doesn't overlay). When the side content is triggered, the main content becomes
    * narrower (if appearing side-by-side). The side content contains a separate scrollbar
    * when appearing next to the main content.
    *
    *
    * <h3>Usage</h3>
    *
    * <i>When to use?</i>
    *
    * Use this component if you want to display relevant information that is not critical
    * for users to complete a task. Users should have access to all the key functions and
    * critical information in the app even if they do not see the side content. This is
    * important because on smaller screen sizes it may be difficult to display the side
    * content in a way that is easily accessible for the user.
    *
    * <i>When not to use?</i>
    *
    * Don't use it if you want to display navigation or critical information that prevents
    * users from completing a task when they have no access to the side content.
    *
    *
    * <h3>Responsive Behavior</h3>
    *
    * Screen width > 1440px
    *
    * <ul><li>Main vs. side content ratio is 75 vs. 25 percent (with a minimum of 320px
    * each).</li>
    * <li>If the application defines a trigger, the side content can be hidden.</li></ul>
    *
    * Screen width <= 1440px and > 1024px
    *
    * <ul><li>Main vs. side content ratio is 66.666 vs. 33.333 percent (with a minimum of
    * 320px each). If the side content width falls below 320 px, it automatically slides
    * under the main content, unless the app development team specifies that it should
    * disappear.</li></ul>
    *
    * Screen width <= 1024px and > 720px
    *
    * <ul><li>The side content ratio is fixed to 340px, and the main content takes the rest
    * of the width. Only if the <code>sideContentFallDown</code> is set to <code>OnMinimumWidth</code>
    * and screen width is <= 960px and > 720px the side content falls below the main content.</li></ul>
    *
    * Screen width <= 720px (for example on a mobile device)
    *
    * <ul><li>In this case, the side content automatically disappears from the screen (unless
    * specified to stay under the content by setting of <code>sideContentVisibility</code>
    * property to <code>AlwaysShow</code>) and can be triggered from a pre-set trigger
    * (specified within the app). When the side content is triggered, it replaces the main
    * content. We recommend that you always place the trigger for the side content in the
    * same location, such as in the app footer.</li></ul>
    *
    * A special case allows switching the comparison mode between the main and side content.
    * In this case, the screen is split into 50:50 percent for main vs. side content. The
    * responsive behavior of the equal split is the same as in the standard view - the
    * side content disappears on screen widths of less than 720 px and can only be
    * viewed by triggering it.
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents-fiori/dist/DynamicSideContent";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.fiori.DynamicSideContent
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-dynamic-side-content
    * @public
    * @since 1.1.0
    */
  @js.native
  trait DynamicSideContent
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    /**
      * @private
      */
    var _currentBreakpoint: String = js.native
    
    def _handleResizeBound(): Unit = js.native
    
    def _isSideContentFirst: Boolean = js.native
    
    /**
      * @private
      */
    var _mcSpan: String = js.native
    
    def _resizeContents(): Unit = js.native
    
    /**
      * @private
      */
    var _scSpan: String = js.native
    
    def _setSpanSizes(mainSize: String, sideSize: String): Unit = js.native
    
    /**
      * @private
      */
    var _toggled: Boolean = js.native
    
    def accInfo: LabelString = js.native
    
    def breakpoint: String = js.native
    
    def containerWidth: Double = js.native
    
    /**
      * Defines whether the component is in equal split mode. In this mode, the side and
      * the main content take 50:50 percent of the container on all screen sizes
      * except for phone, where the main and side contents are switching visibility
      * using the toggle method.
      *
      * @type {boolean}]
      * @name sap.ui.webc.fiori.DynamicSideContent.prototype.equalSplit
      * @defaultvalue false
      * @public
      *
      */
    var equalSplit: Boolean = js.native
    
    def handleResize(): Unit = js.native
    
    /**
      * Defines the visibility of the main content.
      *
      * @type {boolean}
      * @name sap.ui.webc.fiori.DynamicSideContent.prototype.hideMainContent
      * @defaultvalue false
      * @public
      *
      */
    var hideMainContent: Boolean = js.native
    
    /**
      * Defines the visibility of the side content.
      *
      * @type {boolean}
      * @name sap.ui.webc.fiori.DynamicSideContent.prototype.hideSideContent
      * @defaultvalue false
      * @public
      *
      */
    var hideSideContent: Boolean = js.native
    
    /**
      * Defines the main content.
      *
      * @type {HTMLElement[]}
      * @name sap.ui.webc.fiori.DynamicSideContent.prototype.default
      * @slot
      * @public
      */
    /**
      * Defines the side content.
      *
      * @type {HTMLElement[]}
      * @name sap.ui.webc.fiori.DynamicSideContent.prototype.sideContent
      * @slot
      * @public
      */
    var sideContent: js.Array[HTMLElement] = js.native
    
    /**
      * Defines on which breakpoints the side content falls down below the main content.
      *
      * <br><br>
      * <b>The available values are:</b>
      *
      * <ul>
      * <li><code>BelowXL</code></li>
      * <li><code>BelowL</code></li>
      * <li><code>BelowM</code></li>
      * <li><code>OnMinimumWidth</code></li>
      * </ul>
      *
      * @type {sap.ui.webc.fiori.types.SideContentFallDown}
      * @name sap.ui.webc.fiori.DynamicSideContent.prototype.sideContentFallDown
      * @defaultvalue "OnMinimumWidth"
      * @public
      *
      */
    var sideContentFallDown: SideContentFallDown = js.native
    
    /**
      * Defines whether the side content is positioned before the main content (left side
      * in LTR mode), or after the the main content (right side in LTR mode).
      *
      * <br><br>
      * <b>The available values are:</b>
      *
      * <ul>
      * <li><code>Start</code></li>
      * <li><code>End</code></li>
      * </ul>
      *
      * @type {sap.ui.webc.fiori.types.SideContentPosition}
      * @name sap.ui.webc.fiori.DynamicSideContent.prototype.sideContentPosition
      * @defaultvalue "End"
      * @public
      *
      */
    var sideContentPosition: SideContentPosition = js.native
    
    /**
      * Defines on which breakpoints the side content is visible.
      *
      * <br><br>
      * <b>The available values are:</b>
      *
      * <ul>
      * <li><code>AlwaysShow</code></li>
      * <li><code>ShowAboveL</code></li>
      * <li><code>ShowAboveM</code></li>
      * <li><code>ShowAboveS</code></li>
      * <li><code>NeverShow</code></li>
      * </ul>
      *
      * @type {sap.ui.webc.fiori.types.SideContentVisibility}
      * @name sap.ui.webc.fiori.DynamicSideContent.prototype.sideContentVisibility
      * @defaultvalue "ShowAboveS"
      * @public
      *
      */
    var sideContentVisibility: SideContentVisibility = js.native
    
    def sizeL: String = js.native
    
    def sizeM: String = js.native
    
    def sizeS: String = js.native
    
    def sizeXL: String = js.native
    
    def span0: String = js.native
    
    def span12: String = js.native
    
    def span3: String = js.native
    
    def span4: String = js.native
    
    def span6: String = js.native
    
    def span8: String = js.native
    
    def span9: String = js.native
    
    def spanFixed: String = js.native
    
    def styles: Main = js.native
    
    /**
      * Toggles visibility of main and side contents on S screen size (mobile device).
      * @public
      * @method
      * @name sap.ui.webc.fiori.DynamicSideContent#toggleContents
      */
    def toggleContents(): Unit = js.native
  }
}
