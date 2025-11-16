package com.example.a23012011070_mad_assignment

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)
        
        val fullNameInput = findViewById<EditText>(R.id.editName)
        val emailInput = findViewById<EditText>(R.id.editEmail)
        val passwordInput = findViewById<EditText>(R.id.editPassword)
        val bloodGroupInput = findViewById<EditText>(R.id.editBloodGroup)
        val registerButton = findViewById<Button>(R.id.btnRegister)
        val loginText = findViewById<TextView>(R.id.RegisterNow)
        registerButton.setOnClickListener {
            val uname = fullNameInput.text.toString()
            val mail = emailInput.text.toString()
            val pass = passwordInput.text.toString()
            val group = bloodGroupInput.text.toString()

            if (uname.isEmpty() || mail.isEmpty() || pass.isEmpty() || group.isEmpty()){
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "Registered Successfully", Toast.LENGTH_SHORT).show()

                startActivity(Intent(this, LoginActivity::class.java))
                finish()
            }
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        loginText.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}