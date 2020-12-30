package com.example.shopp_partner.data.local.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ProductLocal(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "name") val prdct_name: String,
    @ColumnInfo(name = "price") val price: Double,
    @ColumnInfo(name = "currency") val devise: String
)
