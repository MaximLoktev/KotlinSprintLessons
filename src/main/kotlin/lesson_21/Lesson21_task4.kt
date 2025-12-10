package lesson_21

import java.io.File

fun main() {
    val file = File("words.txt")
    file.writeText("world")

    println("Было: ${file.readText()}")

    file.prependWord("Hello")

    println("Стало: ${file.readText()}")
}

fun File.prependWord(word: String) {
    this.writeText("${word.lowercase()} ${this.readText()}")
}