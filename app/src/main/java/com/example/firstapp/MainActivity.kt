package com.example.firstapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    var txtHello: TextView? = null
    var button: Button? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        enableEdgeToEdge()


        setContentView(R.layout.activity_main)

        //initiALIZE
        txtHello = findViewById(R.id.txt_hello)
        button = findViewById(R.id.button)


        button?.setOnClickListener {
            txtHello?.text = "Salam"
        }



    }
}