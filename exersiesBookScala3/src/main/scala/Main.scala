package progscala3.rounding
import scala.language.reflectiveCalls
import reflect.Selectable.reflectiveSelectable
import scala.util.control.NonFatal
import scala.io.Source

object  manage:
  def apply[ R<:{ def close():Unit }, T  ] (  resour: => R ) ( f :R => T ) : T = 
    var res : Option[R] = None 
    try 
      res = Some( resour )
      f( res.get )
    catch
      case NonFatal(ex) => 
        println(s"manage apply non fatal exeption \n [ $ex \n ]")
        throw ex
    finally
      res.match
        case Some( resour ) => 
          println("clossing connection")
          res.get.close()
        case None => 





object CallByName{
  //for run it example exeute this sbt "run /home/your/adrees.txt
  @main def TryCach(  filesName :String * ) :Unit = 
    val sizes = filesName.map{ fileName => 
      try 
        val size = manage( Source.fromFile( fileName ) ){
          source => 
            source.getLines.size
        }
        println(s"file $fileName has $size lines ")
        size
      
      catch 
        case NonFatal( error )  => 
          println(s"error caught $error")
          0
    }
    print(s"\nsizes is ${sizes.mkString(", ")}")
    
}