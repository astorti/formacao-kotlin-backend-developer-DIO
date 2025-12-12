package introducao

fun main() {
    var nulo: String? = null
    var naoNulo: String = "não nulo"

    println(nulo)

    fun strLength(str: String?): Int {
        return str?.length ?: 0
    }

    println(strLength(nulo))
    println(strLength(naoNulo))
}