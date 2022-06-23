package com.example.omnitrixkotlin

import android.app.Activity
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.omnitrixkotlin.databinding.ActivityWildmuttBinding
import com.example.omnitrixkotlin.databinding.ActivityXlr8Binding

class Wildmutt : Activity() {

    var backPressedTime: Long=0
    private lateinit var binding: ActivityWildmuttBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityWildmuttBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var mediaPlayer=MediaPlayer.create(applicationContext, R.raw.swipesound)
        mediaPlayer.start()

        val button9=findViewById<Button>(R.id.button9)
        button9.setOnClickListener() {
            intent=Intent(this, xlr8::class.java)
            startActivity(intent)
        }

        val button19=findViewById<Button>(R.id.button19)
        button19.setOnClickListener() {
            intent=Intent(this, Upgrade::class.java)
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