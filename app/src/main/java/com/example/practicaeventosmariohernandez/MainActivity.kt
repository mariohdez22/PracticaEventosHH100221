package com.example.practicaeventosmariohernandez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity()
{
    private lateinit var btnUno : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnUno = findViewById(R.id.btnActividadUno)

        btnUno.setOnClickListener{

            var intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}