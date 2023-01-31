package com.faimsoft.learnandroid

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.faimsoft.learnandroid.databinding.ActivityHomeBinding
import com.faimsoft.learnandroid.ui.MainViewModel

class HomeActivity: AppCompatActivity() {

    private val mainViewModel: MainViewModel by viewModels()

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainViewModel.init(this)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }


}