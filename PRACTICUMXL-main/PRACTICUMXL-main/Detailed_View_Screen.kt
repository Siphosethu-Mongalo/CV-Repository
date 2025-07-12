package com.example.practicum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Detailed_View_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_view_screen)

        val validDays = arrayOf(
            "Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
            "Saturday", "Sunday"
        )
        val validMin = arrayOf("12", "15", "17", "10", "09", "10", "10")
        val validMax = arrayOf("25", "29", "19", "19", "23", "18", "16")
        val validWeatherCondition = arrayOf(
            "Sunny", "Sunny", "Raining", "Raining", "Cold",
            "Raining", "Cold"
        )

        val txtDetails: TextView = findViewById(R.id.TxtDetails)
        val textView = findViewById<TextView>(R.id.TxtAverage)
        val Button = findViewById<Button>(R.id.btnBack)

        intent.getStringExtra("Day")
        intent.getStringExtra("Min")
        intent.getStringExtra("Max")
        intent.getStringExtra("Weather Condition")

        var details = ""
        for (i in validDays.indices) {
            details += "Day:${validDays[i]}\n"
                details +="Min"


        }
    }
}

