package typings.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesValueStateMod {
  
  @JSImport("@ui5/webcomponents-base/dist/types/ValueState", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ValueState & String] = js.native
    
    /* "Error" */ val Error: typings.ui5WebcomponentsBase.distTypesValueStateMod.ValueState.Error & String = js.native
    
    /* "Information" */ val Information: typings.ui5WebcomponentsBase.distTypesValueStateMod.ValueState.Information & String = js.native
    
    /* "None" */ val None: typings.ui5WebcomponentsBase.distTypesValueStateMod.ValueState.None & String = js.native
    
    /* "Success" */ val Success: typings.ui5WebcomponentsBase.distTypesValueStateMod.ValueState.Success & String = js.native
    
    /* "Warning" */ val Warning: typings.ui5WebcomponentsBase.distTypesValueStateMod.ValueState.Warning & String = js.native
  }
  
  @js.native
  sealed trait ValueState extends StObject
  @JSImport("@ui5/webcomponents-base/dist/types/ValueState", "ValueState")
  @js.native
  object ValueState extends StObject {
    
    /**
      *
      * @public
      * @type {Error}
      */
    @js.native
    sealed trait Error
      extends StObject
         with ValueState
    
    /**
      *
      * @public
      * @type {Information}
      */
    @js.native
    sealed trait Information
      extends StObject
         with ValueState
    
    /**
      *
      * @public
      * @type {None}
      */
    @js.native
    sealed trait None
      extends StObject
         with ValueState
    
    /**
      *
      * @public
      * @type {Success}
      */
    @js.native
    sealed trait Success
      extends StObject
         with ValueState
    
    /**
      *
      * @public
      * @type {Warning}
      */
    @js.native
    sealed trait Warning
      extends StObject
         with ValueState
  }
}
