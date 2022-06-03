package com.example.omnitrixkotlin

import android.app.Activity
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import com.example.omnitrixkotlin.databinding.ActivityGhostfreakBinding

class Ghostfreak : Activity() {

    private lateinit var binding: ActivityGhostfreakBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGhostfreakBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var mediaPlayer=MediaPlayer.create(applicationContext, R.raw.swipesound)
        mediaPlayer.start()

        val button1=findViewById<Button>(R.id.button3)
        button1.setOnClickListener(){
            intent= Intent(this, Graymatter::class.java)
            startActivity(intent)
        }

    }
}