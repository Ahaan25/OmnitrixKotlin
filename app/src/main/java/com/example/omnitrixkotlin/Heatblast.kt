package com.example.omnitrixkotlin

import android.app.Activity
import android.os.Bundle
import com.example.omnitrixkotlin.databinding.ActivityHeatblastBinding

class Heatblast : Activity() {

    private lateinit var binding: ActivityHeatblastBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHeatblastBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}