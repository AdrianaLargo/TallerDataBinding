package com.example.tallerdatabinding.ui

import com.example.tallerdatabinding.model.Product

fun interface ProductItemHandler {
    fun onProductClicked(item: Product)
}
