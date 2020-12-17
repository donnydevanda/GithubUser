package com.devanda.githubuser

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.HandlerCompat.postDelayed
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        var splashImage: ImageView = findViewById(R.id.splashImage)

        Glide.with(this)
            .load(R.drawable.logo)
            .into(splashImage)

        Handler().postDelayed(Runnable {
            var splashIntent = Intent(this@SplashScreenActivity, MainActivity::class.java)
            startActivity(splashIntent)
            finish()
        }, 2000)
    }
}