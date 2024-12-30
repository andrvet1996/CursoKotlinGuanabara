fun main(){
    print("Qual o seu nome?")
    val nome:String = readLine()!!
    print("Prazer em conhecê-lo$nome! ")
    print("Quantos anos você tem $nome? ")
    val idade:Int = readLine()!!.toInt()
    print("Você $nome tem $idade anos.")
}



