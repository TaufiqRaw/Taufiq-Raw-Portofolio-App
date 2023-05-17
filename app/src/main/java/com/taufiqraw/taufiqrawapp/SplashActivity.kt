package com.taufiqraw.taufiqrawapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import com.taufiqraw.taufiqrawapp.databinding.ActivitySplashBinding
import com.taufiqraw.taufiqrawapp.walkthrough.WalkthroughActivity

/**
 * Tanggal Pengerjaan : 16-05-2023
 * Nama : Taufiq Ridho A.W
 * NIM  : 10120789
 * Kelas: IF-9
 */
class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler(Looper.getMainLooper()).postDelayed({
            Intent(this, WalkthroughActivity::class.java).also {
                val bundle = ActivityOptionsCompat.makeCustomAnimation(this,
                    android.R.anim.fade_in, android.R.anim.fade_out).toBundle();
                startActivity(it, bundle)
            }
            finish()
        }, 4000)

    }
}