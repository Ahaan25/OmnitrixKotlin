package com.example.omnitrixkotlin

import android.app.Activity
import android.os.Bundle
import com.example.omnitrixkotlin.databinding.ActivityGhostfreakBinding

class Ghostfreak : Activity() {

    private lateinit var binding: ActivityGhostfreakBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGhostfreakBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}