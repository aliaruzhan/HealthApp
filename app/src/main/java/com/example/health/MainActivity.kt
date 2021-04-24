package com.example.health

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var start = findViewById<Button>(R.id.button)

        start.setOnClickListener(){
            val intent = Intent(this, ExercisesActivity::class.java)
            startActivity(intent)
        }
    }
}