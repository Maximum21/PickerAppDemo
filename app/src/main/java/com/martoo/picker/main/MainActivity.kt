package com.martoo.picker.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.martoo.picker.R

class MainActivity : AppCompatActivity() {
    private lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnLogin = findViewById<Button>(R.id.loginBtn)
        btnLogin.setOnClickListener {
            startActivity(Intent(this, ListingActivity::class.java))
        }
    }
}