package com.example.androiduf1.sharedpref

import android.content.Context
import android.content.SharedPreferences

class Prefs (context: Context) {
    val USER_KEY = "Preferencia1"
    val USER_NAME = "Username"

    val prefs: SharedPreferences = context.getSharedPreferences(USER_KEY, 0)

    var name: String
        get() = prefs.getString(USER_NAME,"")!!
        set(value) = prefs.edit().putString(USER_NAME, value).apply()
}