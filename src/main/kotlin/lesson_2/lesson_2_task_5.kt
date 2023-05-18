package lesson_2

import kotlin.math.floor
import kotlin.math.pow

fun main(){
    val amount = 70000
    val percent = 16.7
    val scamBank = amount * ((1 + percent / 100).pow(20.0))
    val showMe = String.format("%.3f", scamBank)

    println(showMe)
}