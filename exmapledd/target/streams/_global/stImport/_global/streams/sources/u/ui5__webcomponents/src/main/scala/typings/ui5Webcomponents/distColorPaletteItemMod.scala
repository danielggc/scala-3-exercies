package typings.ui5Webcomponents

import org.scalajs.dom.EventListenerOptions
import typings.std.AddEventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.ui5Webcomponents.anon.RootBackgroundcolor
import typings.ui5Webcomponents.distColorPaletteMod.ColorPaletteNavigationItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distColorPaletteItemMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-color-palette-item</code> component represents a color in the the <code>ui5-color-palette</code>.
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.ColorPaletteItem
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-color-palette-item
    * @since 1.0.0-rc.12
    * @implements sap.ui.webc.main.IColorPaletteItem
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/ColorPaletteItem", JSImport.Default)
  @js.native
  open class default ()
    extends ColorPaletteItem
       with ColorPaletteNavigationItem {
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  }
  object default {
    
    @JSImport("@ui5/webcomponents/dist/ColorPaletteItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/ColorPaletteItem", "default.i18nBundle")
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
    * The <code>ui5-color-palette-item</code> component represents a color in the the <code>ui5-color-palette</code>.
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.ColorPaletteItem
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-color-palette-item
    * @since 1.0.0-rc.12
    * @implements sap.ui.webc.main.IColorPaletteItem
    * @public
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ui5WebcomponentsBase.distDelegateItemNavigationMod.ITabbable because var conflicts: id. Inlined _tabIndex */ @js.native
  trait ColorPaletteItem
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    /**
      * @private
      * @type {boolean}
      * @since 1.0.0-rc.15
      */
    var _disabled: Boolean = js.native
    
    /**
      * Defines the tab-index of the element, helper information for the ItemNavigation.
      * @private
      */
    var _tabIndex: String = js.native
    
    def colorLabel: String = js.native
    
    /**
      * Defines the index of the item inside of the ColorPalette.
      * @private
      * @type {Integer}
      */
    var index: js.UndefOr[Double] = js.native
    
    /**
      * Defines if the ColorPalette is on phone mode.
      * @private
      * @type {boolean}
      */
    var phone: Boolean = js.native
    
    def styles: RootBackgroundcolor = js.native
    
    /**
      * Defines the colour of the component.
      * <br><br>
      * <b>Note:</b> The value should be a valid CSS color.
      *
      * @type {sap.ui.webc.base.types.CSSColor}
      * @name sap.ui.webc.main.ColorPaletteItem.prototype.value
      * @public
      */
    var value: String = js.native
  }
}
