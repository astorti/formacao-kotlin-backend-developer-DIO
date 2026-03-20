object Day {
    fun getDay(day: Int, month: String, year: Int) { 
        println("$day $month $year")
    }
}

fun main(){
    Day.getDay(20, "march", 2026)
}