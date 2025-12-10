package lesson_21

fun main() {
    println("hello".vowelCount())
    println("Good morning".vowelCount())
}

fun String.vowelCount(): Int =
    this.lowercase().count { it in "aeiouy" }