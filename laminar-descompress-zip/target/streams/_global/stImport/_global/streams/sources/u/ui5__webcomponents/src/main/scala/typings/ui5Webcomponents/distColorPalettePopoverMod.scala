package typings.ui5Webcomponents

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import typings.ui5Webcomponents.distColorPaletteMod.ColorPaletteItemClickEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distColorPalettePopoverMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    * Represents a predefined range of colors for easier selection.
    *
    * Overview
    * The ColorPalettePopover provides the users with a slot to predefine colors.
    *
    * You can customize them with the use of the colors property. You can specify a defaultColor and display a "Default color" button for the user to choose directly.
    * You can display a "More colors..." button that opens an additional color picker for the user to choose specific colors that are not present in the predefined range.
    *
    * <h3>Usage</h3>
    *
    * The palette is intended for users, who don't want to check and remember the different values of the colors and spend large amount of time to configure the right color through the color picker.
    *
    * For the <code>ui5-color-palette-popover</code>
    * <h3>ES6 Module Import</h3>
    *
    * <code>import @ui5/webcomponents/dist/ColorPalettePopover.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.ColorPalettePopover
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-color-palette-popover
    * @public
    * @since 1.0.0-rc.16
    */
  @JSImport("@ui5/webcomponents/dist/ColorPalettePopover", JSImport.Default)
  @js.native
  open class default () extends ColorPalettePopover
  object default {
    
    @JSImport("@ui5/webcomponents/dist/ColorPalettePopover", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/ColorPalettePopover", "default.i18nBundle")
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
    * Represents a predefined range of colors for easier selection.
    *
    * Overview
    * The ColorPalettePopover provides the users with a slot to predefine colors.
    *
    * You can customize them with the use of the colors property. You can specify a defaultColor and display a "Default color" button for the user to choose directly.
    * You can display a "More colors..." button that opens an additional color picker for the user to choose specific colors that are not present in the predefined range.
    *
    * <h3>Usage</h3>
    *
    * The palette is intended for users, who don't want to check and remember the different values of the colors and spend large amount of time to configure the right color through the color picker.
    *
    * For the <code>ui5-color-palette-popover</code>
    * <h3>ES6 Module Import</h3>
    *
    * <code>import @ui5/webcomponents/dist/ColorPalettePopover.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.ColorPalettePopover
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-color-palette-popover
    * @public
    * @since 1.0.0-rc.16
    */
  @js.native
  trait ColorPalettePopover
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _cancelButtonLabel: String = js.native
    
    def _colorPalette(): typings.ui5Webcomponents.distColorPaletteMod.default = js.native
    
    def _colorPaletteTitle: String = js.native
    
    def _openPopover(opener: HTMLElement): Unit = js.native
    
    def _respPopover(): typings.ui5Webcomponents.distResponsivePopoverMod.default = js.native
    
    def closePopover(): Unit = js.native
    
    def colorPaletteColors: js.Array[Node] = js.native
    
    /**
      * Defines the content of the component.
      * @type {sap.ui.webc.main.IColorPaletteItem[]}
      * @name sap.ui.webc.main.ColorPalettePopover.prototype.default
      * @slot colors
      * @public
      */
    var colors: js.Array[typings.ui5Webcomponents.distColorPaletteItemMod.default] = js.native
    
    /**
      * Defines the default color of the component.
      * <b>Note:</b> The default color should be a part of the ColorPalette colors</code>
      * @type {sap.ui.webc.base.types.CSSColor}
      * @name sap.ui.webc.main.ColorPalettePopover.prototype.defaultColor
      * @public
      */
    var defaultColor: js.UndefOr[String] = js.native
    
    /**
      * Returns if the component is opened.
      *
      * @protected
      * @since 1.0.0-rc.16
      * @returns {boolean}
      */
    def isOpen(): Boolean = js.native
    
    def onSelectedColor(e: CustomEvent): Unit = js.native
    
    /**
      * Shows the ColorPalettePopover.
      * <b>Note:</b> The method is deprecated and will be removed in future, use <code>showAt</code> instead.
      * @param {HTMLElement} opener the element that the popover is shown at
      * @public
      * @method
      * @name sap.ui.webc.main.ColorPalettePopover#openPopover
      * @since 1.0.0-rc.16
      * @deprecated The method is deprecated in favour of <code>showAt</code>.
      */
    def openPopover(opener: HTMLElement): Unit = js.native
    
    var responsivePopover: js.UndefOr[typings.ui5Webcomponents.distResponsivePopoverMod.default] = js.native
    
    /**
      * Shows the ColorPalettePopover.
      * @param {HTMLElement} opener the element that the popover is shown at
      * @public
      * @method
      * @name sap.ui.webc.main.ColorPalettePopover#showAt
      * @since 1.1.1
      */
    def showAt(opener: HTMLElement): Unit = js.native
    
    /**
      * Defines whether the user can choose the default color from a button.
      * @type {boolean}
      * @name sap.ui.webc.main.ColorPalettePopover.prototype.showDefaultColor
      * @defaultvalue false
      * @public
      */
    var showDefaultColor: Boolean = js.native
    
    /**
      * Defines whether the user can choose a custom color from a component.
      * <b>Note:</b> In order to use this property you need to import the following module: <code>"@ui5/webcomponents/dist/features/ColorPaletteMoreColors.js"</code>
      * @type {boolean}
      * @name sap.ui.webc.main.ColorPalettePopover.prototype.showMoreColors
      * @defaultvalue false
      * @public
      */
    var showMoreColors: Boolean = js.native
    
    /**
      * Defines whether the user can see the last used colors in the bottom of the component
      * @type {boolean}
      * @name sap.ui.webc.main.ColorPalettePopover.prototype.showRecentColors
      * @defaultvalue false
      * @public
      */
    var showRecentColors: Boolean = js.native
  }
  
  type ColorPalettePopoverItemClickEventDetail = ColorPaletteItemClickEventDetail
}
