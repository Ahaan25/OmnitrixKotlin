package com.example.omnitrixkotlin

import android.app.Activity
import android.media.MediaPlayer
import android.os.Bundle
import com.example.omnitrixkotlin.databinding.ActivityXlr8Binding

class xlr8 : Activity() {

    private lateinit var binding: ActivityXlr8Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityXlr8Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var mediaPlayer= MediaPlayer.create(applicationContext, R.raw.swipesound)
        mediaPlayer.start()

    }
}