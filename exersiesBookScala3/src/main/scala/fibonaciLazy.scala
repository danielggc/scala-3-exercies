import scala.math.BigInt


object fibonaciLazy :
    val fibo :LazyList[BigInt] = BigInt(0) #:: BigInt(1) #::  fibo.zip( fibo.tail ).map (  n12  =>  n12._1 + n12._2)


@main
def fiboLazi( ): Unit = 
    println( fibonaciLazy.fibo.take( 10 ).toList )