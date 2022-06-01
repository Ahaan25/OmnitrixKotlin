package com.example.omnitrixkotlin

import android.app.Activity
import android.os.Bundle
import com.example.omnitrixkotlin.databinding.ActivitySplashScreenBinding

class SplashScreen : Activity() {

    private lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}