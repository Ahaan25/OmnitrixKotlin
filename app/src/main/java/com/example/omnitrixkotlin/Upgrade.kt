package com.example.omnitrixkotlin

import android.app.Activity
import android.media.MediaPlayer
import android.os.Bundle
import android.text.method.Touch
import com.example.omnitrixkotlin.databinding.ActivityUpgradeBinding

class Upgrade : Activity() {

    private lateinit var binding: ActivityUpgradeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityUpgradeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var mediaPlayer= MediaPlayer.create(applicationContext, R.raw.swipesound)
        mediaPlayer.start()

    }
}