package com.example.composepaging.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.composepaging.db.entity.Ghs
import com.example.composepaging.db.entity.allMadehs.*

@Database(
    entities = [
        Allmadehs::class,
        AdadEtalatHarighs::class,
        AdadEtelatBehdashtis::class,
        AdadEtelatVakonoshdehis::class,
        KhataratKhases::class,
        Ghs::class
    ], version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract val materialDao: MaterialDao

    companion object {
        private var db: AppDatabase? = null

        fun getDB(context: Context): AppDatabase {
            if (db == null) {
                db = Room.databaseBuilder(context, AppDatabase::class.java, "material_db")
                    .createFromAsset("database/material_db.db").allowMainThreadQueries().build()
            }
            return db!!
        }
    }
}