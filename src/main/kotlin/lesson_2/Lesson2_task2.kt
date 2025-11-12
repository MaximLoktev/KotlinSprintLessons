package lesson_2

fun main() {
    val numberOfWorkers: Int = 50
    val numberOfInterns: Int = 30

    val workerSalary: Int = 30_000
    val internsSalary: Int = 20_000

    val paymentToAllWorkers = workerSalary * numberOfWorkers
    val paymentToAllInterns = internsSalary * numberOfInterns

    val allPayments = paymentToAllWorkers + paymentToAllInterns

    val averageSalaryOfWorker = allPayments / numberOfWorkers

    println(paymentToAllWorkers)
    println(allPayments)
    println(averageSalaryOfWorker)
}