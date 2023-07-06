package com.example.autocare

import android.app.AlertDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.cardview.widget.CardView

class BodyActivity : AppCompatActivity() {

    private lateinit var toolbar: Toolbar
    lateinit var paint: CardView
    lateinit var wrap: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_body)

        toolbar = findViewById(R.id.toolbarz)
        setSupportActionBar(toolbar)

        paint= findViewById(R.id.paint)
        wrap = findViewById(R.id.wrap)


        // First card
        val builder = AlertDialog.Builder(this)
        paint.setOnClickListener {
            builder.setTitle("Paint for Ksh20,000")
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
        wrap.setOnClickListener {
            builder.setTitle("CarWraps for Ksh50,000")
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