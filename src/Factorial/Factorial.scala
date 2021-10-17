package Factorial

object Factorial extends App {
  println("ingresar numero  ")
  val num1=  scala.io. StdIn .readLine ()
  val num=num1.toInt


  def calcularFactoria(n:Int):Long={
    if (n <= 0) 1
    else n * calcularFactoria(n-1)

  }
  println(calcularFactoria(num))

}



