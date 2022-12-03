package com.example.composepaging.db.entity.allMadehs

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class AdadEtalatHarighs(
    @PrimaryKey(autoGenerate = true)
    val IdAdadEtalatHarigh: Int,
    val TitelsAdadEtalatHarigh: String? = null
)
