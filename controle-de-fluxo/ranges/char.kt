fun main(){

    for(c in 'a'..'d'){
        countries(c)
    }
    println()

    for(c in 'd' downTo 'a' step 2){
        countries(c)
    }
}

fun countries(obj: Any){
    when (obj) {
        'a' -> println("Argentina")
        'b' -> println("Brasil")
        'c' -> println("Chile")
        'd' -> println("Dinamarca")
    }
}
