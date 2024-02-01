package com.aniket.kotlinlearning.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import com.aniket.kotlinlearning.R

class SpalsahScreenUser : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_spalsah_screen_user)

            val logo = findViewById<ImageView>(R.id.logo)
            val fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in)
            logo.startAnimation(fadeInAnimation)

            // Navigate to the main activity after a delay
            val intent = Intent(this, MainActivity::class.java)
            val splashScreenDuration = 2000L // 2 seconds
            logo.postDelayed({
                startActivity(intent)
                finish()
            }, splashScreenDuration)
        }
    }