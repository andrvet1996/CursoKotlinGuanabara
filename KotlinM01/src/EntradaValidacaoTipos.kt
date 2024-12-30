fun main(){
  print("Digite um valor: ")
  val n1:Int = readLine()!!.toIntOrNull()?:0
  print("Digite outro valor: ")
  val n2:Int = readLine()!!.toIntOrNull()?:0
  val soma:Int = n1 + n2
  println("A soma de $n1 e $n2 é $soma.")
}