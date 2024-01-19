package progscala3.contexts.typeclass
import scala.annotation.targetName


trait  Semigroup[T]:
    extension ( t: T )
        infix def  combine( other: T ): T 
        def  <+>( other:T ):T = t.combine( other )


trait Monoid[T] extends  Semigroup[T] :
    def unit :T 



given  implementationIntMonoid : Monoid[Int] =
    def unit = 0
    extension ( d : Int ) 
        infix def combine( other ):Int = d + other 


given implementationStringMonoid : Monoid[String] = 
    def unit = String
    extension  ( d :String )
        infix def combine( other ):String =  d + other 