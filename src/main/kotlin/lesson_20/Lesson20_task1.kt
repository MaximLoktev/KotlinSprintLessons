package lesson_20

fun main() {
    val greeting: (String) -> String = { userName: String ->
        "С наступающим Новым Годом, $userName!"
    }

    println(greeting("Максим"))
}