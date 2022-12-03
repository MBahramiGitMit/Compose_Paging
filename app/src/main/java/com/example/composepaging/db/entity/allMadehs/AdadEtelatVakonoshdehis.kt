package com.example.composepaging.db.entity.allMadehs

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class AdadEtelatVakonoshdehis(
    @PrimaryKey(autoGenerate = true)
    val IdAdadEtelatVakonoshdehi: Int,
    val TitelsAdadEtelatVakonoshdehi: String? = null
)
