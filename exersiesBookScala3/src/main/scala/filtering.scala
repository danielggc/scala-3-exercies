object filtering {
  @main
  def filteringRun():Unit=

    val numbers = Map("one" -> 1, "two" -> 2, "three" -> 3)
    val numbertT = numbers.filter( ( k,v ) => k.startsWith("t") )
    println( numbertT )

    //reduce
    println(" from  letf to right : ")
    val list   = Seq(1,2,3,4,5,6)
    val total  = list.reduceLeft( (x,y ) =>  {
            println(s"data  : [$x , $y ]")
            x+y
            }
        )


    println(" from rigth to letf : ")

    val total2 = list.reduceRight((x,y ) =>  {
        println(s"data  : [$x , $y ]")
        x+y
    }) 


    // folding
    val vector = Vector(1, 2, 3, 4, 5, 6)
    val noceVector = vector.foldLeft(Vector.empty[String])( ( init, nexTo ) => init :+ ("[" + nexTo + "]") )
    println(noceVector)
    print("hello ")
}
