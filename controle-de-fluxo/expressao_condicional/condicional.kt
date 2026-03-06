fun main(){
    fun letra(letra: String) = if (letra == "a") "Letra 'a'" else "Diferente de 'a'"

    println(letra("a"))
    println(letra("b"))
}
