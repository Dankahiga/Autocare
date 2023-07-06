package com.example.autocare

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.cardview.widget.CardView

class TyreMaintenanceActivity : AppCompatActivity() {
    private lateinit var toolbar: Toolbar
    lateinit var wheel: CardView
    lateinit var pressure: CardView
    lateinit var change: CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tyre_maintenance)
        toolbar = findViewById(R.id.toolbarz)
        setSupportActionBar(toolbar)

        wheel= findViewById(R.id.wheel)
        pressure = findViewById(R.id.pressure)
        change = findViewById(R.id.change)


        // First card
        val builder = AlertDialog.Builder(this)
        wheel.setOnClickListener {
            builder.setTitle("Wheel Balancing for Ksh2500")
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
        pressure.setOnClickListener {
            builder.setTitle("Tyre pressure for FREE")
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
        change.setOnClickListener {
            builder.setTitle("Tyre Change for Ksh2500")
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