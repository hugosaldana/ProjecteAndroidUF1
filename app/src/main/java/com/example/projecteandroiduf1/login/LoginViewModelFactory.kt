package com.example.projecteandroiduf1.login

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.androiduf1.database.dao

class LoginViewModelFactory(
    private val database: dao,
    private val application: Application
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LoginViewModel::class.java)) {
            return LoginViewModel(database, application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}

