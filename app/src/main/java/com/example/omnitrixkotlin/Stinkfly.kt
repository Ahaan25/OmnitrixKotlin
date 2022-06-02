package com.example.omnitrixkotlin

import android.app.Activity
import android.media.MediaPlayer
import android.os.Bundle
import com.example.omnitrixkotlin.databinding.ActivityStinkflyBinding

class Stinkfly : Activity() {

    private lateinit var binding: ActivityStinkflyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityStinkflyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var mediaPlayer= MediaPlayer.create(applicationContext, R.raw.swipesound)
        mediaPlayer.start()

    }
}