package com.example.firstapp

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class HomeActivity:AppCompatActivity() {

    var textName: TextView? = null
    var imeageView: ImageView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home)

        textName = findViewById(R.id.txt_name)
        imeageView = findViewById(R.id.iv_result)


        val name = intent.getStringExtra("name")

        Log.e("ERRR|R|ER", "Name: ")


        textName?.text = name


        if (name == "asiman"){
            imeageView?.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_call_end_24))
        }



    }

}