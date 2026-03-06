val listaDeTarefas: MutableSet<String> = mutableSetOf("Estudar Kotlin")

fun adicionarTarefa(tarefaUnica: String): Boolean {
    return listaDeTarefas.add(tarefaUnica)
}

fun statusTarefa(adicionado: Boolean): String {
    return if (adicionado) "Tarefa adicionada com sucesso." else "Tarefa duplicada. Tarefa não adicionada."
}

fun main() {
    val novaTarefa: String = "Estudar Android Studio"
    val tarefaJaAdicionada: String = "Estudar Android Studio"

    println("Tarefa: $novaTarefa, status: ${statusTarefa(adicionarTarefa(novaTarefa))}")
    println("Tarefa: $tarefaJaAdicionada, status: ${statusTarefa(adicionarTarefa(tarefaJaAdicionada))}")
}
