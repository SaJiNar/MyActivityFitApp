package com.example.aplicacionesjuntas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val fraseDiaBtn = findViewById<Button>(R.id.fraseDiaBtn)
        fraseDiaBtn.setOnClickListener { navigateToFraseDelDia() }

        val recetasBtn = findViewById<Button>(R.id.recetasBtn)
        recetasBtn.setOnClickListener { navigateToRecetas() }

        val saludBtn = findViewById<Button>(R.id.saludBtn)
        saludBtn.setOnClickListener { navigateToSalud() }

        val calenBtn = findViewById<Button>(R.id.calenBtn)
        calenBtn.setOnClickListener { navigateToRutinas() }
    }

    private fun navigateToFraseDelDia(){
        val intent = Intent(this, FraseMotivadoraActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToRecetas(){
        val intent = Intent(this, CustomAdapter.RecetasActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToSalud(){
        val intent = Intent(this, SaludActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToRutinas(){
        val intent = Intent(this, RutinasActivity::class.java)
        startActivity(intent)
    }
}