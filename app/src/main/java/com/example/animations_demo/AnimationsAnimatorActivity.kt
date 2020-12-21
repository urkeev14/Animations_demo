package com.example.animations_demo

import android.animation.Animator
import android.animation.Animator.AnimatorListener
import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class AnimationsAnimatorActivity : AppCompatActivity() {

    lateinit var image: ImageView
    lateinit var animatorSet: AnimatorSet

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animations_animator)

        image = findViewById(R.id.imageView2)
        image.setOnClickListener {
            animatorSet = AnimatorInflater.loadAnimator(
                this,
                R.animator.my_animator
            ) as AnimatorSet

            animatorSet.duration = 2000
            animatorSet.setTarget(image)
            animatorSet.start()

            animatorSet.addListener(object: AnimatorListener{
                override fun onAnimationRepeat(animation: Animator?) {
                    TODO("Not yet implemented")
                }

                override fun onAnimationEnd(animation: Animator?) {
                    TODO("Not yet implemented")
                }

                override fun onAnimationCancel(animation: Animator?) {
                    TODO("Not yet implemented")
                }

                override fun onAnimationStart(animation: Animator?) {
                    TODO("Not yet implemented")
                }
            })
        }
    }
}
