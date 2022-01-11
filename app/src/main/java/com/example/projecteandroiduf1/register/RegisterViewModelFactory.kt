package com.example.projecteandroiduf1.register

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.androiduf1.database.dao

class RegisterViewModelFactory (
    private val database: dao,
    private val application: Application
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(RegisterViewModel::class.java)) {
            return RegisterViewModel(database, application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}