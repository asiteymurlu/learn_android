package com.example.firstapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    var simpleLogin: TextView? = null
    var etPassword : EditText? = null
    var etUsername: EditText? = null
    var login: MaterialButton? = null


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        enableEdgeToEdge()



        setContentView(R.layout.simple_login)

        //initiALIZE
        etPassword = findViewById(R.id.password)
        etUsername= findViewById(R.id.username)
        login = findViewById(R.id.login)
        simpleLogin = findViewById(R.id.simple_login)


        login?.setOnClickListener {
            login()
        }

    }


    fun login (){

        val username = etUsername!!.text.toString()
        val password = etPassword!!.text.toString()

        if (username.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Istifadeci adi ve ya sifre daxil edilmeyib", Toast.LENGTH_SHORT).show()
        } else if (username == "asiman" && password == "123") {

            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("name", username)
            startActivity(intent)
        }

    }

}