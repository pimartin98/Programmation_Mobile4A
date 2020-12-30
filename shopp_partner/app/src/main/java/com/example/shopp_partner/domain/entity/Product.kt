package com.example.shopp_partner.domain.entity

import androidx.room.Entity


class Product(prdct_name: String, price : Double) {
   var prdct_name : String = ""
    var price : Double? = 0.0
    var devise : String = "€"
}