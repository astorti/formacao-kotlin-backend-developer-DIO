package introducao

class Livros(val id: Int, var titulo: String, var autor: String) 

fun main() {
    val livros = Livros(1, "Duna", "Frank Herbert")
    println(livros.titulo)
}