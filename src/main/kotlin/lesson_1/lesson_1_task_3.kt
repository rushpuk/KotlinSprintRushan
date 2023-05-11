package lesson_1

import java.sql.Time

fun main(){
    val yearFly: Int = 1961
    var hourFly: Int = 9
    var minuteFly: Int = 7
    println("Год полета - $yearFly")
    println("Взлет - 0$hourFly:0$minuteFly")
    hourFly = 10
    minuteFly = 55
    println("Посадка - $hourFly:$minuteFly")

}