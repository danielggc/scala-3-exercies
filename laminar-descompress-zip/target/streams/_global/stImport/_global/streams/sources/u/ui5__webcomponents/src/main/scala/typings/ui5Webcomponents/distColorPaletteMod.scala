package typings.ui5Webcomponents

import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import typings.ui5Webcomponents.ui5WebcomponentsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distColorPaletteMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    * The <code>ui5-color-palette</code> provides the users with a range of predefined colors. The colors are fixed and do not change with the theme.
    *
    * <h3>Usage</h3>
    *
    * The <code>ui5-color-palette</code> is meant for users that need to select a color from a predefined set.
    * To define the colors, use the <code>ui5-color-palette-item</code> component inside the default slot of the <code>ui5-color-palette</code>.
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/ColorPalette.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.ColorPalette
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-color-palette
    * @since 1.0.0-rc.12
    * @appenddocs ColorPaletteItem
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/ColorPalette", JSImport.Default)
  @js.native
  open class default () extends ColorPalette
  object default {
    
    @JSImport("@ui5/webcomponents/dist/ColorPalette", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/ColorPalette", "default.i18nBundle")
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
    * The <code>ui5-color-palette</code> provides the users with a range of predefined colors. The colors are fixed and do not change with the theme.
    *
    * <h3>Usage</h3>
    *
    * The <code>ui5-color-palette</code> is meant for users that need to select a color from a predefined set.
    * To define the colors, use the <code>ui5-color-palette-item</code> component inside the default slot of the <code>ui5-color-palette</code>.
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/ColorPalette.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.ColorPalette
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-color-palette
    * @since 1.0.0-rc.12
    * @appenddocs ColorPaletteItem
    * @public
    */
  @js.native
  trait ColorPalette
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _chooseCustomColor(): js.Promise[Unit] = js.native
    
    def _closeDialog(): js.Promise[Unit] = js.native
    
    def _getDialog(): js.Promise[typings.ui5Webcomponents.distDialogMod.default] = js.native
    
    var _itemNavigation: typings.ui5WebcomponentsBase.distDelegateItemNavigationMod.default = js.native
    
    var _itemNavigationRecentColors: typings.ui5WebcomponentsBase.distDelegateItemNavigationMod.default = js.native
    
    def _onColorContainerKeyDown(e: KeyboardEvent): Unit = js.native
    
    def _onDefaultColorClick(): Unit = js.native
    
    def _onDefaultColorKeyDown(e: KeyboardEvent): Unit = js.native
    
    def _onMoreColorsKeyDown(e: KeyboardEvent): Unit = js.native
    
    def _onRecentColorsContainerKeyDown(e: KeyboardEvent): Unit = js.native
    
    def _onclick(e: MouseEvent): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeyup(e: KeyboardEvent): Unit = js.native
    
    def _openMoreColorsDialog(): js.Promise[Unit] = js.native
    
    var _recentColors: js.Array[String] = js.native
    
    /**
      * Defines the selected color.
      * @type {sap.ui.webc.base.types.CSSColor}
      * @private
      */
    var _selectedColor: js.UndefOr[String] = js.native
    
    def _setColor(color: String): Unit = js.native
    
    def _showMoreColors: js.UndefOr[`false` | typings.ui5Webcomponents.distFeaturesColorPaletteMoreColorsMod.default] = js.native
    
    def colorContainerLabel: String = js.native
    
    def colorPaleteMoreColorsText: String = js.native
    
    def colorPaletteNavigationElements: js.Array[ColorPaletteNavigationItem] = js.native
    
    /**
      * Defines the <code>ui5-color-palette-item</code> elements.
      * @type {sap.ui.webc.main.IColorPaletteItem[]}
      * @name sap.ui.webc.main.ColorPalette.prototype.default
      * @slot colors
      * @public
      */
    var colors: js.Array[typings.ui5Webcomponents.distColorPaletteItemMod.default] = js.native
    
    /**
      * Defines the default color of the color palette
      * <b>Note:</b> The default color should be a part of the ColorPalette colors</code>
      * @type {sap.ui.webc.base.types.CSSColor}
      * @private
      * @since 1.0.0-rc.16
      */
    var defaultColor: js.UndefOr[String] = js.native
    
    def displayedColors: js.Array[typings.ui5Webcomponents.distColorPaletteItemMod.default] = js.native
    
    def focusColorElement(
      element: ColorPaletteNavigationItem,
      itemNavigation: typings.ui5WebcomponentsBase.distDelegateItemNavigationMod.default
    ): Unit = js.native
    
    def getColorPicker(): js.Promise[typings.ui5Webcomponents.distColorPickerMod.default] = js.native
    
    def hasRecentColors: String | `false` = js.native
    
    var moreColorsFeature: js.UndefOr[typings.ui5Webcomponents.distFeaturesColorPaletteMoreColorsMod.default] = js.native
    
    /**
      * Defines if the palette is in Popup or Embeded mode.
      * @type {sap.ui.webc.base.types.CSSColor}
      * @private
      */
    var popupMode: Boolean = js.native
    
    def recentColors: js.Array[String] = js.native
    
    def recentColorsElements: js.Array[typings.ui5Webcomponents.distColorPaletteItemMod.default] = js.native
    
    def rowSize: Double = js.native
    
    def selectColor(item: typings.ui5Webcomponents.distColorPaletteItemMod.default): Unit = js.native
    
    /**
      * Returns the selected color.
      */
    def selectedColor: js.UndefOr[String] = js.native
    
    /**
      * Defines whether the user can choose the default color from a button.
      * @type {boolean}
      * @defaultvalue false
      * @private
      * @since 1.0.0-rc.16
      */
    var showDefaultColor: Boolean = js.native
    
    /**
      * Defines whether the user can choose a custom color from a color picker
      * <b>Note:</b> In order to use this property you need to import the following module: <code>"@ui5/webcomponents/dist/features/ColorPaletteMoreColors.js"</code>
      * @type {boolean}
      * @private
      * @since 1.0.0-rc.15
      */
    var showMoreColors: Boolean = js.native
    
    /**
      * Defines whether the user can see the last used colors in the bottom of the component
      * @type {boolean}
      * @private
      * @since 1.0.0-rc.15
      */
    var showRecentColors: Boolean = js.native
  }
  
  trait ColorPaletteItemClickEventDetail extends StObject {
    
    var color: String
  }
  object ColorPaletteItemClickEventDetail {
    
    inline def apply(color: String): ColorPaletteItemClickEventDetail = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorPaletteItemClickEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorPaletteItemClickEventDetail] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ui5Webcomponents.distColorPaletteItemMod.default
    - typings.ui5Webcomponents.distButtonMod.default
  */
  trait ColorPaletteNavigationItem extends StObject
}
