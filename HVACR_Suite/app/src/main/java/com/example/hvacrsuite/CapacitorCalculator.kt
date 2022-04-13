package com.example.hvacrsuite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hvacrsuite.databinding.ActivityCapacitorCalculatorBinding


class CapacitorCalculator : AppCompatActivity() {

    private lateinit var binding: ActivityCapacitorCalculatorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCapacitorCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button.setOnClickListener {
            val volts = binding.voltage.text.toString().toFloat()
            val amps = binding.amps.text.toString().toFloat()
            val output = (amps * 2652) / volts
            binding.result.text = output.toString()
        }
    }
}