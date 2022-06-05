package com.example.omnitrixkotlin

import android.app.Activity
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import com.example.omnitrixkotlin.databinding.ActivityWildmuttBinding
import com.example.omnitrixkotlin.databinding.ActivityXlr8Binding

class Wildmutt : Activity() {

    private lateinit var binding: ActivityWildmuttBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityWildmuttBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var mediaPlayer=MediaPlayer.create(applicationContext, R.raw.swipesound)
        mediaPlayer.start()

        val button9=findViewById<Button>(R.id.button9)
        button9.setOnClickListener(){
            intent= Intent(this, xlr8::class.java)
            startActivity(intent)
        }

        val button19=findViewById<Button>(R.id.button19)
        button19.setOnClickListener(){
            intent= Intent(this, Upgrade::class.java)
            startActivity(intent)
        }

    }
}