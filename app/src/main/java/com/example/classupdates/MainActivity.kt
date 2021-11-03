package com.example.classupdates

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.classupdates.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
       // bottomNavigationView = findViewById(R.id.bottom_navigation)

        binding.bottomNavigation.setupWithNavController(navHostFragment.findNavController())


    }

}