package lesson_9

fun main() {
    val ingredients = listOf("говядина", "вода", "лук", "морковь")

    println("В рецепте есть следующие ингредиенты: $ingredients")

    ingredients.forEach {
        println(it)
    }
}