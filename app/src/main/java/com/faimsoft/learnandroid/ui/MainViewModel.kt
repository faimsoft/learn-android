package com.faimsoft.learnandroid.ui

import android.content.Context
import androidx.lifecycle.ViewModel
import com.faimsoft.learnandroid.config.AppDataProvider

class MainViewModel: ViewModel() {

    lateinit var appDataProvider: AppDataProvider

    fun init(context: Context) {
        appDataProvider = AppDataProvider(context)
    }


}