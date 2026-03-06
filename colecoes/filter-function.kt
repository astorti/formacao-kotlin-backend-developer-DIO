fun main() {

    val values = listOf("Hello", 5, true, -2, "5", 4)

    val stringValues = values.filter { x -> x is String }

    val notStringValues = values.filter { it !is String }

    println("Valores: $values")
    println("Strings: $stringValues")
    println("Não Strings: $notStringValues")
}
