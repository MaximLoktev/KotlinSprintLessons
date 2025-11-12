package lesson_4

const val DAYS_IN_CYCLE = 2
const val ARMS_ABS_DAY_TYPE = 1

fun main() {
    val trainingDay = 5

    val isArmsAndAbsDay = trainingDay % DAYS_IN_CYCLE == ARMS_ABS_DAY_TYPE
    val isLegsAndBackDay = !isArmsAndAbsDay

    println("""
        Упражнения для рук:    $isArmsAndAbsDay
        Упражнения для ног:    $isLegsAndBackDay
        Упражнения для спины:  $isLegsAndBackDay
        Упражнения для пресса: $isArmsAndAbsDay
    """.trimIndent())
}