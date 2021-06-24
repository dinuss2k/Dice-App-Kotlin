package com.example.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val roll:Button=findViewById(R.id.rollbutton)
        roll.setOnClickListener{

            rolldice()

        }
    }

    private fun rolldice() {
     val Dice=dice(6)
        val diceval=Dice.roll()
        val diceimage:ImageView=findViewById(R.id.diceimg)
        when (diceval) {
            1 -> diceimage.setImageResource(R.drawable.dice_1)
            2 -> diceimage.setImageResource(R.drawable.dice_2)
            3 -> diceimage.setImageResource(R.drawable.dice_3)
            4 -> diceimage.setImageResource(R.drawable.dice_4)
            5 -> diceimage.setImageResource(R.drawable.dice_5)
            6 -> diceimage.setImageResource(R.drawable.dice_6)
        }
    }
}
class dice(val numsides: Int){
    fun roll():Int{

        return (1..numsides).random()

    }
}
