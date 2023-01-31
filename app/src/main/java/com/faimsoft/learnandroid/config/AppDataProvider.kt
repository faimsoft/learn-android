package com.faimsoft.learnandroid.config

import android.content.Context

class AppDataProvider(context: Context) {


    private val preferences = context.getSharedPreferences("my-data", Context.MODE_PRIVATE)


    fun login(email: String, password: String) {
        preferences.edit().apply {
            putString("email", email)
            putString("password", password)
            apply()
        }
    }

    fun getEmail() = preferences.getString("email", "")

    fun getPassword() = preferences.getString("password", "")

    fun logout() {
        preferences.edit().clear().apply()
    }

}