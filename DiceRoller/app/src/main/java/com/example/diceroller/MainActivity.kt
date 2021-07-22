package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.diceroller.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val rollButton: Button = binding.rollButton
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val resultText: TextView = binding.resultText
        resultText.text = Random.nextInt(1, 7).toString()
    }
}