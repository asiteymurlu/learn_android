package com.example.firstapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.firstapp.fragments.AddFragment
import com.example.firstapp.fragments.HomeFragment
import com.google.android.material.floatingactionbutton.FloatingActionButton

/*
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

}*/

val TAG = "MainActivityTest"

class MainActivity : AppCompatActivity() {

    /*private lateinit var txtFirstScore: TextView
    private lateinit var txtSecondScore: TextView
    private lateinit var firstImageView: ImageView
    private lateinit var secondImageView: ImageView
    var firstPlayerScore = 0
    var secondPlayerScore = 0*/

    private var fragmentManager: FragmentManager? = null
    private var fab: FloatingActionButton? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        fab = findViewById(R.id.floatingActionButton)

        fragmentManager = supportFragmentManager


        changeFragment(HomeFragment())



        fab?.setOnClickListener {
            changeFragment(AddFragment())
        }
    }

    fun changeFragment(fragment: Fragment){
        fragmentManager?.beginTransaction()
            ?.replace(R.id.frg_container,fragment)
            ?.commit()
    }



    /*fun setUpView() {
        txtFirstScore = findViewById(R.id.score_me)
        txtSecondScore = findViewById(R.id.score_other)
        firstImageView = findViewById(R.id.imageView4)
        secondImageView = findViewById(R.id.second_img)

    }

    fun playGame(view: View) {
        var firstImage = 0
        var secondImage = 0
        var result = Winner.DRAW

        when (view.id) {
            R.id.tash -> {
                firstImage = R.drawable.tash
                secondImage = Generator.getImage()

                setImageResources(firstImage, secondImage)

                result = Comparator.compare(firstImage, secondImage)

                writeScore(result)
            }

            R.id.kagit -> {
                firstImage = R.drawable.kagit
                secondImage = Generator.getImage()

                setImageResources(firstImage, secondImage)

                result = Comparator.compare(firstImage, secondImage)

                writeScore(result)
            }

            R.id.makas -> {
                firstImage = R.drawable.makas
                secondImage = Generator.getImage()

                setImageResources(firstImage, secondImage)

                result = Comparator.compare(firstImage, secondImage)

                writeScore(result)
            }

        }
    }

    fun setImageResources (firstImage:Int, secondImage:Int){
        firstImageView.setImageResource(firstImage)
        secondImageView.setImageResource(secondImage)
    }

    fun writeScore (winner: Winner){
        when(winner) {
            Winner.DRAW -> {
                Toast.makeText(this, "Berabere", Toast.LENGTH_SHORT).show()
            }
            Winner.FIRST -> {
                firstPlayerScore++
                txtFirstScore.text = firstPlayerScore.toString()
            }
            Winner.SECOND -> {
                secondPlayerScore++
                txtSecondScore.text = secondPlayerScore.toString()
            }
        }
    }

    fun reset (view:View){
        firstPlayerScore = 0
        secondPlayerScore = 0
        txtFirstScore.text = firstPlayerScore.toString()
        txtSecondScore.text = secondPlayerScore.toString()
    }*/
}