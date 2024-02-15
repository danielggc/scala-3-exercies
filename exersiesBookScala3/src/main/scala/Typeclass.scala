package progscala3.contexts.Typeclass
import scala.annotation.targetName
import scala.compiletime.ops.string


trait  Semigroup[T]:
    extension ( t: T )
        infix def  combine( other: T ): T 
        def  <+>( other:T ):T = t.combine( other )


trait Monoid[T] extends  Semigroup[T] :
    def unit :T 



given  implementationIntMonoid : Monoid[Int] with
    def unit = 0
    extension ( d : Int ) 
        infix def combine( other:Int ):Int = d + other 


given implementationStringMonoid : Monoid[String] with
    def unit = ""
    extension  ( d :String )
        infix def combine( other:String ):String =  d + other 



//that is similar implentation but better 


given[T:Numeric] : Monoid[T] with 
    def  unit :T  = summon[Numeric[T]].zero
    extension (  d : T )
        infix def combine ( other:T ) : T = summon[Numeric[T]].plus( d , other )

//given[T]( using num : Numeric[T] ) : Monoid[T] with 
//    def  unit :T  = summon[Numeric[T]].zero
//    extension (  d : T )
//        infix def combine ( other:T ) : T = summon[Numeric[T]].plus( d , other )


object Typeclass :
    @main def main( ):Unit = 
        println(" this is example about trait and given and his construtions or implementations ")
        val dd1 =   List(1 combine 2 , 1 <+> 2  , "aa" combine "bb" , "ss" <+> "dd" ) // if it is  a error with  "0.5 <+> 0.1" !!!!  
        println("[\n")
        dd1.foreach( e  => println( e ))
        println("\n]\n")



//"2" <+> ("3" <+> "4")
//("2" <+> "3") <+> "4"
//("2" combine "3") combine "4"
//StringMonoid.unit <+> "2"
//"2" <+> StringMonoid.unit// "234"
// "234"
// "234"
// "2"
// "2"
//2 <+> (3 <+> 4)
//(2 <+> 3) <+> 4
//(2 combine 3) combine 4
//IntMonoid.unit <+> 2
//2 <+> IntMonoid.unit// 9
// 9
// 9
// 2
// 2