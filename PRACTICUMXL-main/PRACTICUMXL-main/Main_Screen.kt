package com.example.practicum

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.text.util.LocalePreferences.FirstDayOfWeek.Days
import androidx.core.view.ViewCompat

class Main_Screen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        val editTextDay= findViewById<EditText>(R.id.editTextDate)
        val editTextNumber= findViewById<EditText>(R.id.editTextNumber1)
        val editTextNumber2= findViewById<EditText>(R.id.editTextNumber2)
        val editTextNumberChild3= findViewById<EditText>(R.id.editTextNumber3)

            //Declare the text view message
        val buttonBack= findViewById<Button>(R.id.btn_back)
        val buttonClear= findViewById<Button>(R.id.btn_clear)
        val buttonDisplay = findViewById<Button>(R.id.btn_display)

        val validDays = arrayOf("Monday","Tuesday","Wednesday","Thursday","Friday",
        "Saturday","Sunday")
        val validMin= arrayOf("12","15","17","10","09","10","10")
        val validMax= arrayOf("25","29","19","19","23","18","16")
        val validWeatherCondition= arrayOf("Sunny","Sunny","Raining","Raining","Cold",
        "Raining","Cold")

        buttonDisplay.setOnClickListener{
            val intent= Intent( this,Detailed_View_Screen::class.java).apply {
                putExtra("day",validDays)

            }
            startActivity(intent)

            buttonClear.setOnClickListener{
        }

        }
        buttonBack.setOnClickListener{
            finish()
        }
    }
}