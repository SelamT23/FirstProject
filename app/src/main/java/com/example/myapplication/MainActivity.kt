/*
    The MainActivity file is the entry point for our app. When we build and
    run our app, the system launches an instance of this Activity and loads
    its layout.
*/
package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.btnSubmit) // We initialize the btn constant by passing it the id of the button in the activity_main.xml file

        // When the button is clicked, the setOnClickListener method is activated and anything within this function is activated.
        btn.setOnClickListener{
            Toast.makeText(this@MainActivity, "You clicked the submit button!", Toast.LENGTH_SHORT).show()
        }
    }
}