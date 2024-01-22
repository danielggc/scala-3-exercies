package typings.ui5WebcomponentsBase

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Event
import typings.std.EventListenerObject
import typings.std.PromiseLike
import typings.std.Record
import typings.std.ReturnType
import typings.ui5WebcomponentsBase.anon.FnCall
import typings.ui5WebcomponentsBase.distAssetRegistriesThemesMod._ThemeData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ClassMap = {[x: string] : @ui5/webcomponents-base.@ui5/webcomponents-base/dist/types.ClassMapValue | @ui5/webcomponents-base.@ui5/webcomponents-base/dist/types.ClassMap}
  }}}
  to avoid circular code involving: 
  - @ui5/webcomponents-base.@ui5/webcomponents-base/dist/types.ClassMap
  */
  trait ClassMap
    extends StObject
       with /* x */ StringDictionary[ClassMapValue | ClassMap]
  object ClassMap {
    
    inline def apply(): ClassMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClassMap]
    }
  }
  
  type ClassMapValue = Record[String, Boolean]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ComponentStylesData = std.Array<@ui5/webcomponents-base.@ui5/webcomponents-base/dist/types.ComponentStylesData> | std.Array<@ui5/webcomponents-base.@ui5/webcomponents-base/dist/types.StyleData> | @ui5/webcomponents-base.@ui5/webcomponents-base/dist/types.StyleData
  }}}
  to avoid circular code involving: 
  - @ui5/webcomponents-base.@ui5/webcomponents-base/dist/types.ComponentStylesData
  */
  type ComponentStylesData = (js.Array[Any | StyleData]) | StyleData
  
  type Interval = ReturnType[FnCall]
  
  trait PassiveEventListenerObject
    extends StObject
       with EventListenerObject {
    
    var passive: Boolean
  }
  object PassiveEventListenerObject {
    
    inline def apply(handleEvent: Event => Unit, passive: Boolean): PassiveEventListenerObject = {
      val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent), passive = passive.asInstanceOf[js.Any])
      __obj.asInstanceOf[PassiveEventListenerObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PassiveEventListenerObject] (val x: Self) extends AnyVal {
      
      inline def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
    }
  }
  
  type PromiseResolve = js.Function1[/* value */ Unit | PromiseLike[Unit], Unit]
  
  type StyleData = StyleDataCSP | String
  
  trait StyleDataCSP
    extends StObject
       with _ThemeData {
    
    var content: String
    
    var fileName: String
    
    var packageName: String
  }
  object StyleDataCSP {
    
    inline def apply(content: String, fileName: String, packageName: String): StyleDataCSP = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleDataCSP]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StyleDataCSP] (val x: Self) extends AnyVal {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    }
  }
  
  type Timeout = ReturnType[FnCall]
}
