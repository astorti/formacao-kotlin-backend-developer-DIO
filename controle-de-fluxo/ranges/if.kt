fun main(){

    var x = 'c'
    if (x in 'a'..'d'){
        countries(x)
    }

    var y = 'e'
    if(y !in 'a'..'d'){
        countries(y)
    }
}

fun countries(obj: Any){
    when (obj) {
        'a' -> println("Argentina")
        'b' -> println("Brasil")
        'c' -> println("Chile")
        'd' -> println("Dinamarca")
        else -> println("Valor fora do range de 'a' a 'd'!")
    }
}
