package lesson_2

fun main(){

    val departureHours = 9
    val departureMinutes = 39
    val roadTimeMinutes = 457
    val correlationTimeHour = roadTimeMinutes / 60
    val correlationTimeMinute = roadTimeMinutes % 60
    val arrivalHourTemporarily = (correlationTimeMinute + departureMinutes) / 60
    val arrivalMinuteTemporarily = (correlationTimeMinute + departureMinutes) % 60
    val arrivalHour = departureHours + correlationTimeHour + arrivalHourTemporarily

    println("Время прибытия поезда: $arrivalHour:$arrivalMinuteTemporarily")
}