package com.example.omnitrixkotlin

import android.app.Activity
import android.media.MediaPlayer
import android.os.Bundle
import com.example.omnitrixkotlin.databinding.ActivityWildmuttBinding

class Wildmutt : Activity() {

    private lateinit var binding: ActivityWildmuttBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityWildmuttBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var mediaPlayer=MediaPlayer.create(applicationContext, R.raw.swipesound)
        mediaPlayer.start()

    }
}