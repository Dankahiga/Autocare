package com.example.autocare

import android.app.AlertDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class EngineMaintenanceActivity : AppCompatActivity() {
    lateinit var oil: CardView
    lateinit var cool: CardView
    lateinit var filter: CardView
    lateinit var plugs: CardView
    lateinit var diagnosis: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_engine_maintenance)

        oil= findViewById(R.id.oil)
        cool = findViewById(R.id.cool)
        filter= findViewById(R.id.filter)
        plugs = findViewById(R.id.plugs)
        diagnosis = findViewById(R.id.diagnosis)


        // First card
        val builder = AlertDialog.Builder(this)
        oil.setOnClickListener {
            builder.setTitle("Oil Change for Ksh3500")
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
        cool.setOnClickListener {
            builder.setTitle("Cooling System Check for Ksh1500")
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
        filter.setOnClickListener {
            builder.setTitle("Fuel Filter Change for Ksh2500")
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

        val builder3 = AlertDialog.Builder(this)
        plugs.setOnClickListener {
            builder.setTitle("Plugs and Wires Change for Ksh2000")
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

        val builder4 = AlertDialog.Builder(this)
        diagnosis.setOnClickListener {
            builder.setTitle("Car Diagnosis for Ksh3000")
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