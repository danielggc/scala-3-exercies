package typings.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCalendarTypeMod {
  
  @JSImport("@ui5/webcomponents-base/dist/types/CalendarType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CalendarType & String] = js.native
    
    /* "Buddhist" */ val Buddhist: typings.ui5WebcomponentsBase.distTypesCalendarTypeMod.CalendarType.Buddhist & String = js.native
    
    /* "Gregorian" */ val Gregorian: typings.ui5WebcomponentsBase.distTypesCalendarTypeMod.CalendarType.Gregorian & String = js.native
    
    /* "Islamic" */ val Islamic: typings.ui5WebcomponentsBase.distTypesCalendarTypeMod.CalendarType.Islamic & String = js.native
    
    /* "Japanese" */ val Japanese: typings.ui5WebcomponentsBase.distTypesCalendarTypeMod.CalendarType.Japanese & String = js.native
    
    /* "Persian" */ val Persian: typings.ui5WebcomponentsBase.distTypesCalendarTypeMod.CalendarType.Persian & String = js.native
  }
  
  @js.native
  sealed trait CalendarType extends StObject
  @JSImport("@ui5/webcomponents-base/dist/types/CalendarType", "CalendarType")
  @js.native
  object CalendarType extends StObject {
    
    /**
      * @public
      * @type {Buddhist}
      */
    @js.native
    sealed trait Buddhist
      extends StObject
         with CalendarType
    
    /**
      * @public
      * @type {Gregorian}
      */
    @js.native
    sealed trait Gregorian
      extends StObject
         with CalendarType
    
    /**
      * @public
      * @type {Islamic}
      */
    @js.native
    sealed trait Islamic
      extends StObject
         with CalendarType
    
    /**
      * @public
      * @type {Japanese}
      */
    @js.native
    sealed trait Japanese
      extends StObject
         with CalendarType
    
    /**
      * @public
      * @type {Persian}
      */
    @js.native
    sealed trait Persian
      extends StObject
         with CalendarType
  }
}
