package com.example.omnitrixkotlin

import android.app.Activity
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler

class SplashScreen : Activity() {

    private val SC:Long=1000
    val context=applicationContext

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        Handler().postDelayed({
            startActivity(Intent(this,FourArms::class.java))
            finish()
        }, SC)

        var mediaPlayer = MediaPlayer.create(context, R.raw.omnitrixlaunchsound)
        mediaPlayer.start()
    }
}