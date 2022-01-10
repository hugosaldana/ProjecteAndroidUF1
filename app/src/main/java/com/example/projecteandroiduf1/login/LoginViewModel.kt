package com.example.projecteandroiduf1.login

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import com.example.androiduf1.database.dao

class LoginViewModel (val database: dao,
                      application: Application) : AndroidViewModel(application) {
    init {
        Log.i("LoginViewModel", "LoginViewModel created!")

    }


   fun existeix(nom: String, contrasenya: String): Boolean {
        return database.correcte(nom,contrasenya) == 1
    }
}