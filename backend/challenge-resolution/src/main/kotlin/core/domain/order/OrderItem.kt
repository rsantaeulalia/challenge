package main.kotlin.core.domain.order

import main.kotlin.core.domain.product.Product

data class OrderItem(val product: Product, val quantity: Int) {
    val total get() = product.price * quantity
}