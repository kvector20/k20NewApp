package com.example.kvapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import androidx.core.app.ActivityCompat
import com.example.kvapp.R
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val rotateAnimation= AnimationUtils.loadAnimation(this,
            R.anim.rotate_arrow
        )
        arrowIV.startAnimation(rotateAnimation)
        supportActionBar!!.hide()

        var mHun: Handler?
        var splashDaly:Long=800
        mHun= Handler()
        mHun.postDelayed(mru,splashDaly)
    }
    val mru:Runnable= Runnable {
        val i= Intent(this,MainActivity::class.java)
        startActivity(i)
        ActivityCompat.finishAffinity(this)
    }
}

