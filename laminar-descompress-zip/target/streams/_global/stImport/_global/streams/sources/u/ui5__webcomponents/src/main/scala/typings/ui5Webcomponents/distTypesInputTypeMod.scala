package typings.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInputTypeMod {
  
  @JSImport("@ui5/webcomponents/dist/types/InputType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[InputType & String] = js.native
    
    /* "Email" */ val Email: typings.ui5Webcomponents.distTypesInputTypeMod.InputType.Email & String = js.native
    
    /* "Number" */ val Number: typings.ui5Webcomponents.distTypesInputTypeMod.InputType.Number & String = js.native
    
    /* "Password" */ val Password: typings.ui5Webcomponents.distTypesInputTypeMod.InputType.Password & String = js.native
    
    /* "Tel" */ val Tel: typings.ui5Webcomponents.distTypesInputTypeMod.InputType.Tel & String = js.native
    
    /* "Text" */ val Text: typings.ui5Webcomponents.distTypesInputTypeMod.InputType.Text & String = js.native
    
    /* "URL" */ val URL: typings.ui5Webcomponents.distTypesInputTypeMod.InputType.URL & String = js.native
  }
  
  @js.native
  sealed trait InputType extends StObject
  @JSImport("@ui5/webcomponents/dist/types/InputType", "InputType")
  @js.native
  object InputType extends StObject {
    
    /**
      * Used for input fields that must contain an e-mail address.
      * @public
      * @type {Email}
      */
    @js.native
    sealed trait Email
      extends StObject
         with InputType
    
    /**
      * Defines a numeric input field.
      * @public
      * @type {Number}
      */
    @js.native
    sealed trait Number
      extends StObject
         with InputType
    
    /**
      * Defines a password field.
      * @public
      * @type {Password}
      */
    @js.native
    sealed trait Password
      extends StObject
         with InputType
    
    /**
      * Used for input fields that should contain a telephone number.
      * @public
      * @type {Tel}
      */
    @js.native
    sealed trait Tel
      extends StObject
         with InputType
    
    /**
      * Defines a one-line text input field:
      * @public
      * @type {Text}
      */
    @js.native
    sealed trait Text
      extends StObject
         with InputType
    
    /**
      * Used for input fields that should contain a URL address.
      * @public
      * @type {URL}
      */
    @js.native
    sealed trait URL
      extends StObject
         with InputType
  }
}
