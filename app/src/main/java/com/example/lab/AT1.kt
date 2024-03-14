package com.example.lab

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import java.util.Locale

class AT1 : AppCompatActivity() {

    private lateinit var openATbtn: Button
    private lateinit var changeToPTbtn: Button
    private lateinit var changeToENbtn: Button
    private var language = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity1)

        openATbtn = findViewById(R.id.openATbtn)
        changeToENbtn = findViewById(R.id.changeToENbtn)
        changeToPTbtn = findViewById(R.id.changeToPTbtn)

        openATbtn.setOnClickListener {
            val intent = Intent(this, AT2::class.java)
            startActivity(intent)
        }

        changeToENbtn.setOnClickListener {
            setLanguage("en")
        }

        changeToPTbtn.setOnClickListener {
            setLanguage("pt")
        }
    }



    private fun setLanguage(languageCode: String) {
        val locale = Locale(languageCode)
        Locale.setDefault(locale)
        val configuration = resources.configuration
        configuration.setLocale(locale)

        val context = createConfigurationContext(configuration)
        resources.updateConfiguration(configuration, resources.displayMetrics)

        recreate() // Recreate the activity to reflect the change
    }


}