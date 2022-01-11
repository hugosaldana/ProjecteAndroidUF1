package com.example.projecteandroiduf1.register

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import com.example.androiduf1.database.Usuari
import com.example.androiduf1.database.dao



class RegisterViewModel (val database: dao,
                         application: Application) : AndroidViewModel(application) {
    init {
        Log.i("RegisterViewModel", "RegisterViewModel created!")

    }



    fun insertar_usuari(nom: String, cognom: String, nom_user: String, contrasenya: String){

        var lista: Usuari? = null

        lista?.nom ?: nom
        lista?.cognom?: cognom
        lista?.nom_usuari?: nom_user
        lista?.contrasenya?: contrasenya

        database.insert(lista)
        Log.i("UsuariRegistrat", "UsuariRegistrat")
    }


    fun existeix(nom_user: String, contrasenya: String): Boolean {
        return database.correcte(nom_user,contrasenya) == 1
    }


}