package com.example.composepaging.db.entity.allMadehs

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class KhataratKhases(
    @PrimaryKey(autoGenerate = true)
    val IdKhataratKhas: Int,
    val TitelsKhataratKhas: String? = null
)
