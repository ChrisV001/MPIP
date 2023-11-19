package com.example.lab_intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var exButton: Button
    private lateinit var imButton: Button
    private lateinit var imgButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        exButton = findViewById(R.id.exButton)
        imButton = findViewById(R.id.impButton)
        textView = findViewById(R.id.mainText)
        imgButton = findViewById(R.id.imageButton)
    }
}