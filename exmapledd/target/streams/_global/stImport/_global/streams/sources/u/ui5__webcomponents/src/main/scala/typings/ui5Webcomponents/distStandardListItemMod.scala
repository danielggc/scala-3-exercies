package typings.ui5Webcomponents

import org.scalajs.dom.EventListenerOptions
import org.scalajs.dom.HTMLElement
import typings.std.AddEventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.ui5Webcomponents.distListItemMod.IAccessibleListItem
import typings.ui5Webcomponents.distTypesWrappingTypeMod.WrappingType
import typings.ui5WebcomponentsBase.distTypesValueStateMod.ValueState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distStandardListItemMod {
  
  /**
    * @class
    * The <code>ui5-li</code> represents the simplest type of item for a <code>ui5-list</code>.
    *
    * This is a list item,
    * providing the most common use cases such as <code>text</code>,
    * <code>image</code> and <code>icon</code>.
    *
    * <h3>CSS Shadow Parts</h3>
    *
    * <ui5-link target="_blank" href="https://developer.mozilla.org/en-US/docs/Web/CSS/::part">CSS Shadow Parts</ui5-link> allow developers to style elements inside the Shadow DOM.
    * <br>
    * The <code>ui5-li</code> exposes the following CSS Shadow Parts:
    * <ul>
    * <li>title - Used to style the title of the list item</li>
    * <li>description - Used to style the description of the list item</li>
    * <li>additional-text - Used to style the additionalText of the list item</li>
    * <li>icon - Used to style the icon of the list item</li>
    * </ul>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.StandardListItem
    * @extends sap.ui.webc.main.ListItem
    * @tagname ui5-li
    * @implements sap.ui.webc.main.IListItem
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/StandardListItem", JSImport.Default)
  @js.native
  open class default () extends StandardListItem
  
  /**
    * @class
    * The <code>ui5-li</code> represents the simplest type of item for a <code>ui5-list</code>.
    *
    * This is a list item,
    * providing the most common use cases such as <code>text</code>,
    * <code>image</code> and <code>icon</code>.
    *
    * <h3>CSS Shadow Parts</h3>
    *
    * <ui5-link target="_blank" href="https://developer.mozilla.org/en-US/docs/Web/CSS/::part">CSS Shadow Parts</ui5-link> allow developers to style elements inside the Shadow DOM.
    * <br>
    * The <code>ui5-li</code> exposes the following CSS Shadow Parts:
    * <ul>
    * <li>title - Used to style the title of the list item</li>
    * <li>description - Used to style the description of the list item</li>
    * <li>additional-text - Used to style the additionalText of the list item</li>
    * <li>icon - Used to style the icon of the list item</li>
    * </ul>
    *
    * @constructor
    * @author SAP SE
    * @alias sap.ui.webc.main.StandardListItem
    * @extends sap.ui.webc.main.ListItem
    * @tagname ui5-li
    * @implements sap.ui.webc.main.IListItem
    * @public
    */
  @js.native
  trait StandardListItem
    extends typings.ui5Webcomponents.distListItemMod.default
       with IAccessibleListItem {
    
    var _hasImageContent: Boolean = js.native
    
    /**
      * Defines the text alternative of the component.
      * Note: If not provided a default text alternative will be set, if present.
      *
      * @type {string}
      * @name sap.ui.webc.main.StandardListItem.prototype.accessibleName
      * @defaultvalue ""
      * @public
      * @since 1.0.0-rc.15
      */
    @JSName("accessibleName")
    var accessibleName_StandardListItem: String = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    /**
      * Defines the <code>additionalText</code>, displayed in the end of the list item.
      * @type {string}
      * @name sap.ui.webc.main.StandardListItem.prototype.additionalText
      * @public
      * @since 1.0.0-rc.15
      */
    var additionalText: String = js.native
    
    /**
      * Defines the state of the <code>additionalText</code>.
      * <br>
      * Available options are: <code>"None"</code> (by default), <code>"Success"</code>, <code>"Warning"</code>, <code>"Information"</code> and <code>"Error"</code>.
      * @type {sap.ui.webc.base.types.ValueState}
      * @name sap.ui.webc.main.StandardListItem.prototype.additionalTextState
      * @defaultvalue "None"
      * @public
      * @since 1.0.0-rc.15
      */
    var additionalTextState: ValueState = js.native
    
    /**
      * Defines the description displayed right under the item text, if such is present.
      * @type {string}
      * @name sap.ui.webc.main.StandardListItem.prototype.description
      * @defaultvalue: ""
      * @public
      * @since 0.8.0
      */
    var description: String = js.native
    
    def displayIconBegin: Boolean = js.native
    
    def displayIconEnd: Boolean = js.native
    
    def displayImage: Boolean = js.native
    
    def hasImageContent: Boolean = js.native
    
    /**
      * Indicates if the list item has text content.
      * @type {boolean}
      * @name sap.ui.webc.main.StandardListItem.prototype.hasTitle
      * @private
      */
    var hasTitle: Boolean = js.native
    
    /**
      * Defines the <code>icon</code> source URI.
      * <br><br>
      * <b>Note:</b>
      * SAP-icons font provides numerous built-in icons. To find all the available icons, see the
      * <ui5-link target="_blank" href="https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html" class="api-table-content-cell-link">Icon Explorer</ui5-link>.
      *
      * @type {string}
      * @name sap.ui.webc.main.StandardListItem.prototype.icon
      * @public
      */
    var icon: String = js.native
    
    /**
      * Defines whether the <code>icon</code> should be displayed in the beginning of the list item or in the end.
      * <br><br>
      * <b>Note:</b> If <code>image</code> is set, the <code>icon</code> would be displayed after the <code>image</code>.
      *
      * @type {boolean}
      * @name sap.ui.webc.main.StandardListItem.prototype.iconEnd
      * @defaultvalue false
      * @public
      */
    var iconEnd: Boolean = js.native
    
    /**
      * Defines the <code>image</code> source URI.
      * <br><br>
      * <b>Note:</b> The <code>image</code> would be displayed in the beginning of the list item.
      *
      * @type {string}
      * @name sap.ui.webc.main.StandardListItem.prototype.image
      * @public
      */
    var image: String = js.native
    
    /**
      * Defines the text of the component.
      * <br><br>
      * <b>Note:</b> Although this slot accepts HTML Elements, it is strongly recommended that you only use text in order to preserve the intended design.
      *
      * @type {Node[]}
      * @name sap.ui.webc.main.StandardListItem.prototype.default
      * @slot
      * @public
      */
    /**
      * <b>Note:</b> While the slot allows option for setting custom avatar, to match the
      * design guidelines, please use the <code>ui5-avatar</code> with it`s default size - S.
      * <b>Note:</b> If bigger <code>ui5-avatar</code> needs to be used, then the size of the
      * <code>ui5-li</code> should be customized in order to fit.
      * @type {HTMLElement[]}
      * @name sap.ui.webc.main.StandardListItem.prototype.imageContent
      * @since 1.10.0
      * @slot
      * @public
      */
    var imageContent: js.Array[HTMLElement] = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    
    /**
      * Defines if the text of the component should wrap, they truncate by default.
      *
      * <br><br>
      * <b>Note:</b> this property takes affect only if text node is provided to default slot of the component
      * @type {sap.ui.webc.main.types.WrappingType}
      * @name sap.ui.webc.main.StandardListItem.prototype.wrappingType
      * @defaultvalue "None"
      * @private
      * @since 1.5.0
      */
    var wrappingType: WrappingType = js.native
  }
}
