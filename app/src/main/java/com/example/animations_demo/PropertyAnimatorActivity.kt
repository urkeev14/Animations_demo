package com.example.animations_demo

import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PropertyAnimatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_property_animator)

        val button = findViewById<Button>(R.id.button)
        val xScale = ObjectAnimator.ofFloat(button, "x", 5f)

        xScale.apply{
            setPropertyName("x")
            target = button
            duration = 4000
            repeatCount = ValueAnimator.INFINITE
            repeatMode = ValueAnimator.REVERSE
        }

        button.setOnClickListener {
            xScale.start()
        }
    }
}