package com.example.composepaging.db.entity.allMadehs

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class AdadEtelatBehdashtis(
    @PrimaryKey(autoGenerate = true)
    val IdAdadEtelatBehdashti: Int,
    val TitelsAdadEtelatBehdashti: String? = null
)
