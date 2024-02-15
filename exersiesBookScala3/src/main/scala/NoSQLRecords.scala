import scala.language.implicitConversions
import scala.compiletime.ops.int
import scala.util.Try




case class invalidFieldName( name :String ) extends  RuntimeException(s"invalid field name : [ $name ]")







case class  Recort private (  contents : Map[String, Any ] ):
    import  Recort.Conv
    def add[T:Conv] ( data : Map[ String, T ]) :Recort  =
        Recort( contents ++ data )
    def get[T:Conv]( name :String ) : Try[T]=
        Try{
            val conv =   summon[Conv[T]]
            conv(cosult( name ))
        }

    def cosult( name : String) :Any = 
        contents.getOrElse( name , throw  invalidFieldName(name))




object  Recort:
    def make:Recort =  Recort(Map.empty)
    type Conv[V] = Conversion[Any,V]



@main 
def TryScalaDB =
    import Recort.Conv

    given Conv[Int] = _.asInstanceOf[Int]
    given Conv[Double] = _.asInstanceOf[Double]
    given Conv[String] = _.asInstanceOf[String]
    given ab[A : Conv, B : Conv]: Conv[(A, B)] = _.asInstanceOf[(A,B)]
    

    val rec = Recort.make.add ( Map( "one" -> 1 ) )
    .add( Map ("two" -> 2.2) )
    .add ( Map ("three" -> "THREE!")) 
    .add ( Map ("four" -> (4.4, "four"))) 
    .add ( Map ("five" -> (5, ("five", 5.5))) )


    
    val one = rec.get[Int]("one")
    val two = rec.get[Double]("two")
    val three = rec.get[String]("three")
    val four = rec.get[(Double, String)]("four")
    val five = rec.get[(Int, (String, Double))]("five")
    val bad1 = rec.get[String]("two")
    val bad2 = rec.get[String]("five")
    val bad3 = rec.get[Double]("five")
    // val error = rec.get[Byte]("byte")
    println( s"one, two, three, four, five ->\n $one, $two, $three, $four,\n" ) 
    println( s"bad1, bad2, bad3 ->\n $bad1\n $bad2\n $bad3")