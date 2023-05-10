package com.example.hotelapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hotelapp.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth

class RegistrActivity : AppCompatActivity() {

        private lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registr)
    }
}