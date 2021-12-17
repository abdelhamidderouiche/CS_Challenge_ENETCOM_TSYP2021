package com.example.cs2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup

class demande : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demande)

        var nom: EditText= findViewById(R.id.nom)
        var etab: EditText=findViewById(R.id.etab)
        var type: RadioGroup=findViewById(R.id.rg1)

        var b: Button= findViewById(R.id.aj)

        b.setOnClickListener {

            var h= Home()
            h.addVal(nom.text.toString(),etab.text.toString())
            var i= Intent(this,Home::class.java)
            startActivity(i)

        }



    }
}