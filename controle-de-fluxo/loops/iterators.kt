class Food(val name: String)

class Recipe(val foods: List<Food>) {

    operator fun iterator(): Iterator<Food> {
        return foods.iterator()
    }
}

fun main() {

    val foods = listOf(Food("macarrão"), Food("bolo"));
    val recipe = Recipe(foods)

    for (food in foods) {
        println("Fazer receita de ${food.name}")
    }
}
