val ListaDeTarefas: MutableMap<String, String> = mutableMapOf("Estudar Kotlin" to "pendente", "Estudar Java" to "concluído")
val Relatório: Map<String, String> = ListaDeTarefas

fun atualizarStatus(tarefa: String) {
    if (ListaDeTarefas.containsKey(tarefa)) {
        println("Atualizando $tarefa...")
        if(ListaDeTarefas[tarefa] == "concluído") {
            println("Esta tarefa já está concluída!")
        } else {
            ListaDeTarefas[tarefa] = "concluído"
            println("Atualização concluída!")
        }
    } else {
        println("Erro: A tarefa $tarefa não existe na lista!")
    }
    println("------------------------------------")
}

fun gerarRelatorio() {
    println("====================================")
    println("Relatório:")
    ListaDeTarefas.forEach {
        k, v -> println("Tarefa: $k, status: $v")
    }
    println("====================================")
}

fun main() {
    gerarRelatorio()
    atualizarStatus("Estudar Java")
    atualizarStatus("Estudar Kotlin")
    atualizarStatus("Estudar Kotlin")
    gerarRelatorio()
}
