package com.example.autocare

import android.app.AlertDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.cardview.widget.CardView

class CarwashActivity : AppCompatActivity() {
    private lateinit var toolbar: Toolbar
    lateinit var ewash: CardView
    lateinit var bwash: CardView
    lateinit var polishing: CardView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carwash)
        toolbar = findViewById(R.id.toolbarz)
        setSupportActionBar(toolbar)

        ewash= findViewById(R.id.ewash)
        bwash = findViewById(R.id.bwash)
        polishing = findViewById(R.id.polishing)


        // First card
        val builder = AlertDialog.Builder(this)
        ewash.setOnClickListener {
            builder.setTitle("Engine Wash for Ksh500")
            builder.setMessage("Would you like to pay?Use send money to 0712345678?")

            builder.setPositiveButton("Pay") { dialog: DialogInterface, _: Int ->
                // Open the SIM Toolkit
                val wire = applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                startActivity(wire)
            }

            builder.setNegativeButton("Cancel") { dialog: DialogInterface, _: Int ->
                dialog.dismiss()
                finish()
            }

            builder.setOnCancelListener {
                finish()
            }

                .show()
        }

        val builder1 = AlertDialog.Builder(this)
        bwash.setOnClickListener {
            builder.setTitle("BodyWash for Ksh250")
            builder.setMessage("Would you like to pay?Use send money to 0712345678?")

            builder.setPositiveButton("Pay") { dialog: DialogInterface, _: Int ->
                // Open the SIM Toolkit
                val wire = applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                startActivity(wire)
            }

            builder.setNegativeButton("Cancel") { dialog: DialogInterface, _: Int ->
                dialog.dismiss()
                finish()
            }

            builder.setOnCancelListener {
                finish()
            }

                .show()
        }
        val builder2 = AlertDialog.Builder(this)
        polishing.setOnClickListener {
            builder.setTitle("Polish for Ksh200")
            builder.setMessage("Would you like to pay?Use send money to 0712345678?")

            builder.setPositiveButton("Pay") { dialog: DialogInterface, _: Int ->
                // Open the SIM Toolkit
                val wire = applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                startActivity(wire)
            }

            builder.setNegativeButton("Cancel") { dialog: DialogInterface, _: Int ->
                dialog.dismiss()
                finish()
            }

            builder.setOnCancelListener {
                finish()
            }

                .show()
        }
    }
}