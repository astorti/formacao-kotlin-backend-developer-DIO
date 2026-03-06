fun main() {

    val doces = listOf("bolo","sorvete","brigadeiro")
    val comidas = listOf("arroz","feijão","macarrão")
    val receitas = listOf(doces, comidas)
    val mapReceitas = receitas.map { it }
    val flatMapReceitas = receitas.flatMap { it }

    println(mapReceitas)
    println(flatMapReceitas)
}
