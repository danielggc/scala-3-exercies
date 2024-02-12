package typings.ui5Webcomponents

import typings.std.Record
import typings.ui5Webcomponents.anon.Bar
import typings.ui5Webcomponents.ui5WebcomponentsBooleans.`true`
import typings.ui5WebcomponentsBase.distTypesValueStateMod.ValueState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distProgressIndicatorMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    * Shows the progress of a process in a graphical way. To indicate the progress,
    * the inside of the component is filled with a color.
    *
    * <h3>Responsive Behavior</h3>
    * You can change the size of the Progress Indicator by changing its <code>width</code> or <code>height</code> CSS properties.
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/ProgressIndicator.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.ProgressIndicator
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-progress-indicator
    * @public
    * @since 1.0.0-rc.8
    */
  @JSImport("@ui5/webcomponents/dist/ProgressIndicator", JSImport.Default)
  @js.native
  open class default () extends ProgressIndicator
  object default {
    
    @JSImport("@ui5/webcomponents/dist/ProgressIndicator", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/ProgressIndicator", "default.i18nBundle")
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
    * Shows the progress of a process in a graphical way. To indicate the progress,
    * the inside of the component is filled with a color.
    *
    * <h3>Responsive Behavior</h3>
    * You can change the size of the Progress Indicator by changing its <code>width</code> or <code>height</code> CSS properties.
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/ProgressIndicator.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.ProgressIndicator
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-progress-indicator
    * @public
    * @since 1.0.0-rc.8
    */
  @js.native
  trait ProgressIndicator
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _ariaDisabled: js.UndefOr[`true`] = js.native
    
    var _previousValue: Double = js.native
    
    var _transitionDuration: Double = js.native
    
    /**
      * Defines whether component is in disabled state.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.ProgressIndicator.prototype.disabled
      * @defaultvalue false
      * @public
      */
    var disabled: Boolean = js.native
    
    /**
      * Specifies the text value to be displayed in the bar.
      *
      * <b>Note:</b>
      * <ul>
      * <li>If there is no value provided or the value is empty, the default percentage value is shown.</li>
      * <li>If <code>hideValue</code> property is <code>true</code> both the <code>displayValue</code> and <code>value</code> property values are not shown.</li>
      * </ul>
      *
      * @type {string}
      * @name sap.ui.webc.main.ProgressIndicator.prototype.displayValue
      * @public
      */
    var displayValue: String = js.native
    
    /**
      * Defines whether the component value is shown.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.ProgressIndicator.prototype.hideValue
      * @defaultvalue false
      * @public
      */
    var hideValue: Boolean = js.native
    
    def shouldAnimate: Boolean = js.native
    
    def showIcon: Boolean = js.native
    
    def showValueInRemainingBar: Boolean = js.native
    
    def styles: Bar = js.native
    
    def validatedValue: Double = js.native
    
    /**
      * Specifies the numerical value in percent for the length of the component.
      *
      * <b>Note:</b>
      * If a value greater than 100 is provided, the percentValue is set to 100. In other cases of invalid value, percentValue is set to its default of 0.
      * @type {sap.ui.webc.base.types.Integer}
      * @name sap.ui.webc.main.ProgressIndicator.prototype.value
      * @defaultvalue 0
      * @public
      */
    var value: Double = js.native
    
    /**
      * Defines the value state of the component.
      * <br><br>
      * Available options are:
      * <ul>
      * <li><code>None</code></li>
      * <li><code>Error</code></li>
      * <li><code>Warning</code></li>
      * <li><code>Success</code></li>
      * <li><code>Information</code></li>
      * </ul>
      *
      * @type {sap.ui.webc.base.types.ValueState}
      * @name sap.ui.webc.main.ProgressIndicator.prototype.valueState
      * @defaultvalue "None"
      * @public
      */
    var valueState: ValueState = js.native
    
    def valueStateIcon: String = js.native
    
    def valueStateIconMappings(): Record[String, String] = js.native
    
    def valueStateText: String = js.native
    
    def valueStateTextMappings(): Record[String, String] = js.native
  }
}
