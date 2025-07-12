# PRACTICUMXL
This is the layout page for the first screen
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@drawable/gb"
    tools:context=".MainActivity">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:gravity="center"
        android:padding="30dp"/>


    <TextView
        android:layout_width="wrap_content"
        android:layout_height="match_parent"
        android:text="Day Time App"
        android:textStyle="bold"
        android:textSize="63dp"
        android:fontFamily="sans-serif-medium"
        android:textColor="@color/white"/>
    


    <androidx.cardview.widget.CardView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_alignParentBottom="true"
        >

        <LinearLayout
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:orientation="vertical"
            android:padding="28dp" />

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="match_parent"
            android:text="Click Next For Main Screen"
            android:textColor="@color/my_primary"
            android:textSize="34dp"/>

        <Button
            android:layout_width="wrap_content"
            android:layout_height="match_parent"
            android:id="@+id/btn_next"
            android:layout_marginTop="48dp"
            android:text="Next"/>


    </androidx.cardview.widget.CardView>

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="match_parent"
        android:text="Sefako Siphosethu Mongalo ST10181363"
        android:textColor="@color/white"
        android:textStyle="bold"
        android:layout_marginTop="488dp"
        android:textSize="38dp"/>



</RelativeLayout>

this is the layout page for the second screen
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".Main_Screen">

    <ImageView
        android:id="@+id/imageView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="52dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.497"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:srcCompat="@drawable/rain" />

    <TextView
        android:id="@+id/text_result"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="44dp"
        android:text="Enter The Data Below"
        android:textSize="24sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/imageView" />

    <TextView
        android:id="@+id/dayTime"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="36dp"
        android:text="Day"
        android:textSize="20sp"
        app:layout_constraintEnd_toStartOf="@+id/editTextDate"
        app:layout_constraintHorizontal_bias="0.35"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/text_result" />

    <EditText
        android:id="@+id/editTextDate"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="36dp"
        android:layout_marginEnd="88dp"
        android:ems="10"
        android:inputType="date"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/text_result" />

    <TextView
        android:id="@+id/MinTime"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="44dp"
        android:text="Min"
        android:textSize="20sp"
        app:layout_constraintEnd_toStartOf="@+id/editTextNumber1"
        app:layout_constraintHorizontal_bias="0.35"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/dayTime" />

    <TextView
        android:id="@+id/MaxTime"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="36dp"
        android:layout_marginEnd="44dp"
        android:text="Max"
        android:textSize="20sp"
        app:layout_constraintEnd_toStartOf="@+id/editTextNumber2"
        app:layout_constraintHorizontal_bias="0.694"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/MinTime" />

    <TextView
        android:id="@+id/weather"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="40dp"
        android:text="Weather Condition"
        android:textSize="20sp"
        app:layout_constraintEnd_toStartOf="@+id/editTextNumber3"
        app:layout_constraintHorizontal_bias="0.47"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/MaxTime" />

    <EditText
        android:id="@+id/editTextNumber1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="20dp"
        android:layout_marginEnd="88dp"
        android:ems="10"
        android:inputType="number"
        android:minHeight="48dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/editTextDate" />

    <EditText
        android:id="@+id/editTextNumber2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="24dp"
        android:layout_marginEnd="84dp"
        android:ems="10"
        android:inputType="number"
        android:minHeight="48dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/editTextNumber1" />

    <EditText
        android:id="@+id/editTextNumber3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="24dp"
        android:layout_marginEnd="16dp"
        android:ems="10"
        android:inputType="number"
        android:minHeight="48dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/editTextNumber2" />

    <Button
        android:id="@+id/btn_back"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="64dp"
        android:text="Back"
        app:layout_constraintEnd_toStartOf="@+id/btn_clear"
        app:layout_constraintHorizontal_bias="0.416"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/weather" />

    <Button
        android:id="@+id/btn_clear"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="32dp"
        android:layout_marginEnd="48dp"
        android:text="Clear"
        app:layout_constraintEnd_toStartOf="@+id/btn_display"
        app:layout_constraintTop_toBottomOf="@+id/editTextNumber3" />

    <Button
        android:id="@+id/btn_display"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="32dp"
        android:layout_marginEnd="24dp"
        android:text="Display"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/editTextNumber3" />
<

<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".Detailed_View_Screen">
    <ImageView
        android:id="@+id/imageView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="52dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.497"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:srcCompat="@drawable/rain" />

    <TextView
        android:id="@+id/TxtDetails"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="64dp"
        android:text="Day: Monday"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.193"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/imageView" />

    <TextView
        android:id="@+id/TxtAverage"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="72dp"
        android:text="TextView"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.201"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/TxtDetails" />

    <Button
        android:id="@+id/btnBack"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="100dp"
        android:text="Back"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.198"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/TxtAverage" />


</androidx.constraintlayout.widget.ConstraintLayout>


The .KT CODES
package com.example.practicum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Button = findViewById<Button>(R.id.btn_next)
        Button.setOnClickListener{
            intent= Intent(this, Main_Screen::class.java)
            startActivity(intent)
        }
    }
}

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

This is the psueodocode
0.	START
//Declerations
StringDay
IntegerMin
IntegerMax
StringWeatherConditions

1.	Output
“Please enter the weather Conditions”
2.	Input
if Monday =<12 then 
print “Sunny”
 	if Tuesday =<15 then 
 	print “Sunny”
 		If Wednesday =< 17 then
  		print ‘Raining”
  			If Thursday =<10 then
  			Print “Raining”
		If Friday =<09 then
 		print “Cold”
	If Saturday =<10 THEN
	print “Raining”
If Sunday =<10 then
Print “Cold”

EndIf
3.	End

