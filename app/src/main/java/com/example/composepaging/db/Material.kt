package com.example.composepaging.db

import androidx.room.Embedded
import androidx.room.Relation
import com.example.composepaging.db.entity.Ghs
import com.example.composepaging.db.entity.allMadehs.*

data class Material(
    @Embedded
    val allMadehs: Allmadehs,
    @Relation(
        parentColumn = "TLAdadEtalatHarighId",
        entityColumn = "IdAdadEtalatHarigh"
    )
    val etalatHarighs: AdadEtalatHarighs,
    @Relation(
        parentColumn = "TLKhataratKhasId",
        entityColumn = "IdKhataratKhas"
    )
    val khataratKhases: KhataratKhases,
    @Relation(
        parentColumn = "TLAdadEtelatVakonoshdehiId",
        entityColumn = "IdAdadEtelatVakonoshdehi"
    )
    val etelatVakonoshdehis: AdadEtelatVakonoshdehis,
    @Relation(
        parentColumn = "TLAdadEtelatBehdashtiId",
        entityColumn = "IdAdadEtelatBehdashti"
    )
    val etelatBehdashtis: AdadEtelatBehdashtis,
    @Relation(
        parentColumn = "IdAllmadeh",
        entityColumn = "TAllmadehId"
    )
    val ghs: Ghs
    )
