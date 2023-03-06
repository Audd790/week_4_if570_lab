package id.ac.umn.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollbutton: Button = findViewById(R.id.button)
        rollbutton.setOnClickListener { rolldice() }
    }
    //creates a random number using dice class
    private fun rolldice() {
        val dice = Dice(6)
        val diceRoll: Int = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
}
//a class that resembles a dice
class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }

}