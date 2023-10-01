package com.example.mad_practical4_21012011167

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val login:Button=findViewById(R.id.button1)
        val register:Button=findViewById(R.id.button2)
        login.setOnClickListener()
        {
            val i = Intent(this,login :: class.java)
            startActivity(i)
        }
        register.setOnClickListener()
        {
            val i = Intent(this,signup :: class.java)
            startActivity(i)
        }
    }
}
