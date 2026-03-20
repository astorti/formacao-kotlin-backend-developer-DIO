fun soma(valor1: Int, valor2: Int, valor3: Int): Unit {  //1

    val somaValores = object {                                                     //2
        var valor1: Int = valor1
        var valor2: Int = valor2
        var valor3: Int = valor3
    }

    val total = somaValores.valor1 + somaValores.valor2 + somaValores.valor3       //3

    println("Soma total: $total")                                               //4

}

fun main() {
    soma(10, 5, 2)                                                         //5
}