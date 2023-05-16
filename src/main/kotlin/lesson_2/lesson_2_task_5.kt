package lesson_2

import kotlin.math.floor
import kotlin.math.pow

fun main(){
    val amount = 70000
    val percent = 16.7
    val scamBank = amount * (Math.pow((1 + percent / 100), 20.0))

    println(floor(scamBank * 1000.0) / 1000.0)
}