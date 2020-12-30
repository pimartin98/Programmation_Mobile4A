package com.example.shopp_partner.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.shopp_partner.domain.entity.Product

@Database(entities = arrayOf(Product::class), version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun databaseDao(): DatabaseDAO
}
