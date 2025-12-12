package introducao

class Cores<E>(vararg cor: E) {

    private val cores = cor.toMutableList()

    fun push(cor: E) = cores.add(cor)
    fun pop() = cores.removeLast()
    fun size() = cores.size
    
    override fun toString(): String {
        return "$cores"
    }
}


fun main() {

    val cores = Cores("amarelo", "vermelho", "azul")
    println("${cores.size()}: $cores")
    cores.push("verde")
    println("${cores.size()}: $cores")

    for (i in 1..cores.size()) {
        println("pop(): ${cores.pop()}")
        println("${cores.size()}: $cores")
    }
}