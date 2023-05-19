package lesson_1

fun main(){
    val secondsFly = 6480
    val minutesFly = secondsFly / 60
    val coreSeconds = secondsFly % 60
    val showMe = "%02d".format(coreSeconds)

    println("$minutesFly:$showMe")
}