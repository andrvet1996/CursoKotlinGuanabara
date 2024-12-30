fun main(){//String crua
    println("""
        Menu principal
        1) Novo
        2) Editar
        3) ...
        4) ...
    """)
    //Interpoladas
    val ano = 2024
    val nasc = 1976
    print("Você nasceu em $nasc e estamos no ano de $ano. " +
            "Então você tem ${ano-nasc} anos.")
}