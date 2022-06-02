package com.example.omnitrixkotlin

import android.app.Activity
import android.media.MediaPlayer
import android.os.Bundle
import com.example.omnitrixkotlin.databinding.ActivityGraymatterBinding

class Graymatter : Activity() {

    private lateinit var binding: ActivityGraymatterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGraymatterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var mediaPlayer=MediaPlayer.create(applicationContext, R.raw.swipesound)
        mediaPlayer.start()

    }
}