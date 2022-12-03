package com.example.composepaging.db.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.PrimaryKey
import com.example.composepaging.db.entity.allMadehs.Allmadehs

@Entity(
    foreignKeys = [
        ForeignKey(
            entity = Allmadehs::class,
            childColumns = ["TAllmadehId"],
            parentColumns = ["IdAllmadeh"],
            onDelete = CASCADE
        )
    ]
)
data class Ghs(
    @PrimaryKey
    val IdGhs: Int,
    val BayaneKhatar: String? = null,
    val JomleEhtiyati: String? = null,
    val Piktogram: String? = null,
    val Signal: String? = null,
    val TAllmadehId: Int
)