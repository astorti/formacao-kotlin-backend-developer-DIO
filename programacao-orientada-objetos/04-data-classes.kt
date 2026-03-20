data class Products(val name: String, val id: Int) {
    override fun equals(other: Any?) =
        other is Products && other.id == this.id 
}
fun main() {
    val notebook = Products("notebook", 1)
    println(notebook)

    val notebookTwo = Products("notebook", 1)
    val monitor = Products("monitor", 2)

    println("notebook == notebookTwo: ${notebook == notebookTwo}")
    println("notebook == monitor: ${notebook == monitor}")

    // hashCode() function
    println(notebook.hashCode())
    println(notebookTwo.hashCode())
    println(monitor.hashCode())

    // copy() function
    println(notebook.copy())
    println(notebook === notebook.copy())
    println(notebook.copy("Notebook"))
    println(notebook.copy(id = 3))

    println("name = ${notebook.component1()}")
    println("id = ${notebook.component2()}")
}