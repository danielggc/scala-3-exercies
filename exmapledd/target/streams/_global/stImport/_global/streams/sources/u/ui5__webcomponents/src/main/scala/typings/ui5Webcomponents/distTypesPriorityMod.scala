package typings.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPriorityMod {
  
  @JSImport("@ui5/webcomponents/dist/types/Priority", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Priority & String] = js.native
    
    /* "High" */ val High: typings.ui5Webcomponents.distTypesPriorityMod.Priority.High & String = js.native
    
    /* "Low" */ val Low: typings.ui5Webcomponents.distTypesPriorityMod.Priority.Low & String = js.native
    
    /* "Medium" */ val Medium: typings.ui5Webcomponents.distTypesPriorityMod.Priority.Medium & String = js.native
    
    /* "None" */ val None: typings.ui5Webcomponents.distTypesPriorityMod.Priority.None & String = js.native
  }
  
  @js.native
  sealed trait Priority extends StObject
  @JSImport("@ui5/webcomponents/dist/types/Priority", "Priority")
  @js.native
  object Priority extends StObject {
    
    /**
      * High priority.
      * @public
      * @type {High}
      */
    @js.native
    sealed trait High
      extends StObject
         with Priority
    
    /**
      * Low priority.
      * @public
      * @type {Low}
      */
    @js.native
    sealed trait Low
      extends StObject
         with Priority
    
    /**
      * Medium priority.
      * @public
      * @type {Medium}
      */
    @js.native
    sealed trait Medium
      extends StObject
         with Priority
    
    /**
      * Default, none priority.
      * @public
      * @type {None}
      */
    @js.native
    sealed trait None
      extends StObject
         with Priority
  }
}
