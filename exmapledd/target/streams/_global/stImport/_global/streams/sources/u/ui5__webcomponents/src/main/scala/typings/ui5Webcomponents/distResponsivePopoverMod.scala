package typings.ui5Webcomponents

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.HTMLElement
import typings.ui5Webcomponents.distPopupMod.PopupBeforeCloseEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distResponsivePopoverMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    * The <code>ui5-responsive-popover</code> acts as a Popover on desktop and tablet, while on phone it acts as a Dialog.
    * The component improves tremendously the user experience on mobile.
    *
    * <h3>Usage</h3>
    * Use it when you want to make sure that all the content is visible on any device.
    *
    * <h3>CSS Shadow Parts</h3>
    *
    * <ui5-link target="_blank" href="https://developer.mozilla.org/en-US/docs/Web/CSS/::part">CSS Shadow Parts</ui5-link> allow developers to style elements inside the Shadow DOM.
    * <br>
    * The <code>ui5-responsive-popover</code> exposes the following CSS Shadow Parts:
    * <ul>
    * <li>header - Used to style the header of the component</li>
    * <li>content - Used to style the content of the component</li>
    * <li>footer - Used to style the footer of the component</li>
    * </ul>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.ResponsivePopover
    * @extends sap.ui.webc.main.Popover
    * @tagname ui5-responsive-popover
    * @since 1.0.0-rc.6
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/ResponsivePopover", JSImport.Default)
  @js.native
  open class default () extends ResponsivePopover
  object default {
    
    @JSImport("@ui5/webcomponents/dist/ResponsivePopover", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/ResponsivePopover", "default.i18nBundle")
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
    * The <code>ui5-responsive-popover</code> acts as a Popover on desktop and tablet, while on phone it acts as a Dialog.
    * The component improves tremendously the user experience on mobile.
    *
    * <h3>Usage</h3>
    * Use it when you want to make sure that all the content is visible on any device.
    *
    * <h3>CSS Shadow Parts</h3>
    *
    * <ui5-link target="_blank" href="https://developer.mozilla.org/en-US/docs/Web/CSS/::part">CSS Shadow Parts</ui5-link> allow developers to style elements inside the Shadow DOM.
    * <br>
    * The <code>ui5-responsive-popover</code> exposes the following CSS Shadow Parts:
    * <ul>
    * <li>header - Used to style the header of the component</li>
    * <li>content - Used to style the content of the component</li>
    * <li>footer - Used to style the footer of the component</li>
    * </ul>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.ResponsivePopover
    * @extends sap.ui.webc.main.Popover
    * @tagname ui5-responsive-popover
    * @since 1.0.0-rc.6
    * @public
    */
  @js.native
  trait ResponsivePopover
    extends typings.ui5Webcomponents.distPopoverMod.default {
    
    def _afterDialogClose(e: CustomEvent): Unit = js.native
    
    def _beforeDialogOpen(e: CustomEvent): Unit = js.native
    
    def _closeDialogAriaLabel: String = js.native
    
    def _dialog: typings.ui5Webcomponents.distDialogMod.default = js.native
    
    /**
      * Defines whether a close button will be rendered in the header of the component
      * <b>Note:</b> If you are using the <code>header</code> slot, this property will have no effect
      *
      * @private
      * @type {boolean}
      * @defaultvalue false
      * @since 1.0.0-rc.16
      */
    var _hideCloseButton: Boolean = js.native
    
    /**
      * Used internaly for controls which must not have header.
      * @private
      */
    var _hideHeader: Boolean = js.native
    
    def _isPhone: Boolean = js.native
    
    def _propagateDialogEvent(e: CustomEvent): Unit = js.native
    
    /**
      * Defines if only the content would be displayed (without header and footer) in the popover on Desktop.
      * By default both the header and footer would be displayed.
      * @private
      */
    var contentOnlyOnDesktop: Boolean = js.native
    
    def toggle(opener: HTMLElement): Unit = js.native
  }
  
  type ResponsivePopoverBeforeCloseEventDetail = PopupBeforeCloseEventDetail
}
