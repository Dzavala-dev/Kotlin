package Aquarium.generics

fun main(args:Array<String>){
    genericExample()
}

open class WaterSupply(var needsProcess: Boolean)

class Tapwater : WaterSupply(true){

    fun addChemicalCleaners() = apply{
        needsProcess = false
    }
}

class FishStoreWater : WaterSupply(false)

class LakeWater : WaterSupply( true){
    fun filter() = apply{
        needsProcess = false
    }
}

class Aquarium<out T: WaterSupply>(val waterSupply: T){
    fun addWater(cleaner: Cleaner<T>){
        if (waterSupply.needsProcess){
            cleaner.clean(waterSupply)
        }
        //check(!waterSupply.needsProcess) {"Water supply needs processed"}
        println ("adding water from $waterSupply")
    }
}

interface Cleaner<in T: WaterSupply>{
    fun clean(waterSupply: T)
}

class TapWaterCleaner: Cleaner<Tapwater>{
    override fun clean(waterSupply: Tapwater){
        waterSupply.addChemicalCleaners()
    }
}

fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("Item Added")

fun genericExample(){
    val cleaner = TapWaterCleaner()
    val aquarium : Aquarium<Tapwater> = Aquarium(Tapwater())
    aquarium.waterSupply.addChemicalCleaners()
    aquarium.addWater(cleaner)
}