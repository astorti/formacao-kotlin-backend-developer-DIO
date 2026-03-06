fun main(){

    var contries = listOf("Brasil", "Argentina", "Paraguay", "Uruguai", "Espanha", "Italia", "Portugal", "França")
    for(i in 0..3){
        print(contries[i])
    }
    println()

    for(i in 0 until 3){
        print(contries[i])
    }
    println()

    for(i in 0..6 step 2){
        print(contries[i])
    }
    println()

    for(i in 3 downTo 0){
        print(contries[i])
    }
}
