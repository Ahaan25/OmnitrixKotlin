package com.example.omnitrixkotlin

import android.app.Activity
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.text.method.Touch
import android.widget.Button
import com.example.omnitrixkotlin.databinding.ActivityUpgradeBinding

class Upgrade : Activity() {

    private lateinit var binding: ActivityUpgradeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityUpgradeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var mediaPlayer=MediaPlayer.create(applicationContext, R.raw.swipesound)
        mediaPlayer.start()

        val button8=findViewById<Button>(R.id.button8)
        button8.setOnClickListener(){
            intent= Intent(this, Wildmutt::class.java)
            startActivity(intent)
        }

        val button18=findViewById<Button>(R.id.button18)
        button18.setOnClickListener(){
            intent= Intent(this, Stinkfly::class.java)
            startActivity(intent)
        }

    }
}