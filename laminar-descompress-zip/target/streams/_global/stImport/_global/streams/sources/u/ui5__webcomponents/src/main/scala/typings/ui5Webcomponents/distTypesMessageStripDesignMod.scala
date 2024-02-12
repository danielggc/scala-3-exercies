package typings.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMessageStripDesignMod {
  
  @JSImport("@ui5/webcomponents/dist/types/MessageStripDesign", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MessageStripDesign & String] = js.native
    
    /* "Information" */ val Information: typings.ui5Webcomponents.distTypesMessageStripDesignMod.MessageStripDesign.Information & String = js.native
    
    /* "Negative" */ val Negative: typings.ui5Webcomponents.distTypesMessageStripDesignMod.MessageStripDesign.Negative & String = js.native
    
    /* "Positive" */ val Positive: typings.ui5Webcomponents.distTypesMessageStripDesignMod.MessageStripDesign.Positive & String = js.native
    
    /* "Warning" */ val Warning: typings.ui5Webcomponents.distTypesMessageStripDesignMod.MessageStripDesign.Warning & String = js.native
  }
  
  @js.native
  sealed trait MessageStripDesign extends StObject
  @JSImport("@ui5/webcomponents/dist/types/MessageStripDesign", "MessageStripDesign")
  @js.native
  object MessageStripDesign extends StObject {
    
    /**
      * Message should be just an information
      * @public
      * @type {Information}
      */
    @js.native
    sealed trait Information
      extends StObject
         with MessageStripDesign
    
    /**
      * Message is an error
      * @public
      * @type {Negative}
      */
    @js.native
    sealed trait Negative
      extends StObject
         with MessageStripDesign
    
    /**
      * Message is a success message
      * @public
      * @type {Positive}
      */
    @js.native
    sealed trait Positive
      extends StObject
         with MessageStripDesign
    
    /**
      * Message is a warning
      * @public
      * @type {Warning}
      */
    @js.native
    sealed trait Warning
      extends StObject
         with MessageStripDesign
  }
}
