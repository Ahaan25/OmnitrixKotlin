package com.example.omnitrixkotlin

import android.app.Activity
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.omnitrixkotlin.databinding.ActivityRipjawsBinding

class Ripjaws : Activity() {

    private lateinit var binding: ActivityRipjawsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRipjawsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.swipesound)
        mediaPlayer.start()

        val button1 = findViewById<Button>(R.id.button6)
        button1.setOnClickListener() {
            intent = Intent(this, Stinkfly::class.java)
            startActivity(intent)
        }

    }
}