package typings.ui5WebcomponentsFiori.anon

import typings.std.Record
import typings.ui5WebcomponentsBase.distI18nBundleMod.I18nText
import typings.ui5WebcomponentsBase.distI18nBundleMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofLink extends StObject {
  
  /* static member */
  var i18nBundle: default
  
  /* static member */
  def onDefine(): js.Promise[Unit]
  
  /* static member */
  def typeTextMappings(): Record[String, I18nText]
}
object TypeofLink {
  
  inline def apply(
    i18nBundle: default,
    onDefine: () => js.Promise[Unit],
    typeTextMappings: () => Record[String, I18nText]
  ): TypeofLink = {
    val __obj = js.Dynamic.literal(i18nBundle = i18nBundle.asInstanceOf[js.Any], onDefine = js.Any.fromFunction0(onDefine), typeTextMappings = js.Any.fromFunction0(typeTextMappings))
    __obj.asInstanceOf[TypeofLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofLink] (val x: Self) extends AnyVal {
    
    inline def setI18nBundle(value: default): Self = StObject.set(x, "i18nBundle", value.asInstanceOf[js.Any])
    
    inline def setOnDefine(value: () => js.Promise[Unit]): Self = StObject.set(x, "onDefine", js.Any.fromFunction0(value))
    
    inline def setTypeTextMappings(value: () => Record[String, I18nText]): Self = StObject.set(x, "typeTextMappings", js.Any.fromFunction0(value))
  }
}
