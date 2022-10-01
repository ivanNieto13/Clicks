package com.example.clicks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvSaludo = findViewById<TextView>(R.id.tvSaludo)
        val btnSaludar = findViewById<Button>(R.id.btnSaludar)

        tvSaludo.text = "Cambio 1 saludo"

        btnSaludar.setOnClickListener {
            tvSaludo.text = "Cambio 2 saludo"
        }

        tvSaludo.setOnClickListener {
            tvSaludo.text = "Cambio 3 saludo"
        }
    }
}