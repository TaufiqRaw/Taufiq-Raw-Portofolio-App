package com.taufiqraw.taufiqrawapp.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.taufiqraw.taufiqrawapp.R
import com.taufiqraw.taufiqrawapp.databinding.ActivityMainBinding

/**
 * Tanggal Pengerjaan : 16-05-2023
 * Nama : Taufiq Ridho A.W
 * NIM  : 10120789
 * Kelas: IF-9
 */
class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var navController : NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bottomNav = binding.bottomNavigationView;
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainer) as NavHostFragment
        navController = navHostFragment.findNavController()

        bottomNav.setupWithNavController(navController)
    }
}