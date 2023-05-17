package com.taufiqraw.taufiqrawapp.walkthrough

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.taufiqraw.taufiqrawapp.R
import com.taufiqraw.taufiqrawapp.databinding.ActivitySplashBinding
import com.taufiqraw.taufiqrawapp.databinding.ActivityWalkthroughBinding
import com.taufiqraw.taufiqrawapp.main.MainActivity

/**
 * Tanggal Pengerjaan : 16-05-2023
 * Nama : Taufiq Ridho A.W
 * NIM  : 10120789
 * Kelas: IF-9
 */
class WalkthroughActivity : AppCompatActivity() {
    private lateinit var viewPagerAdapter: WalkthroughPagerAdapter
    private lateinit var binding : ActivityWalkthroughBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWalkthroughBinding.inflate(layoutInflater)
        setContentView(binding.root)

        startAnim();

        val slides = arrayOf(
            WalkthroughSlide(
                R.drawable.emerald,
                "Hello World",
                "Whatsupp"
            ),
            WalkthroughSlide(
                R.drawable.emerald,
                "Buenos dias",
                "Mandy!"
            ),
        )

        viewPagerAdapter = WalkthroughPagerAdapter(slides)
        binding.pager.adapter = viewPagerAdapter
        binding.dotsIndicator.attachTo(binding.pager)

        binding.buttonNext.setOnClickListener{
            Intent(this@WalkthroughActivity, MainActivity::class.java).also {
                startActivity(it);
                finish();
            }
        }
        binding.pager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                if(position == slides.size-1)
                    binding.buttonNext.visibility = View.VISIBLE;
                else
                    binding.buttonNext.visibility = View.GONE;
            }
        })

    }

    private fun startAnim() {
        (binding.gradientBottom.background as AnimationDrawable).apply {
            setEnterFadeDuration(2000)
            setExitFadeDuration(1000)
            start()
        }
        (binding.gradientTop.background as AnimationDrawable).apply {
            setEnterFadeDuration(2000)
            setExitFadeDuration(1000)
            start()
        }
    }
}