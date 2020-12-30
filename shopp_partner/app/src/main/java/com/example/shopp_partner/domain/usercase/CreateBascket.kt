package com.example.shopp_partner.domain.usercase

import com.example.shopp_partner.data.repository.ProductRepository
import com.example.shopp_partner.domain.entity.Product

class CreateBascket(
    private val productRepository: ProductRepository
) {
        suspend fun invoke(product : Product){
        productRepository.createProduct(product)
        }
}
