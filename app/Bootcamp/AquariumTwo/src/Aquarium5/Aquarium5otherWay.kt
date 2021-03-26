package Aquarium5

import com.sun.tools.corba.se.idl.Util.capitalize


fun main(args:Array<String>){
    fishExample2()
}

data class Fish2 (var name: String)

fun fishExample2 () {
    val fish = Fish2( "splashy")

    // without inline an object is created every call to myWith
    myWith2(fish.name, object : Function1<String, Unit>{
        override fun invoke(name: String){
            name.capitalize()
        }
    })
    //with inline no object is created, and lambda body is inlined here
    fish.name.capitalize()
}

inline fun myWith2 (name: String, block: String.() -> Unit) {
    name.block()
}
