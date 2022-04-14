package com.example.hvacrsuite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hvacrsuite.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)

        binding.launchCapacitorCalc.setOnClickListener {
            val intent = Intent(this, CapacitorCalculator::class.java)
            startActivity(intent)
        }
        binding.launchFlowchart.setOnClickListener{
            val intent = Intent( this,flowchart::class.java)
            startActivity(intent)


        }
    }
}