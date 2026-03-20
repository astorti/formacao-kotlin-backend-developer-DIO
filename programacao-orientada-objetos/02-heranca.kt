open class Author(val book: String, val name: String) {
    fun author() {
        println("$book é um livro de $name!")
    }
}

class JRRTolkien : Author("O Senhor dos Anéis", "J. R. R. Tolkien") 
class IsaacAsimov: Author("Fundação", "Isaac Asimov")

fun main() {
    val tolkien: Author = JRRTolkien()
    tolkien.author()
    
    val asimov: Author = IsaacAsimov()
    asimov.author()
}