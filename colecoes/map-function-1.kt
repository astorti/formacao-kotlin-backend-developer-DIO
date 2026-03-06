fun main() {

    val numeros = listOf(5, 7, 2, -4, 0, -6)     // 1

    val par = numeros.map { x -> x % 2 == 0}      // 2

    val impar = numeros.map { it % 2 != 0 }          // 3

    println("Numeros: $numeros")
    println("Numeros pares: $par")
    println("Numeros impares: $impar")
}
