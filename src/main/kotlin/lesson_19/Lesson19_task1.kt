package lesson_19

fun main() {
    println("Вы можете добавить в аквариум следующих рыб:")

    FishType.entries.forEach {
        println("- ${it.russianName}")
    }
}

enum class FishType(val russianName: String) {
    GUPPY("гуппи"),
    ANGELFISH("скалярия"),
    GOLDFISH("золотая рыбка"),
    SIAMESE_FIGHTING_FISH("петушок")
}