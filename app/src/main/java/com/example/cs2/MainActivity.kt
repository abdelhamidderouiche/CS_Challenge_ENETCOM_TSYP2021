package com.example.cs2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val usercin = "01234567"
        val usercode = "0000"

        val e1 = findViewById<EditText>(R.id.e1)
        val e2 = findViewById<EditText>(R.id.pass)

        val cin = e1.text.toString()
        val code = e2.text.toString()

        val login = findViewById<Button>(R.id.login)


        login.setOnClickListener {

                val i = Intent(this, Home::class.java)
                startActivity(i)


        }

    }
}