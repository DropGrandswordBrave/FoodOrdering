package com.example.foodorderingapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import com.example.foodorderingapp.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        WindowCompat.getInsetsController(window, window.decorView).apply {
            isAppearanceLightStatusBars = true
            isAppearanceLightNavigationBars = true
        }
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { view, insets ->
            val bars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.setPadding(bars.left, bars.top, bars.right, bars.bottom)
            insets
        }
        binding.nextButton.setOnClickListener {
            if (!binding.nextButton.isEnabled) return@setOnClickListener
            binding.nextButton.isEnabled = false
            binding.skipButton.isEnabled = false
            startActivity(Intent(this, LoginActivity::class.java))
        }
        binding.skipButton.setOnClickListener {
            if (!binding.skipButton.isEnabled) return@setOnClickListener
            binding.skipButton.isEnabled = false
            binding.nextButton.isEnabled = false
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }

    override fun onResume() {
        super.onResume()
        binding.nextButton.isEnabled = true
        binding.skipButton.isEnabled = true
    }
}
