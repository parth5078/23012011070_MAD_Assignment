package com.example.a23012011070_mad_assignment

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BloodRequestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_blood_request)
        val name = findViewById<EditText>(R.id.nameInput)
        val group = findViewById<EditText>(R.id.groupInput)
        val units = findViewById<EditText>(R.id.unitsInput)
        val hospital = findViewById<EditText>(R.id.hospitalInput)
        val contact = findViewById<EditText>(R.id.contactInput)
        val submit = findViewById<Button>(R.id.submitButton)
        submit.setOnClickListener {
            if (name.text.isEmpty() || group.text.isEmpty() || units.text.isEmpty() ||
                hospital.text.isEmpty() || contact.text.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Blood Request Submitted", Toast.LENGTH_SHORT).show()
                finish()
            }
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}