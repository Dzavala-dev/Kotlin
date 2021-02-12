package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

     lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)

        // Poner texto a un boton
        //rollButton.text = "Let's Roll"

        //Dar click en el boton
        rollButton.setOnClickListener {
            rollDice()
            // Mandar un mensaje en la pantalla
            //Toast.makeText(this, "Button Clicked", Toast.LENGTH_LONG).show()
        }

        diceImage = findViewById(R.id.dice_image)
    }

    private fun rollDice() {

        //val resultText: TextView = findViewById(R.id.result_text)

        val randomInt = Random.nextInt(6) + 1 // Random numbers
        //imagenes random
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        //val diceImage: ImageView = findViewById(R.id.dice_image)
        //mandar a llamar las imagenes
        diceImage.setImageResource(drawableResource)
        //resultText.text = randomInt.toString()
        //resultText.text = "Dice Rolled!"
    }
}
