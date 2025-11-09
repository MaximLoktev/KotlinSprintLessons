package lesson_2

fun main() {
    val numberOfWorkers: Byte = 50
    val numberOfInterns: Byte = 30

    val workerSalary: Short = 30_000
    val internsSalary: Short = 20_000

    val paymentToAllWorkers: Int = workerSalary * numberOfWorkers
    val paymentToAllInterns: Int = internsSalary * numberOfInterns

    val allPayments: Int = paymentToAllWorkers + paymentToAllInterns

    val averageSalaryOfWorker: Int = allPayments / numberOfWorkers

    println(paymentToAllWorkers)
    println(allPayments)
    println(averageSalaryOfWorker)
}