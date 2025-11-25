package lesson_9

fun main() {
    val portion = listOf(2, 50, 15) // яйца, молоко, масло

    print("Введите количество порций омлета: ")
    val count = readln().toInt()

    val totalIngredients = portion.map { it * count }

    println("На $count порций вам понадобится: Яиц – ${totalIngredients[0]}, молока – ${totalIngredients[1]}, сливочного масла – ${totalIngredients[2]}")
}