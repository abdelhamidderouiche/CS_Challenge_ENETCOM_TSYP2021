package com.example.cs2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import android.widget.SimpleAdapter

class Home : AppCompatActivity() {

    lateinit var ls:ListView
    companion object {
    lateinit  var values: ArrayList<HashMap<String,String>> }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        ls=findViewById(R.id.lst)

        values= ArrayList<HashMap<String,String>>()
        var map= HashMap<String,String>()
        map.put("demande"," Demande 1")
        map.put("statut"," En cours, chez Minstere de Finance")
        values.add(map)

        var adapter=SimpleAdapter(this,values,R.layout.modle, arrayOf("demande","statut"),
        intArrayOf(R.id.t2,R.id.t3))

        ls.adapter=adapter

        var b: Button=findViewById(R.id.button2)

        b.setOnClickListener {

            var i= Intent(this,demande::class.java)
            startActivity(i)

        }



    }

    public  fun addVal(s1: String ,s2: String) {

        var map = HashMap<String, String>()
        map.put("demande", s1)
        map.put("statut", s2)
        values.add(map)



    }

}