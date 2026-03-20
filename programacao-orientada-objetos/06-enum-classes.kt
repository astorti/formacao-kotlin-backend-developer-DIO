enum class Day(val day: String) {
    MORNING("morning"),
    AFTERNOON("afternoon"),
    NIGHT("night");

    fun greeting() = "Good $day"
}

fun main() {
    val morning = Day.MORNING
    println(morning)
    println(morning.greeting())
    println(Day.AFTERNOON.greeting())
    println(Day.NIGHT.greeting())
}