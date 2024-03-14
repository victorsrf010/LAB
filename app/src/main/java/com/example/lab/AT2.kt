package com.example.lab

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AT2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2)

        val closeATbtn: Button = findViewById(R.id.closeATbtn)
        closeATbtn.setOnClickListener {
            finish()
        }
    }
}