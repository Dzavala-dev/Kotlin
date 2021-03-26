package Decorations

object MobyDickWhale {
    val author = "Herman Melville"

    fun jump (){
        //..
    }
}

enum class Color (val rgb: Int){
    RED (0XFF0000),
    GREEN(0X00FF00),
    BLUE(0X0000FF)
}

sealed class Seal

class SeaLion: Seal()
class Walrus: Seal()

fun matchSeal(seal: Seal): String{
    return when (seal){
        is Walrus -> "Walrus"
        is SeaLion -> "Sea Lion"
    }
}