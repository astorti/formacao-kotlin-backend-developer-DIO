fun main() {
    var estadosBrasileiros1 = setOf("São Paulo", "Minas Gerais", "Paraná")
    var estadosBrasileiros2 = setOf("Paraná", "São Paulo", "Minas Gerais")

    println(estadosBrasileiros1 == estadosBrasileiros2)
    println(estadosBrasileiros1 === estadosBrasileiros2)
}
