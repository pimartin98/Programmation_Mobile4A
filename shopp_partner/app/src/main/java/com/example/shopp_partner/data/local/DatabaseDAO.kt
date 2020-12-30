package com.example.shopp_partner.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.shopp_partner.data.local.models.ProductLocal
import com.example.shopp_partner.domain.entity.Product

@Dao
interface DatabaseDAO {
    @Query("SELECT * FROM productlocal")
    fun getAll(): List<ProductLocal>

    @Query("SELECT * FROM productlocal")
    fun loadAllByIds(userIds: IntArray): List<ProductLocal>

    @Query("SELECT * FROM productlocal WHERE name like :pdct_name")
    fun findByName(pdct_name: String): ProductLocal

    @Insert
    fun insert( product: Product)

    @Delete
    fun delete(product: ProductLocal)
}
