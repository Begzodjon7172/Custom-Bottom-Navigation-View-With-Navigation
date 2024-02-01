package com.example.bottomnavigationview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.bottomnavigationview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val fragmentContainer = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController =   fragmentContainer.navController
        binding.bottomNav.setupWithNavController(navController)
        val badge = binding.bottomNav.getOrCreateBadge(R.id.homeFragment)
        badge.number = 76

    }
}