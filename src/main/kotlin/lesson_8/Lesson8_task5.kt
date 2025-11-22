package lesson_8

fun main() {
    print("\nВведите кол-во ингредиентов: ")
    val count = readln().toInt()

    val ingredients = Array(count) { "" }

    for (i in 0 until count) {
        print("\nВведите название ингредиента: ")
        val item = readln().lowercase()

        ingredients[i] = item
    }

    println("\nСписок ингредиентов: ${ingredients.joinToString()}")
}