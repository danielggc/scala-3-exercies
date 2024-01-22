package typings.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndColumnFullScreen extends StObject {
  
  var EndColumnFullScreen: Arrows
  
  var MidColumnFullScreen: Arrows
  
  var OneColumn: Arrows
  
  var ThreeColumnsEndExpanded: ArrowsArray
  
  var ThreeColumnsMidExpanded: ArrowsLayout
  
  var ThreeColumnsMidExpandedEndHidden: Arrows
  
  var ThreeColumnsStartExpanded: ArrowsLayout
  
  var ThreeColumnsStartExpandedEndHidden: Layout
  
  var TwoColumnsMidExpanded: Arrows
  
  var TwoColumnsStartExpanded: Layout
}
object EndColumnFullScreen {
  
  inline def apply(
    EndColumnFullScreen: Arrows,
    MidColumnFullScreen: Arrows,
    OneColumn: Arrows,
    ThreeColumnsEndExpanded: ArrowsArray,
    ThreeColumnsMidExpanded: ArrowsLayout,
    ThreeColumnsMidExpandedEndHidden: Arrows,
    ThreeColumnsStartExpanded: ArrowsLayout,
    ThreeColumnsStartExpandedEndHidden: Layout,
    TwoColumnsMidExpanded: Arrows,
    TwoColumnsStartExpanded: Layout
  ): EndColumnFullScreen = {
    val __obj = js.Dynamic.literal(EndColumnFullScreen = EndColumnFullScreen.asInstanceOf[js.Any], MidColumnFullScreen = MidColumnFullScreen.asInstanceOf[js.Any], OneColumn = OneColumn.asInstanceOf[js.Any], ThreeColumnsEndExpanded = ThreeColumnsEndExpanded.asInstanceOf[js.Any], ThreeColumnsMidExpanded = ThreeColumnsMidExpanded.asInstanceOf[js.Any], ThreeColumnsMidExpandedEndHidden = ThreeColumnsMidExpandedEndHidden.asInstanceOf[js.Any], ThreeColumnsStartExpanded = ThreeColumnsStartExpanded.asInstanceOf[js.Any], ThreeColumnsStartExpandedEndHidden = ThreeColumnsStartExpandedEndHidden.asInstanceOf[js.Any], TwoColumnsMidExpanded = TwoColumnsMidExpanded.asInstanceOf[js.Any], TwoColumnsStartExpanded = TwoColumnsStartExpanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndColumnFullScreen]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndColumnFullScreen] (val x: Self) extends AnyVal {
    
    inline def setEndColumnFullScreen(value: Arrows): Self = StObject.set(x, "EndColumnFullScreen", value.asInstanceOf[js.Any])
    
    inline def setMidColumnFullScreen(value: Arrows): Self = StObject.set(x, "MidColumnFullScreen", value.asInstanceOf[js.Any])
    
    inline def setOneColumn(value: Arrows): Self = StObject.set(x, "OneColumn", value.asInstanceOf[js.Any])
    
    inline def setThreeColumnsEndExpanded(value: ArrowsArray): Self = StObject.set(x, "ThreeColumnsEndExpanded", value.asInstanceOf[js.Any])
    
    inline def setThreeColumnsMidExpanded(value: ArrowsLayout): Self = StObject.set(x, "ThreeColumnsMidExpanded", value.asInstanceOf[js.Any])
    
    inline def setThreeColumnsMidExpandedEndHidden(value: Arrows): Self = StObject.set(x, "ThreeColumnsMidExpandedEndHidden", value.asInstanceOf[js.Any])
    
    inline def setThreeColumnsStartExpanded(value: ArrowsLayout): Self = StObject.set(x, "ThreeColumnsStartExpanded", value.asInstanceOf[js.Any])
    
    inline def setThreeColumnsStartExpandedEndHidden(value: Layout): Self = StObject.set(x, "ThreeColumnsStartExpandedEndHidden", value.asInstanceOf[js.Any])
    
    inline def setTwoColumnsMidExpanded(value: Arrows): Self = StObject.set(x, "TwoColumnsMidExpanded", value.asInstanceOf[js.Any])
    
    inline def setTwoColumnsStartExpanded(value: Layout): Self = StObject.set(x, "TwoColumnsStartExpanded", value.asInstanceOf[js.Any])
  }
}
