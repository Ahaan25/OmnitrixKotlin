package com.example.omnitrixkotlin

import android.app.Activity
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import com.example.omnitrixkotlin.databinding.ActivityXlr8Binding

class xlr8 : Activity() {

    private lateinit var binding: ActivityXlr8Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityXlr8Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var mediaPlayer=MediaPlayer.create(applicationContext, R.raw.swipesound)
        mediaPlayer.start()

        val button1=findViewById<Button>(R.id.button10)
        button1.setOnClickListener(){
            intent= Intent(this, Diamonhead::class.java)
            startActivity(intent)
        }

    }
}