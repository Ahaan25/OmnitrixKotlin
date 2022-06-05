package com.example.omnitrixkotlin

import android.app.Activity
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.omnitrixkotlin.databinding.ActivityHeatblastBinding

class Heatblast : Activity() {

    private lateinit var binding: ActivityHeatblastBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHeatblastBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.swipesound)
        mediaPlayer.start()

        val button5 = findViewById<Button>(R.id.button5)
        button5.setOnClickListener() {
            intent = Intent(this, Ripjaws::class.java)
            startActivity(intent)
        }

        val button15 = findViewById<Button>(R.id.button15)
        button15.setOnClickListener() {
            intent = Intent(this, Graymatter::class.java)
            startActivity(intent)
        }

    }
}