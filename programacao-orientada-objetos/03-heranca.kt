open class Country(val name: String, val origin: String) {
    fun origin() {
        println("$name é um país da $origin!")
    }
}

class Asia(name: String) : Country(name = name, origin = "Asia")
class Europe(name: String) : Country(name = name, origin = "Europa")

fun main() {
    val japan: Country = Asia("Japão")
    japan.origin()
    
    val italy: Country = Europe("Itália")
    italy.origin()
}