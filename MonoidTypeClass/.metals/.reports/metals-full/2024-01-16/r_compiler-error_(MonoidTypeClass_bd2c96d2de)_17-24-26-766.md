file://<WORKSPACE>/main.scala
### java.lang.StringIndexOutOfBoundsException: begin 417, end 449, length 443

occurred in the presentation compiler.

action parameters:
offset: 443
uri: file://<WORKSPACE>/main.scala
text:
```scala
package progscala3.contexts.typeclass
import scala.annotation.targetName


trait  Semigroup[T]:
    extension ( t: T )
        infix def  combine( other: T ): T 
        def  <+>( other:T ):T = t.combine( other )


trait Monoid extends  Semigroup[T]
    def unit :T 



given  implementationIntMonoid : Monoid[Int] =
    def unit = 0
    extension ( d : Int ) 
        infix def combine( other ) = d + other 


given implementationStringMonoid@@
```



#### Error stacktrace:

```
java.base/java.lang.String.checkBoundsBeginEnd(String.java:4606)
	java.base/java.lang.String.substring(String.java:2709)
	scala.meta.internal.pc.PcCollector.isGeneratedGiven(PcCollector.scala:139)
	scala.meta.internal.pc.PcCollector.soughtSymbols(PcCollector.scala:216)
	scala.meta.internal.pc.PcCollector.resultWithSought(PcCollector.scala:361)
	scala.meta.internal.pc.PcCollector.result(PcCollector.scala:351)
	scala.meta.internal.pc.PcDocumentHighlightProvider.highlights(PcDocumentHighlightProvider.scala:32)
	scala.meta.internal.pc.ScalaPresentationCompiler.documentHighlight$$anonfun$1(ScalaPresentationCompiler.scala:168)
```
#### Short summary: 

java.lang.StringIndexOutOfBoundsException: begin 417, end 449, length 443