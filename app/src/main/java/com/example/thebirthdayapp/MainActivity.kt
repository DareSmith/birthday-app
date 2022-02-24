package com.example.thebirthdayapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(
            applicationContext,
            "Don't forget to call me",
            Toast.LENGTH_SHORT
        ).show()


    }
}