package com.example.animations_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import androidx.transition.Fade
import androidx.transition.Scene
import androidx.transition.TransitionManager

class SimpleTransition : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_transition)

        val button = findViewById<Button>(R.id.btnStart)
        button.setOnClickListener {
            val fade = Fade()
            fade.duration = 2000
            val root = findViewById<ViewGroup>(android.R.id.content)
            val scene2 = Scene.getSceneForLayout(root, R.layout.activity_simple_transition_end_scene, applicationContext)

            TransitionManager.go(scene2, fade)
        }
    }
}