package com.example.autocare

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.autocare.LoginActivity1
import com.example.autocare.R

class MainActivity : AppCompatActivity() {
    private val splashTimeOut: Long = 3000 // 3 seconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Replace with your actual layout file

        // Create a handler to delay the redirect to the login page
        Handler().postDelayed({
            val intent = Intent(this, LoginActivity1::class.java) // Replace with your actual login activity
            startActivity(intent)
            finish()
        }, splashTimeOut)
    }
}