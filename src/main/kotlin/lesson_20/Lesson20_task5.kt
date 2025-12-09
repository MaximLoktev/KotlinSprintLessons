package lesson_20

fun main() {
    val robot = Robot()

    println("Обычная речь:")
    robot.say()

    robot.setModifier { phrase ->
        phrase.reversed()
    }

    println("\nИнвертированная речь:")
    robot.say()
}

class Robot {

    private val phrases = listOf(
        "Привет, я робот",
        "Как ваши дела?",
        "Я умею говорить",
        "Программирование это весело",
        "Давайте работать вместе"
    )

    private var modifier: (String) -> String = { it }

    fun setModifier(mod: (String) -> String) { modifier = mod }

    fun say() {
        println(modifier(phrases.random()))
    }
}