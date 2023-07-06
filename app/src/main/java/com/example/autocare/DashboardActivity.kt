package com.example.autocare

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.Toolbar
import androidx.cardview.widget.CardView
import kotlinx.coroutines.NonCancellable.cancel

open class DashboardActivity : AppCompatActivity() {
    lateinit var engine:CardView
    lateinit var tyre:CardView
    lateinit var carwash:CardView
    lateinit var lease:CardView
    lateinit var body:CardView
    lateinit var accessories:CardView
    lateinit var logout:CardView
    private lateinit var box: AlertDialog.Builder
    private lateinit var toolbar: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        engine = findViewById(R.id.Engine)
        tyre = findViewById(R.id.Tyre)
        carwash = findViewById(R.id.wash)
        lease = findViewById(R.id.lease)
        body = findViewById(R.id.body)
        accessories = findViewById(R.id.accessories)
        logout = findViewById(R.id.logout)

        engine.setOnClickListener {
            Toast.makeText(this, "Engine Maintenance", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, EngineMaintenanceActivity::class.java)
            startActivity(intent)
        }

        tyre.setOnClickListener {
            Toast.makeText(this, "Tyre Maintenance", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, TyreMaintenanceActivity::class.java)
            startActivity(intent)
        }

        carwash.setOnClickListener {
            Toast.makeText(this, "Carwash", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, CarwashActivity::class.java)
            startActivity(intent)
        }

        lease.setOnClickListener {
            Toast.makeText(this, "Car Leasing", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, LeaseActivity::class.java)
            startActivity(intent)
        }

        body.setOnClickListener {
            Toast.makeText(this, "body", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, BodyActivity::class.java)
            startActivity(intent)
        }

        accessories.setOnClickListener {
            Toast.makeText(this, "Car accessories", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, AccessoriesActivity::class.java)
            startActivity(intent)
        }

        box =AlertDialog.Builder(this)
        logout.setOnClickListener {
            Toast.makeText(applicationContext, "You have clicked logout", Toast.LENGTH_LONG).show()
            box.setTitle("Alert!")
                .setMessage("Do you want to exit AutoCare?")
                .setCancelable(true)//dialog box in cancellable
                .setPositiveButton("Yes"){dialogInterface,it ->
                    finish() //close app when clicked on
                }
                .setNegativeButton("No"){dialogInterface,it ->
                    dialogInterface.cancel() //cancel the dialog box
                }
                .setNeutralButton("Help"){dialogInterface,it ->
                    Toast.makeText(this@DashboardActivity,"Help clicked",Toast.LENGTH_SHORT).show()
                }
                .show()//show the builder

        }

        toolbar = findViewById(R.id.toolbarz)
        setSupportActionBar(toolbar)


    }
}