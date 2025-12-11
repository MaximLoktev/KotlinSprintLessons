package lesson_22

fun main() {
    val alphaCentauri = GalacticGuide(
        name = "Альфа Центавра",
        description = "Ближайшая к Солнцу звёздная система, состоящая из трёх звёзд",
        dateTime = "2024-01-15 22:30:00",
        distanceFromEarth = 4.37
    )

    println("""
        Информация о звёздной системе:
        Название: ${alphaCentauri.component1()}
        Описание: ${alphaCentauri.component2()}
        Дата/время: ${alphaCentauri.component3()}
        Расстояние от Земли: ${alphaCentauri.component4()} световых лет
    """.trimIndent())
}

data class GalacticGuide(
    val name: String,
    val description: String,
    val dateTime: String,
    val distanceFromEarth: Double
)