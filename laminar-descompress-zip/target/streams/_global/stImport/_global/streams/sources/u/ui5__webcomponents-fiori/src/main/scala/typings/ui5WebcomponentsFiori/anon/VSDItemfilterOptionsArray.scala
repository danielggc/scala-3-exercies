package typings.ui5WebcomponentsFiori.anon

import typings.ui5WebcomponentsFiori.distViewSettingsDialogMod.VSDItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @ui5/webcomponents-fiori.@ui5/webcomponents-fiori/dist/ViewSettingsDialog.VSDItem & {  filterOptions :std.Array<@ui5/webcomponents-fiori.@ui5/webcomponents-fiori/dist/ViewSettingsDialog.VSDItem>} */
trait VSDItemfilterOptionsArray extends StObject {
  
  var filterOptions: js.Array[VSDItem]
  
  var selected: Boolean
  
  var text: String
}
object VSDItemfilterOptionsArray {
  
  inline def apply(filterOptions: js.Array[VSDItem], selected: Boolean, text: String): VSDItemfilterOptionsArray = {
    val __obj = js.Dynamic.literal(filterOptions = filterOptions.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[VSDItemfilterOptionsArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VSDItemfilterOptionsArray] (val x: Self) extends AnyVal {
    
    inline def setFilterOptions(value: js.Array[VSDItem]): Self = StObject.set(x, "filterOptions", value.asInstanceOf[js.Any])
    
    inline def setFilterOptionsVarargs(value: VSDItem*): Self = StObject.set(x, "filterOptions", js.Array(value*))
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
