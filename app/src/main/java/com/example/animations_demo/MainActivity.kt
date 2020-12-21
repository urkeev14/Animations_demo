package com.example.animations_demo

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    var animationRunning = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button  = findViewById<Button>(R.id.btnStart)
        val animationDrawable = button.background as AnimationDrawable
        button.setOnClickListener {
            if(animationRunning){
                animationDrawable.stop()
                button.text = "Background animation"
                animationRunning = false
            }else{
                animationDrawable.start()
                button.text = "Stop"
                animationRunning = true
            }
        }
    }
}