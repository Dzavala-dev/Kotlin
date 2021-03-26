fun main(args:Array<String>){
    if (args[0].toInt()<12) println("Good morning Kotlin")
    else println("Good night Kotlin")

    // one line representation
    println("Good ${if (args[0].toInt()<12) "morning" else "night"},Kotlin")
}

//correct

/*
if (args[0].toInt() < 12) println("Good morning, Kotlin")
else println("Good night, Kotlin" )

println("${if (args[0].toInt() < 12) "Good morning, Kotlin" else "Good night, Kotlin"}")

*/