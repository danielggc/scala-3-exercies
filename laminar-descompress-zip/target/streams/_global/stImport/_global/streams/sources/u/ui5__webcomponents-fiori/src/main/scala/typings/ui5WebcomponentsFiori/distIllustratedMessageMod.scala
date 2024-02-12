package typings.ui5WebcomponentsFiori

import org.scalajs.dom.HTMLElement
import typings.std.Record
import typings.ui5WebcomponentsFiori.distTypesIllustrationMessageSizeMod.IllustrationMessageSize
import typings.ui5WebcomponentsFiori.distTypesIllustrationMessageTypeMod.IllustrationMessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIllustratedMessageMod {
  
  /**
    * @class
    *
    * <h3 class="comment-api-title">Overview</h3>
    * An IllustratedMessage is a recommended combination of a solution-oriented message, an engaging
    * illustration, and conversational tone to better communicate an empty or a success state than just show
    * a message alone.
    *
    * Each illustration has default internationalised title and subtitle texts. Also they can be managed with
    * <code>titleText</code> and <code>subtitleText</code> properties.
    *
    * To display the desired illustration, use the <code>name</code> property, where you can find the list of all available illustrations.
    * <br><br>
    * <b>Note:</b> By default the “BeforeSearch” illustration is loaded. To use other illustrations, make sure you import them in addition, for example:
    * <br>
    * <code>import "@ui5/webcomponents-fiori/dist/illustrations/NoData.js"</code>
    * <br>
    * <b>Note:</b> Illustrations starting with the “Tnt” prefix are part of another illustration set. For example to use the “TntSuccess” illustration, add the following import::
    * <br>
    * <code>import "@ui5/webcomponents-fiori/dist/illustrations/tnt/Success.js"</code>
    *
    * <h3>Structure</h3>
    * The IllustratedMessage consists of the following elements, which are displayed below each other in the following order:
    * <br>
    * <ul>
    * <li>Illustration</li>
    * <li>Title</li>
    * <li>Subtitle</li>
    * <li>Actions</li>
    * </ul>
    *
    * <h3>Usage</h3>
    * <code>ui5-illustrated-message</code> is meant to be used inside container component, for example a <code>ui5-card</code>,
    * a <code>ui5-dialog</code> or a <code>ui5-page</code>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents-fiori/dist/IllustratedMessage.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.fiori.IllustratedMessage
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-illustrated-message
    * @public
    * @since 1.0.0-rc.15
    */
  @JSImport("@ui5/webcomponents-fiori/dist/IllustratedMessage", JSImport.Default)
  @js.native
  open class default () extends IllustratedMessage
  object default {
    
    @JSImport("@ui5/webcomponents-fiori/dist/IllustratedMessage", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents-fiori/dist/IllustratedMessage", "default.i18nBundle")
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
    * An IllustratedMessage is a recommended combination of a solution-oriented message, an engaging
    * illustration, and conversational tone to better communicate an empty or a success state than just show
    * a message alone.
    *
    * Each illustration has default internationalised title and subtitle texts. Also they can be managed with
    * <code>titleText</code> and <code>subtitleText</code> properties.
    *
    * To display the desired illustration, use the <code>name</code> property, where you can find the list of all available illustrations.
    * <br><br>
    * <b>Note:</b> By default the “BeforeSearch” illustration is loaded. To use other illustrations, make sure you import them in addition, for example:
    * <br>
    * <code>import "@ui5/webcomponents-fiori/dist/illustrations/NoData.js"</code>
    * <br>
    * <b>Note:</b> Illustrations starting with the “Tnt” prefix are part of another illustration set. For example to use the “TntSuccess” illustration, add the following import::
    * <br>
    * <code>import "@ui5/webcomponents-fiori/dist/illustrations/tnt/Success.js"</code>
    *
    * <h3>Structure</h3>
    * The IllustratedMessage consists of the following elements, which are displayed below each other in the following order:
    * <br>
    * <ul>
    * <li>Illustration</li>
    * <li>Title</li>
    * <li>Subtitle</li>
    * <li>Actions</li>
    * </ul>
    *
    * <h3>Usage</h3>
    * <code>ui5-illustrated-message</code> is meant to be used inside container component, for example a <code>ui5-card</code>,
    * a <code>ui5-dialog</code> or a <code>ui5-page</code>
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents-fiori/dist/IllustratedMessage.js";</code>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.fiori.IllustratedMessage
    * @extends sap.ui.webc.base.UI5Element
    * @tagname ui5-illustrated-message
    * @public
    * @since 1.0.0-rc.15
    */
  @js.native
  trait IllustratedMessage
    extends typings.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _applyMedia(): Unit = js.native
    
    /**
      * Modifies the IM styles in accordance to the `size` property's value.
      * Note: The resize handler has no effect when size is different than "Auto".
      * @private
      * @since 1.5.0
      */
    def _handleCustomSize(): Unit = js.native
    
    def _handleResize(): Unit = js.native
    
    var _lastKnownMedia: String = js.native
    
    var _lastKnownOffsetWidthForMedia: Record[String, Double] = js.native
    
    def _setSVGAccAttrs(): Unit = js.native
    
    /**
      * Receives id(or many ids) of the elements that label the component.
      *
      * @type {string}
      * @defaultvalue ""
      * @name sap.ui.webc.fiori.IllustratedMessage.prototype.accessibleNameRef
      * @public
      * @since 1.7.0
      */
    var accessibleNameRef: String = js.native
    
    /**
      * Defines the component actions.
      * @type {sap.ui.webc.main.IButton[]}
      * @slot actions
      * @name sap.ui.webc.fiori.IllustratedMessage.prototype.default
      * @public
      */
    var actions: js.Array[HTMLElement] = js.native
    
    def ariaLabelText: js.UndefOr[String] = js.native
    
    /**
      * Illustration breakpoint variant for the <code>Dialog</code> size.
      *
      * @private
      * @type {String}
      * @since 1.9.0
      */
    var dialogSvg: String = js.native
    
    def effectiveIllustration: String = js.native
    
    def effectiveSubitleText: js.UndefOr[String] = js.native
    
    def effectiveTitleText: js.UndefOr[String] = js.native
    
    def handleResize(): Unit = js.native
    
    def hasActions: Boolean = js.native
    
    def hasFormattedSubtitle: Boolean = js.native
    
    def hasFormattedTitle: Boolean = js.native
    
    def hasSubtitle: Boolean = js.native
    
    def hasTitle: Boolean = js.native
    
    var illustrationSubtitle: js.UndefOr[String] = js.native
    
    var illustrationTitle: js.UndefOr[String] = js.native
    
    def isValidIllustration(currentIllustration: IllustrationMessageType): Boolean = js.native
    
    /**
      * Determinates what is the current media of the component based on its width.
      * @private
      */
    var media: String = js.native
    
    /**
      * Defines the illustration name that will be displayed in the component.
      * <br><br>
      * Available illustrations are:
      * <ul>
      * <li><code>AddColumn</code></li>
      * <li><code>AddPeople</code></li>
      * <li><code>AddDimensions</code></li>
      * <li><code>BalloonSky</code></li>
      * <li><code>BeforeSearch</code></li>
      * <li><code>Connection</code></li>
      * <li><code>EmptyCalendar</code></li>
      * <li><code>EmptyList</code></li>
      * <li><code>EmptyPlanningCalendar</code></li>
      * <li><code>ErrorScreen</code></li>
      * <li><code>FilterTable</code></li>
      * <li><code>GroupTable</code></li>
      * <li><code>NoActivities</code></li>
      * <li><code>NoData</code></li>
      * <li><code>NoEntries</code></li>
      * <li><code>NoFilterResults</code></li>
      * <li><code>NoMail_v1</code></li>
      * <li><code>NoMail</code></li>
      * <li><code>NoNotifications</code></li>
      * <li><code>NoSavedItems_v1</code></li>
      * <li><code>NoSavedItems</code></li>
      * <li><code>NoSearchResults</code></li>
      * <li><code>NoTasks_v1</code></li>
      * <li><code>NoTasks</code></li>
      * <li><code>NoDimensionsSet</code></li>
      * <li><code>PageNotFound</code></li>
      * <li><code>ReloadScreen</code></li>
      * <li><code>ResizeColumn</code></li>
      * <li><code>SearchEarth</code></li>
      * <li><code>SearchFolder</code></li>
      * <li><code>SimpleBalloon</code></li>
      * <li><code>SimpleBell</code></li>
      * <li><code>SimpleCalendar</code></li>
      * <li><code>SimpleCheckMark</code></li>
      * <li><code>SimpleConnection</code></li>
      * <li><code>SimpleEmptyDoc</code></li>
      * <li><code>SimpleEmptyList</code></li>
      * <li><code>SimpleError</code></li>
      * <li><code>SimpleMagnifier</code></li>
      * <li><code>SimpleMail</code></li>
      * <li><code>SimpleNoSavedItems</code></li>
      * <li><code>SimpleNotFoundMagnifier</code></li>
      * <li><code>SimpleReload</code></li>
      * <li><code>SimpleTask</code></li>
      * <li><code>SleepingBell</code></li>
      * <li><code>SortColumn</code></li>
      * <li><code>SuccessBalloon</code></li>
      * <li><code>SuccessCheckMark</code></li>
      * <li><code>SuccessHighFive</code></li>
      * <li><code>SuccessScreen</code></li>
      * <li><code>Tent</code></li>
      * <li><code>UnableToLoad</code></li>
      * <li><code>UnableToLoadImage</code></li>
      * <li><code>UnableToUpload</code></li>
      * <li><code>UploadToCloud</code></li>
      * <li><code>UploadCollection</code></li>
      * <li><code>TntChartArea</code></li>
      * <li><code>TntChartArea2</code></li>
      * <li><code>TntChartBar</code></li>
      * <li><code>TntChartBPMNFlow</code></li>
      * <li><code>TntChartBullet</code></li>
      * <li><code>TntChartDoughnut</code></li>
      * <li><code>TntChartFlow</code></li>
      * <li><code>TntChartGantt</code></li>
      * <li><code>TntChartOrg</code></li>
      * <li><code>TntChartPie</code></li>
      * <li><code>TntCodePlaceholder</code></li>
      * <li><code>TntCompany</code></li>
      * <li><code>TntComponents</code></li>
      * <li><code>TntExternalLink</code></li>
      * <li><code>TntFaceID</code></li>
      * <li><code>TntFingerprint</code></li>
      * <li><code>TntLock</code></li>
      * <li><code>TntMission</code></li>
      * <li><code>TntNoApplications</code></li>
      * <li><code>TntNoFlows</code></li>
      * <li><code>TntNoUsers</code></li>
      * <li><code>TntRadar</code></li>
      * <li><code>TntSecrets</code></li>
      * <li><code>TntServices</code></li>
      * <li><code>TntSessionExpired</code></li>
      * <li><code>TntSessionExpiring</code></li>
      * <li><code>TntSuccess</code></li>
      * <li><code>TntSuccessfulAuth</code></li>
      * <li><code>TntSystems</code></li>
      * <li><code>TntTeams</code></li>
      * <li><code>TntTools</code></li>
      * <li><code>TntUnableToLoad</code></li>
      * <li><code>TntUnlock</code></li>
      * <li><code>TntUnsuccessfulAuth</code></li>
      * <li><code>TntUser2</code></li>
      * </ul>
      * <br><br>
      * <b>Note:</b> By default the <code>BeforeSearch</code> illustration is loaded.
      * <br>
      * When using an illustration type, other than the default, it should be loaded in addition:
      * <br>
      * <code>import "@ui5/webcomponents-fiori/dist/illustrations/NoData.js";</code>
      * <br><br>
      * <b>Note:</b> TNT illustrations cointain <code>Tnt</code> prefix in their name.
      * You can import them removing the <code>Tnt</code> prefix like this:
      * <br>
      * <code>import "@ui5/webcomponents-fiori/dist/illustrations/tnt/SessionExpired.js";</code>
      * @type {sap.ui.webc.fiori.types.IllustrationMessageType}
      * @defaultvalue "BeforeSearch"
      * @name sap.ui.webc.fiori.IllustratedMessage.prototype.name
      * @public
      */
    var name: IllustrationMessageType = js.native
    
    /**
      * Illustration breakpoint variant for the <code>Scene</code> size.
      *
      * @private
      * @type {String}
      * @since 1.9.0
      */
    var sceneSvg: String = js.native
    
    /**
      * Determines which illustration breakpoint variant is used.
      * <br><br>
      * Available options are:
      * <ul>
      * <li><code>Auto</code></li>
      * <li><code>Base</code></li>
      * <li><code>Spot</code></li>
      * <li><code>Dialog</code></li>
      * <li><code>Scene</code></li>
      * </ul>
      *
      * As <code>IllustratedMessage</code> adapts itself around the <code>Illustration</code>, the other
      * elements of the component are displayed differently on the different breakpoints/illustration sizes.
      *
      * @type {sap.ui.webc.fiori.types.IllustrationMessageSize}
      * @defaultvalue "Auto"
      * @name sap.ui.webc.fiori.IllustratedMessage.prototype.size
      * @public
      * @since 1.5.0
      */
    var size: IllustrationMessageSize = js.native
    
    /**
      * Illustration breakpoint variant for the <code>Spot</code> size.
      *
      * @private
      * @type {String}
      * @since 1.9.0
      */
    var spotSvg: String = js.native
    
    /**
      * Defines the subtitle of the component.
      * <br><br>
      * <b>Note:</b> Using this slot, the default subtitle text of illustration and the value of <code>subtitleText</code> property will be overwritten.
      * @type {HTMLElement}
      * @slot subtitle
      * @name sap.ui.webc.fiori.IllustratedMessage.prototype.subtitle
      * @public
      * @since 1.0.0-rc.16
      */
    var subtitle: js.Array[HTMLElement] = js.native
    
    /**
      * Defines the subtitle of the component.
      * <br><br>
      * <b>Note:</b> Using this property, the default subtitle text of illustration will be overwritten.
      * <br><br>
      * <b>Note:</b> Using <code>subtitle</code> slot, the default of this property will be overwritten.
      * @type {string}
      * @defaultvalue ""
      * @name sap.ui.webc.fiori.IllustratedMessage.prototype.subtitleText
      * @public
      */
    var subtitleText: String = js.native
    
    /**
      * Defines the title of the component.
      * <br><br>
      * <b>Note:</b> Using this property, the default title text of illustration will be overwritten.
      * @type {string}
      * @defaultvalue ""
      * @name sap.ui.webc.fiori.IllustratedMessage.prototype.titleText
      * @public
      */
    var titleText: String = js.native
    
    /**
      * Defines the title of the component.
      * <br><br>
      * <b>Note:</b> Using this slot, the default title text of illustration and the value of <code>title</code> property will be overwritten.
      * @type {HTMLElement}
      * @slot title
      * @name sap.ui.webc.fiori.IllustratedMessage.prototype.title
      * @public
      * @since 1.7.0
      */
    @JSName("title")
    var title_IllustratedMessage: js.Array[HTMLElement] & String = js.native
  }
}
