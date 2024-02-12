package typings.ui5Webcomponents

import typings.std.Record
import typings.ui5Webcomponents.distTypesMessageStripDesignMod.MessageStripDesign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMessageStripMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-message-strip</code> component enables the embedding of app-related messages.
    * It displays 4 designs of messages, each with corresponding semantic color and icon: Information, Positive, Warning and Negative.
    * Each message can have a Close button, so that it can be removed from the UI, if needed.
    *
    * <h3>Usage</h3>
    *
    * For the <code>ui5-message-strip</code> component, you can define whether it displays
    * an icon in the beginning and a close button. Moreover, its size and background
    * can be controlled with CSS.
    *
    * <h3>Keyboard Handling</h3>
    *
    * <h4>Fast Navigation</h4>
    * This component provides a build in fast navigation group which can be used via <code>F6 / Shift + F6</code> or <code> Ctrl + Alt(Option) + Down /  Ctrl + Alt(Option) + Up</code>.
    * In order to use this functionality, you need to import the following module:
    * <code>import "@ui5/webcomponents-base/dist/features/F6Navigation.js"</code>
    * <br><br>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/MessageStrip";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.MessageStrip
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-message-strip
    * @public
    * @since 0.9.0
    */
  @JSImport("@ui5/webcomponents/dist/MessageStrip", JSImport.Default)
  @js.native
  open class default () extends MessageStrip
  object default {
    
    @JSImport("@ui5/webcomponents/dist/MessageStrip", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def designAnnouncementMappings(): DesignTypeAnnouncemnt = ^.asInstanceOf[js.Dynamic].applyDynamic("designAnnouncementMappings")().asInstanceOf[DesignTypeAnnouncemnt]
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/MessageStrip", "default.i18nBundle")
    @js.native
    def i18nBundle: typings.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: typings.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def onDefine(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("onDefine")().asInstanceOf[js.Promise[Unit]]
  }
  
  @js.native
  sealed trait DesignClassesMapping extends StObject
  @JSImport("@ui5/webcomponents/dist/MessageStrip", "DesignClassesMapping")
  @js.native
  object DesignClassesMapping extends StObject {
    
    @js.native
    sealed trait Information
      extends StObject
         with DesignClassesMapping
    
    @js.native
    sealed trait Negative
      extends StObject
         with DesignClassesMapping
    
    @js.native
    sealed trait Positive
      extends StObject
         with DesignClassesMapping
    
    @js.native
    sealed trait Warning
      extends StObject
         with DesignClassesMapping
  }
  
  @js.native
  sealed trait IconMappings extends StObject
  @JSImport("@ui5/webcomponents/dist/MessageStrip", "IconMappings")
  @js.native
  object IconMappings extends StObject {
    
    @js.native
    sealed trait Information
      extends StObject
         with IconMappings
    
    @js.native
    sealed trait Negative
      extends StObject
         with IconMappings
    
    @js.native
    sealed trait Positive
      extends StObject
         with IconMappings
    
    @js.native
    sealed trait Warning
      extends StObject
         with IconMappings
  }
  
  type DesignTypeAnnouncemnt = Record[MessageStripDesign, String]
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    *
    * The <code>ui5-message-strip</code> component enables the embedding of app-related messages.
    * It displays 4 designs of messages, each with corresponding semantic color and icon: Information, Positive, Warning and Negative.
    * Each message can have a Close button, so that it can be removed from the UI, if needed.
    *
    * <h3>Usage</h3>
    *
    * For the <code>ui5-message-strip</code> component, you can define whether it displays
    * an icon in the beginning and a close button. Moreover, its size and background
    * can be controlled with CSS.
    *
    * <h3>Keyboard Handling</h3>
    *
    * <h4>Fast Navigation</h4>
    * This component provides a build in fast navigation group which can be used via <code>F6 / Shift + F6</code> or <code> Ctrl + Alt(Option) + Down /  Ctrl + Alt(Option) + Up</code>.
    * In order to use this functionality, you need to import the following module:
    * <code>import "@ui5/webcomponents-base/dist/features/F6Navigation.js"</code>
    * <br><br>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/MessageStrip";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.MessageStrip
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-message-strip
    * @public
    * @since 0.9.0
    */
  @js.native
  trait MessageStrip
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _closableText: String = js.native
    
    def _closeButtonText: String = js.native
    
    def _closeClick(): Unit = js.native
    
    /**
      * Defines the component type.
      * <br><br>
      * <b>Note:</b> Available options are <code>"Information"</code>, <code>"Positive"</code>, <code>"Negative"</code>,
      * and <code>"Warning"</code>.
      *
      * @type {sap.ui.webc.main.types.MessageStripDesign}
      * @name sap.ui.webc.main.MessageStrip.prototype.design
      * @defaultvalue "Information"
      * @public
      * @since 1.0.0-rc.15
      */
    var design: MessageStripDesign = js.native
    
    def designClasses: DesignClassesMapping = js.native
    
    def hiddenText: String = js.native
    
    /**
      * Defines whether the MessageStrip renders close button.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.MessageStrip.prototype.hideCloseButton
      * @defaultvalue false
      * @public
      */
    var hideCloseButton: Boolean = js.native
    
    /**
      * Defines whether the MessageStrip will show an icon in the beginning.
      * You can directly provide an icon with the <code>icon</code> slot. Otherwise, the default icon for the type will be used.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.MessageStrip.prototype.hideIcon
      * @defaultvalue false
      * @public
      * @since 1.0.0-rc.15
      */
    var hideIcon: Boolean = js.native
    
    /**
      * Defines the text of the component.
      * <br><br>
      * <b>Note:</b> Although this slot accepts HTML Elements, it is strongly recommended that you only use text in order to preserve the intended design.
      *
      * @type {Node[]}
      * @name sap.ui.webc.main.MessageStrip.prototype.default
      * @slot
      * @public
      */
    /**
      * Defines the content to be displayed as graphical element within the component.
      * <br><br>
      * <b>Note:</b> If no icon is given, the default icon for the component type will be used.
      * The SAP-icons font provides numerous options.
      * <br><br>
      *
      * See all the available icons in the <ui5-link target="_blank" href="https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html" class="api-table-content-cell-link">Icon Explorer</ui5-link>.
      *
      * @type {sap.ui.webc.main.IIcon}
      * @name sap.ui.webc.main.MessageStrip.prototype.icon
      * @slot
      * @public
      */
    var icon: js.Array[typings.ui5Webcomponents.distIconMod.default] = js.native
    
    def iconProvided: Boolean = js.native
    
    def standardIconName: IconMappings = js.native
  }
}
