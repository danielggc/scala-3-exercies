package typings.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTitleLevelMod {
  
  @JSImport("@ui5/webcomponents/dist/types/TitleLevel", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TitleLevel & String] = js.native
    
    /* "H1" */ val H1: typings.ui5Webcomponents.distTypesTitleLevelMod.TitleLevel.H1 & String = js.native
    
    /* "H2" */ val H2: typings.ui5Webcomponents.distTypesTitleLevelMod.TitleLevel.H2 & String = js.native
    
    /* "H3" */ val H3: typings.ui5Webcomponents.distTypesTitleLevelMod.TitleLevel.H3 & String = js.native
    
    /* "H4" */ val H4: typings.ui5Webcomponents.distTypesTitleLevelMod.TitleLevel.H4 & String = js.native
    
    /* "H5" */ val H5: typings.ui5Webcomponents.distTypesTitleLevelMod.TitleLevel.H5 & String = js.native
    
    /* "H6" */ val H6: typings.ui5Webcomponents.distTypesTitleLevelMod.TitleLevel.H6 & String = js.native
  }
  
  @js.native
  sealed trait TitleLevel extends StObject
  @JSImport("@ui5/webcomponents/dist/types/TitleLevel", "TitleLevel")
  @js.native
  object TitleLevel extends StObject {
    
    /**
      * Renders <code>h1</code> tag.
      * @public
      * @type {H1}
      */
    @js.native
    sealed trait H1
      extends StObject
         with TitleLevel
    
    /**
      * Renders <code>h2</code> tag.
      * @public
      * @type {H2}
      */
    @js.native
    sealed trait H2
      extends StObject
         with TitleLevel
    
    /**
      * Renders <code>h3</code> tag.
      * @public
      * @type {H3}
      */
    @js.native
    sealed trait H3
      extends StObject
         with TitleLevel
    
    /**
      * Renders <code>h4</code> tag.
      * @public
      * @type {H4}
      */
    @js.native
    sealed trait H4
      extends StObject
         with TitleLevel
    
    /**
      * Renders <code>h5</code> tag.
      * @public
      * @type {H5}
      */
    @js.native
    sealed trait H5
      extends StObject
         with TitleLevel
    
    /**
      * Renders <code>h6</code> tag.
      * @public
      * @type {H6}
      */
    @js.native
    sealed trait H6
      extends StObject
         with TitleLevel
  }
}
