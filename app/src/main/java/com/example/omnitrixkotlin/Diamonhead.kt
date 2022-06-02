package com.example.omnitrixkotlin

import android.app.Activity
import android.media.MediaPlayer
import android.os.Bundle
import com.example.omnitrixkotlin.databinding.ActivityDiamonheadBinding

class Diamonhead : Activity() {

    private lateinit var binding: ActivityDiamonheadBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDiamonheadBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var mediaPlayer=MediaPlayer.create(applicationContext, R.raw.swipesound)
        mediaPlayer.start()

    }
}