package com.example.omnitrixkotlin

import android.app.Activity
import android.os.Bundle
import com.example.omnitrixkotlin.databinding.ActivityCannonballBinding

class Cannonball : Activity() {

    private lateinit var binding: ActivityCannonballBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCannonballBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}