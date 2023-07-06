package com.example.autocare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.autocare.R
import com.example.autocare.SignActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class LoginActivity1 : AppCompatActivity() {


    private lateinit var myemail1: EditText
    private lateinit var mypassword1: EditText
    lateinit var login1: Button
    lateinit var signup: TextView
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login1)

        myemail1=findViewById(R.id.email1)
        mypassword1=findViewById(R.id.password1)
        login1=findViewById(R.id.login)
        signup=findViewById(R.id.text1)
        auth= FirebaseAuth.getInstance()

        login1.setOnClickListener {
            login()
        }
        signup.setOnClickListener {
            val intent = Intent(this, SignActivity::class.java)
            startActivity(intent)
            finish()
        }
    }



    private fun login(){
        val email=myemail1.text.toString()
        val pass=mypassword1.text.toString()

        if (email.isBlank() || pass.isBlank() ){
            Toast.makeText(this,"Please Email and password can't be blank", Toast.LENGTH_LONG).show()

            return

        }

        auth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(this) {
            if (it.isSuccessful){
                Toast.makeText(this,"Failed to login", Toast.LENGTH_LONG).show()


            }else{
                Toast.makeText(this,"Logged In successfully", Toast.LENGTH_LONG).show()
                val intent = Intent(this, DashboardActivity::class.java)
                startActivity(intent)
            }

        }

    }
}