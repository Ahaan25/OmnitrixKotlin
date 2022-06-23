package com.example.omnitrixkotlin

import android.app.Activity
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.omnitrixkotlin.databinding.ActivityRipjawsBinding

class Ripjaws : Activity() {

    var backPressedTime: Long=0
    private lateinit var binding: ActivityRipjawsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityRipjawsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var mediaPlayer=MediaPlayer.create(applicationContext, R.raw.swipesound)
        mediaPlayer.start()

        val button6=findViewById<Button>(R.id.button6)
        button6.setOnClickListener() {
            intent=Intent(this, Stinkfly::class.java)
            startActivity(intent)
        }

        val button16=findViewById<Button>(R.id.button16)
        button16.setOnClickListener() {
            intent=Intent(this, Stinkfly::class.java)
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