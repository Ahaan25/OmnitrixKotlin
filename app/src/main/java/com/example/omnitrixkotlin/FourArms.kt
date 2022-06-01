package com.example.omnitrixkotlin

import android.app.Activity
import android.os.Bundle
import com.example.omnitrixkotlin.databinding.ActivityFourarmsBinding

class FourArms : Activity() {

    private lateinit var binding: ActivityFourarmsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFourarmsBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}