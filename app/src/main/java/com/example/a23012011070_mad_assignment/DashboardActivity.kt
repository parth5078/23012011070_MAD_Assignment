package com.example.a23012011070_mad_assignment

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.card.MaterialCardView

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dashboard)
        val cardDonate = findViewById<MaterialCardView>(R.id.cardDonate)
        val cardRequest = findViewById<MaterialCardView>(R.id.cardRequest)
        val cardStock = findViewById<MaterialCardView>(R.id.cardStock)
        val cardNearestCenter = findViewById<MaterialCardView>(R.id.cardCenter)
        val cardProfile = findViewById<MaterialCardView>(R.id.cardProfile)
        val cardLogout = findViewById<MaterialCardView>(R.id.cardLogout)
        cardDonate.setOnClickListener {
            startActivity(Intent(this, DonateBloodActivity::class.java))
        }
        cardRequest.setOnClickListener {
            startActivity(Intent(this, BloodRequestActivity::class.java))
        }
        cardStock.setOnClickListener {
            startActivity(Intent(this, BloodStockActivity::class.java))
        }
        cardNearestCenter.setOnClickListener {
            startActivity(Intent(this, NearestCenterActivity::class.java))
        }
        cardProfile.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
        cardLogout.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
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