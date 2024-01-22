package typings.ui5WebcomponentsBase

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMediaRangeMod {
  
  /**
    * API for screen width changes.
    *
    * @namespace
    * @name MediaRange
    */
  object default {
    
    @JSImport("@ui5/webcomponents-base/dist/MediaRange", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ui5/webcomponents-base/dist/MediaRange", "default.RANGESETS")
    @js.native
    def RANGESETS: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RANGESETS */ Any = js.native
    inline def RANGESETS_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RANGESETS */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RANGESETS")(x.asInstanceOf[js.Any])
    
    inline def getCurrentRange(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentRange")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getCurrentRange(name: String, width: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentRange")(name.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def initRangeSet(name: String, range: Range): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initRangeSet")(name.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @js.native
  sealed trait RANGESETS extends StObject
  /**
    * Enumeration containing the names and settings of predefined screen width media query range sets.
    *
    * @namespace
    * @name MediaRange.RANGESETS
    * @public
    */
  @JSImport("@ui5/webcomponents-base/dist/MediaRange", "RANGESETS")
  @js.native
  object RANGESETS extends StObject {
    
    /**
      * A 4-step range set (S-M-L-XL).
      *
      * The ranges of this set are:
      * <ul>
      * <li><code>"S"</code>: For screens smaller than 600 pixels.</li>
      * <li><code>"M"</code>: For screens greater than or equal to 600 pixels and smaller than 1024 pixels.</li>
      * <li><code>"L"</code>: For screens greater than or equal to 1024 pixels and smaller than 1440 pixels.</li>
      * <li><code>"XL"</code>: For screens greater than or equal to 1440 pixels.</li>
      * </ul>
      *
      * @name MediaRange.RANGESETS.RANGE_4STEPS
      * @public
      */
    @js.native
    sealed trait RANGE_4STEPS
      extends StObject
         with RANGESETS
  }
  
  type Range = Map[String, js.Array[Double]]
}
