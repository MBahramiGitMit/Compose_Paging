package com.example.composepaging.db.entity.allMadehs

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "Allmadehs",
    foreignKeys = [ForeignKey(
        entity = AdadEtalatHarighs::class,
        childColumns = ["TLAdadEtalatHarighId"],
        parentColumns = ["IdAdadEtalatHarigh"]
    ), ForeignKey(
        entity = KhataratKhases::class,
        childColumns = ["TLKhataratKhasId"],
        parentColumns = ["IdKhataratKhas"]
    ), ForeignKey(
        entity = AdadEtelatVakonoshdehis::class,
        childColumns = ["TLAdadEtelatVakonoshdehiId"],
        parentColumns = ["IdAdadEtelatVakonoshdehi"]
    ), ForeignKey(
        entity = AdadEtelatBehdashtis::class,
        childColumns = ["TLAdadEtelatBehdashtiId"],
        parentColumns = ["IdAdadEtelatBehdashti"]
    )]
)
data class Allmadehs(
    @PrimaryKey
    val IdAllmadeh: Int,
    val TLAdadEtelatBehdashtiId: Int? = null,
    val TLAdadEtalatHarighId: Int? = null,
    val TLAdadEtelatVakonoshdehiId: Int? = null,
    val TLKhataratKhasId: Int? = null,
    val Cas: String? = null,
    val ClaseKhatarDot: String? = null,
    val Erg: String? = null,
    val Formol: String? = null,
    val NameEn: String? = null,
    val NameFa: String? = null,
    val Un: String? = null,
    val Sobat: String? = null
)