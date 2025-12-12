package introducao

fun imprimirNome(nome: String) {
    println("Hello $nome")
}

fun imprimirNomeComPrefixo(prefixo: String = "Hello", nome: String) {
    println("$prefixo $nome")
}

fun somar(valor1: Int, valor2: Int): Int {
    return valor1 + valor2
}

fun multiplicar(valor1: Int, valor2: Int) = valor1 * valor2

fun main() {
    imprimirNome("André")
    imprimirNomeComPrefixo(nome="André")
    imprimirNomeComPrefixo(nome="André", prefixo="Olá")
    println(somar(10, 5))
    println(multiplicar(10, 5))
}
