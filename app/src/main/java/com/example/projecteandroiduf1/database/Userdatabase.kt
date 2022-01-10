package com.example.androiduf1.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Usuari::class], version = 1, exportSchema = false)
abstract class Userdatabase : RoomDatabase() {
    abstract val LoginDatabaseDao: dao

    companion object {

        @Volatile
        private var INSTANCE: Userdatabase? = null

        fun getInstance(context: Context): Userdatabase {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        Userdatabase::class.java,
                        "Usuaris_database"
                    )
                        .fallbackToDestructiveMigration()
                        .allowMainThreadQueries()
                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }

}