    package com.example.exampleform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView
import androidx.core.widget.addTextChangedListener

    class MainActivity : AppCompatActivity() {

    private val currentState: FormState = FormState()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val radio = findViewById<RadioGroup>(R.id.radioGroup)
        val editText = findViewById<EditText>(R.id.editText1)
        val button = findViewById<Button>(R.id.button)
        val textView =  findViewById<TextView>(R.id.textView)

        editText.addTextChangedListener {
            if(!it.isNullOrEmpty()) currentState.fieldData = it.toString()
        }

        radio.setOnCheckedChangeListener { _, i ->
            currentState.radioResult = i
        }

        button.setOnClickListener {
            textView.text = currentState.getFinalData()
        }


    }


}