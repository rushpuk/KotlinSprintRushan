package lesson_2

fun main(){
    val crystalOre = 7
    val ironOre = 11
    val bonusBaff = 0.2
    var bonusItem = crystalOre * bonusBaff
    println("Бонусной кристальной руды: ${bonusItem.toInt()}")
    bonusItem = ironOre * bonusBaff
    println("Бонусной железной руды: ${bonusItem.toInt()}")
}