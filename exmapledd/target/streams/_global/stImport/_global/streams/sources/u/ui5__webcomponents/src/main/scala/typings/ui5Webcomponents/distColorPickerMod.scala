package typings.ui5Webcomponents

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import typings.ui5Webcomponents.anon.Circle
import typings.ui5Webcomponents.anon.H
import typings.ui5Webcomponents.ui5WebcomponentsBooleans.`true`
import typings.ui5Webcomponents.ui5WebcomponentsStrings.Error
import typings.ui5WebcomponentsBase.distUtilColorConversionMod.ColorRGB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distColorPickerMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    * The <code>ui5-color-picker</code> allows users to choose any color and provides different input options for selecting colors.
    *
    * <h3>Usage</h3>
    *
    * <h4>When to use:</h4
    * Use the color picker if:
    * <ul>
    * <li> users need to select any color freely.</li>
    * </ul>
    *
    * <h4>When not to use:</h4>
    * <ul>
    * <li> Users need to select one color from a predefined set of colors. Use the ColorPalette component instead.</li>
    * </ul>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/ColorPicker.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @since 1.0.0-rc.12
    * @alias sap.ui.webc.main.ColorPicker
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-color-picker
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/ColorPicker", JSImport.Default)
  @js.native
  open class default () extends ColorPicker
  object default {
    
    @JSImport("@ui5/webcomponents/dist/ColorPicker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/ColorPicker", "default.i18nBundle")
    @js.native
    def i18nBundle: typings.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: typings.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def onDefine(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("onDefine")().asInstanceOf[js.Promise[Unit]]
  }
  
  trait ColorCoordinates extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object ColorCoordinates {
    
    inline def apply(x: Double, y: Double): ColorCoordinates = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorCoordinates]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorCoordinates] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    * The <code>ui5-color-picker</code> allows users to choose any color and provides different input options for selecting colors.
    *
    * <h3>Usage</h3>
    *
    * <h4>When to use:</h4
    * Use the color picker if:
    * <ul>
    * <li> users need to select any color freely.</li>
    * </ul>
    *
    * <h4>When not to use:</h4>
    * <ul>
    * <li> Users need to select one color from a predefined set of colors. Use the ColorPalette component instead.</li>
    * </ul>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/ColorPicker.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @since 1.0.0-rc.12
    * @alias sap.ui.webc.main.ColorPicker
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-color-picker
    * @public
    */
  @js.native
  trait ColorPicker
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    /**
      * @private
      */
    var _alpha: Double = js.native
    
    def _calculateColorFromCoordinates(x: Double, y: Double): js.UndefOr[H] = js.native
    
    def _changeSelectedColor(x: Double, y: Double): Unit = js.native
    
    /**
      * Defines the currenty selected color from the main color section.
      * @private
      */
    var _color: ColorRGB = js.native
    
    def _handleAlphaChange(): Unit = js.native
    
    def _handleAlphaInput(e: CustomEvent): Unit = js.native
    
    def _handleHEXChange(e: CustomEvent): Unit = js.native
    def _handleHEXChange(e: KeyboardEvent): Unit = js.native
    
    def _handleHueInput(e: CustomEvent): Unit = js.native
    
    def _handleMouseDown(e: MouseEvent): Unit = js.native
    
    def _handleMouseMove(e: MouseEvent): Unit = js.native
    
    def _handleMouseOut(e: MouseEvent): Unit = js.native
    
    def _handleMouseUp(): Unit = js.native
    
    def _handleRGBInputsChange(e: CustomEvent): Unit = js.native
    
    /**
      * @private
      */
    var _hue: Double = js.native
    
    /**
      * @private
      */
    var _isHueValueChanged: Boolean = js.native
    
    /**
      * @private
      */
    var _isSelectedColorChanged: Boolean = js.native
    
    /**
      * Defines the current main color which is selected via the hue slider and is shown in the main color square.
      * @type {string}
      * @private
      */
    var _mainColor: ColorRGB = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    /**
      * @private
      */
    var _selectedCoordinates: ColorCoordinates = js.native
    
    def _setColor(): Unit = js.native
    def _setColor(color: ColorRGB): Unit = js.native
    
    def _setHex(): Unit = js.native
    
    def _setMainColor(hueValue: Double): Unit = js.native
    
    def _setValues(): Unit = js.native
    
    /**
      * @private
      */
    var _wrongHEX: Boolean = js.native
    
    def alphaInputLabel: String = js.native
    
    def alphaSliderLabel: String = js.native
    
    def blueInputLabel: String = js.native
    
    /**
      * Defines the currently selected color of the component.
      * <br><br>
      * <b>Note</b>: use HEX, RGB, RGBA, HSV formats or a CSS color name when modifying this property.
      * @type {sap.ui.webc.base.types.CSSColor}
      * @name sap.ui.webc.main.ColorPicker.prototype.color
      * @public
      */
    var color: String = js.native
    
    def greenInputLabel: String = js.native
    
    /**
      * Defines the HEX code of the currently selected color
      * *Note*: If Alpha(transperancy) is set it is not included in this property. Use <code>color</code> property.
      * @type {string}
      * @private
      */
    var hex: String = js.native
    
    def hexInputErrorState: js.UndefOr[Error] = js.native
    
    def hexInputLabel: String = js.native
    
    def hueSliderLabel: String = js.native
    
    def inputsDisabled: js.UndefOr[`true`] = js.native
    
    var mouseDown: Boolean = js.native
    
    var mouseIn: Boolean = js.native
    
    def redInputLabel: String = js.native
    
    var selectedHue: Double = js.native
    
    def styles: Circle = js.native
  }
}
