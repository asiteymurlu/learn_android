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

    var simpleLogin: TextView? = null
    var password : TextView? = null
    var username: TextView? = null
    var login: Button? = null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        enableEdgeToEdge()



        setContentView(R.layout.simple_login)

        //initiALIZE
        password = findViewById(R.id.password)
        username= findViewById(R.id.username)
        username= findViewById(R.id.login)
        simpleLogin = findViewById(R.id.simple_login)







    }
}