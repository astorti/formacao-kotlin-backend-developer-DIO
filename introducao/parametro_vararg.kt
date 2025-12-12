package introducao

fun names(vararg names: String) {
    for (name in names) println(name)
}

fun printNames(vararg entries: String) {
    names(*entries)
}

fun printNamesWithPrefix(vararg names: String, prefix: String) {
    for (name in names) println("$prefix $name!")
}

fun main() {
    names("John", "Harry", "Mary", "Paul")
    printNames("Peter", "James", "William")
    printNamesWithPrefix("Peter", "James", "William", prefix="Hello")
}