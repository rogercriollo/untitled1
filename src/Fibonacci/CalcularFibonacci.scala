package Fibonacci

object CalcularFibonacci extends App{
  var tamaño = 5
  

  println("ingrese numero Fibonacci")
  val num1=  scala.io. StdIn .readLine ()
  val num=num1.toInt


  def CalcularFibonacci(n:Int):Long={
    if (n == 1) 0
    else if (n==2)1
    else
      CalcularFibonacci (n -2 ) +  CalcularFibonacci(n-1)

  }
  println(CalcularFibonacci(num))

}
