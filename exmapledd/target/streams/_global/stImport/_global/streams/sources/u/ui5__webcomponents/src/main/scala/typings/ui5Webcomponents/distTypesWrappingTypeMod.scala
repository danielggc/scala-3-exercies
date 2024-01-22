package typings.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesWrappingTypeMod {
  
  @JSImport("@ui5/webcomponents/dist/types/WrappingType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[WrappingType & String] = js.native
    
    /* "None" */ val None: typings.ui5Webcomponents.distTypesWrappingTypeMod.WrappingType.None & String = js.native
    
    /* "Normal" */ val Normal: typings.ui5Webcomponents.distTypesWrappingTypeMod.WrappingType.Normal & String = js.native
  }
  
  @js.native
  sealed trait WrappingType extends StObject
  @JSImport("@ui5/webcomponents/dist/types/WrappingType", "WrappingType")
  @js.native
  object WrappingType extends StObject {
    
    /**
      * The text will be truncated with an ellipsis.
      * @public
      * @type {None}
      */
    @js.native
    sealed trait None
      extends StObject
         with WrappingType
    
    /**
      * The text will wrap. The words will not be broken based on hyphenation.
      * @public
      * @type {Normal}
      */
    @js.native
    sealed trait Normal
      extends StObject
         with WrappingType
  }
}
