package com.example.hotelapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.hotelapp.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth


public class MainActivity : AppCompatActivity() {
    private lateinit var btnSignIn: Button
    private lateinit var btnRegister: Button
    private lateinit var binding: ActivityMainBinding
    companion object{
            lateinit var auth: FirebaseAuth
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        auth = FirebaseAuth.getInstance()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSignIn.setOnClickListener{
            startActivity(Intent(this,SignInActivity::class.java))
            finish()
        }

        btnSignIn = findViewById(R.id.btnSignIn)
        btnRegister = findViewById(R.id.btnRegister)

        binding.btnRegister.setOnClickListener {
           val intent = Intent(this,RegistrActivity::class.java)
            startActivity(intent)
        }

 }



}



