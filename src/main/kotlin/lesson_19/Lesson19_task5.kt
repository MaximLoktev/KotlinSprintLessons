package lesson_19

fun main() {
    println("""
        Добро пожаловать в приложение «Картотека»!
        Формат ввода: имя пол
        Доступные значения пола: ${Gender.entries.joinToString { it.string }}
        Пример: Анна женский
        Введите данные 5 человек:
    """.trimIndent())

    val people = List(5) { index ->
        print("Человек ${index + 1}: ")
        val input = readln()
        val parts = input.split(" ")
        val name = parts[0]
        val genderStr = parts[1]
        val gender = Gender.entries.first { it.string == genderStr }
        Person(name, gender)
    }

    println("\n=== Список людей в картотеке ===")

    people.forEachIndexed { index, person ->
        println("${index + 1}. ${person.name} (${person.gender.string})")
    }
}

enum class Gender(val string: String) {
    MALE("мужской"),
    FEMALE("женский"),
}

class Person(val name: String, val gender: Gender)