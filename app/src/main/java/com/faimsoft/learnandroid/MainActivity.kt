package com.faimsoft.learnandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.faimsoft.learnandroid.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.login.setOnClickListener {
            val email = binding.etUsername.text.toString().trim()
            val password = binding.etPassword.text.toString().trim()

            Log.e(TAG,"email: $email , password: $password")
            Toast.makeText(this, "email: $email , password: $password", Toast.LENGTH_SHORT).show()

        }


    }

    companion object {
        private const val TAG = "MainActivity"
    }

}