enum class Day {
    MORNING, AFTERNOON, NIGHT
}

fun main() {
    val timeOfTheDay = Day.MORNING
    val message = when (timeOfTheDay) {
        Day.MORNING -> "Good morning"
        Day.AFTERNOON -> "Good afternoon"
        Day.NIGHT -> "Good night"
    }
    println(message)
}