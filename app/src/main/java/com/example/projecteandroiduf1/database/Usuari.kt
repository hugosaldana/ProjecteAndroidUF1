package com.example.androiduf1.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Usuaris")
data class Usuari (
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    @ColumnInfo(name = "Nom_Usuari")
    var nom_usuari: String = "",
    @ColumnInfo(name = "Contrasenya")
    var contrasenya: String = "",
    @ColumnInfo(name ="Nom")
    var nom: String = "",
    @ColumnInfo(name ="Cognom")
    var cognom: String = ""

)