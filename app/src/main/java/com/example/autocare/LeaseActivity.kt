package com.example.autocare

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.cardview.widget.CardView

class LeaseActivity : AppCompatActivity() {
    private lateinit var toolbar: Toolbar
    private val simToolkitPackage = "com.android.stk"
    lateinit var passo:CardView
    lateinit var noah:CardView
    lateinit var sti:CardView
    lateinit var tx:CardView
    lateinit var v8:CardView
    lateinit var c200:CardView
    lateinit var coupe:CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lease)
        toolbar = findViewById(R.id.toolbarz)
        setSupportActionBar(toolbar)

        //Find by id
        passo = findViewById(R.id.passo)
        noah = findViewById(R.id.noah)
        sti = findViewById(R.id.sti)
        tx = findViewById(R.id.tx)
        v8 = findViewById(R.id.v8)
        c200 = findViewById(R.id.c200)
        coupe = findViewById(R.id.coupe)


        // First card
            val builder = AlertDialog.Builder(this)
            passo.setOnClickListener {
                builder.setTitle("Purchase Passo")
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
        noah.setOnClickListener {
            builder.setTitle("Purchase Noah")
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
        sti.setOnClickListener {
            builder.setTitle("Purchase ForesterSTI")
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

        // Fourth card
        val builder3 = AlertDialog.Builder(this)
        tx.setOnClickListener {
            builder.setTitle("Purchase Prado TX")
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

        // Fifth card
        val builder4 = AlertDialog.Builder(this)
        v8.setOnClickListener {
            builder.setTitle("Purchase Toyota V8")
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

        // Sixth card
        val builder5 = AlertDialog.Builder(this)
        c200.setOnClickListener {
            builder.setTitle("Purchase Mercedes")
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

        // Seventh card
        val builder6 = AlertDialog.Builder(this)
        coupe.setOnClickListener {
            builder.setTitle("Purchase BMW")
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


