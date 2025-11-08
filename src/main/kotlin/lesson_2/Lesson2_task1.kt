package lesson_2

fun main() {
    val numberOfStudents: Float = 4f

    val scoreOfFirst: Byte = 3
    val scoreOfSecond: Byte = 4
    val scoreOfThird: Byte = 3
    val scoreOfFourth: Byte = 5

    val averageStudentGrade: Float = (scoreOfFirst + scoreOfSecond + scoreOfThird + scoreOfFourth) / numberOfStudents

    println(averageStudentGrade)
}