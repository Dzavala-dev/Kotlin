package Aquarium

fun main (args: Array<String>){
    buildAquarium ()
    makefish()
}

fun buildAquarium() {

    val myAquarium = Aquarium()
    println ("Length: ${myAquarium.length} " +
            "Width: ${myAquarium.width} " +
            "Height: ${myAquarium.heigth}")
     myAquarium.heigth = 80

    println("Height: ${myAquarium.heigth} cm")
    println("Volume: ${myAquarium.volume} liters")

    val smallAquarium = Aquarium(20,15,30)
    println("Small Aquarium: ${smallAquarium.volume} liters")

    val myAquarium2 = Aquarium(numberOfFish = 9)

    println("Small Aquarium: ${myAquarium2.volume} liters with " +
            "Length: ${myAquarium2.length} " +
            "Width: ${myAquarium2.width} " +
            "Height: ${myAquarium2.heigth}")
}

fun feedFish(fish: FishAction){
    fish.eat()
}

fun makefish(){

    val shark = Shark()
    val pleco = Plecostomus()

    println ("Shark: ${shark.color} \nPlecostomus: ${pleco.color}")

    shark.eat()
    pleco.eat()
}