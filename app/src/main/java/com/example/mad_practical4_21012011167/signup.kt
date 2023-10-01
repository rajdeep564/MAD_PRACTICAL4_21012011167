package com.example.mad_practical4_21012011167

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)
        val login: TextView =findViewById(R.id.textView5)
        login.setOnClickListener() {
            val i= Intent(this,LoginActivity ::class.java).also { startActivity(it)}
        }
    }
}
