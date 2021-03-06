package com.example.omnitrixkotlin

import android.app.Activity
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.omnitrixkotlin.databinding.ActivityXlr8Binding

class xlr8 : Activity() {

    var backPressedTime: Long=0
    private lateinit var binding: ActivityXlr8Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityXlr8Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var mediaPlayer=MediaPlayer.create(applicationContext, R.raw.swipesound)
        mediaPlayer.start()

        val button10=findViewById<Button>(R.id.button10)
        button10.setOnClickListener(){
            intent=Intent(this, Diamonhead::class.java)
            startActivity(intent)
        }

        val button20=findViewById<Button>(R.id.button20)
        button20.setOnClickListener(){
            intent=Intent(this, Wildmutt::class.java)
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