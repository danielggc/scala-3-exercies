package typings.ui5WebcomponentsFiori.anon

import typings.ui5WebcomponentsFiori.distSortItemMod.default
import typings.ui5WebcomponentsFiori.distViewSettingsDialogMod.VSDFilter
import typings.ui5WebcomponentsFiori.distViewSettingsDialogMod.VSDFilters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filters extends StObject {
  
  var filters: VSDFilters
  
  var sortBy: String
  
  var sortByItem: default
  
  var sortDescending: Boolean
  
  var sortOrder: String
}
object Filters {
  
  inline def apply(
    filters: VSDFilters,
    sortBy: String,
    sortByItem: default,
    sortDescending: Boolean,
    sortOrder: String
  ): Filters = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], sortBy = sortBy.asInstanceOf[js.Any], sortByItem = sortByItem.asInstanceOf[js.Any], sortDescending = sortDescending.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Filters] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: VSDFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersVarargs(value: VSDFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setSortBy(value: String): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByItem(value: default): Self = StObject.set(x, "sortByItem", value.asInstanceOf[js.Any])
    
    inline def setSortDescending(value: Boolean): Self = StObject.set(x, "sortDescending", value.asInstanceOf[js.Any])
    
    inline def setSortOrder(value: String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
  }
}
