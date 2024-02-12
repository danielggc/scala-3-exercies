package typings.ui5Webcomponents.anon

import typings.ui5WebcomponentsBase.distI18nBundleMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofGroupHeaderListItem extends StObject {
  
  /**
    * Defines the text of the component.
    * <br>
    * <b>Note:</b> Although this slot accepts HTML Elements, it is strongly recommended that you only use text in order to preserve the intended design.
    *
    * @type {Node[]}
    * @name sap.ui.webc.main.GroupHeaderListItem.prototype.default
    * @slot
    * @public
    */
  /* static member */
  var i18nBundle: default
  
  /* static member */
  def onDefine(): js.Promise[Unit]
}
object TypeofGroupHeaderListItem {
  
  inline def apply(i18nBundle: default, onDefine: () => js.Promise[Unit]): TypeofGroupHeaderListItem = {
    val __obj = js.Dynamic.literal(i18nBundle = i18nBundle.asInstanceOf[js.Any], onDefine = js.Any.fromFunction0(onDefine))
    __obj.asInstanceOf[TypeofGroupHeaderListItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofGroupHeaderListItem] (val x: Self) extends AnyVal {
    
    inline def setI18nBundle(value: default): Self = StObject.set(x, "i18nBundle", value.asInstanceOf[js.Any])
    
    inline def setOnDefine(value: () => js.Promise[Unit]): Self = StObject.set(x, "onDefine", js.Any.fromFunction0(value))
  }
}
