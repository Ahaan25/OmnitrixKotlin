package com.example.omnitrixkotlin

import android.app.Activity
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.omnitrixkotlin.databinding.ActivityGraymatterBinding

class Graymatter : Activity() {

    private lateinit var binding: ActivityGraymatterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGraymatterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var mediaPlayer=MediaPlayer.create(applicationContext, R.raw.swipesound)
        mediaPlayer.start()

        val button4=findViewById<Button>(R.id.button4)
        button4.setOnClickListener(){
            intent= Intent(this, Heatblast::class.java)
            startActivity(intent)
        }

        val button14=findViewById<Button>(R.id.button14)
        button14.setOnClickListener(){
            intent= Intent(this, Ghostfreak::class.java)
            startActivity(intent)
        }

    }
}