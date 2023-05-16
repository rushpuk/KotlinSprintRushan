package lesson_2

fun main(){
    val employees = 50
    val moneySalary = 30000
    val juniorDev = 30
    val juniorSalary = 20000
    val costEmployee = employees * moneySalary
    val costAll = (juniorDev * juniorSalary) + costEmployee
    val averageSalary = costAll / (employees + juniorDev)

    println("Зарплаты постоянных сотрудников: $costEmployee")
    println("Зарплаты на всех сотрудников: $costAll")
    println("Средняя зарплата: $averageSalary")
}