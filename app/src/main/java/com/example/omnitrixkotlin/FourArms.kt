package com.example.omnitrixkotlin

import android.app.Activity
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import com.example.omnitrixkotlin.databinding.ActivityFourarmsBinding

class FourArms : Activity() {

    var x1=0f; var x2=0f; var y1=0f; var y2=0f
    private val SC:Long=1000
    private lateinit var binding: ActivityFourarmsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityFourarmsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler().postDelayed({
            startActivity(Intent(this,Upgrade::class.java))
            finish()
        }, SC)

        /*
        View.OnTouchListener(object : OnSwipeTouchListener(this@FourArms), (v: View, event: MotionEvent) -> Boolean {
            override fun onSwipeLeft() {
                super.onSwipeLeft()
                Toast.makeText(this@FourArms, "Swipe Left gesture detected", Toast.LENGTH_SHORT)
                    .show()
            }

            override fun onSwipeRight() {
                super.onSwipeRight()
                Toast.makeText(this@FourArms, "Swipe Right gesture detected", Toast.LENGTH_SHORT)
                    .show()
            }

            override fun onSwipeUp() {
                super.onSwipeUp()
                Toast.makeText(this@FourArms, "Swipe up gesture detected", Toast.LENGTH_SHORT)
                    .show()
            }

            override fun onSwipeDown() {
                super.onSwipeDown()
                Toast.makeText(this@FourArms, "Swipe down gesture detected", Toast.LENGTH_SHORT)
                    .show()
            }
        })
        */

    }
}