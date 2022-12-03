package com.example.composepaging.db

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction

@Dao
interface MaterialDao {
    @Transaction
    @Query("SELECT * FROM Allmadehs WHERE idAllmadeh == :id")
    fun getMaterialById(id: Int): Material
}