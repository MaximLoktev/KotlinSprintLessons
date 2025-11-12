package lesson_2

fun main() {
    val numberOfStudents: Int = 4

    val scoreOfFirst: Int = 3
    val scoreOfSecond: Int = 4
    val scoreOfThird: Int = 3
    val scoreOfFourth: Int = 5

    val sumOfAllScore = scoreOfFirst + scoreOfSecond + scoreOfThird + scoreOfFourth

    val averageStudentGrade = sumOfAllScore.toFloat() / numberOfStudents

    println(averageStudentGrade)
}