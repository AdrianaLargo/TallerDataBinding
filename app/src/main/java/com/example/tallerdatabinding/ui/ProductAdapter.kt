package com.example.tallerdatabinding.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tallerdatabinding.databinding.ItemProductBinding
import com.example.tallerdatabinding.model.Product

class ProductAdapter(
    private val items: List<Product>,
    private val handler: ProductItemHandler
) : RecyclerView.Adapter<ProductAdapter.VH>() {

    inner class VH(val binding: ItemProductBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemProductBinding.inflate(inflater, parent, false)
        return VH(binding)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val item = items[position]
        holder.binding.product = item
        holder.binding.handler = handler
        holder.binding.executePendingBindings()
    }

    override fun getItemCount(): Int = items.size
}
