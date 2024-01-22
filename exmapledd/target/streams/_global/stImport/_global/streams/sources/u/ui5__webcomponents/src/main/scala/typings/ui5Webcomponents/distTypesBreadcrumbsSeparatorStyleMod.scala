package typings.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBreadcrumbsSeparatorStyleMod {
  
  @JSImport("@ui5/webcomponents/dist/types/BreadcrumbsSeparatorStyle", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[BreadcrumbsSeparatorStyle & String] = js.native
    
    /* "BackSlash" */ val BackSlash: typings.ui5Webcomponents.distTypesBreadcrumbsSeparatorStyleMod.BreadcrumbsSeparatorStyle.BackSlash & String = js.native
    
    /* "DoubleBackSlash" */ val DoubleBackSlash: typings.ui5Webcomponents.distTypesBreadcrumbsSeparatorStyleMod.BreadcrumbsSeparatorStyle.DoubleBackSlash & String = js.native
    
    /* "DoubleGreaterThan" */ val DoubleGreaterThan: typings.ui5Webcomponents.distTypesBreadcrumbsSeparatorStyleMod.BreadcrumbsSeparatorStyle.DoubleGreaterThan & String = js.native
    
    /* "DoubleSlash" */ val DoubleSlash: typings.ui5Webcomponents.distTypesBreadcrumbsSeparatorStyleMod.BreadcrumbsSeparatorStyle.DoubleSlash & String = js.native
    
    /* "GreaterThan" */ val GreaterThan: typings.ui5Webcomponents.distTypesBreadcrumbsSeparatorStyleMod.BreadcrumbsSeparatorStyle.GreaterThan & String = js.native
    
    /* "Slash" */ val Slash: typings.ui5Webcomponents.distTypesBreadcrumbsSeparatorStyleMod.BreadcrumbsSeparatorStyle.Slash & String = js.native
  }
  
  @js.native
  sealed trait BreadcrumbsSeparatorStyle extends StObject
  @JSImport("@ui5/webcomponents/dist/types/BreadcrumbsSeparatorStyle", "BreadcrumbsSeparatorStyle")
  @js.native
  object BreadcrumbsSeparatorStyle extends StObject {
    
    /**
      * The separator appears as "\".
      * @public
      * @type {BackSlash}
      */
    @js.native
    sealed trait BackSlash
      extends StObject
         with BreadcrumbsSeparatorStyle
    
    /**
      * The separator appears as "\\".
      * @public
      * @type {DoubleBackSlash}
      */
    @js.native
    sealed trait DoubleBackSlash
      extends StObject
         with BreadcrumbsSeparatorStyle
    
    /**
      * The separator appears as ">>".
      * @public
      * @type {DoubleGreaterThan}
      */
    @js.native
    sealed trait DoubleGreaterThan
      extends StObject
         with BreadcrumbsSeparatorStyle
    
    /**
      * The separator appears as "//" .
      * @public
      * @type {DoubleSlash}
      */
    @js.native
    sealed trait DoubleSlash
      extends StObject
         with BreadcrumbsSeparatorStyle
    
    /**
      * The separator appears as ">".
      * @public
      * @type {GreaterThan}
      */
    @js.native
    sealed trait GreaterThan
      extends StObject
         with BreadcrumbsSeparatorStyle
    
    /**
      * The separator appears as "/".
      * @public
      * @type {Slash}
      */
    @js.native
    sealed trait Slash
      extends StObject
         with BreadcrumbsSeparatorStyle
  }
}
