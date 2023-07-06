package com.example.autocare

import android.app.AlertDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class AccessoriesActivity : AppCompatActivity() {
    lateinit var freshene: CardView
    lateinit var seat: CardView
    lateinit var mats: CardView
    lateinit var steer: CardView
    lateinit var cover: CardView
    lateinit var mount: CardView
    lateinit var gps: CardView
    lateinit var kit:CardView
    lateinit var charger:CardView
    lateinit var napkins:CardView
    lateinit var jack:CardView
    lateinit var shiner:CardView
    lateinit var aid:CardView
    lateinit var bt:CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_accessories)

        //Find by id
        freshene = findViewById(R.id.freshener)
        seat= findViewById(R.id.seat)
        mats= findViewById(R.id.mats)
        steer= findViewById(R.id.steer)
        cover = findViewById(R.id.cover)
        mount = findViewById(R.id.mount)
        gps = findViewById(R.id.gps)
        kit = findViewById(R.id.kit)
        charger = findViewById(R.id.charger)
        napkins = findViewById(R.id.napkins)
        jack = findViewById(R.id.jack)
        shiner = findViewById(R.id.shiner)
        aid= findViewById(R.id.aid)
        bt = findViewById(R.id.bt)

        // First card
        val builder = AlertDialog.Builder(this)
        freshene.setOnClickListener {
            builder.setTitle("Purchase AirFresheners for Ksh250 ")
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

        // Second card
        val builder1 = AlertDialog.Builder(this)
        seat.setOnClickListener {
            builder.setTitle("Purchase SeatCovers for KSh1500")
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

        // Third card
        val builder2 = AlertDialog.Builder(this)
        mats.setOnClickListener {
            builder.setTitle("Purchase FloorMats for Ksh1000")
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
        steer.setOnClickListener {
            builder.setTitle("Purchase SteerCovers for Ksh600")
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
        cover.setOnClickListener {
            builder.setTitle("Purchase CarCover for Ksh 800")
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
        mount.setOnClickListener {
            builder.setTitle("Purchase CarMount for Ksh500")
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
        gps.setOnClickListener {
            builder.setTitle("Purchase GPS SYstem for Ksh1100")
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

        // Eighth card
        val builder7 = AlertDialog.Builder(this)
        kit.setOnClickListener {
            builder.setTitle("Purchase EmergencyKit for Ksh700")
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

        // Ninth card
        val builder8 = AlertDialog.Builder(this)
        charger.setOnClickListener {
            builder.setTitle("Purchase charger for Ksh300")
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

        // Tenth card
        val builder9 = AlertDialog.Builder(this)
        napkins.setOnClickListener {
            builder.setTitle("Purchase Napkins for Ksh 300")
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

        // Eleventh card
        val builder10 = AlertDialog.Builder(this)
        jack.setOnClickListener {
            builder.setTitle("Purchase CarJack for KSh 650")
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

        // Twelfth card
        val builder11 = AlertDialog.Builder(this)
        shiner.setOnClickListener {
            builder.setTitle("Purchase Shiner for Ksh250")
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

        // Thirteenth card
        val builder12 = AlertDialog.Builder(this)
        kit.setOnClickListener {
            builder.setTitle("Purchase FirstAidkit for Ksh700")
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

        // Fourteenth card
        val builder13 = AlertDialog.Builder(this)
        bt.setOnClickListener {
            builder.setTitle("Purchase Modulator for KSh 350")
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