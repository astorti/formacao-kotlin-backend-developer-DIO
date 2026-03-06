val listaDeTarefas: MutableList<String> = mutableListOf("Estudar Kotlin")
val tarefas: List<String> = listaDeTarefas

fun adicionarTarefa(novaTarefa: String) {
    listaDeTarefas.add(novaTarefa)
}

fun listarTarefas(): List<String> {
    return tarefas
}

fun main() {
    adicionarTarefa("Estudar Android Studio")
    adicionarTarefa("Estudar React Native")
    adicionarTarefa("Estudar Flutter")
    println("Total tarefas: ${listarTarefas().size}")
    println("====== TAREFAS ======")
    listarTarefas().forEach {
        i -> println(i)
    }
}
