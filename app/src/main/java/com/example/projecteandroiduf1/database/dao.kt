package com.example.androiduf1.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import java.util.HashMap

@Dao
interface dao {

    @Insert
    fun insert(user: Usuari)

    @Update
    fun update(user: Usuari)


    @Query("Select id from Usuaris")
    fun getids(): Int?

    @Query("Select count(Nom_Usuari) from Usuaris where Nom_usuari = :nom and Contrasenya = :contrasenya")
    fun correcte(nom:String, contrasenya: String): Int?


    @Query("Select count(Nom_Usuari) from Usuaris where Nom_usuari = :nom ")
    fun existeixnom(nom: String): Int?

    @Query("Select * from Usuaris")
    fun getAllUsuaris(): LiveData<List<Usuari>>



}