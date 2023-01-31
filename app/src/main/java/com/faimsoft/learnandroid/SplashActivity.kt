package com.faimsoft.learnandroid

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.faimsoft.learnandroid.databinding.ActivitySplashBinding
import com.faimsoft.learnandroid.ui.MainViewModel

@SuppressLint("CustomSplashScreen")
class SplashActivity: AppCompatActivity() {

    private val mainViewModel: MainViewModel by viewModels()
    private val handler = Handler(Looper.getMainLooper())

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainViewModel.init(this)

        handler.postDelayed({
            if (mainViewModel.appDataProvider.getEmail().isNullOrEmpty()) {
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
                finish()
                return@postDelayed
            }
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000)


    }


}