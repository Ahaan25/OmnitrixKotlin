package com.example.omnitrixkotlin

import android.app.Activity
import android.content.Intent
import android.media.MediaPlayer
import android.os.Build
import android.os.Bundle
import android.transition.Slide
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.Toast
import com.example.omnitrixkotlin.databinding.ActivityDiamonheadBinding
import kotlin.system.exitProcess

class Diamonhead : Activity() {

    var backPressedTime: Long=0
    private lateinit var binding: ActivityDiamonheadBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityDiamonheadBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var mediaPlayer=MediaPlayer.create(applicationContext, R.raw.swipesound)
        mediaPlayer.start()

        val button1=findViewById<Button>(R.id.button1)
        button1.setOnClickListener(){
            intent=Intent(this, FourArms::class.java)
            startActivity(intent)
        }

        val button11=findViewById<Button>(R.id.button11)
        button11.setOnClickListener(){
            intent=Intent(this, xlr8::class.java)
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