package com.faimsoft.learnandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import com.faimsoft.learnandroid.databinding.ActivityLoginBinding
import com.faimsoft.learnandroid.ui.MainViewModel
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainViewModel.init(this)

        binding.login.setOnClickListener {
            val email = binding.etUsername.text.toString().trim()
            val password = binding.etPassword.text.toString().trim()

            Log.e(TAG,"email: $email , password: $password")

            mainViewModel.appDataProvider.login(email, password)

            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }


    }

    companion object {
        private const val TAG = "MainActivity"
    }

}