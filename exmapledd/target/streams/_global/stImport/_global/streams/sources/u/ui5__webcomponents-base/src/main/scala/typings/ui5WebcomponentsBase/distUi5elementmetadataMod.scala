package typings.ui5WebcomponentsBase

import org.scalajs.dom.Node
import typings.std.BooleanConstructor
import typings.std.ObjectConstructor
import typings.std.Record
import typings.std.StringConstructor
import typings.ui5WebcomponentsBase.anon.TypeofNode
import typings.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.property
import typings.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.slot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUi5elementmetadataMod {
  
  /**
    *
    * @class
    * @public
    */
  @JSImport("@ui5/webcomponents-base/dist/UI5ElementMetadata", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with UI5ElementMetadata {
    def this(metadata: Metadata) = this()
    
    /**
      * Determines whether this UI5 Element has a default slot of type Node, therefore can slot text
      * @returns {boolean}
      */
    /* CompleteClass */
    override def canSlotText(): Boolean = js.native
    
    /**
      * Returns an array with the attributes of the UI5 Element (in kebab-case)
      * @public
      * @returns {string[]}
      */
    /* CompleteClass */
    override def getAttributesList(): js.Array[String] = js.native
    
    /**
      * Returns an object with key-value pairs of events and their metadata definitions
      * @public
      */
    /* CompleteClass */
    override def getEvents(): EventData = js.native
    
    /* CompleteClass */
    override def getInitialState(): State = js.native
    
    /**
      * Returns an object with key-value pairs of properties and their metadata definitions
      * @public
      */
    /* CompleteClass */
    override def getProperties(): Record[String, Property] = js.native
    
    /**
      * Returns an array with the properties of the UI5 Element (in camelCase)
      * @public
      * @returns {string[]}
      */
    /* CompleteClass */
    override def getPropertiesList(): js.Array[String] = js.native
    
    /**
      * Returns the tag of the UI5 Element without the scope
      * @public
      */
    /* CompleteClass */
    override def getPureTag(): String = js.native
    
    /**
      * Returns an object with key-value pairs of slots and their metadata definitions
      * @public
      */
    /* CompleteClass */
    override def getSlots(): Record[String, Slot] = js.native
    
    /**
      * Returns the tag of the UI5 Element
      * @public
      */
    /* CompleteClass */
    override def getTag(): String = js.native
    
    /**
      * Determines whether a property should have an attribute counterpart
      * @public
      * @param propName
      * @returns {boolean}
      */
    /* CompleteClass */
    override def hasAttribute(propName: String): Boolean = js.native
    
    /**
      * Determines whether this UI5 Element supports any slots with "individualSlots: true"
      * @public
      */
    /* CompleteClass */
    override def hasIndividualSlots(): Boolean = js.native
    
    /**
      * Determines whether this UI5 Element supports any slots
      * @public
      */
    /* CompleteClass */
    override def hasSlots(): Boolean = js.native
    
    /**
      * Determines whether this UI5 Element has any translatable texts (needs to be invalidated upon language change)
      * @returns {boolean}
      */
    /* CompleteClass */
    override def isLanguageAware(): Boolean = js.native
    
    /**
      * Determines whether this UI5 Element has any theme dependant carachteristics.
      * @returns {boolean}
      */
    /* CompleteClass */
    override def isThemeAware(): Boolean = js.native
    
    /* CompleteClass */
    var metadata: Metadata = js.native
    
    /**
      * Matches a changed entity (property/slot) with the given name against the "invalidateOnChildChange" configuration
      * and determines whether this should cause and invalidation
      *
      * @param slotName the name of the slot in which a child was changed
      * @param type the type of change in the child: "property" or "slot"
      * @param name the name of the property/slot that changed
      * @returns {boolean}
      */
    /* CompleteClass */
    override def shouldInvalidateOnChildChange(slotName: String, `type`: property | slot, name: String): Boolean = js.native
    
    /**
      * Determines whether this UI5 Element needs to invalidate if children are added/removed/changed
      * @public
      */
    /* CompleteClass */
    override def slotsAreManaged(): Boolean = js.native
    
    /**
      * Determines whether this control supports F6 fast navigation
      * @public
      */
    /* CompleteClass */
    override def supportsF6FastNavigation(): Boolean = js.native
  }
  object default {
    
    @JSImport("@ui5/webcomponents-base/dist/UI5ElementMetadata", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Validates the property's value and returns it if correct
      * or returns the default value if not.
      * <b>Note:</b> Only intended for use by UI5Element.js
      * @public
      */
    /* static member */
    inline def validatePropertyValue(value: PropertyValue, propData: Property): PropertyValue = (^.asInstanceOf[js.Dynamic].applyDynamic("validatePropertyValue")(value.asInstanceOf[js.Any], propData.asInstanceOf[js.Any])).asInstanceOf[PropertyValue]
    
    /**
      * Validates the slot's value and returns it if correct
      * or throws an exception if not.
      * <b>Note:</b> Only intended for use by UI5Element.js
      * @pubic
      */
    /* static member */
    inline def validateSlotValue(value: Node, slotData: Slot): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("validateSlotValue")(value.asInstanceOf[js.Any], slotData.asInstanceOf[js.Any])).asInstanceOf[Node]
  }
  
  type EventData = Record[String, js.Object]
  
  trait Metadata extends StObject {
    
    var events: js.UndefOr[EventData] = js.undefined
    
    var fastNavigation: js.UndefOr[Boolean] = js.undefined
    
    var languageAware: js.UndefOr[Boolean] = js.undefined
    
    var managedSlots: js.UndefOr[Boolean] = js.undefined
    
    var properties: js.UndefOr[Record[String, Property]] = js.undefined
    
    var slots: js.UndefOr[Record[String, Slot]] = js.undefined
    
    var tag: js.UndefOr[String] = js.undefined
    
    var themeAware: js.UndefOr[Boolean] = js.undefined
  }
  object Metadata {
    
    inline def apply(): Metadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Metadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
      
      inline def setEvents(value: EventData): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setFastNavigation(value: Boolean): Self = StObject.set(x, "fastNavigation", value.asInstanceOf[js.Any])
      
      inline def setFastNavigationUndefined: Self = StObject.set(x, "fastNavigation", js.undefined)
      
      inline def setLanguageAware(value: Boolean): Self = StObject.set(x, "languageAware", value.asInstanceOf[js.Any])
      
      inline def setLanguageAwareUndefined: Self = StObject.set(x, "languageAware", js.undefined)
      
      inline def setManagedSlots(value: Boolean): Self = StObject.set(x, "managedSlots", value.asInstanceOf[js.Any])
      
      inline def setManagedSlotsUndefined: Self = StObject.set(x, "managedSlots", js.undefined)
      
      inline def setProperties(value: Record[String, Property]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setSlots(value: Record[String, Slot]): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setThemeAware(value: Boolean): Self = StObject.set(x, "themeAware", value.asInstanceOf[js.Any])
      
      inline def setThemeAwareUndefined: Self = StObject.set(x, "themeAware", js.undefined)
    }
  }
  
  trait Property extends StObject {
    
    var compareValues: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[PropertyValue] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var noAttribute: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[
        BooleanConstructor | StringConstructor | ObjectConstructor | typings.ui5WebcomponentsBase.distTypesDataTypeMod.default
      ] = js.undefined
    
    var validator: js.UndefOr[typings.ui5WebcomponentsBase.distTypesDataTypeMod.default] = js.undefined
  }
  object Property {
    
    inline def apply(): Property = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Property]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Property] (val x: Self) extends AnyVal {
      
      inline def setCompareValues(value: Boolean): Self = StObject.set(x, "compareValues", value.asInstanceOf[js.Any])
      
      inline def setCompareValuesUndefined: Self = StObject.set(x, "compareValues", js.undefined)
      
      inline def setDefaultValue(value: PropertyValue): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setNoAttribute(value: Boolean): Self = StObject.set(x, "noAttribute", value.asInstanceOf[js.Any])
      
      inline def setNoAttributeUndefined: Self = StObject.set(x, "noAttribute", js.undefined)
      
      inline def setType(
        value: BooleanConstructor | StringConstructor | ObjectConstructor | typings.ui5WebcomponentsBase.distTypesDataTypeMod.default
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValidator(value: typings.ui5WebcomponentsBase.distTypesDataTypeMod.default): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
      
      inline def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
    }
  }
  
  type PropertyValue = js.UndefOr[
    Boolean | Double | String | js.Object | Null | typings.ui5WebcomponentsBase.distTypesDataTypeMod.default
  ]
  
  trait Slot extends StObject {
    
    var default: js.UndefOr[Boolean] = js.undefined
    
    var individualSlots: js.UndefOr[Boolean] = js.undefined
    
    var invalidateOnChildChange: js.UndefOr[Boolean | SlotInvalidation] = js.undefined
    
    var propertyName: js.UndefOr[String] = js.undefined
    
    var `type`: TypeofNode | (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HTMLElement */ Any)
  }
  object Slot {
    
    inline def apply(
      `type`: TypeofNode | (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HTMLElement */ Any)
    ): Slot = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Slot]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Slot] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setIndividualSlots(value: Boolean): Self = StObject.set(x, "individualSlots", value.asInstanceOf[js.Any])
      
      inline def setIndividualSlotsUndefined: Self = StObject.set(x, "individualSlots", js.undefined)
      
      inline def setInvalidateOnChildChange(value: Boolean | SlotInvalidation): Self = StObject.set(x, "invalidateOnChildChange", value.asInstanceOf[js.Any])
      
      inline def setInvalidateOnChildChangeUndefined: Self = StObject.set(x, "invalidateOnChildChange", js.undefined)
      
      inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      inline def setPropertyNameUndefined: Self = StObject.set(x, "propertyName", js.undefined)
      
      inline def setType(
        value: TypeofNode | (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HTMLElement */ Any)
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SlotInvalidation extends StObject {
    
    var properties: Boolean | js.Array[String]
    
    var slots: Boolean | js.Array[String]
  }
  object SlotInvalidation {
    
    inline def apply(properties: Boolean | js.Array[String], slots: Boolean | js.Array[String]): SlotInvalidation = {
      val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
      __obj.asInstanceOf[SlotInvalidation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SlotInvalidation] (val x: Self) extends AnyVal {
      
      inline def setProperties(value: Boolean | js.Array[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesVarargs(value: String*): Self = StObject.set(x, "properties", js.Array(value*))
      
      inline def setSlots(value: Boolean | js.Array[String]): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      inline def setSlotsVarargs(value: String*): Self = StObject.set(x, "slots", js.Array(value*))
    }
  }
  
  type SlotValue = Node
  
  type State = Record[String, PropertyValue | js.Array[Node]]
  
  /**
    *
    * @class
    * @public
    */
  trait UI5ElementMetadata extends StObject {
    
    var _initialState: js.UndefOr[State] = js.undefined
    
    /**
      * Determines whether this UI5 Element has a default slot of type Node, therefore can slot text
      * @returns {boolean}
      */
    def canSlotText(): Boolean
    
    /**
      * Returns an array with the attributes of the UI5 Element (in kebab-case)
      * @public
      * @returns {string[]}
      */
    def getAttributesList(): js.Array[String]
    
    /**
      * Returns an object with key-value pairs of events and their metadata definitions
      * @public
      */
    def getEvents(): EventData
    
    def getInitialState(): State
    
    /**
      * Returns an object with key-value pairs of properties and their metadata definitions
      * @public
      */
    def getProperties(): Record[String, Property]
    
    /**
      * Returns an array with the properties of the UI5 Element (in camelCase)
      * @public
      * @returns {string[]}
      */
    def getPropertiesList(): js.Array[String]
    
    /**
      * Returns the tag of the UI5 Element without the scope
      * @public
      */
    def getPureTag(): String
    
    /**
      * Returns an object with key-value pairs of slots and their metadata definitions
      * @public
      */
    def getSlots(): Record[String, Slot]
    
    /**
      * Returns the tag of the UI5 Element
      * @public
      */
    def getTag(): String
    
    /**
      * Determines whether a property should have an attribute counterpart
      * @public
      * @param propName
      * @returns {boolean}
      */
    def hasAttribute(propName: String): Boolean
    
    /**
      * Determines whether this UI5 Element supports any slots with "individualSlots: true"
      * @public
      */
    def hasIndividualSlots(): Boolean
    
    /**
      * Determines whether this UI5 Element supports any slots
      * @public
      */
    def hasSlots(): Boolean
    
    /**
      * Determines whether this UI5 Element has any translatable texts (needs to be invalidated upon language change)
      * @returns {boolean}
      */
    def isLanguageAware(): Boolean
    
    /**
      * Determines whether this UI5 Element has any theme dependant carachteristics.
      * @returns {boolean}
      */
    def isThemeAware(): Boolean
    
    var metadata: Metadata
    
    /**
      * Matches a changed entity (property/slot) with the given name against the "invalidateOnChildChange" configuration
      * and determines whether this should cause and invalidation
      *
      * @param slotName the name of the slot in which a child was changed
      * @param type the type of change in the child: "property" or "slot"
      * @param name the name of the property/slot that changed
      * @returns {boolean}
      */
    def shouldInvalidateOnChildChange(slotName: String, `type`: property | slot, name: String): Boolean
    
    /**
      * Determines whether this UI5 Element needs to invalidate if children are added/removed/changed
      * @public
      */
    def slotsAreManaged(): Boolean
    
    /**
      * Determines whether this control supports F6 fast navigation
      * @public
      */
    def supportsF6FastNavigation(): Boolean
  }
  object UI5ElementMetadata {
    
    inline def apply(
      canSlotText: () => Boolean,
      getAttributesList: () => js.Array[String],
      getEvents: () => EventData,
      getInitialState: () => State,
      getProperties: () => Record[String, Property],
      getPropertiesList: () => js.Array[String],
      getPureTag: () => String,
      getSlots: () => Record[String, Slot],
      getTag: () => String,
      hasAttribute: String => Boolean,
      hasIndividualSlots: () => Boolean,
      hasSlots: () => Boolean,
      isLanguageAware: () => Boolean,
      isThemeAware: () => Boolean,
      metadata: Metadata,
      shouldInvalidateOnChildChange: (String, property | slot, String) => Boolean,
      slotsAreManaged: () => Boolean,
      supportsF6FastNavigation: () => Boolean
    ): UI5ElementMetadata = {
      val __obj = js.Dynamic.literal(canSlotText = js.Any.fromFunction0(canSlotText), getAttributesList = js.Any.fromFunction0(getAttributesList), getEvents = js.Any.fromFunction0(getEvents), getInitialState = js.Any.fromFunction0(getInitialState), getProperties = js.Any.fromFunction0(getProperties), getPropertiesList = js.Any.fromFunction0(getPropertiesList), getPureTag = js.Any.fromFunction0(getPureTag), getSlots = js.Any.fromFunction0(getSlots), getTag = js.Any.fromFunction0(getTag), hasAttribute = js.Any.fromFunction1(hasAttribute), hasIndividualSlots = js.Any.fromFunction0(hasIndividualSlots), hasSlots = js.Any.fromFunction0(hasSlots), isLanguageAware = js.Any.fromFunction0(isLanguageAware), isThemeAware = js.Any.fromFunction0(isThemeAware), metadata = metadata.asInstanceOf[js.Any], shouldInvalidateOnChildChange = js.Any.fromFunction3(shouldInvalidateOnChildChange), slotsAreManaged = js.Any.fromFunction0(slotsAreManaged), supportsF6FastNavigation = js.Any.fromFunction0(supportsF6FastNavigation))
      __obj.asInstanceOf[UI5ElementMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UI5ElementMetadata] (val x: Self) extends AnyVal {
      
      inline def setCanSlotText(value: () => Boolean): Self = StObject.set(x, "canSlotText", js.Any.fromFunction0(value))
      
      inline def setGetAttributesList(value: () => js.Array[String]): Self = StObject.set(x, "getAttributesList", js.Any.fromFunction0(value))
      
      inline def setGetEvents(value: () => EventData): Self = StObject.set(x, "getEvents", js.Any.fromFunction0(value))
      
      inline def setGetInitialState(value: () => State): Self = StObject.set(x, "getInitialState", js.Any.fromFunction0(value))
      
      inline def setGetProperties(value: () => Record[String, Property]): Self = StObject.set(x, "getProperties", js.Any.fromFunction0(value))
      
      inline def setGetPropertiesList(value: () => js.Array[String]): Self = StObject.set(x, "getPropertiesList", js.Any.fromFunction0(value))
      
      inline def setGetPureTag(value: () => String): Self = StObject.set(x, "getPureTag", js.Any.fromFunction0(value))
      
      inline def setGetSlots(value: () => Record[String, Slot]): Self = StObject.set(x, "getSlots", js.Any.fromFunction0(value))
      
      inline def setGetTag(value: () => String): Self = StObject.set(x, "getTag", js.Any.fromFunction0(value))
      
      inline def setHasAttribute(value: String => Boolean): Self = StObject.set(x, "hasAttribute", js.Any.fromFunction1(value))
      
      inline def setHasIndividualSlots(value: () => Boolean): Self = StObject.set(x, "hasIndividualSlots", js.Any.fromFunction0(value))
      
      inline def setHasSlots(value: () => Boolean): Self = StObject.set(x, "hasSlots", js.Any.fromFunction0(value))
      
      inline def setIsLanguageAware(value: () => Boolean): Self = StObject.set(x, "isLanguageAware", js.Any.fromFunction0(value))
      
      inline def setIsThemeAware(value: () => Boolean): Self = StObject.set(x, "isThemeAware", js.Any.fromFunction0(value))
      
      inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setShouldInvalidateOnChildChange(value: (String, property | slot, String) => Boolean): Self = StObject.set(x, "shouldInvalidateOnChildChange", js.Any.fromFunction3(value))
      
      inline def setSlotsAreManaged(value: () => Boolean): Self = StObject.set(x, "slotsAreManaged", js.Any.fromFunction0(value))
      
      inline def setSupportsF6FastNavigation(value: () => Boolean): Self = StObject.set(x, "supportsF6FastNavigation", js.Any.fromFunction0(value))
      
      inline def set_initialState(value: State): Self = StObject.set(x, "_initialState", value.asInstanceOf[js.Any])
      
      inline def set_initialStateUndefined: Self = StObject.set(x, "_initialState", js.undefined)
    }
  }
}
