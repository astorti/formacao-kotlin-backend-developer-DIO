fun main() {

    var valor1 = "string"
    var valor2 = "number"
    var valor3 = 5L
    var valor4 = MyClass()
    println(valores(valor1))
    println(valores(valor2))
    println(valores(valor3))
    println(valores(valor4))
}

fun valores(obj: Any): Any {
    val result = when (obj) {
        "number" -> 1
        "string" -> "Hello"
        is Long -> true
        else -> "any"
    }
    return result
}

class MyClass
