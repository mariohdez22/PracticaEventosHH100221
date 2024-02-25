package com.example.practicaeventosmariohernandez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {

    private lateinit var btnDos : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btnDos = findViewById(R.id.btnActividadDos)

        btnDos.setOnClickListener{
            finish()
        }
    }
}