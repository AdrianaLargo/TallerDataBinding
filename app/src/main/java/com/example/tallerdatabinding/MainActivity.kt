package com.example.tallerdatabinding

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.tallerdatabinding.databinding.ActivityMainBinding
import com.example.tallerdatabinding.model.Product
import com.example.tallerdatabinding.ui.ProductAdapter
import com.example.tallerdatabinding.ui.ProductItemHandler

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate vía DataBinding (evita "source must not be null")
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = listOf(
            Product("Café molido 250g", 3.50),
            Product("Té verde 20 sobres", 2.20),
            Product("Chocolate 70% 100g", 2.80),
            Product("Galletas integrales", 1.90),
            Product("Mermelada de fresa", 2.60)
        )

        val handler = ProductItemHandler { item ->
            Toast.makeText(this, "Seleccionaste: ${item.name}", Toast.LENGTH_SHORT).show()
        }

        val adapter = ProductAdapter(data, handler)
        binding.rvProducts.adapter = adapter
    }
}
