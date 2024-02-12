package typings.litHtml

import typings.litHtml.developmentDirectiveMod.PartInfo
import typings.litHtml.developmentDirectivesRepeatMod.RepeatDirectiveFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object directivesRepeatDotjsMod {
  
  @JSImport("lit-html/directives/repeat.js", "RepeatDirective")
  @js.native
  open class RepeatDirective protected ()
    extends typings.litHtml.developmentDirectivesRepeatMod.RepeatDirective {
    def this(partInfo: PartInfo) = this()
  }
  
  @JSImport("lit-html/directives/repeat.js", "repeat")
  @js.native
  val repeat: RepeatDirectiveFn = js.native
}
