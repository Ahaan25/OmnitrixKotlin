package com.example.omnitrixkotlin

import android.app.Activity
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.text.Layout
import android.text.method.Touch
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.Toast
import com.example.omnitrixkotlin.databinding.ActivityFourarmsBinding
import com.example.omnitrixkotlin.databinding.ActivityGhostfreakBinding

class FourArms : Activity() {

    private lateinit var binding: ActivityFourarmsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityFourarmsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var mediaPlayer=MediaPlayer.create(applicationContext, R.raw.swipesound)
        mediaPlayer.start()

        val button2=findViewById<Button>(R.id.button2)
        button2.setOnClickListener(){
            intent=Intent(this, Ghostfreak::class.java)
            startActivity(intent)
        }

        val button12=findViewById<Button>(R.id.button12)
        button12.setOnClickListener(){
            intent=Intent(this, Diamonhead::class.java)
            startActivity(intent)
        }

    }
}