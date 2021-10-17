package NumeroParImpar

object Par0Impar extends App{
  def esPrimo(numero: Int): Boolean = { // El 0, 1 y 4 no son primos
    if (numero == 0 || numero == 1 || numero == 4) return false
    for (x <- 2 until numero / 2) { // Si es divisible por cualquiera de estos números, no
      // es primo
      if (numero % x == 0) return false
    }
    // Si no se pudo dividir por ninguno de los de arriba, sí es primo
    true
  }
  
}