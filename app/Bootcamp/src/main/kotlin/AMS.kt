import kotlin.random.Random
import java.util.*

fun main(args: Array<String>) {
    println("Hello, Kotlin!")
    feedTheFish()

    var bubbles = 0
    while (bubbles <50){
        bubbles++
    }
    repeat (times = 2){
        println("A fish is Swimming")
    }

}



fun getDirtySensorReading() = 20
fun shouldChangeWater(day: String, temperature:Int = 22, dirty: Int = getDirtySensorReading()) :Boolean {

    fun isSunday(day: String) = day == "Sunday"
    fun isDirty(dirty: Int) = dirty > 30
    fun isTooHot(temperature: Int) = temperature > 30

return when {
    isTooHot(temperature)-> true
    isDirty(dirty)-> true
    isSunday(day)-> true
    else -> false
    }
}



fun shouldChangeWater2(
    day: String,
    temperature:Int = 22,
    dirty: Int = 20) {
}


fun feedTheFish(){
    val day = randomDay()
    val food = fishfood(day)
    println ("Today is $day and the fish eat $food" )

    shouldChangeWater(day,22,50)
    shouldChangeWater(day, dirty = 50)
    shouldChangeWater2(day = "Monday")

    if (shouldChangeWater(day)){
        println ("Change the water today")
    }
}

fun randomDay() : String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random.nextInt(7)]
}

fun fishfood (day : String) : String{
    var food = "fasting"

    return when (day) {
        "Monday" -> "Flakes"
        "Tuesday" -> "Pallets"
        "Wednesday" -> "Redworms"
        "Thursday" -> "Granules"
        "Saturday" -> "Lettuce"

        else -> "fasting"
    }

}
    // manera 1 de hacerlo

  /*  when (day) {
        "Monday" -> food = "Flakes"
        "Tuesday" -> food = "Pallets"
        "Wednesday" -> food = "Redworms"
        "Thursday" -> food = "granules"
        "Friday" -> food = "Mosquitoes"
        "Saturday" -> food = "Lettuce"
        "Sunday" -> food = "Plankton"
    }
return food */


    /*val isUnit = println ("This is an expression")
    println(isUnit)

    val temperature = 10
    val isHot = if (temperature > 50) true else false
    println(isHot)

    val message = "You are ${if (temperature>50) "friend" else "safe"} fish"
    println(message)*/

/*
//list
 fun eagerExample() {
    val decorations = listOf("rock", "pagoda", "Plastic plant", "alligator", "flowerpot")
    val eager = decorations.filter { it[0] == 'p' }
    println(eager)

    //apply filter lazily
    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println(filtered)
    println(filtered.toList())

    //apply map lazily
    val lazyMap = decorations.asSequence().map {
        println("map: $it")
        it
    }

    println(lazyMap)
    println("first: ${lazyMap.first()}")
    println("all: ${lazyMap.toList()}")

}
 */