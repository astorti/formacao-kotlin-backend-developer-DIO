fun main() {
    var valor1 = "string"
    var valor2 = "number"
    var valor3 = 5L
    var valor4 = MyClass()

    cases(valor1)
    cases(valor2)
    cases(valor3)
    cases(valor4)
    cases("hello")
}

fun cases(obj: Any){
    when (obj) {
        "number" -> println(1)
        "string" -> println("Hello")
        is Long -> println("Long")
        !is String -> println("Not a string or number")
        else -> println("unknown")
    }
}

class MyClass
