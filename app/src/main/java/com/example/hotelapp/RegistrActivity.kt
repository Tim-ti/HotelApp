package com.example.hotelapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.hotelapp.databinding.ActivityMainBinding
import com.example.hotelapp.databinding.ActivityRegistrBinding
import com.google.firebase.auth.FirebaseAuth

class RegistrActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityRegistrBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSignIn.setOnClickListener {
            startActivity(Intent(this, SignInActivity::class.java))
            finish()
        }
        binding.btnRegister.setOnClickListener {
            val email = binding.emailField.text.toString()
            val password = binding.passField.text.toString()
            if (email.isNotEmpty() && password.isNotEmpty())
                MainActivity.auth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener{
                        if (it.isSuccessful) {
                            startActivity(Intent(this, MainActivity::class.java))
                            finish()
                        }

                    }

        }
    }
}