package com.example.hotelapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button



public class MainActivity : AppCompatActivity() {
    private lateinit var btnSignIn: Button
    private lateinit var btnRegister: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSignIn = findViewById(R.id.btnSignIn)
        btnRegister = findViewById(R.id.btnRegister)

        btnRegister.setOnClickListener {
           val intent = Intent(this,RegistrActivity::class.java)
            startActivity(intent)
        }

 }



}



