package com.example.mad_practical4_21012011167

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        val signup:TextView=findViewById(R.id.textView5)
        signup.setOnClickListener() {
            val i=Intent(this,signup ::class.java).also {
                startActivity(it) }
        }
    }
}
