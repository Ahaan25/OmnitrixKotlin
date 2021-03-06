package com.example.omnitrixkotlin

import android.app.Activity
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.omnitrixkotlin.databinding.ActivityGhostfreakBinding

class Ghostfreak : Activity() {

    var backPressedTime: Long=0
    private lateinit var binding: ActivityGhostfreakBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityGhostfreakBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var mediaPlayer=MediaPlayer.create(applicationContext, R.raw.swipesound)
        mediaPlayer.start()

        val button3=findViewById<Button>(R.id.button3)
        button3.setOnClickListener(){
            intent=Intent(this, Graymatter::class.java)
            startActivity(intent)
        }

        val button13=findViewById<Button>(R.id.button13)
        button13.setOnClickListener(){
            intent=Intent(this, FourArms::class.java)
            startActivity(intent)
        }

    }

    override fun onBackPressed() {
        if (backPressedTime+2000>System.currentTimeMillis()) {
            super.onBackPressed()
            finish()
        }
        else {
            Toast.makeText(this, "Press back again to leave the app.", Toast.LENGTH_LONG).show()
        }
        backPressedTime=System.currentTimeMillis()
    }

}