package com.example.omnitrixkotlin

import android.app.Activity
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.omnitrixkotlin.databinding.ActivityStinkflyBinding

class Stinkfly : Activity() {

    var backPressedTime: Long=0
    private lateinit var binding: ActivityStinkflyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityStinkflyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var mediaPlayer=MediaPlayer.create(applicationContext, R.raw.swipesound)
        mediaPlayer.start()

        val button7=findViewById<Button>(R.id.button7)
        button7.setOnClickListener() {
            intent=Intent(this, Upgrade::class.java)
            startActivity(intent)
        }

        val button17=findViewById<Button>(R.id.button17)
        button17.setOnClickListener() {
            intent=Intent(this, Heatblast::class.java)
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