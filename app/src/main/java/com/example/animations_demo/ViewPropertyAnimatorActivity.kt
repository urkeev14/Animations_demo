package com.example.animations_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ViewPropertyAnimatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_property_animator)

        val button = findViewById<Button>(R.id.button2)

        button.setOnClickListener {
            button.animate()
                .translationY(300f)
                .scaleX(2f)
                .alpha(0.5f)
                .setDuration(5000)
                .withEndAction {
                    Toast.makeText(this, "Something...", Toast.LENGTH_SHORT).show()
                }
        }
    }
}