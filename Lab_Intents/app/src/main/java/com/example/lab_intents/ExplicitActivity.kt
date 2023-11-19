package com.example.lab_intents

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class ExplicitActivity : AppCompatActivity() {
    private lateinit var buttonConfirm: Button
    private lateinit var buttonBack: Button
    private lateinit var textView: TextView
    private lateinit var userInput: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit)

        buttonConfirm = findViewById(R.id.buttonConfirm)
        buttonBack = findViewById(R.id.buttonBack)
        textView = findViewById(R.id.explicitText)

    }
}